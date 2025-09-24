public class TesteSistemaVeiculos {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE VEÍCULOS ===\n");
        
        // Criando um objeto da classe Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 4);
        Carro carro2 = new Carro("Honda", "Civic", 2022, 4);
        
        // Criando um objeto da classe Moto
        Moto moto1 = new Moto("Honda", "CB 600F", 2023, 600);
        Moto moto2 = new Moto("Yamaha", "MT-07", 2022, 689);
        
        // Testando o método exibirDetalhes() para os carros
        carro1.exibirDetalhes();
        System.out.println();
        
        carro2.exibirDetalhes();
        System.out.println();
        
        // Testando o método exibirDetalhes() para as motos
        moto1.exibirDetalhes();
        System.out.println();
        
        moto2.exibirDetalhes();
        System.out.println();
        
        // Demonstrando polimorfismo
        System.out.println("=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        Veiculo[] veiculos = {carro1, moto1};
        
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println();
        }
    }
}