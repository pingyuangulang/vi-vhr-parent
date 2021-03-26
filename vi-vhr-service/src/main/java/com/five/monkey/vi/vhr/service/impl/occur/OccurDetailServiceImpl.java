package com.five.monkey.vi.vhr.service.impl.occur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.dal.mapper.base.OccurDetailMapper;
import com.five.monkey.vi.vhr.service.occur.OccurDetailService;

/**
 * @author jim
 * @date 2021/3/25 17:14
 */
@Service("occurDetailServiceImpl")
public class OccurDetailServiceImpl implements OccurDetailService {

	@Autowired
	private OccurDetailMapper occurDetailMapper;
}
