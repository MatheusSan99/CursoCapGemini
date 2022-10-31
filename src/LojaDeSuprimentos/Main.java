package LojaDeSuprimentos;

public class Main {
    public static void main(String[] args) throws Exception {
        Invoice invoice = new Invoice(1,"Notebook",9,5.00f);
        System.out.println(invoice.valorTotal());
    }
}
