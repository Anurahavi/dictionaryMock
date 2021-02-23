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
	
	Dictionary dic = null;
	@Mock
	DictionaryService service = Mockito.mock(DictionaryService.class);
	
	@Rule public MockitoRule rule = MockitoJUnit.rule(); 
	
			
	

	@Before
	public void doSetup() {
		dic = new Dictionary(service);
		
	}
	
	@Test	
	public void testIsEnglishWord() {
		
		String[] array = {"row", "ring", "know", "now", "work"};
		
		ArrayList<String> mockList = new ArrayList<String>();
	      for(String text:array) {
	    	  mockList.add(text.toLowerCase());
	      }
	      
		when(service.getDictionary()).thenReturn(mockList);
		
		assertEquals(true, dic.isEnglishWord("working"));
	}
}
