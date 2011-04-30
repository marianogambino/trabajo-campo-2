package um.appl.cmp2.util;

import um.appl.cmp2.util.appl.UtilAppl;


public class Utilidades 
{
	public static java.util.Date getFechaActual()
	{
		//Si trabajara con EJB deberia tener un Bdlg en donde el service locator
		// haga el loockup para obtener el EJB y luego al mismo llamar al metodo getFechaActual.
		return UtilAppl.getFechaActual();
	}
}
