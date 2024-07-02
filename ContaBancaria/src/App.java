class App {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(2, 200);

        contaBancaria.detalhesConta();
        contaBancaria.depositar(200);
        contaBancaria.sacar(100);
        contaBancaria.imprimirHistorico();
        
        contaBancaria.sacar(300);
    }
}
