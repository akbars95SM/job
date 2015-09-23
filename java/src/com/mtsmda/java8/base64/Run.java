package com.mtsmda.java8.base64;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.UUID;

public class Run {

	public static void main(String[] args) {
		String text = "Java 8 Base 64";
		
		try {
			String base64EncodedString = Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
			System.out.println(base64EncodedString);
			
			byte [] base64DecodeString = Base64.getDecoder().decode(base64EncodedString);
			System.out.println(new String(base64DecodeString, Charset.defaultCharset()));
			
			base64EncodedString = Base64.getUrlEncoder().encodeToString(text.getBytes("UTF-8"));
			System.out.println(base64EncodedString);
			
			StringBuilder stringBuilder = new StringBuilder();
			
			for(int i = 0; i < 10; i++){
				stringBuilder.append(UUID.randomUUID().toString()).append("\n");
			}
			
			System.out.println(stringBuilder);
			System.out.println("______________________________");
			
			byte[] bytes = stringBuilder.toString().getBytes("UTF-8");
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(bytes);
			System.out.println(mimeEncodedString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
