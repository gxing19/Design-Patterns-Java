package resttemplate;

public class MyInterceptingRequestFactory implements MyRequestFactory {

    private volatile MyRequestFactory interceptingRequestFactory;

    public MyInterceptingRequestFactory() {
    }

    public MyInterceptingRequestFactory(MyRequestFactory interceptingRequestFactory) {
        this.interceptingRequestFactory = interceptingRequestFactory;
    }

    public MyRequestFactory getInterceptingRequestFactory() {
        return interceptingRequestFactory;
    }

    public MyInterceptingRequestFactory setInterceptingRequestFactory(MyRequestFactory interceptingRequestFactory) {
        this.interceptingRequestFactory = interceptingRequestFactory;
        return this;
    }

    @Override
    public String createRequest(String str) {
        return str + " MyInterceptingRequestFactory";
    }
}
