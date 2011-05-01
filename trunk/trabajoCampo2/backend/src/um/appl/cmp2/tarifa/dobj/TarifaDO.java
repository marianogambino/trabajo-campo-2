package um.appl.cmp2.tarifa.dobj;

import java.math.BigDecimal;
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

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.util.Utilidades;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Tarifa")
@SequenceGenerator(name="SEQ_GEN",sequenceName="TAR_ID_SEQ_001",allocationSize=1)
public class TarifaDO extends DObj 
{
	private Long id;
	private BigDecimal precioKwh;
	private TipoTarifaDO tipoTarifa;
	private String estado;
	private String usuarioModif;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_GEN")
	@Column(name="TAR_ID",nullable=false)
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
	 * @return the precioKwh
	 */
	@Column(name="TAR_PRECIO_KWH",nullable=false)
	public BigDecimal getPrecioKwh() {
		return precioKwh;
	}
	/**
	 * @param precioKwh the precioKwh to set
	 */
	public void setPrecioKwh(BigDecimal precioKwh) {
		this.precioKwh = precioKwh;
	}
	/**
	 * @return the tipoTarifa
	 */
	@OneToOne
	@JoinColumn(name="TAR_TTF_ID",nullable=false)
	public TipoTarifaDO getTipoTarifa() {
		return tipoTarifa;
	}
	/**
	 * @param tipoTarifa the tipoTarifa to set
	 */
	public void setTipoTarifa(TipoTarifaDO tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	/**
	 * @return the estado
	 */
	@Column(name="TAR_ESTADO",nullable=false)
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
	 * @return the usuarioModif
	 */
	@Column(name="TAR_USU_ULT_MOD",nullable=false)
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
	@Column(name="TAR_FECHA_ULT_MOD",nullable=false)
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
	@Column(name="TAR_FECHA_CAMBIO_ESTADO",nullable=false)
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
		this.fechaUltMod = Utilidades.getFechaActual();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
	}
}
