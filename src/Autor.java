public class Autor {
  private int id_Autor;
  private String nome_Autor;

  public Autor(int id_Autor, String nome_Autor) {
    this.id_Autor = id_Autor;
    this.nome_Autor = nome_Autor;
  }

  public Autor() {

  }

  // Métodos

  public int getId_Autor() {
    return this.id_Autor;
  }

  public void setId_Autor(int id_Autor) {
    this.id_Autor = id_Autor;
  }

  public String getNome_Autor() {
    return this.nome_Autor;
  }

  public void setNome_Autor(String nome_Autor) {
    this.nome_Autor = nome_Autor;
  }

}
