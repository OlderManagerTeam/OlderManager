package com.sds.em.service.impl;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.QuestionMapper;
import com.sds.em.mapper.SecurityMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Question;
import com.sds.em.po.QuestionExample;
import com.sds.em.po.Security;
import com.sds.em.po.SecurityExample;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.service.IndexService;

public class IndexServiceImpl implements IndexService {
	@Autowired
	StaffbaseMapper staffbaseMapper;

	@Autowired
	SecurityMapper securityMapper;

	@Autowired
	QuestionMapper questionMapper;

	/**
	 * 
	 */
	@Override
	public Message returnQuestion(String staffTel) {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStafftelEqualTo(staffTel);
			List<Staffbase> StaffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
			if (!StaffbaseList.isEmpty()) {
				int staffId = StaffbaseList.get(0).getStaffid();
				SecurityExample securityExample = new SecurityExample();
				com.sds.em.po.SecurityExample.Criteria criteria2 = securityExample.createCriteria();
				criteria2.andSecuritystaffidEqualTo(staffId);
				List<Security> securityList = securityMapper.selectByExample(securityExample);
				int securityQuestionId = securityList.get(0).getSecurityquestionid();

				QuestionExample qustionExample = new QuestionExample();
				com.sds.em.po.QuestionExample.Criteria criteria3 = qustionExample.createCriteria();
				criteria3.andQuestionidEqualTo(securityQuestionId);
				List<Question> questionList = questionMapper.selectByExample(qustionExample);
				String questionContent = questionList.get(0).getQuestioncontent();

				JSONObject jsonObject = new JSONObject();
				try {
					jsonObject.put("questionId", securityQuestionId);
					jsonObject.put("questionContent", questionContent);
					jsonObject.put("staffId", staffId);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return new Message(true, "返回成功", jsonObject.toString());
			} else {
				return new Message(false, "您输入的号码不存在", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

}
