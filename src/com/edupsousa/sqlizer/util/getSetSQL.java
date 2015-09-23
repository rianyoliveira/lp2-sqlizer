package com.edupsousa.sqlizer.util;

import java.util.LinkedHashMap;

public class getSetSQL implements getSQLInterface { 
	
	public String getSQL(LinkedHashMap<String, String> fields) {
		
		String sql = "";
		
		for (String key : fields.keySet()) {
			String value = fields.get(key);
			if (sql.equals("")) {
				sql = "SET " + key + "=" + value;
			} else {
				sql += ", " + key + "=" + value;
			}
		}
		
		return sql;
	}

}
