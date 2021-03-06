package ins.outweb.serviceimpl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import ins.outweb.service.SinosoftInter;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-03-03T17:57:45.456+08:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "SinosoftWebInterService", 
                  wsdlLocation = "http://taotaoapp.6655.la:21093/basic/webservice?wsdl",
                  targetNamespace = "http://serviceimpl.outweb.ins/") 
public class SinosoftWebInterService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://serviceimpl.outweb.ins/", "SinosoftWebInterService");
    public final static QName SinosoftWebInterPort = new QName("http://serviceimpl.outweb.ins/", "SinosoftWebInterPort");
    static {
        URL url = null;
        try {
            url = new URL("http://taotaoapp.6655.la:21093/basic/webservice?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SinosoftWebInterService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://taotaoapp.6655.la:21093/basic/webservice?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SinosoftWebInterService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SinosoftWebInterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SinosoftWebInterService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SinosoftWebInterService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SinosoftWebInterService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SinosoftWebInterService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SinosoftInter
     */
    @WebEndpoint(name = "SinosoftWebInterPort")
    public SinosoftInter getSinosoftWebInterPort() {
        return super.getPort(SinosoftWebInterPort, SinosoftInter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SinosoftInter
     */
    @WebEndpoint(name = "SinosoftWebInterPort")
    public SinosoftInter getSinosoftWebInterPort(WebServiceFeature... features) {
        return super.getPort(SinosoftWebInterPort, SinosoftInter.class, features);
    }

}
