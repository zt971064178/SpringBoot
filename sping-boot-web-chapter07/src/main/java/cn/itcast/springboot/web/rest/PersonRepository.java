package cn.itcast.springboot.web.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	@RestResource(path="nameStartsWith", rel="nameStartsWith")
	Person findByNameStartsWith(String name) ;
	
}
