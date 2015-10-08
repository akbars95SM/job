package com.mtsmda.hibenateOnly.hibenateOnly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TempTest {

	public static void main(String[] args) {
		String keyI = "03", valueI = "ProfClaim";
		System.out.println(isNotValid(keyI, valueI));
	}
	
	private static boolean isNotValid(String keyI, String valueI){
		Map<String, String> map2 = new HashMap<>();
		map2.put("01", "ProfClaim");
		map2.put("03", "DentalClaim,ProfClaim");
		map2.put("10", "DentalClaim");
		map2.put("04", "InstClaim");
		map2.put("05", "InstClaim");
		map2.put("11", "DentalClaim");
		map2.put("54", "PharmClaim");
		map2.put("27", "ProfClaim");
		map2.put("32", "ProfClaim");
		System.out.println(map2.size());
		for (String key : map2.keySet()) {
			if (isNotBlank(key)) {
				String value = map2.get(key);
				if (isNotBlank(value)) {
					System.out.println("key - " + key + "\tvalue - " + value);
					if (key.equals(keyI) && value.contains(valueI)) {
						return true;
					}
				}
			}
		}
		System.out.println();
		return false;
	}

	private static boolean isNotBlank(String text) {
		if (text != null && !text.trim().isEmpty()) {
			return true;
		}
		return false;
	}

}