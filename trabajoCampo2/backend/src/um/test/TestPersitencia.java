package um.test;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import um.appl.cmp2.empleado.dobj.EmpleadoDO;
import um.appl.cmp2.util.constantes.Constantes;




public class TestPersitencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//persistirEmpleado();
		consultarEmpleado();
	}
	
	public static void persistirEmpleado()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constantes.CONECTION_HIBERNATE);
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		EmpleadoDO emp = new EmpleadoDO();
		
		emp.setApellido("dasf");
		emp.setNombre("sadf");
		emp.setDni(new BigDecimal(28751161));
		emp.setEmail("marianogambino@gmail.com");
		emp.setEstado("A");
		emp.setTelefono("46247287");
		emp.setTelefono2("1564707216");
		emp.setType("E");
		emp.setUsuarioModif("Mariano");
		
		
		/*LocalidadDO loc = new LocalidadDO();
		loc.setCp("145714");
		loc.setNombre("Iuzai6464ngo");
		loc.setOptimisticLock(0L);
		loc.setId(3L);*/
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
	}
	
	private static void consultarEmpleado()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constantes.CONECTION_HIBERNATE);
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from EmpleadoDO e where e.id = :val");
		q.setParameter("val", 650L);
		EmpleadoDO emp = (EmpleadoDO)q.getResultList().get(0);
		
		if(emp!=null)
			System.out.println(emp.getNombre()+" - "+emp.getApellido());
		
	}

}
