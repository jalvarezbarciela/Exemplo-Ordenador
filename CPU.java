package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class CPU {
    private int velocidade;
    private int memoria;
    /**
     * Constructor con parametros
     * @param velocidade
     * @param memoria 
     */
    public CPU(int velocidade,int memoria){
       this.velocidade=velocidade;
       this.memoria=memoria;
    }
    public CPU(){
       
    }
    /**
     *Sirve para dar valor a velocidade
     *@param velocidade 
     */
    public void setVelocidade(int velocidade){
       this.velocidade=velocidade;
    }
    /**
     *Sirve para dar valor a memoria
     *@param memoria 
     */    
    public void setMemoria(int memoria){
       this.memoria=memoria; 
    }
    /**
     *Sirve para devolver el valor de velocidade
     *@return velocidade
     */    
    public int getVelocidade(){
        return velocidade;
    }
    /**
     *Sirve para devolver el valor de memoria 
     *@return memoria
     */    
    public int getMemoria(){
        return memoria;
    
    }
    
    
}
