package br.com.easymoney.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {

	private Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/ad_4e9e506bd1aa34b", "b7ee0276603676", "caa37ddd");
		} catch (ClassNotFoundException cnfe) {
			throw new RuntimeException(cnfe);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return conexao;
	}
}
