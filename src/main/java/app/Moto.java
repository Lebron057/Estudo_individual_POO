package app;

public class Moto extends Veiculo{
    private int cilindradas;

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    public int getCilindradas() {
        return cilindradas;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Moto ---");
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.getCilindradas());
    }

    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.setCilindradas(cilindradas);
    }

    @Override
    public double calcularImposto(){
        return 450.0;
    }
}