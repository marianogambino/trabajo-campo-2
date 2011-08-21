/**
 * 
 */
package um.appl.cmp2.impuesto.table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import um.appl.cmp2.tarifa.cobj.ImpuestoCObj;

/**
 * @author Mariano
 *
 */
@ManagedBean
@ViewScoped
public class ImpuestoView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7412275737083793818L;
	
	private List<ImpuestoCObj> impuestos;
	private ImpuestoCObj selectedImpuesto;
	
	private String descripcion;
	private String valor;
	
	/**
	 * @return the descripcion
	 */
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
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * 
	 */
	public ImpuestoView(){
		impuestos = new ArrayList<ImpuestoCObj>();
		selectedImpuesto = new ImpuestoCObj();
		//llamar al servicio para obtener la lista de impuestos.
	}
	
	/**
	 * @return the impuestos
	 */
	public List<ImpuestoCObj> getImpuestos() {
		return impuestos;
	}
	/**
	 * @param impuestos the impuestos to set
	 */
	public void setImpuestos(List<ImpuestoCObj> impuestos) {
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
	
	public void add(){
		ImpuestoCObj imp = new ImpuestoCObj();
		imp.setDescripcion(descripcion);
		imp.setValorPorcentaje(new BigDecimal(valor));
		
		impuestos.add(imp);
	}
	
	
	
}
