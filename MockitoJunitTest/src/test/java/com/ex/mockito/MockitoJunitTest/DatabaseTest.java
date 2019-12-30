package com.ex.mockito.MockitoJunitTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
 
 
@RunWith(MockitoJUnitRunner.class)
public class DatabaseTest 
{
    @InjectMocks
    DatabaseService recordService;
     
    @Mock
    DatabaseDAO databaseMock;

     
    @Test
    public void saveTest()
    {
        boolean saved = recordService.save("temp.txt");
        assertEquals(true, saved);
         
        verify(databaseMock, times(1)).save("temp.txt");
    }
}

//Let’s understand above test class step by step:
//
//Annotate the test with the @RunWith(MockitoJUnitRunner.class) so that mockito can process the annotations.
//Annotate the dao fields with the @Mock annotation to have a mock object instantiated for both of them.
//Annotate service field with the @InjectMocks annotation to first instantiate and then inject both mocked dependencies.
//Call the method to test on the class to be tested ie. recordService.
//Verify that methods in the mocked objects have been invoked.