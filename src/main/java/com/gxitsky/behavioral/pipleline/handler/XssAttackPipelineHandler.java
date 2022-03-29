package com.gxitsky.behavioral.pipleline.handler;

import com.gxitsky.behavioral.pipleline.PipelineHandler;
import com.gxitsky.behavioral.pipleline.RequestContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author gxing
 * @desc TODO
 * @date 2022/3/29
 */
@Slf4j
public class XssAttackPipelineHandler implements PipelineHandler<RequestContext> {
    @Override
    public boolean handle(RequestContext context) {
        log.info("----->防XSS攻击处理");
        return true;
    }
}
