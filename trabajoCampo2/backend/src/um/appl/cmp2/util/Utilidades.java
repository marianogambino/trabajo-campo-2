package um.appl.cmp2.util;

import java.util.Date;



public class Utilidades 
{
	public static java.util.Date getFechaActual()
	{
		//Si trabajara con EJB deberia tener un Bdlg en donde el service locator
		// haga el loockup para obtener el EJB y luego al mismo llamar al metodo getFechaActual.
		return new Date();
	}
}
