package com.gxitsky.behavioral.pipleline.handler;

import com.gxitsky.behavioral.pipleline.PipelineHandler;
import com.gxitsky.behavioral.pipleline.RequestContext;

/**
 * @author gxing
 * @desc 白名单
 * @date 2022/3/29
 */
public class WhiteListPipelineHandler implements PipelineHandler<RequestContext> {
    @Override
    public boolean handle(RequestContext context) {
        return false;
    }
}
