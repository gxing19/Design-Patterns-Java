package resttemplate;

public abstract class InterceptAccessor extends HttpAccessor {

    private MyRequestFactory interceptingRequestFactory;

    @Override
    public MyRequestFactory getRequestFactory() {
        MyRequestFactory factory = this.interceptingRequestFactory;
        if (factory == null) {
            factory = new MyInterceptingRequestFactory(super.getRequestFactory());
            this.interceptingRequestFactory = factory;
            return factory;
        } else {
            return super.getRequestFactory();
        }
    }
}
