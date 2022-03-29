package com.gxitsky.behavioral.pipleline.handler;

import com.gxitsky.behavioral.pipleline.PipelineHandler;
import com.gxitsky.behavioral.pipleline.RequestContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author gxing
 * @desc Token 校验
 * @date 2022/3/29
 */
@Slf4j
public class TokenVerifyPipelineHandler implements PipelineHandler<RequestContext> {
    @Override
    public boolean handle(RequestContext context) {
        log.info("----->Token校验处理");
        return false;
    }
}
