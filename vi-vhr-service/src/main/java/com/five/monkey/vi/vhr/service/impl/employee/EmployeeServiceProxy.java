package com.five.monkey.vi.vhr.service.impl.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.service.employee.EmployeeService;

/**
 * @author jim
 * @date 2021/3/25 17:57
 */
@Service("employeeServiceProxy")
public class EmployeeServiceProxy implements EmployeeService {

    @Autowired
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeServiceImpl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
