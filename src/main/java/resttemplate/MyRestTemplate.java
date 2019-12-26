package resttemplate;

public class MyRestTemplate extends InterceptAccessor {

    protected void doExecute() {
        String request = createRequest("Hello World");

        System.out.println(request);
    }
}
