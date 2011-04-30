package um.appl.cmp2.usuario.dobj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.empleado.dobj.EmpleadoDO;
import um.appl.cmp2.util.Utilidades;

@SuppressWarnings("serial")
@Entity
@Table(name="Usuario")
@SequenceGenerator(name="SEQ_GEN",sequenceName="USU_ID_SEQ_001" , allocationSize=1)
public class UsuarioDO extends DObj 
{
	private Long id;
	private String nombre;
	private String password;
	private String tipoPermiso;
	//Falta agregar atributo de reintentos de logueo
	//Falta Tiempo de session. al momento del alta va ser un valor default.
	private String estado;
	private String usuUltModif;
	private Date fechaUltModif; // EN LA BD PASARLO A DATETIME
	private Date fechaCambioEstado; // EN LA BD PASARLO A DATETIME
	private EmpleadoDO empleado;
	private Long optimistickLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name="USU_ID", nullable = false)
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
	@Column(name="USU_NOMBRE", nullable = false)
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
	 * @return the password
	 */
	@Column(name = "USU_PASSWORD", nullable = false)
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the tipoPermiso
	 */
	@Column(name="USU_TIPO_PERMISO")
	public String getTipoPermiso() {
		return tipoPermiso;
	}
	/**
	 * @param tipoPermiso the tipoPermiso to set
	 */
	public void setTipoPermiso(String tipoPermiso) {
		this.tipoPermiso = tipoPermiso;
	}
	/**
	 * @return the estado
	 */
	@Column(name="USU_ESTADO")
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) 
	{
		String temp = this.estado;
		this.estado = estado;
		
		if(this.estado != null && temp != null && !temp.equalsIgnoreCase(this.estado))
			setFechaCambioEstado(Utilidades.getFechaActual());	
	}
	
	/**
	 * @return the usuUltModif
	 */
	@Column(name="USU_ULT_MOD")
	public String getUsuUltModif() {
		return usuUltModif;
	}
	/**
	 * @param usuUltModif the usuUltModif to set
	 */
	public void setUsuUltModif(String usuUltModif) {
		this.usuUltModif = usuUltModif;
	}
	/**
	 * @return the fechaUltModif
	 */
	@Column(name="USU_FECHA_ULT_MODIF")
	public Date getFechaUltModif() {
		return fechaUltModif;
	}
	/**
	 * @param fechaUltModif the fechaUltModif to set
	 */
	public void setFechaUltModif(Date fechaUltModif) {
		this.fechaUltModif = fechaUltModif;
	}
	/**
	 * @return the optimistickLock
	 */
	@Version
	@Column(name="LOCK_CONTROL", nullable = false)
	public Long getOptimistickLock() {
		return optimistickLock;
	}
	/**
	 * @param optimistickLock the optimistickLock to set
	 */
	public void setOptimistickLock(Long optimistickLock) {
		this.optimistickLock = optimistickLock;
	}
	
	@PrePersist
	public void prePersist()
	{
		this.fechaUltModif = Utilidades.getFechaActual();
		this.fechaCambioEstado = Utilidades.getFechaActual();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltModif = Utilidades.getFechaActual();
	}
	
	@Override
	public Object domainObjectId()
	{
		return this.id;
	}
	
	/**
	 * @return the fechaCambioEstado
	 */
	@Column(name="USU_FECHA_CAMBIO_ESTADO",nullable = false)
	public Date getFechaCambioEstado() {
		return fechaCambioEstado;
	}
	/**
	 * @param fechaCambioEstado the fechaCambioEstado to set
	 */
	public void setFechaCambioEstado(Date fechaCambioEstado)
	{
		this.fechaCambioEstado = fechaCambioEstado;
	}
	/**
	 * @return the empleado
	 */
	@OneToOne(mappedBy="usuario")
	public EmpleadoDO getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(EmpleadoDO empleado) {
		this.empleado = empleado;
	}
	
	
	
	
}
