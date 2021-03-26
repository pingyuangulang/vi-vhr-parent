package com.five.monkey.vi.vhr.service.impl.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.dal.mapper.base.EmployeeMapper;
import com.five.monkey.vi.vhr.service.employee.EmployeeService;

/**
 * @author jim
 * @date 2021/3/25 17:11
 */
@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
}
