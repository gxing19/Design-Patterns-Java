package com.designpatterns.structural.abstractfacade;

/**
 * @author gxing
 * @desc
 * @date 2021/6/17
 */
public class StandardSessionFacade implements HttpSession {

    private HttpSession httpSession;

    public StandardSessionFacade(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    @Override
    public String getId() {
        return httpSession.getId();
    }
}
