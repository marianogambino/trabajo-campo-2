/**
 * 
 */
package testClientWs;

/**
 * @author Mariano
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = ClientWs.get_Interface().srv.helloWorld("MARIANO");
		System.out.println(name);
	}

}
