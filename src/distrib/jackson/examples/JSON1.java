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
 
public class JSON1 {
    public static void main(String[] args) {
 
	User user = new User();
        
	ObjectMapper mapper = new ObjectMapper();
 
	try {
 
		// convert user object to json string, and save to a file
		mapper.writeValue(new File("user.json"), user);
 
		// display to console
		System.out.println(mapper.writeValueAsString(user));
 
	} catch (JsonGenerationException e) {
 
		e.printStackTrace();
 
	} catch (JsonMappingException e) {
 
		e.printStackTrace();
 
	} catch (IOException e) {
 
		e.printStackTrace();
 
	}
 
  }
 
}