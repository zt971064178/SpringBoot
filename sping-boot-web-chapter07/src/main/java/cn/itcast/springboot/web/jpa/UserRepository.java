package cn.itcast.springboot.web.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name) ;
	
	User findByNameAndAge(String name, Integer age) ;
	
	@Query("select u from User u where u.name = :name")
	User findUser(@Param(value="name") String name) ;
}
