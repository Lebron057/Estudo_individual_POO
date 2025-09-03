package app;

public class Caminhao extends Veiculo{
    private int numeroDeEixos;

    public void setNumeroDeEixos(int numeroDeEixos){
        this.numeroDeEixos = numeroDeEixos;
    }
    public int getNumerodeEixos(){
        return numeroDeEixos;
    }

    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Caminhao ---");
        super.exibirDetalhes();
        System.out.println("Numero de eixos: " + this.getNumerodeEixos());
    }

    public Caminhao(String marca, String modelo, int ano, int numeroDeEixos){
        super(marca, modelo, ano);
        this.setNumeroDeEixos(numeroDeEixos);
    }

    @Override
    public double calcularImposto(){
        return 500.0 * numeroDeEixos;
    }
}