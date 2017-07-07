package mythremote;

import mythapi.frontend.Frontend;
import mythapi.frontend.FrontendServices;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by felix on 19/06/17.
 */
public class Helper {

    public static boolean SendKey(String host, String port, String key) throws MalformedURLException
    {
        boolean response;
        String wsdlLocation = "http://%s:%d/%s/wsdl";
        int parsedPort = Integer.parseInt(port);
        URL frontEndApiServiceUrl = new URL(String.format(wsdlLocation, host, parsedPort, "Frontend"));
        FrontendServices frontEndServices = new FrontendServices(frontEndApiServiceUrl);
        Frontend frontend = frontEndServices.getBasicHttpBindingFrontend();

        response = frontend.sendKey(key);

        return response;
    }
}
