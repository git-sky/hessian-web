package cn.com.sky.service;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

	public String get() {
		return "get method invoke";
	}

	public Map<String, Object> getById(long id) {
		if (id <= 0) {
			return null;
		}
		Map<String, Object> result = new HashMap<>();
		result.put("id", id);
		result.put("name", "含含糊糊");
		return result;
	}
}