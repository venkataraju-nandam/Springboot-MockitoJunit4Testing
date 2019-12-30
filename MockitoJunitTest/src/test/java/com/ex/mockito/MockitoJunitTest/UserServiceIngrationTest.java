//package com.ex.mockito.MockitoJunitTest;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
////import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.test.context.junit4.SpringRunner;
//
////import static org.junit.Assert.*;
////import static org.junit.matchers.JUnitMatchers.*;
//import static org.hamcrest.MatcherAssert.*;
//import static org.hamcrest.Matchers.*;
//
//
//
//	@RunWith(SpringRunner.class)
//	@DataJpaTest
//	@ComponentScan
//	public class UserServiceIngrationTest {
//	 
////		import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//	    @Autowired
//	    private TestEntityManager entityManager;
//	    
////	    @InjectMocks
//	    @Autowired
//	    private UserService userService;	 
//	    
////	    @Autowired
////	    private UserRepository userRepository;    
////	    @Mock
////	    UserEntity emp;
//	       
//	    @Test
//	    public void whengetAllUsers_From_UserService() {
//	    	System.out.println("Executing TEST method -> whengetAllUsers_From_UserService");
//	        // given
//	        UserEntity user = new UserEntity(1,"Barak","Micheli","Obama","Barak_Obama");
//	        entityManager.persist(user);
//	        entityManager.flush();
//	        
//	        // when
//	        
////	        UserEntity found = userRepository.findByUserName(user.getUserName());
//	        List<UserEntity> found1 = userService.getAllUsers();
//	        
//	        assertThat("Zero is one", 0, is(not(1))); // passes
////	        assertThat("User is not ->", found.getUserName(), is(not(user.getUserName())));
//	        assertThat("User is -> ", found1.get(0).getUserName(), is(user.getUserName()));
//	     
//	        // then
////	        assertThat(found.getName())
////	          .isEqualTo(emp.getName());
//	        System.out.println("found1.get(0).getUserName()" +found1.get(0).getUserName());
//	        System.out.println("user.getUserName()"+ user.getUserName());
//	        System.out.println("Executing TEST method END-> whengetAllUsers_From_UserService");
//	    }
//	}
//	
//	
////	Testing with HAMCREST 
////	_____________________
////    Person person=new Person("Barrack", "Washington");
////    String str=person.toString();
////    assertThat(person,hasToString(str));
////    
////    assertThat(Cat.class,typeCompatibleWith(Animal.class));
////
////    Person person = new Person("Baeldung", 25);
////    assertThat(person, hasProperty("name"));
////	
////    Person person1 = new Person("Baeldung", "New York");
////    Person person2 = new Person("Baeldung", "New York");
////    assertThat(person1, samePropertyValuesAs(person2));
////    
////    Person person = new Person("Baeldung", "New York");
////    assertThat(person, hasProperty("address", equalTo("New York")));