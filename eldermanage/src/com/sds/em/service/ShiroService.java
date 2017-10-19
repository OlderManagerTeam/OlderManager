package com.sds.em.service;

import java.util.Set;

public interface ShiroService {
	public Set<String> getRoles(String stafftel);
	public Object getPerson(String tel);
}
