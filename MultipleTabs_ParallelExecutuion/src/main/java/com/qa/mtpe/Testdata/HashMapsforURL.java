package com.qa.mtpe.Testdata;

import java.util.HashMap;

public class HashMapsforURL {

	
	public static HashMap<String, String> geturls()
	{
		HashMap<String,String> urlmap = new HashMap<String,String>();
		urlmap.put("seleniumpage", "https://selenium.dev/");
		urlmap.put("downloadpage", "https://selenium.dev/downloads/");
		
		return urlmap;
	}
}
