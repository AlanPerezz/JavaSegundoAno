public class Cartao {
  float saldo;
  String titular;
  
  public Cartao() {}
  
  void creditar(float paramFloat) { saldo += paramFloat; }
  
  boolean debitar(float paramFloat)
  {
    if (saldo >= paramFloat) {
      saldo -= paramFloat;
      return true;
    }
    return false;
  }
}
