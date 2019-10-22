package ordenador;
/**
 *
 * @author jalvarezbarciela
 */
public class Ordenador {
    private Rato Rato=new Rato();
    private Pantalla Pantalla=new Pantalla();
    private CPU CPU=new CPU();
    public Ordenador(String tipo,String marca,float pulgada,int velocidade,int memoria){
        Rato=new Rato(tipo);
        Pantalla=new Pantalla(marca,pulgada);
        CPU=new CPU(velocidade,memoria);
    }
    public Ordenador(){
        
    }
    public void setRato(String tipo){
        Rato=new Rato(tipo);
    }
    public void setPantalla(String marca,float pulgadas){
        Pantalla=new Pantalla(marca,pulgadas);
    }
    public void setCPU(int velocidade,int memoria){
        CPU=new CPU(velocidade,memoria);
    }
    public void amosar(){
        System.out.println("Rato:"+Rato.getTipo()+"\nPantalla: \nMarca:"+Pantalla.getMarca()+"\nPulgadas:"+Pantalla.getPulgadas()+"\nCPU:\nVelocidade:"+CPU.getVelocidade()+"\nMemoria:"+CPU.getMemoria());
    }
}
