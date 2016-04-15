package com.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ReadJSON {

	private static final String HOST = "";
	private static final int PORT = 0;
	private static final String USER = "";
	private static final String PASS = "";
	private static final String DBNAME = "";
	private static final String TABLE = "";

	private static MongoClient mongoClient;
	private static MongoDatabase dbCon = null;

	public static void init() {
		MongoCredential basicAuth = MongoCredential.createScramSha1Credential(USER, DBNAME, PASS.toCharArray());
		List<MongoCredential> auths = new ArrayList<>();
		auths.add(basicAuth);

		ServerAddress serverAddress = new ServerAddress(HOST, PORT);
		mongoClient = new MongoClient(serverAddress, auths);
		dbCon = mongoClient.getDatabase(DBNAME);
	}

	public static void main(String[] args) {

		MongoCollection<Document> coll = dbCon.getCollection(TABLE);

		JSONParser parser = new JSONParser();

		try {
			init();
			FileReader inputFile = new FileReader("D:\\Coding\\vietnam\\admin_level_4b.geojson");
			JSONArray arr = (JSONArray) parser.parse(inputFile);

			for (int i = 10; i < arr.size(); i++) {
				JSONObject obj = (JSONObject) arr.get(i);
				Document dbObject = Document.parse(obj.toJSONString());
				coll.insertOne(dbObject);
				System.out.println("Persisted obj " + obj.get("name"));
			}
		} catch (ParseException | IOException e) {
			System.err.println(e.getMessage());
		} finally {
			mongoClient.close();
		}
	}

}
