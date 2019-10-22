package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Ordenador {
    private Rato rato=new Rato();
    private Pantalla pantalla=new Pantalla();
    private CPU CPU=new CPU();
    public Ordenador(String tipo,String marca,float pulgada,int velocidade,int memoria){
        rato=new Rato(tipo);
        pantalla=new Pantalla(marca,pulgada);
        CPU=new CPU(velocidade,memoria);
    }
    public Ordenador(){
        
    }
    public void setRato(String tipo){
        rato=new Rato(tipo);
    }
    public void setPantalla(String marca,float pulgadas){
        pantalla=new Pantalla(marca,pulgadas);
    }
    public void setCPU(int velocidade,int memoria){
        CPU=new CPU(velocidade,memoria);
    }
    public Rato getRato(){
        return rato;
    }
    public Pantalla getPantalla(){
        return pantalla;
    }
    public CPU getCPU(){
        return CPU;
    }
    public void amosar(){
        System.out.println("Rato:"+rato.getTipo()+"\nPantalla: \nMarca:"+pantalla.getMarca()+"\nPulgadas:"+pantalla.getPulgadas()+"\nCPU:\nVelocidade:"+CPU.getVelocidade()+"\nMemoria:"+CPU.getMemoria());
    }
}
