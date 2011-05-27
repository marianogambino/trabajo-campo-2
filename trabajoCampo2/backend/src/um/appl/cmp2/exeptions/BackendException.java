/**
 * 
 */
package um.appl.cmp2.exeptions;

import um.appl.cmp2.mensajeGenerico.itf.MensajeGenericoItf;
import um.appl.cmp2.util.constantes.Constantes;

/**
 * @author Mariano
 *
 */
public class BackendException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8786932975033369247L;
	private String tipoError = Constantes.TEXTO_VACIO;
    private String mensajeError = Constantes.TEXTO_VACIO;
    //private static final Log log = LogFactory.getLog(BackendException.class);
	
	/**
	 * 
	 */
	public BackendException() {
		// TODO Auto-generated constructor stub
	}

    public BackendException(String tipoError, String mensajeError) {
          this.tipoError = tipoError;
          this.mensajeError = mensajeError;
    }



    public BackendException(Exception e) {
          this.tipoError = Constantes.TIPO_ERROR_ERROR;
          this.mensajeError = e.getMessage();
    }

    public void setMensaje(MensajeGenericoItf mensajeCarrier) {
          mensajeCarrier.setMensaje(true);
          mensajeCarrier.setTipoMensaje(this.tipoError);
          mensajeCarrier.setDescripcionMensaje(this.mensajeError);
          //log.error(mensajeCarrier);

    }
}
