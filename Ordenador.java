package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Ordenador {
    private Rato rato=new Rato();
    private Pantalla pantalla=new Pantalla();
    private CPU CPU=new CPU();
    /**
     * Constructor con parametros 
     * @param tipo
     * @param marca
     * @param pulgada
     * @param velocidade
     * @param memoria 
     */
    public Ordenador(String tipo,String marca,float pulgada,int velocidade,int memoria){
        rato=new Rato(tipo);
        pantalla=new Pantalla(marca,pulgada);
        CPU=new CPU(velocidade,memoria);
    }
    
    public Ordenador(){
        
    }
    /**
     * Metodo para dar valores
     * @param tipo 
     */
    public void setRato(String tipo){
        rato=new Rato(tipo);
    }
    /**
     * Metodo para dar valores
     * @param marca
     * @param pulgadas 
     */
    public void setPantalla(String marca,float pulgadas){
        pantalla=new Pantalla(marca,pulgadas);
    }
    /**
     * Metodo para dar valores
     * @param velocidade
     * @param memoria 
     */
    public void setCPU(int velocidade,int memoria){
        CPU=new CPU(velocidade,memoria);
    }
    /**
     * Metodo para recibir valores
     * @return rato
     */
    public Rato getRato(){
        return rato;
    }
    /**
     * Metodo para recibir valores
     * @return pantalla
     */
    public Pantalla getPantalla(){
        return pantalla;
    }
    /**
     * Metodo para recibir valores
     * @return CPU
     */
    public CPU getCPU(){
        return CPU;
    }
    public void amosar(){
        System.out.println("Rato:"+rato.getTipo()+"\nPantalla: \nMarca:"+pantalla.getMarca()+"\nPulgadas:"+pantalla.getPulgadas()+"\nCPU:\nVelocidade:"+CPU.getVelocidade()+"\nMemoria:"+CPU.getMemoria());
    }
}
