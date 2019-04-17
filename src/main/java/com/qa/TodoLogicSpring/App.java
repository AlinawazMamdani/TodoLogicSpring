
package com.qa.TodoLogicSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    	logger.info("Starting application");
    	SpringApplication.run(App.class, args);
    	

    }
    private static final Logger logger = LoggerFactory.getLogger(App.class);
   
}

