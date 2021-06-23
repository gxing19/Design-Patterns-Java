package com.designpatterns.structural.facade.session;

/**
 * @author gxing
 * @desc
 * @date 2021/6/17
 */
public class StandardSession implements HttpSession, Session {

    private StandardSessionFacade facade;
    private String id;

    @Override
    public HttpSession getSession() {
        if (facade == null) {
            facade = new StandardSessionFacade(this);
        }
        return facade;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
