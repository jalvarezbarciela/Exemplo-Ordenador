package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Rato {
    private String tipo;
    /**
     * Constructor con parametros
     * @param tipo 
     */
    public Rato(String tipo){
        this.tipo=tipo;
    }
    public Rato(){
    
    }

    /**
     * Metodo para dar valor
     * @param tipo 
     */
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    /**
     * Metodo para recibir valores
     * @return tipo
     */
    public String getTipo(){
        return tipo;
    }
    
}
