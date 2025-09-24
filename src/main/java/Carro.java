public class Carro extends Veiculo {
    private int numeroPortas;
    
    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }
    
    // Sobrescrevendo o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Carro ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Portas: " + numeroPortas);
    }
    
    // Getter e Setter para numeroPortas
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}