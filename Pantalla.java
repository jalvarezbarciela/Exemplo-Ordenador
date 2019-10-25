package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Pantalla {
    private String marca;
    private float pulgadas;
    /**
     * Constructor con parametros
     * @param marca
     * @param pulgadas 
     */
    public Pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
        
    }
    
    public Pantalla(){
        
    }
    /**
     * Metodo para dar valores
     * @param marca 
     */
    public void setMarca(String marca){
        this.marca=marca;
    }
    /**
     * Metodo para dar valores
     * @param pulgadas 
     */
    public void setPulgadas(float pulgadas){
        this.pulgadas=pulgadas;
    }
    /**
     * Metodo para recibir valores
     * @return marca
     */
    public String getMarca(){
        return marca;
    }
    /**
     * Metodo para recibir valores
     * @return pulgadas
     */
    public float getPulgadas(){
        return pulgadas;
    }
}
