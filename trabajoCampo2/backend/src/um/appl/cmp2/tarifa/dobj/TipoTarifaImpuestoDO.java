package um.appl.cmp2.tarifa.dobj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import um.appl.cmp2.commons.dobj.DObj;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="TipoTarifa_Impuesto")
@SequenceGenerator(name="SEQ_GEN",sequenceName="TT_IMP_ID_SEQ_001",allocationSize=1)
public class TipoTarifaImpuestoDO extends DObj 
{
	private Long id;
	private TipoTarifaDO tipoTarifa;
	private ImpuestoDO impuesto;
	private Long optimisticLock;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQ_GEN")
	@Column(name="TTI_IMP_ID",nullable=false)
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
	 * @return the tipoTarifa
	 */
	@ManyToOne
	@JoinColumn(name="TTI_IMP_TTF_ID",nullable=false)
	public TipoTarifaDO getTipoTarifa() {
		return tipoTarifa;
	}
	/**
	 * @param tarifa the tipoTarifa to set
	 */
	public void setTipoTarifa(TipoTarifaDO tarifa) {
		this.tipoTarifa = tarifa;
	}
	/**
	 * @return the impuesto
	 */
	@ManyToOne
	@JoinColumn(name="TTI_IMP_IMP_ID",nullable=false)
	public ImpuestoDO getImpuesto() {
		return impuesto;
	}
	/**
	 * @param impuesto the impuesto to set
	 */
	public void setImpuesto(ImpuestoDO impuesto) {
		this.impuesto = impuesto;
	}
	/**
	 * @return the optimisticLock
	 */
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
