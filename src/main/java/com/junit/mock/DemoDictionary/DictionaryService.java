package com.junit.mock.DemoDictionary;

import java.util.ArrayList;

public interface DictionaryService {
	ArrayList <String> getDictionary();
	boolean isEnglishWord(String word);

}
