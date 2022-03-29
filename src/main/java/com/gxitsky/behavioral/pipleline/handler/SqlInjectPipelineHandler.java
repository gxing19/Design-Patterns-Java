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
public class SqlInjectPipelineHandler implements PipelineHandler<RequestContext> {
    @Override
    public boolean handle(RequestContext context) {
        log.info("----->防SQL注入处理");
        return false;
    }
}
