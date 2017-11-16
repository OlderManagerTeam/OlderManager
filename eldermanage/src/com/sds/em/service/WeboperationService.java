package com.sds.em.service;

import com.sds.em.po.Message;

public interface WeboperationService {

	public Message getauthorization();

	public Message addpersonauthorization(String stafftel, String authorization);

	public Message delpersonauthorization(String stafftel, String authorization);

	public Message staffname(String stafftel);

}
