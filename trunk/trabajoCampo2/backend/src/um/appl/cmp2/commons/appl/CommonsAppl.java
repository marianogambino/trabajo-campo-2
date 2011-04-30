package um.appl.cmp2.commons.appl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import um.appl.cmp2.commons.itf.CommonsItf;
import um.appl.cmp2.util.constantes.Constantes;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings({ "unused", "serial" })
public class CommonsAppl implements CommonsItf
{	
	private EntityManager em;
	
	public CommonsAppl()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constantes.CONECTION_HIBERNATE);
		em = emf.createEntityManager();
	}
	
	
}
