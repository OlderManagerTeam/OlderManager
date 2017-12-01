package com.sds.em.service;

import com.sds.em.po.Message;

public interface OlderPersonalCenterService {

	Message newmessagecount(int olderid);

	Message readallmessage(int olderid);

	Message readAmessage(int olderid, Long messageid);

	Message oldmessagecount(int olderid);

	Message messagebyid(int olderid, Long oldermessageid);

	Message visited(int olderid);
}
