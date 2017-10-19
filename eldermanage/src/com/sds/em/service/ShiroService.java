package com.sds.em.service;

import java.util.Set;

import com.sds.em.po.Staffbase;

public interface ShiroService {
	public Set<String> getRoles(String stafftel);
	public Staffbase getPerson(String stafftel);
}
