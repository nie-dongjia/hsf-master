package com.djn.cn.hsf.base.rpc;

import com.djn.cn.hsf.base.entity.UserInfo;

/**
 * 
 * <b>类   名：</b>IUserInfoRPC<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年3月14日 下午10:06:44<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年3月14日 下午10:06:44<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public interface IUserInfoRPC {
	/**
	 * 
	 * getById  TODO
	 *
	 * @param id
	 * @return   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	UserInfo getById(String id);
}
