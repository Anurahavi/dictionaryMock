package com.junit.mock.DemoDictionary;

import java.util.ArrayList;

public class Dictionary {

	public String[] listofWords = {"row", "ring", "know", "now", "work","working"};
	DictionaryService service;
	
	public Dictionary(DictionaryService service) {
		this.service = service;
	}
	
	public ArrayList <String> getDictionary() {
		return service.getDictionary();
	}
	
	public boolean isEnglish(String word,String[] words) {
		return service.isEnglish(word,words);
	}
	
	public boolean isThisEnglish(String word) {
        for (String w : listofWords) {
            if (w.equals(word.toLowerCase())) {
                System.out.println(word + " is a valid english word");
                return true;
            }
        }
        return false;
    }
	
	
	public Boolean substrings(String word) {
		
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
