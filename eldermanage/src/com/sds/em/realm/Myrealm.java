package com.sds.em.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.po.Olderbase;
import com.sds.em.po.Staffbase;
import com.sds.em.service.ShiroService;

public class Myrealm extends AuthorizingRealm {
	/**
	 * 为当限前登录的用户授予角色和权
	 */
	@Autowired
	ShiroService shiroService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		String tel = (String) arg0.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(shiroService.getRoles(tel));
		return authorizationInfo;
	}

	/**
	 * 验证当前登录的用户
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		String tel = (String) arg0.getPrincipal();
		Object object = shiroService.getPerson(tel);
		if(object==null)
			return null;
		if (object.getClass().getName() == "com.sds.em.po.Staffbase") {
			Staffbase staff = (Staffbase) shiroService.getPerson(tel);
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(staff.getStafftel(), staff.getStaffpassword(),
					staff.getStafftel());
			return authcInfo;
		}else if(object.getClass().getName() == "com.sds.em.po.Olderbase"){
			Olderbase olderbase=(Olderbase) shiroService.getPerson(tel);
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(olderbase.getOldertel(), olderbase.getOlderpassword(),
					olderbase.getOldertel());
			return authcInfo;
		}
		return null;
	}

}
