
public class App {
  public static void main(String[] args) throws Exception {

    // OBJETO PERMISSAO
    Permissoes[] p = new Permissoes[2];
    p[0] = new Permissoes();
    p[0].permComum();
    p[1] = new Permissoes();
    p[1].permAdm();

    AutorDAO autorDAO = new AutorDAO();

    // //ADD AUTOR NO BANCO!!

    Autor autor = new Autor(1, "MAURILIO S MENEZES");

    autorDAO.saveAutor(autor);

    // // BUSCA AUTOR NO BANCO !!

    // for (Autor autor : autorDAO.getAutors()) {
    // System.out.println("ID: " + autor.getId_Autor());
    // System.out.println("NOME AUTOR: " + autor.getNome_Autor());
    // System.out.println("------------------------------------------");
    // }

    // // UPDATE AUTOR

    // Autor autor = new Autor(1, "MAURILIO S MENEZES");
    // autorDAO.updateBy(autor);

    // remove
    // autorDAO.removeByid(1);

    ///////////////////////////////////////////////////////////////////////////////////////
    // CRIANDO OBJ usuario
    // Usuario usuario = new Usuario(6, "FRANDILDO", "FRAN@123", "12345", p[0]);

    // UsuarioDAO usuarioDAO = new UsuarioDAO();
    // // ADD USUÁRIO NO BANCO !!
    // usuarioDAO.saveUser(usuario);

    // // OBJETO USUARIO
    // Usuario[] u = new Usuario[3];

    // u[0] = new Usuario(1, "Maurilio", "mauri@123", "1234", p[0]);
    // u[1] = new Usuario(2, "Miriam", "mauri@123", "1234", p[0]);
    // u[2] = new Usuario(1, "Muricio", "mauri@123", "1234", p[0]);

    // // Autor e editora livro
    // Autor a = new Autor(1, "Maurilio");
    // Editora e = new Editora(1, "MM'S");

    // // LIVRO
    // Livros book = new Livros(1, "Vastas Emoções", 18.50, "01/08/2020", a, e);
    // Livros book2 = new Livros(1, "Historia", 18.50, "01/08/2020", a, e);

    // // ItemCompra
    // // ID, QTD, PRODUTO
    // ItensCompra item = new ItensCompra(1, 2, book);
    // ItensCompra item2 = new ItensCompra(1, 3, book2);
    // item.toString();

    // // Compra
    // Compra c = new Compra(1, "01/20", u[0]);
    // c.addCompra(item);
    // c.addCompra(item2);

    // // compra
    // Compra c1 = new Compra(2, "01/20", u[2]);
    // c1.addCompra(item);
    // c1.addCompra(item2);
    // c1.mostraItens();

    // c.mostraItens();
    // String mostrar = c.Mostrar();

    // System.out.println("-----DADOS DA COMPRA----");
    // System.out.println(mostrar);

  }
}
