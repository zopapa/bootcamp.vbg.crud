package com.bootcamp;

import com.bootcamp.constants.AppConstants;

import org.testng.annotations.Test;

import javax.persistence.Persistence;
import java.util.Properties;

/**
 * Created by darextossa on 9/22/17.
 */


public class GenerateTableTest {

    @Test
    public void generateTables(){
        Persistence.generateSchema(AppConstants.PERSISTENCE_UNIT, new Properties());
    }
    
}
