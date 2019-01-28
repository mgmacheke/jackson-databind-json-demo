package com.code.jackson.json.demo;

import java.io.File;

import com.code.jackson.json.demo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try{
			
			//create a object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read a json file to the java object
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			 
			// print firstName and lastName
			System.out.println("First name: " + theStudent.getFirstName());
			System.out.println("Last name: " + theStudent.getLastName());
			 
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
