package com.ex.mockito.MockitoJunitTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

	@RunWith(SpringRunner.class)
	@DataJpaTest
	public class UserRepositoryIngrationTest {
	 
//		import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
	    @Autowired
	    private TestEntityManager entityManager;
	 
	    @Autowired
	    private UserRepository userRepository;
//	    
//	    @Mock
//	    UserEntity emp;
	    

	 
	    @Test
	    public void whenFindByNameUser_thenReturnEmployee() {
	        // given
	        UserEntity user = new UserEntity(1,"Barak","Micheli","Obama","Barak_Obama");
	        entityManager.persist(user);
	        entityManager.flush();
	        
	        // when
	        UserEntity found = userRepository.findByUserName(user.getUserName());
//	        List<UserEntity> found1 = userRepository.findAll();
	     
	        // then
//	        assertThat(found.getName())
//	          .isEqualTo(emp.getName());
	    }
	}
