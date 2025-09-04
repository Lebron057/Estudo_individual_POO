package app;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

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

    // A palavra "final" aqui proíbe que qualquer subclasse (Carro, Moto, etc.)
    // possa criar um método com o mesmo nome "getDescricaoCompleta".
    public final String getDescricaoCompleta(){

        // Usamos 'this' para nos referirmos aos atributos do próprio objeto.
        return "Veiculo: " + this.marca + " " + this.modelo + " (" + this.ano + ")";
        }

    @Override
    public String toString(){
        return "Veiculo: " + this.marca + " " + this.modelo + " (" + this.ano + ")";
    }

    public Veiculo(String marca, String modelo, int ano){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public abstract double calcularImposto();
}