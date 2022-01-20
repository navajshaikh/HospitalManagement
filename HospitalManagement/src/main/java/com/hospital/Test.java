package com.hospital;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	 public static void main( String[] args )
	    {
	        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	    
	        Hospital h=(Hospital) ac.getBean("hospital");
	        
	        h.setName("City Hospital");
	        h.setAddress("Mumbai MG road");
	        h.setType("Gov.");
	        
	        
	        Doctor d=(Doctor) ac.getBean("d");
	       
	       Map<Integer, String> obj=new TreeMap<Integer, String>();
	       obj.put(1, "harry");
	       obj.put(2, "john");
	       obj.put(3, "Rahul");
	       
	       d.setName(obj);
	       
	       Patient p=(Patient) ac.getBean("p");
	       
	       h.setDoctor(d);
	       h.setPatient(p);
	     
	     
	       System.out.println(h);
	      
	        
	        ac.close(); 
	    }


}
