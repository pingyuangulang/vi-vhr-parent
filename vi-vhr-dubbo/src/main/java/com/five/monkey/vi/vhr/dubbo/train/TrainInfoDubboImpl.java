package com.five.monkey.vi.vhr.dubbo.train;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jim
 * @date 2021/3/26 14:59
 */
@DubboService(interfaceClass = TrainInfoDubbo.class, timeout = 3000)
public class TrainInfoDubboImpl implements TrainInfoDubbo {

}
