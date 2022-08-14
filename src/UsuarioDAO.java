import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
  Connection conn = null;
  PreparedStatement pstm = null;

  public void saveUser(Usuario usuario) {

    // Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
    // de dados

    String sql = "INSERT INTO usuarios(id_usuario,nome,email,senha)" + " VALUES(?,?,?,?)";

    try {
      // Cria uma conexão com o banco
      conn = Conexao.createConnectionToMySQL();
      // Cria um PreparedStatment, classe usada para executar a query
      pstm = conn.prepareStatement(sql);

      pstm.setInt(1, usuario.getId());
      // Adiciona o valor do primeiro parâmetro da sql
      pstm.setString(2, usuario.getNome());
      // Adicionar o valor do segundo parâmetro da sql
      pstm.setString(3, usuario.getEmail());
      // Adiciona o valor do terceiro parâmetro da sql
      pstm.setString(4, usuario.getSenha());

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

  // REMOVE
  public void removeByid(int id) {

    String sql = "DELETE FROM contato where id = ?";

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

}
