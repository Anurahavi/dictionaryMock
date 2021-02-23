package com.junit.mock.DemoDictionary;

import java.util.ArrayList;

public class Dictionary {

	String[] wordList;
	DictionaryService service;
	
	public Dictionary(DictionaryService service) {
		this.service = service;
	}
	
	public ArrayList <String> getDictionary() {
		return service.getDictionary();
	}
	
	public Boolean isEnglishWord(String word) {
		
		PermutationCombination pc = new PermutationCombination();
		
		ArrayList <String> possibleWords = pc.getPossibleWords(word);
		
		ArrayList<String> listTwo = getDictionary();
         
		possibleWords.retainAll(listTwo);
        
		System.out.println(possibleWords);
		
		if(possibleWords.size() > 0) {
			return true;
		}
		
		return false;
		
	}
	
	
}
