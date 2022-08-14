public class Editora {
  private int id;
  private String nome;

  public Editora(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public Editora() {

  }

  // Métodos especiais
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
