package um.appl.cmp2.puntoSuministro.dobj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.tarifa.dobj.TarifaDO;
import um.appl.cmp2.util.Utilidades;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Tipo_Punto_Suministro")
@SequenceGenerator(name="SEQ_GEN",sequenceName="TPS_ID_SEQ_001",allocationSize=1)
public class TipoPuntoSuministroDO extends DObj
{
	private Long id;
	private String descripcion;
	private String estado;
	private TarifaDO tarifa;
	private String usuarioMod;
	private Date fechaUltModif;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name="TPS_ID",nullable = false)
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
	@Column(name="TPS_DESCRIPCION",nullable = true)
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
	 * @return the estado
	 */
	@Column(name="TPS_ESTADO", nullable=false)
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
	 * @return the tarifa
	 */
	@OneToOne
	@JoinColumn(name="TPS_TAR_ID",nullable=false)
	public TarifaDO getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(TarifaDO tarifa) {
		this.tarifa = tarifa;
	}
	/**
	 * @return the usuarioMod
	 */
	@Column(name="TPS_USU_ULT_MOD",nullable=false)
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
	 * @return the fechaUltModif
	 */
	@Column(name="TPS_FECHA_ULT_MOD",nullable=false)
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
	 * @return the fechaCambioEstado
	 */
	@Column(name="TPS_FECHA_CAMBIO_ESTADO",nullable=false)
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
	
	@PrePersist
	public void prePersist()
	{
		this.fechaCambioEstado = Utilidades.getFechaActual();
		this.fechaUltModif = Utilidades.getFechaActual();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltModif = Utilidades.getFechaActual();
	}
	
}
