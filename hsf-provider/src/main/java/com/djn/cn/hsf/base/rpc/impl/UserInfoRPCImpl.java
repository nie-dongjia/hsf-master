package com.djn.cn.hsf.base.rpc.impl;

import com.djn.cn.hsf.base.entity.UserInfo;
import com.djn.cn.hsf.base.rpc.IUserInfoRPC;
/**
 * 
 * <b>类   名：</b>UserInfoRPCImpl<br/>
 * <b>类描述：</b>服务实现<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年3月16日 下午4:08:36<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年3月16日 下午4:08:36<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public class UserInfoRPCImpl implements IUserInfoRPC{
	@Override
	public UserInfo getById(String id) {
		UserInfo userInfo  = new  UserInfo();
		userInfo.setId(id);
		userInfo.setName("nie-dongjia:");
		return userInfo;
	}

}
