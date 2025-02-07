package com.example.restfulwebservicesj17.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		someBean someBean = new someBean("value1", "value2", "Value3");
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean); 
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}

	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList() {
		
		List<someBean> list = Arrays.asList(new someBean("value1", "value2", "Value3"), new someBean("valu4", "value4", "Value4"));
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}

}
