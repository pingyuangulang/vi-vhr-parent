package com.five.monkey.vi.vhr.common.constant;

/**
 * @author jim
 * @date 2021/3/26 15:26
 */
public class UserConstant {

	private UserConstant() {
	}

	/** redis类型:string;key=user.info.{id};value={JSON.toJsonString(userVo)} */
	public static final String USER_KEY_PREFIX = "user.info.";
}
