package testClientWs;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import ws.IWs;

/** 
 * 
 * @author Mariano
 *
 */
public class ClientWs {

	private static ClientWs ret;
	public IWs srv;
    public static String url = "http://localhost:9080/hello/ws/helloWorld";
 
    private ClientWs () {
    	
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
 
    public static synchronized ClientWs get_Interface() {
 
        if (ret == null)
            ret = new ClientWs();
 
        return ret;
    }
 
   
	
}