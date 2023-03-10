
package proxy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ReleveService", targetNamespace = "http://Metier/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReleveService {


    /**
     * 
     * @return
     *     returns proxy.Releve
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReleve", targetNamespace = "http://Metier/", className = "proxy.GetReleve")
    @ResponseWrapper(localName = "getReleveResponse", targetNamespace = "http://Metier/", className = "proxy.GetReleveResponse")
    @Action(input = "http://Metier/ReleveService/getReleveRequest", output = "http://Metier/ReleveService/getReleveResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Metier/ReleveService/getReleve/Fault/Exception")
    })
    public Releve getReleve()
        throws Exception_Exception
    ;

}
