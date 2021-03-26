package com.five.monkey.vi.vhr.dubbo.user;

import com.five.monkey.vi.vhr.common.vo.user.UserVo;

/**
 * @author jim
 * @date 2021/3/26 11:51
 */
public interface UserDubbo {

	UserVo findUserById(Long id);
}
