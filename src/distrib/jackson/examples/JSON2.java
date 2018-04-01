/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distrib.jackson.examples;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
 
public class JSON2 {
    public static void main(String[] args) {
 
	ObjectMapper mapper = new ObjectMapper();
 
	try {
 
		// read from file, convert it to user class
		User user = mapper.readValue(new File("user.json"), User.class);
 
		// display to console
		System.out.println(user);
 
	} catch (JsonGenerationException e) {
 
		e.printStackTrace();
 
	} catch (JsonMappingException e) {
 
		e.printStackTrace();
 
	} catch (IOException e) {
 
		e.printStackTrace();
 
	}
 
  }
 
}