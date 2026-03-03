package exercicios2;

/*Public*/ class Principal {

    public static void main(String[] args) {
   Produto produto1 = new Produto();

        produto1.setNome("Notebook");

        // Tentando inserir preço inválido
        produto1.setPreco(-500);

        // Inserindo preço válido
        produto1.setPreco(3500);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());
    }
}