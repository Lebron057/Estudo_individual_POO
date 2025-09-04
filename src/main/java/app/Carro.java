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
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Numero de portas: " + this.getNumeroDePortas());
    }

    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.setNumeroDePortas(numeroDePortas);
    }

    // método construtor com valor de portas fixo
    public Carro(String marca, String modelo, int ano){
        // A chamada 'this()' chama o outro construtor desta MESMA classe
        // Deve ser sempre a primeira linha.
        this(marca, modelo, ano, 4);
    }

    @Override
    public double calcularImposto(){
        return 1500.0;
    }
}