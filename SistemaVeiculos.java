public class SistemaVeiculos {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Toyota", "Corolla", 2024);
        Veiculo moto = new Moto("Honda", "CB500", 2023);
        Veiculo caminhao = new Caminhao("Scania", "FH 540", 2023);

        System.out.println("====CARRO====");
        carro.exibirDetalhes();
        carro.acelerar();

        System.out.println("====MOTO====");
        moto.exibirDetalhes();
        moto.acelerar();

        System.out.println("====CAMINHAO====");
        caminhao.exibirDetalhes();
        caminhao.acelerar();
        
    }
}