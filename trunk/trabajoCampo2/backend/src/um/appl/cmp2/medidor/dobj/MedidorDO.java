package um.appl.cmp2.medidor.dobj;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.util.Utilidades;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Medidor")
@SequenceGenerator(name="SEQ_GEN", sequenceName="MED_ID_SEQ_001",allocationSize=1)
public class MedidorDO extends DObj 
{
	private Long id;
	private String descripcion;
	private Boolean asignado;
	private Set<EstadoMedidorDO> estadosMedidor;//tiene que ser un set
	private String UsuarioMod;
	private String estado;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name="MED_ID",nullable=false)
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
	 * @return the descripcion
	 */
	@Column(name="MED_DESCRIPCION")
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the asignado
	 */
	@Column(name="MED_ASIGNADO", nullable = false)
	public Boolean getAsignado() {
		return asignado;
	}
	/**
	 * @param asignado the asignado to set
	 */
	public void setAsignado(Boolean asignado) {
		this.asignado = asignado;
	}
	/**
	 * @return the estadosMedidor
	 */
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="EMD_MED_ID" , nullable = false)
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<EstadoMedidorDO> getEstadosMedidor() {
		return estadosMedidor;
	}
	/**
	 * @param estadosMedidor the estadosMedidor to set
	 */
	public void setEstadosMedidor(Set<EstadoMedidorDO> estadosMedidor) {
		this.estadosMedidor = estadosMedidor;
	}
	
	/**
	 * @return the usuarioMod
	 */
	@Column(name="MED_USU_ULT_MOD",nullable=false)
	public String getUsuarioMod() {
		return UsuarioMod;
	}
	/**
	 * @param usuarioMod the usuarioMod to set
	 */
	public void setUsuarioMod(String usuarioMod) {
		UsuarioMod = usuarioMod;
	}
	/**
	 * @return the estado
	 */
	@Column(name="MED_ESTADO",nullable=false)
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		
		String temp = this.estado;
		this.estado = estado;
		if(temp != null && this.estado != null && !temp.equalsIgnoreCase(this.estado))
			this.fechaCambioEstado = Utilidades.getFechaActual();
	}
	/**
	 * @return the fechaUltMod
	 */
	@Column(name="MED_FECHA_ULT_MOD",nullable=false)
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
	@Column(name="MED_FECHA_CAMBIO_ESTADO",nullable=false)
	public Date getFechaCambioEstado() {
		return fechaCambioEstado;
	}
	/**
	 * @param fechaCambioEstado the fechaCambioEstado to set
	 */
	public void setFechaCambioEstado(Date fechaCambioEstado) {
		this.fechaCambioEstado = fechaCambioEstado;
	}
	
	@PrePersist
	public void prePersist()
	{
		this.fechaCambioEstado = Utilidades.getFechaActual();
		this.fechaUltMod = Utilidades.getFechaActual();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
	}
}