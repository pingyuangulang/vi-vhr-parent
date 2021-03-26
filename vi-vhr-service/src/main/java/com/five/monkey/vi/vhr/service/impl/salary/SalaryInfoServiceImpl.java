package com.five.monkey.vi.vhr.service.impl.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.dal.mapper.base.SalaryInfoMapper;
import com.five.monkey.vi.vhr.service.salary.SalaryInfoService;

/**
 * @author jim
 * @date 2021/3/25 17:17
 */
@Service("salaryInfoServiceImpl")
public class SalaryInfoServiceImpl implements SalaryInfoService {

	@Autowired
	private SalaryInfoMapper salaryInfoMapper;
}
