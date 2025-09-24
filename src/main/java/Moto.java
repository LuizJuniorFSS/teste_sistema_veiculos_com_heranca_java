public class Moto extends Veiculo {
    private int cilindradas;
    
    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    // Sobrescrevendo o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        System.out.println("=== Detalhes da Moto ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
    
    // Getter e Setter para cilindradas
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}