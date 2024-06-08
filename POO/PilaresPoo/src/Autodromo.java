public class Autodromo {
    public static void main(String[] args) {
        
        Carro jeep = new Carro();  
        jeep.setChassi("334FDE");
        jeep.ligar();
        
        Moto z400 = new Moto();        
        z400.setChassi("234CAE");
        z400.ligar();
        
        Carro coringa = jeep;
        coringa.ligar();
        
    }
}
