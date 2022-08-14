public class Permissoes {
  private int id;
  private String tipo;

  public Permissoes() {

  }

  // Métodos

  public void permComum() {

    this.tipo = "comum";
  }

  public void permAdm() {

    this.tipo = "comum";
  }

  // Métodos especiais
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

}
