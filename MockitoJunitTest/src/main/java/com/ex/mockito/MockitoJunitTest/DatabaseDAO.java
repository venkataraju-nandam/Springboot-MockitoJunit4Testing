package com.ex.mockito.MockitoJunitTest;

import org.springframework.stereotype.Component;

@Component
public class DatabaseDAO 
{
    public void save(String fileName) {
        System.out.println("Saved in database");
    }
}