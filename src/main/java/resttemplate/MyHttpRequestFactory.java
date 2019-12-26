package resttemplate;

public class MyHttpRequestFactory implements MyRequestFactory {

    @Override
    public String createRequest(String str) {
        return str + " MyHttpRequestFactory";
    }
}
