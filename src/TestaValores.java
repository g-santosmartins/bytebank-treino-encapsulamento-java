public class TestaValores {
  public static void main(String[] args) {
    Conta conta = new Conta(5648, 6594);
    
    // tratamos comportamentos com 0 e null nos numeros da conta

    System.out.println(conta.getAgencia());
    System.out.println(conta.getNumero());

    Conta conta2 = new Conta(5648, 5656);
    Conta conta3 = new Conta(95959, 6564);

    // pedir o numero das contas pelo nome da classe

    System.out.println(Conta.getTotal());


  }
}
