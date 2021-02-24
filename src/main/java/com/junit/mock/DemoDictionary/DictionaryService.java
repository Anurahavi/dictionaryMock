package com.junit.mock.DemoDictionary;

import java.util.ArrayList;

public interface DictionaryService {
	ArrayList <String> getDictionary();
	boolean isEnglish(String word,String [] words);

}
