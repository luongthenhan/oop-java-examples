package com.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		String s = "{ \"humidity\" : 60.77, \"temperature\" : 33.59, \"time\" : \"2016-04-15T22:47:42\" }";

		try {
			JSONObject obj = (JSONObject)parser.parse(s);

			System.out.println("Field temperature");
			System.out.println(obj.get("temperature"));

			System.out.println("Field humidity");
			System.out.println(obj.get("humidity"));
			
			System.out.println("Field time");
			System.out.println(obj.get("time"));
		} catch (ParseException pe) {

			System.out.println("position: " + pe.getPosition());
			System.out.println(pe);
		}
	}

}
