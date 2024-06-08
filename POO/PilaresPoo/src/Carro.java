public class Carro extends Veiculo{
    
    public void ligar(){
        conferirCombustivel();
        System.out.println("Ligado");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
}
