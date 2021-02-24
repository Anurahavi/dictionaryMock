package com.junit.mock.DemoDictionary;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class DictionaryTest {
	
	public String[] listofWords = {"row", "ring", "know", "now", "work","working"};
	Dictionary dic = null;
	ArrayList<String> mockList = new ArrayList<String>();
	
	@Mock
	DictionaryService service;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule(); 
	
			
	

	@Before
	public void doSetup() {
		dic = new Dictionary(service);
		
	      for(String text:listofWords) {
	    	  mockList.add(text.toLowerCase());
	      }
		
	}
	
	@Test	
	public void testIsEnglishWord() {
		
		
	   
		when(service.getDictionary()).thenReturn(mockList);
		
		when(service.isEnglish("working",listofWords)).thenReturn(dic.isThisEnglish("working"));
		assertEquals(true,service.isEnglish("working",listofWords));
		assertEquals(true, dic.substrings("working"));
		
	}
	
	
}
