//package com.ex.mockito.MockitoJunitTest;
//
//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//import org.apache.catalina.WebResource;
//import org.glassfish.jersey.client.ClientConfig;
//
//
//
//public class UserAPIClient {
//	private static final String REST_URI 
//    		= "http://localhost:8082/spring-jersey/resources/employees";
//
////	private Client client2 = ClientFilter.newClient();
////	private Client client = new Client();
////	private Client client1 =  ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
//	
////	Client client = ClientBuilder.newClient();
////	Client client = ClientBuilder.newBuilder().build();
////	Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
////	ClientConfig config = new ClientConfig();
//	
////	Client client = ClientBuilder.newClient(config  );
////	public Response createJsonUser(UserEntity user) {
////		
////        user = new UserEntity(1,"Barak","Micheli","Obama","Barak_Obama");
////        
////	    return client
////	      .target(REST_URI)
////	      .request(MediaType.APPLICATION_JSON)
////	      .post(Entity.entity(user, MediaType.APPLICATION_JSON));
////
////	}
//	
//	public void createJsonUser2(UserEntity user) {
//		ClientConfig config = new DefaultClientConfig();
//		  Client client = Client.create(config);
//		  WebResource service = client.resource(UriBuilder.fromUri(REST_URI).build());
////		  // getting XML data
////		  System.out.println(service. path('restPath').path('resourcePath').accept(MediaType.APPLICATION_JSON).get(String.class));
////		  // getting JSON data
////		  System.out.println(service. path('restPath').path('resourcePath').accept(MediaType.APPLICATION_XML).get(String.class));
//		  System.out.println(service.getWebappPath());
//	}
//	
//	
//
//		public void createJsonUser1(UserEntity user) {
//			
////	        user = new UserEntity(1,"Barak","Micheli","Obama","Barak_Obama");
////	        
////	        WebTarget target = client.target("http://localhost:8080/RESTEasyApplication/user-management/users");
////	        Response response = target.request().get();
////	        String users = response.readEntity(String.class);
//
//		}
//	
//	public void method2() {
////		Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
////		WebTarget webTarget = client.target("http://localhost:8080/JerseyDemos/rest").path("employees");
////		 
////		Employee emp = new Employee();
////		emp.setId(1);
////		emp.setName("David Feezor");
////		 
////		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
////		Response response = invocationBuilder.post(Entity.entity(emp, MediaType.APPLICATION_XML));
////		 
////		System.out.println(response.getStatus());
////		System.out.println(response.readEntity(String.class));
//	}
//}
