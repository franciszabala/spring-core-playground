package com.franciszabala.example.spring.unittest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.franciszabala.example.spring.model.SetterMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SetterMessageTest-context.xml")
public class SetterMessageTest {

    final Logger logger = LoggerFactory.getLogger(SetterMessageTest.class);

    @Autowired
    private SetterMessage message = null;

    /**
     * Tests message.
     */
    @Test
    public void testMessage() {   
        assertNotNull("Constructor message instance is null.", message);
        
        String msg = message.getMessage();
        
        assertNotNull("Message is null.", msg);
        
        String expectedMessage = "Spring is fun.";
        
        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

        logger.info("message='{}'", msg);
    }
    
    @Test
    @Timed(millis = 180)
    public void testMessageTimed() {   
        assertNotNull("Constructor message instance is null.", message);
        
        String msg = message.getMessage();
        
        assertNotNull("Message is null.", msg);
        
        String expectedMessage = "Spring is fun.";
        
        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

        logger.info("message='{}'", msg);
        
        System.out.println("This is timed");
    }
    
    @Test
    @Timed(millis = 0)
    public void testMessageTimedFail() {   
    	
    	try {
    		System.out.println("This is timed");
			Thread.sleep(2400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertNotNull("Constructor message instance is null.", message);
        
        String msg = message.getMessage();
        
        assertNotNull("Message is null.", msg);
        
        String expectedMessage = "Spring is fun.";
        
        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

        logger.info("message='{}'", msg);
        
        
    }
    
}
   