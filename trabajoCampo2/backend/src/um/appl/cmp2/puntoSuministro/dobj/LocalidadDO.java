package um.appl.cmp2.puntoSuministro.dobj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.apache.log4j.Logger;

import um.appl.cmp2.commons.dobj.DObj;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="LOCALIDAD")
public class LocalidadDO extends DObj 
{
	static Logger logger = Logger.getLogger(LocalidadDO.class);
	
	private Long id;
	private String nombre;
	private String cp;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="LOC_ID" , nullable = false)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	@Column(name="LOC_NOMBRE")
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cp
	 */
	@Column(name="LOC_CP")
	public String getCp() {
		return cp;
	}
	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * @return the optimisticLock
	 */
	@Version
	@Column(name="LOCK_CONTROL")
	public Long getOptimisticLock() {
		return optimisticLock;
	}
	/**
	 * @param optimisticLock the optimisticLock to set
	 */
	public void setOptimisticLock(Long optimisticLock) {
		this.optimisticLock = optimisticLock;
	}
}
