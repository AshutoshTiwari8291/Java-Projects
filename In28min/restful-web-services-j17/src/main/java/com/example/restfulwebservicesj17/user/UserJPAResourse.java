package com.example.restfulwebservicesj17.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.restfulwebservicesj17.jpa.PostRepository;
import com.example.restfulwebservicesj17.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJPAResourse {

	private UserRepository UserRepository;
	private PostRepository postRepository;

	public UserJPAResourse(UserRepository UserRepository, PostRepository postRepository) {
		this.UserRepository = UserRepository;
		this.postRepository = postRepository;
	}

	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers() {
		return UserRepository.findAll();
	}
	
	// Add link for users here..
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveAllUsers(@PathVariable int id) {
		Optional<User> user = UserRepository.findById(id);
		
		if (user.isEmpty()) 
			throw new UserNotFoundException("User does not exist id:"+id);
		
		EntityModel<User> entityModel = EntityModel.of(user.get() );
		
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		entityModel.add(link.withRel("all-users"));
		
		return entityModel;
	}

	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = UserRepository.save(user);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build(); // This will send created status
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		UserRepository.deleteById(id);
	}
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retrivePostsForUser(@PathVariable int id) {
		Optional<User> user = UserRepository.findById(id);
		if (user.isEmpty()) 
			throw new UserNotFoundException("User does not exist id:"+id);
		return user.get().getPosts();
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Post> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post){
		Optional<User> user = UserRepository.findById(id);
		
		if (user.isEmpty()) 
			throw new UserNotFoundException("User does not exist id:"+id);
		
		post.setUser(user.get());
		Post savedUser = postRepository.save(post);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
