package com.five.monkey.vi.vhr.service.impl.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.dal.mapper.base.DepartmentMapper;
import com.five.monkey.vi.vhr.service.department.DepartmentService;

/**
 * @author jim
 * @date 2021/3/25 17:12
 */
@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
}
