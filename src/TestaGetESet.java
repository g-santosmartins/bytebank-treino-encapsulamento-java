public class TestaGetESet {
  public static void main(String[] args) throws Exception {
    Conta conta = new Conta(5648, 6465);

    // isso nao funciona
    // conta.numero = 1337;

    conta.deposita(1000);

    conta.getSaldo();

    conta.setNumero(1337);

    conta.getNumero();

    Cliente guilherme = new Cliente();

    // conta.titular = "guilherme"

    guilherme.setNome("Guilherme Martins");

    // dizendo que a referencia titular vai para o cliente guilherme
    conta.setTitular(guilherme);

    // pega o titular da conta, ache o nome, retorne
    System.out.println(conta.getTitular().getNome());
    conta.getTitular().setProfissao("programador");

    // alterando de outra forma
    Cliente titularDaConta = conta.getTitular();
    titularDaConta.setProfissao("programador");

    // mesma referencia:
    System.out.println(titularDaConta);
    System.out.println(guilherme);
    System.out.println(conta.getTitular());

  }
}
