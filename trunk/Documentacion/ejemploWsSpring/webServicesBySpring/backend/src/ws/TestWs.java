/**
 * 
 */
package ws;

import javax.jws.WebService;

/**
 * @author Mariano
 *
 */
@WebService(endpointInterface="ws.IWs")
public class TestWs implements IWs{

	private static String HELLO = "Hola ";
	
	/**
	 * 
	 */
	@Override
	public String helloWorld(String name) {
		
		return HELLO+name;
	}

}
