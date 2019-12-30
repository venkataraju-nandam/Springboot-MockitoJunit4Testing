package com.ex.mockito.MockitoJunitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DatabaseService {
	@Autowired
    DatabaseDAO database;
    
    public boolean save(String fileName) 
    {
        database.save(fileName);
        System.out.println("Saved in database in Main class");   
        return true;
    }
}
