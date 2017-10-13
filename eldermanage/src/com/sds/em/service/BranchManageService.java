package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;

public interface BranchManageService {
     public Message BaseEnter(Olderbase olderbase) throws Exception;
     
     public Message SickEnter(int olderId,Oldersick oldersick) throws Exception;
}
