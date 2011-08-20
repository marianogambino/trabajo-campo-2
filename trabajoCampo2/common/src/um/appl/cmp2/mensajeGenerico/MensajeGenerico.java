/**
 * 
 */
package um.appl.cmp2.mensajeGenerico;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import um.appl.cmp2.mensajeGenerico.itf.MensajeGenericoItf;


/**
 * @author Mariano
 *
 */
public class MensajeGenerico implements MensajeGenericoItf {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2633929855741663440L;
	private Boolean isMensaje = false;
	private String tipoMensaje;
	private String mensajeError;
	
	public static class Adapter extends XmlAdapter<MensajeGenerico, MensajeGenericoItf> {
		@Override
		public MensajeGenerico marshal(MensajeGenericoItf v) throws Exception {
		    return (MensajeGenerico) v;
		}
		
		@Override
		public MensajeGenericoItf unmarshal(MensajeGenerico v) throws Exception {
		    return v;
		}
	}
	
	
	
	/**
	 * 
	 */
	public MensajeGenerico() {
	}

	@Override
	public void setMensaje(Boolean isMensaje) {
		this.isMensaje = isMensaje;
	}

	@Override
	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;		
	}

	@Override
	public void setDescripcionMensaje(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	@Override
	public Boolean isMensaje() {
		return this.isMensaje;
	}

	@Override
	public String getTipoMensaje() {
		return this.tipoMensaje;
	}

	@Override
	public String getDescripcionMensaje() {
		return this.mensajeError;
	}

}
