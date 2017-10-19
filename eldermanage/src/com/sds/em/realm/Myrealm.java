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
import com.sds.em.service.StaffShiroService;

public class Myrealm extends AuthorizingRealm {
	/**
	 * 为当限前登录的用户授予角色和权
	 */
	@Autowired
	StaffShiroService staffShiroService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO 自动生成的方法存根
		String stafftel = (String) arg0.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(staffShiroService.getRoles(stafftel));
		return authorizationInfo;
	}

	/**
	 * 验证当前登录的用户
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO 自动生成的方法存根
		String stafftel = (String) arg0.getPrincipal();
		Staffbase staff = staffShiroService.getStaff(stafftel);
		Olderbase older=
		if (staff != null) {
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(staff.getStafftel(), staff.getStaffpassword(),
					staff.getStafftel());
			return authcInfo;
		}
		return null;
	}

}
