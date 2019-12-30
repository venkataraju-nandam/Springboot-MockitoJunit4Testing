package com.ex.mockito.MockitoJunitTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "fw_user1")
@RequiredArgsConstructor
public class UserEntity {
	
	
	/*
	 * @Id instead of @GeneratedValue(strategy = GenerationType.AUTO) 
	 * The reason for this is that you have declared the id in Person class as generated with auto strategy 
	 * meaning JPA tries to insert the id itself while persisting the entity. 
	 * However in your constructor you are manually setting the id variable 
	 */
    public UserEntity(int i, String fname, String middle, String lname, String uname) {
		this.id = (long) i;
		this.firstName = fname;
		this.middleName = middle;
		this.lastName = lname;
		this.userName = uname;
	}

	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO) // commented for manually set the id,entityManager.persist(user) in test class failing...
	@Autowired
	@Setter @Getter
	@Column (name = "PERSON_ID")
    private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Autowired
	@Setter @Getter
	@Column (name = "FIRST_NAME")
	private String firstName;
	
	@Autowired
	@Setter @Getter
	@Column (name = "MIDDLE_NAME")
    private String middleName;
	
	@Autowired
	@Setter @Getter
	@Column (name = "LAST_NAME")
    private String lastName;

	@Autowired
	@Setter @Getter
	@Column (name = "USER_NAME")
    private String userName;

	public String getUserName() {
		// TODO Auto-generated method stub
		return this.userName;
	}
	
//	@Override
//    public String toString() {
//        return "UserEntity [person id=" + id + ", firstName=" + firstName + "]";
//    }


	
}
