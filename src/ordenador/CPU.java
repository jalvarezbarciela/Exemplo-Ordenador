package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class CPU {
    private int velocidade;
    private int memoria;
    
    public CPU(int velocidade,int memoria){
       this.velocidade=velocidade;
       this.memoria=memoria;
    }
    public CPU(){
        
    }
    public void setVelocidade(int velocidade){
       this.velocidade=velocidade;
    }
    public void setMemoria(int memoria){
       this.memoria=memoria; 
    }
    public int getVelocidade(){
        return velocidade;
    }
    public int getMemoria(){
        return memoria;
        
    }
    
    
}
