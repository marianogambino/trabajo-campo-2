package um.appl.cmp2.tarifa.dobj;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="Tipo_Tarifa")
@SequenceGenerator(name="SEQ_GEN",sequenceName="TTF_ID_SEQ_001",allocationSize=1)
public class TipoTarifaDO extends DObj 
{
	private Long id;
	private String descripcion;
	private Set<TipoTarifaImpuestoDO> impuestos;
	private String estado;
	private String usuarioModif;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_GEN")
	@Column(name="TTF_ID",nullable=false)
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
	@Column(name="TTF_DESCRIPCION",nullable=true)
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
	 * @return the impuestos
	 */
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "tipoTarifa")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<TipoTarifaImpuestoDO> getImpuestos() {
		return impuestos;
	}

	/**
	 * @param impuestos the impuestos to set
	 */
	public void setImpuestos(Set<TipoTarifaImpuestoDO> impuestos) {
		this.impuestos = impuestos;
	}

	/**
	 * @return the estado
	 */
	@Column(name="TTF_ESTADO",nullable=false)
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
	@Column(name="TTF_USU_ULT_MOD",nullable=false)
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
	@Column(name="TTF_FECHA_ULT_MOD",nullable=false)
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
	@Column(name="TTF_FECHA_CAMBIO_ESTADO",nullable=false)
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
