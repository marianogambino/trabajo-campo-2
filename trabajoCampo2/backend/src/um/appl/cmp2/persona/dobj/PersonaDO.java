package um.appl.cmp2.persona.dobj;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.util.Utilidades;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="PERSONA")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="PER_TYPE", discriminatorType = DiscriminatorType.STRING,length=1)
@SequenceGenerator(name="SEQ_GEN", sequenceName="PER_ID_SEQ_001")
public abstract class PersonaDO extends DObj 
{
	private Long id;
	private String nombre;
	private String apellido;
	private BigDecimal dni;
	private String telefono;
	private String email;
	private String telefono2;
	private String type;
	private String estado;
	private String usuarioModif;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name="PER_ID", nullable = false)
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
	@Column(name="PER_NOMBRE")
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
	 * @return the apellido
	 */
	@Column(name="PER_APELLIDO")
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the dni
	 */
	@Column(name="PER_DNI")
	public BigDecimal getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}
	/**
	 * @return the telefono
	 */
	@Column(name="PER_TELEFONO")
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the email
	 */
	@Column(name="PER_EMAIL")
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefono2
	 */
	@Column(name="PER_TELEFONO2")
	public String getTelefono2() {
		return telefono2;
	}
	/**
	 * @param telefono2 the telefono2 to set
	 */
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	/**
	 * @return the type
	 */
	@Column(name="PER_TYPE")
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the estado
	 */
	@Column(name="PER_ESTADO")
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		
		String temp = this.estado;
		this.estado = estado;
		if(temp != null && this.estado!=null && !temp.equalsIgnoreCase(this.estado))
			setFechaCambioEstado(Utilidades.getFechaActual());
	}
	
	/**
	 * @return the usuarioModif
	 */
	@Column(name="PER_USU_ULT_MOD")
	public String getUsuarioModif() {
		return usuarioModif;
	}
	
	/**
	 * @param usuarioModif the usuarioModif to set
	 */
	public void setUsuarioModif(String usuarioModif) {
		this.usuarioModif = usuarioModif;
	}
	/**
	 * @return the fechaUltMod
	 */
	@Column(name="PER_FECHA_ULT_MOD")
	public Date getFechaUltMod() {
		return fechaUltMod;
	}
	
	/**
	 * @param fechaUltMod the fechaUltMod to set
	 */
	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}
	/**
	 * @return the fechaCambioEstado
	 */
	@Column(name="PER_FECHA_CAMBIO_ESTADO")
	public Date getFechaCambioEstado() {
		return fechaCambioEstado;
	}
	/**
	 * @param fechaCambioEstado the fechaCambioEstado to set
	 */
	public void setFechaCambioEstado(Date fechaCambioEstado) {
		this.fechaCambioEstado = fechaCambioEstado;
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
	
	/**
	 * Antes de persistir
	 */
	@PrePersist
	public void prePersist()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
		this.fechaCambioEstado = Utilidades.getFechaActual();
	}
	
	/**
	 * Ante de actualizar
	 */
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
	}
	
	/**
	 * Id
	 */
	@Override
	public Object domainObjectId()
	{
		return this.id;
	}
}
