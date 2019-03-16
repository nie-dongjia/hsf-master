package com.djn.cn.hsf.base.entity;
/**
 * 
 * <b>类   名：</b>UserInfo<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年3月14日 下午10:06:41<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年3月14日 下午10:06:41<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public class UserInfo {
	private String id;
	private String name;
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + "]";
	}
}
