public class Livros {
  private int id;
  private String nome;
  private double preco;
  private String dataPublicação;
  private Autor autor;
  private Editora editora;

  public Livros(int id, String nome, double preco, String dataPublicação, Autor autor, Editora editora) {
    setId(id);
    setNome(nome);
    setPreco(preco);
    setDataPublicação(dataPublicação);
    setAutor(autor);
    setEditora(editora);
  }

  public Livros() {
  }

  // Métodos

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

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getDataPublicação() {
    return this.dataPublicação;
  }

  public void setDataPublicação(String dataPublicação) {
    this.dataPublicação = dataPublicação;
  }

  public Autor getAutor() {
    return this.autor;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  public Editora geEditora() {
    return this.editora;
  }

  public void setEditora(Editora editora) {
    this.editora = editora;
  }

}
