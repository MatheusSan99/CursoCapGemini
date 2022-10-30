package Elevador;

public class Elevador {
   final int andaresDoPredio = 20;
   int pessoasNoElevador = 0;
   int andarAtual;

   public Elevador() {
      final int capacidadeDoElevador = 8;
      int andarAtual = 0;
   }

   public int getPessoasNoElevador() {
      return this.pessoasNoElevador;
   }

   public void setPessoasNoElevador(Pessoa pessoa) {
      if (this.pessoasNoElevador < 8) {
         this.pessoasNoElevador++;
      }
      else
      System.out.println("Capacidade Máxima do Elevador Atingida!");
   }
   public void desceDoElevador(Pessoa pessoa) {
      if (this.pessoasNoElevador > 0) {
         this.pessoasNoElevador--;
      }
      else
      System.out.println("Não tem ninguém no elevador!");
   }
   public int getAndarAtual() {
      return this.andarAtual;
   }

   public void setAndarAtual(int andarAtual) {
      this.andarAtual = andarAtual;
   }

   public void subirDeAndar() {
      if (this.getAndarAtual() < 20) {
         this.setAndarAtual(getAndarAtual() + 1);
      }
      else System.out.println("Último andar atingido");
   }
   public void descerDeAndar() {
      if (this.getAndarAtual() > 0) {
         this.setAndarAtual(getAndarAtual() - 1);
      }
      else System.out.println("Você está no térreo");
   }
}
