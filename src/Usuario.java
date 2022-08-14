public class Usuario {
  private int id;
  private String nome;
  private String email;
  private String Senha;
  private Permissoes Permission;

  // Métodos
  public String mostrar() {

    return "Nome : " + this.nome + "Email :" + this.email + " permissao : " + this.Permission.getTipo();
  }

  // Métodos especiais

  public Usuario() {
  }

  public Usuario(int id, String nome, String email, String Senha, Permissoes Permission) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.Senha = Senha;
    this.Permission = Permission;
  }

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

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String eMail) {
    this.email = eMail;
  }

  public String getSenha() {
    return this.Senha;
  }

  public void setSenha(String Senha) {
    this.Senha = Senha;
  }

  public Permissoes getPermission() {
    return this.Permission;
  }

}
