package com.five.monkey.vi.vhr.service.impl.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.five.monkey.vi.vhr.service.department.DepartmentService;

/**
 * @author jim
 * @date 2021/3/25 17:45
 */
@Service("departmentServiceProxy")
public class DepartmentServiceProxy implements DepartmentService {

    @Autowired
    @Qualifier("departmentServiceImpl")
    private DepartmentService departmentServiceImpl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
