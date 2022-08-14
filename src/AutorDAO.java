import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {
  Connection conn = null;
  PreparedStatement pstm = null;

  public void saveAutor(Autor autor) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar no banco
    // de dados

    String sql = "INSERT INTO autores(id_autor,nome_autor)" + "VALUES(?,?)";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      pstm.setInt(1, autor.getId_Autor());
      // Adiciona o valor do primeiro parâmetro da sql
      pstm.setString(2, autor.getNome_Autor());
      // Adicionar o valor do segundo parâmetro da sql

      System.out.println(pstm);

      // Executa a sql para inserção dos dados
      pstm.execute();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Fecha as conexões
      try {
        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }
  }

  public void removeByid(int id) {

    String sql = "DELETE FROM autores where id_autor = ?";

    try {
      conn = Conexao.createConnectionToMySQL();
      // cria conexao

      pstm = conn.prepareStatement(sql);
      // passa o comando sql para o objeto pstm
      pstm.setInt(1, id);
      // seta o id no comando sql
      pstm.execute();
      // executa o comando sql que está no objeto pstm
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Fecha as conexões
      try {
        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }
  }

  public void updateBy(Autor autor) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar no banco
    // de dados

    String sql = "UPDATE autores SET nome_autor = ?" + "WHERE id_autor=?";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      // Adiciona o valor do primeiro parâmetro da sql
      pstm.setString(1, autor.getNome_Autor());
      // Adiciona o valor do segundo parâmetro
      pstm.setInt(2, autor.getId_Autor());

      // Executa a sql para inserção dos dados
      pstm.execute();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Fecha as conexões
      try {
        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }
  }

  public List<Autor> getAutors() {

    String sql = "SELECT * FROM autores";

    List<Autor> autors = new ArrayList<Autor>();

    // Classe que vai recuperar os dados do banco de dados
    ResultSet rset = null;

    try {
      conn = Conexao.createConnectionToMySQL();

      pstm = conn.prepareStatement(sql);

      rset = pstm.executeQuery();

      // Enquanto existir dados no banco de dados, faça
      while (rset.next()) {

        Autor autor = new Autor();

        // Recupera o id do banco e atribui ele ao objeto
        autor.setId_Autor(rset.getInt("id_autor"));

        // Recupera o nome do banco e atribui ele ao objeto
        autor.setNome_Autor(rset.getString("nome_autor"));

        // Adiciona o autor recuperado, a lista de autores
        autors.add(autor);
      }
    } catch (Exception e) {

      e.printStackTrace();
    } finally {

      try {

        if (rset != null) {

          rset.close();
        }

        if (pstm != null) {

          pstm.close();
        }

        if (conn != null) {
          conn.close();
        }

      } catch (Exception e) {

        e.printStackTrace();
      }
    }

    return autors;
  }
}
