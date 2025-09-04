package app;

public class TestaVeiculo{

    public static void printLine(int count) {
        System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.print("=");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Veiculo[] frota = new Veiculo[4];
        frota[0] = new Carro("Ferrari", "SF90", 2024, 2);
        frota[1] = new Moto("Honda", "CB-300", 2016, 300);
        frota[2] = new Caminhao("Mercedez", "VUC", 2020, 2);
        frota[3] = new Carro("Porsche", "Carrera", 2023);

        for(Veiculo veiculo : frota){

            veiculo.exibirDetalhes();
            System.out.println("Imposto do veiculo: " + veiculo.calcularImposto());
            
            if(veiculo instanceof Carro){ // "instanceof" verifica se a variavel veiculo é da classe Carro
                Carro carroEspecifico = (Carro) veiculo; // Isso é o cast
                System.out.println("Este carro tem " + carroEspecifico.getNumeroDePortas() + " portas.");
            }
            
            if(veiculo instanceof Caminhao){
                Caminhao caminhaoEspecifico = (Caminhao) veiculo;
                System.out.println("Este caminhão tem " + caminhaoEspecifico.getNumerodeEixos() + " eixos.");
            }
            
            System.out.println(veiculo); // O Java chama o veiculo.toString() automaticamente!
            printLine(40);
        }
    }
}