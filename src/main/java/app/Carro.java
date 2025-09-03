package app;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Carro ---");
        super.exibirDetalhes();
        System.out.println("Numero de portas: " + this.getNumeroDePortas());
    }

    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.setNumeroDePortas(numeroDePortas);
    }

    @Override
    public double calcularImposto(){
        return 1500.0;
    }
}