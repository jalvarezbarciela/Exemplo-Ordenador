package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Pantalla {
    private String marca;
    private float pulgadas;
    public Pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
        
    }
    public Pantalla(){
        
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setPulgadas(float pulgadas){
        this.pulgadas=pulgadas;
    }
    public String getMarca(){
        return marca;
    }
    public float getPulgadas(){
        return pulgadas;
    }
}
