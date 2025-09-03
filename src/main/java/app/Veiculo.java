package app;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
    
    public void exibirDetalhes(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
    }

    public Veiculo(String marca, String modelo, int ano){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public abstract double calcularImposto();
}