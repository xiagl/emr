package com.zxit.wbss.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * <p>
 * <pre>
 * lbs service = new lbs();
 * LbsSoap portType = service.getLbsSoap();
 * portType.requestLocation(...);
 * </pre>
 * <p>
 * </p>
 */
@WebServiceClient(name = "lbs", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/C:/ecc.wsdl")
public class Lbs extends Service {

    private final static URL LBS_WSDL_LOCATION;
    private final static Logger logger = Logger
            .getLogger(com.zxit.wbss.soap.Lbs.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.zxit.wbss.soap.Lbs.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/ecc.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/ecc.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        LBS_WSDL_LOCATION = url;
    }

    public Lbs(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Lbs() {
        super(LBS_WSDL_LOCATION, new QName("http://tempuri.org/", "lbs"));
    }

    /**
     * @return returns LbsSoap
     */
    @WebEndpoint(name = "lbsSoap")
    public LbsSoap getLbsSoap() {
        return super.getPort(new QName("http://tempuri.org/", "lbsSoap"),
                LbsSoap.class);
    }

    /**
     * @return returns LbsSoap
     */
    @WebEndpoint(name = "lbsSoap12")
    public LbsSoap getLbsSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "lbsSoap12"),
                LbsSoap.class);
    }

    /**
     * @return returns LbsHttpGet
     */
    @WebEndpoint(name = "lbsHttpGet")
    public LbsHttpGet getLbsHttpGet() {
        return super.getPort(new QName("http://tempuri.org/", "lbsHttpGet"),
                LbsHttpGet.class);
    }

    /**
     * @return returns LbsHttpPost
     */
    @WebEndpoint(name = "lbsHttpPost")
    public LbsHttpPost getLbsHttpPost() {
        return super.getPort(new QName("http://tempuri.org/", "lbsHttpPost"),
                LbsHttpPost.class);
    }

}
