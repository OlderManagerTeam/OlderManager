package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Visited;

public interface OlderPersonalCenterService {

	Message newmessagecount(int olderid);

	Message readallmessage(int olderid);

	Message readAmessage(int olderid, Long messageid);

	Message oldmessagecount(int olderid);

	Message messagebyid(int olderid, Long oldermessageid);

	Message visited(int olderid);

	Message putvisited(Visited visited, int olderid);
}
