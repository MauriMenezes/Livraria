import java.util.ArrayList;

public class Compra {

  private int id;
  private String data;
  private double valorCompra;
  private Usuario User;
  ArrayList<ItensCompra> item = new ArrayList<ItensCompra>();

  public Compra(int id, String data, Usuario user) {
    this.id = id;
    this.data = data;
    this.User = user;
  }
  // Métodos

  public void mostraItens() {

    System.out.println("-----itens da Compra------");
    System.out.println("ID COMPRA : " + getId());
    for (ItensCompra itensCompras : item) {
      System.out.println("produto: " + itensCompras.getLivros().getNome() + " QTD: " + itensCompras.getQntItens()
          + " result: " + itensCompras.getValor());
    }
  }

  public void addCompra(ItensCompra itens) {
    item.add(itens);
  }

  public void calcValor() {
    for (ItensCompra itensCompras : item) {
      this.valorCompra += itensCompras.getValor();
    }

  }

  public String Mostrar() {
    calcValor();

    return "ID-COMPRA : " + this.id + " DATA-COMPRA: " + this.data + " VALOR-COMPRA: "
        + this.valorCompra + " Usuario: " + this.User.getNome() + " Permissão: " + this.User.getPermission().getTipo();
  }

  // Métodos especiais
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public double getValorCompra() {
    return this.valorCompra;
  }
}