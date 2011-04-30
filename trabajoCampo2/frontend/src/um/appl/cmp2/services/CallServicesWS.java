/**
 * 
 */
package um.appl.cmp2.services;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import um.appl.cmp2.ws.IWs;

/**
 * @author Mariano
 *
 */
public class CallServicesWS implements ICallServices{

	private static CallServicesWS ret;
	public IWs srv;
    public static String url = "http://localhost:9080/EEbackend/ws/EEws";
 
    private CallServicesWS () {
    	
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IWs.class);
        factory.setAddress(url);
        srv = (IWs) factory.create();
 
        // Turn off chunking so that NTLM can occur
        Client client = ClientProxy.getClient(srv);
        HTTPConduit http = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(36000);
        httpClientPolicy.setAllowChunking(false);
        http.setClient(httpClientPolicy);
    }
 
    private static synchronized CallServicesWS get_Interface() {
 
        if (ret == null)
            ret = new CallServicesWS();
        return ret;
    }

    /**
     * Obtiene la interface para la llama a los servicios.
     */
	@Override
	public CallServicesWS getInterface() {
		return get_Interface();
	}
	
}
