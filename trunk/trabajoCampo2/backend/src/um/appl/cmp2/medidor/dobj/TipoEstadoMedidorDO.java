package um.appl.cmp2.medidor.dobj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.commons.dobj.DObj;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Tipo_Estado_Medidor")
@SequenceGenerator(name="SEQ_GEN", sequenceName="TEM_ID_SEQ_001", allocationSize=1)
public class TipoEstadoMedidorDO extends DObj 
{
	private Long id;
	private String descripcion;
	private String usuarioMod;
	private String estado;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name="TEM_ID",nullable=false)
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
	@Column(name="TEM_DESCRIPCION" , nullable=true)
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
	 * @return the usuarioMod
	 */
	@Column(name="TEM_USU_ULT_MOD",nullable=false)
	public String getUsuarioMod() {
		return usuarioMod;
	}
	/**
	 * @param usuarioMod the usuarioMod to set
	 */
	public void setUsuarioMod(String usuarioMod) {
		this.usuarioMod = usuarioMod;
	}
	/**
	 * @return the estado
	 */
	@Column(name="TEM_ESTADO",nullable=false)
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the fechaUltMod
	 */
	@Column(name="TEM_FECHA_ULT_MOD", nullable=false)
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
	@Column(name="TEM_FECHA_CAMBIO_ESTADO",nullable=false)
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
	@Column(name="LOCK_CONTROL",nullable=false)
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
