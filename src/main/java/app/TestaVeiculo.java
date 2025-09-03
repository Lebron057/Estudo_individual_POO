package app;

public class TestaVeiculo{
    public static void main(String[] args){
        Carro c1 = new Carro();
        Moto m1 = new Moto();

        c1.setMarca("Ferrari");
        c1.setModelo("SF90");
        c1.setAno(2024);
        c1.setNumeroDePortas(2);

        m1.setMarca("Honda");
        m1.setModelo("CB-300");
        m1.setAno(2016);
        m1.setCilindradas(300);

        System.out.println("--- Detalhes do Carro ---");
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Numero de portas: " + c1.getNumeroDePortas() + "\n");
        
        System.out.println("\n--- Detalhes do Moto ---");
        System.out.println("Marca: " + m1.getMarca());
        System.out.println("Modelo: " + m1.getModelo());
        System.out.println("Ano: " + m1.getAno());
        System.out.println("Cilindradas: " + m1.getCilindradas());

    }
}