package br.com.easymoney.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.easymoney.model.PropostaVO;

public class PropostaDAOMySql extends GenericDAO {
	
	public void incluirProposta(PropostaVO pessoa) {
		Connection con = null;
		try {
			con = obterConexao();

			Statement stm = con.createStatement();

//			String SQL = "insert into proposta (p_id, baco, agencia, data_nascimento, papel)" +
//			"values (" + "'" + pessoa.getNome() + " '" + "," + "'" + pessoa.getCpf() + "'" + "," + "'" + pessoa.getSexo() + "'" + "," + "'" + pessoa.getDataNasc() + "'" + "," + "'" + pessoa.getPapel() + "')";
//			System.out.println("Sql: " + SQL);
//			stm.executeUpdate(SQL);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException onConClose) {
				System.out.println("Houve erro no fechamento da conexão");
				onConClose.printStackTrace();
			}
		}  
	}

}
