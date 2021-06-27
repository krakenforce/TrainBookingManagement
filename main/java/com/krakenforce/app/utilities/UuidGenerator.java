package com.krakenforce.app.utilities;

import java.util.UUID;

public class UuidGenerator {
	
	public static String generateId() {
		UUID uuid = UUID.randomUUID();
		String uuidString = uuid.toString();		
		return uuidString;
	}
	
	public static boolean validateUUID(String id, String uuid){
		if(uuid.equals(id)) {
			return true;
		}
		return false;
	}
}
