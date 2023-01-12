
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ReleveServiceService", targetNamespace = "http://Metier/", wsdlLocation = "http://localhost:8080/?wsdl")
public class ReleveServiceService
    extends Service
{

    private final static URL RELEVESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException RELEVESERVICESERVICE_EXCEPTION;
    private final static QName RELEVESERVICESERVICE_QNAME = new QName("http://Metier/", "ReleveServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RELEVESERVICESERVICE_WSDL_LOCATION = url;
        RELEVESERVICESERVICE_EXCEPTION = e;
    }

    public ReleveServiceService() {
        super(__getWsdlLocation(), RELEVESERVICESERVICE_QNAME);
    }

    public ReleveServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RELEVESERVICESERVICE_QNAME, features);
    }

    public ReleveServiceService(URL wsdlLocation) {
        super(wsdlLocation, RELEVESERVICESERVICE_QNAME);
    }

    public ReleveServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RELEVESERVICESERVICE_QNAME, features);
    }

    public ReleveServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReleveServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReleveService
     */
    @WebEndpoint(name = "ReleveServicePort")
    public ReleveService getReleveServicePort() {
        return super.getPort(new QName("http://Metier/", "ReleveServicePort"), ReleveService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReleveService
     */
    @WebEndpoint(name = "ReleveServicePort")
    public ReleveService getReleveServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Metier/", "ReleveServicePort"), ReleveService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RELEVESERVICESERVICE_EXCEPTION!= null) {
            throw RELEVESERVICESERVICE_EXCEPTION;
        }
        return RELEVESERVICESERVICE_WSDL_LOCATION;
    }

}
