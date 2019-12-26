package resttemplate;

public abstract class HttpAccessor {

    MyRequestFactory requestFactory = new MyHttpRequestFactory();

    public MyRequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    protected String createRequest(String str) {
        return getRequestFactory().createRequest(str);
    }
}
