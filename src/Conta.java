public class Conta {
  private double saldo;
  int agencia;
  int numero;

  // associei a outra classe
  Cliente titular;

  // persiste o valor, parece uma 'variavel global'
  private static int total;

  public Conta(int agencia, int numero) {

    // static fica acessivel a conta(class)
    Conta.total++;

    System.out.println("O total de contas é " + total);
    this.agencia = agencia;
    this.numero = numero;
    System.out.println("Estou criando uma conta com o titular");
  }

  // void não pode retornar nada
  public void deposita(double valor) {

    // this é forma explicita de dar bind aqui
    this.saldo += valor;
    System.out.println("Você depositou o valor: " + saldo);
  }

  // para sacar e validar a possibilidade em conta
  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      System.out.println("Foi sacado da sua conta: " + valor);
      System.out.println("Novo saldo em conta: " + this.saldo);
      return true;
    }

    // omitimos o else pois já saimos do fluxo do codigos
    System.out.println("Saldo indisponível! Não foi possivel sacar: " + valor);
    System.out.println("Saldo em conta: " + this.saldo);
    return false;
  }

  // logica para transferir
  public boolean transfere(double valor, Conta destino) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      destino.deposita(valor);
      System.out.println("O novo saldo na conta é " + this.saldo);
      System.out.print("O saldo na conta da ");
      System.out.print(destino.titular);
      System.out.print(" tem o novo saldo de: ");
      System.out.print(destino.saldo);
      return true;
    }
    System.out.println("Saldo na conta é insuficiente para realizar a transação");
    return false;
  }

  // retorna saldo
  public double getSaldo() {
    System.out.println("Seu saldo é: " + this.saldo);
    return this.saldo;
  }

  // retorna o numero da conta
  public int getNumero() {
    return this.numero;
  }

  // altera e retorna o novo numero da conta
  public void setNumero(int NovoNumero) {
    if (numero <= 0) {
      System.out.println("Não pode usar valores menores ou iguais a 0 no número da conta");
      return;
    }
    this.numero = NovoNumero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia <= 0) {
      System.out.println("Não pode usar valores menores ou iguais a 0 na conta");
      return;
    }
    this.agencia = agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }

  // não posso acessar o this dentro do static

  public static int getTotal() {
    return Conta.total;
  }

}
