package com.five.monkey.vi.vhr.dubbo.department;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jim
 * @date 2021/3/26 14:57
 */
@DubboService(interfaceClass = DepartmentDubbo.class, timeout = 3000)
public class DepartmentDubboImpl implements DepartmentDubbo {

}
