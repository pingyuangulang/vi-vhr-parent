package com.five.monkey.vi.vhr.service.user;

import java.util.List;

import com.five.monkey.vi.vhr.common.vo.user.UserVo;

/**
 * @author jim
 * @date 2021/3/25 16:18
 */
public interface UserService {

	UserVo findUserById(Long id);

	List<UserVo> list(int start, int length);

	UserVo insertSelective(UserVo userVo);
}
