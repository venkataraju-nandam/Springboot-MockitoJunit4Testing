package com.ex.mockito.MockitoJunitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "MockitoJunitTest Classes -> Hello World!" );
        
//        UserEntity user = new UserEntity(1,"Barak","Micheli","Obama","Barak_Obama");
//        
//        UserAPIClient client = new UserAPIClient();
//        client.createJsonUser(user);
//        System.out.println( "MockitoJunitTest Classes -> After execution of UserAPI createJsonUser !" );
    }
}
