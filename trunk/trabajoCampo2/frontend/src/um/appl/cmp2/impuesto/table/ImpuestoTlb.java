/**
 * 
 */
package um.appl.cmp2.impuesto.table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;

import um.appl.cmp2.tarifa.cobj.ImpuestoCObj;

/**
 * @author Mariano
 *
 */
@ManagedBean(name="impuestoTlb")
public class ImpuestoTlb implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7412275737083793818L;
	
	private Set<ImpuestoCObj> impuestos;
	private ImpuestoCObj selectedImpuesto;
	
	/**
	 * 
	 */
	public ImpuestoTlb(){
		impuestos = new HashSet<ImpuestoCObj>();
		//llamar al servicio para obtener la lista de impuestos.
	}
	
	/**
	 * @return the impuestos
	 */
	public Set<ImpuestoCObj> getImpuestos() {
		return impuestos;
	}
	/**
	 * @param impuestos the impuestos to set
	 */
	public void setImpuestos(Set<ImpuestoCObj> impuestos) {
		this.impuestos = impuestos;
	}

	/**
	 * @return the selectedImpuesto
	 */
	public ImpuestoCObj getSelectedImpuesto() {
		return selectedImpuesto;
	}

	/**
	 * @param selectedImpuesto the selectedImpuesto to set
	 */
	public void setSelectedImpuesto(ImpuestoCObj selectedImpuesto) {
		this.selectedImpuesto = selectedImpuesto;
	}
	
	
	
	
	
}
