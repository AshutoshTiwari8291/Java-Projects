package com.example.restfulwebservicesj17.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSeconfVersionOfPerson() {
		return new PersonV2(new Name("Ashutosh", "Tiwari"));
	}

	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParamer() {
		return new PersonV1("Bob");
	}

	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSeconVersionOfPersonRequestParamer() {
		return new PersonV2(new Name("Ashutosh", "Tiwari"));
	}

	@GetMapping(path = "/person/header", headers = " =1")
	public PersonV1 getFirstVersionOfPersonRequestHeaders() {
		return new PersonV1("Bob");
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSeconVersionOfPersonRequestHeaders() {
		return new PersonV2(new Name("Ashutosh", "Tiwari"));
	}
	
	
	@GetMapping(path = "/person/header", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeaders() {
		return new PersonV1("Bob");
	}

	@GetMapping(path = "/person/header", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSeconVersionOfPersonAcceptHeaders() {
		return new PersonV2(new Name("Ashutosh", "Tiwari"));
	}
}
