/**
 * 
 */
package um.appl.cmp2.impuesto.form;

import java.math.BigDecimal;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.tarifa.cobj.ImpuestoCObj;

/**
 * @author Mariano
 *
 */
public class ImpuestoForm extends Common {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3539084971137021848L;

	private ImpuestoCObj impuesto;
	
	
	/**
	 * @return the valorPorcentaje
	 */
	public BigDecimal getValorPorcentaje() {
		return impuesto.getValorPorcentaje();
	}
	
	/**
	 * @param valorPorcentaje the valorPorcentaje to set
	 */
	public void setValorPorcentaje(BigDecimal valorPorcentaje) {
		this.impuesto.setValorPorcentaje(valorPorcentaje);
	}
	
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return this.impuesto.getDescripcion();
	}
	
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.impuesto.setDescripcion(descripcion);
	}
	
	
	
}
