package com.five.monkey.vi.vhr.service.impl.remove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.dal.mapper.base.RemoveInfoMapper;
import com.five.monkey.vi.vhr.service.remove.RemoveInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:15
 */
@Service("removeInfoServiceImpl")
public class RemoveInfoServiceImpl implements RemoveInfoService {

	@Autowired
	private RemoveInfoMapper removeInfoMapper;
}
