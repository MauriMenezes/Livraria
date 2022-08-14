public class ItensCompra {

  private int id;
  private int qntItens;
  private double valor;
  private Livros livros;
  private Compra compra;

  public ItensCompra(int id, int qntItens, Livros livros) {
    this.id = id;
    this.qntItens = qntItens;
    this.valor = qntItens * livros.getPreco();
    this.livros = livros;
  }
  // Métodos

  public void addCarrinho() {

  }

  // Métodos especiais

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQntItens() {
    return this.qntItens;
  }

  public void setQntItens(int qntItens) {
    this.qntItens = qntItens;
  }

  public double getValor() {
    return this.valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Livros getLivros() {
    return this.livros;
  }

  public void setLivros(Livros livros) {
    this.livros = livros;
  }

}
