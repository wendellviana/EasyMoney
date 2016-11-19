package br.com.easymoney.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletGeral extends HttpServlet{
	
	/** 
 * � executado quando � feita uma requisi��o com m�todo GET pelo cliente. 
 *  
 * @param request Objeto com as informa��es pertinentes a requisi��o 
 * @param response Objeto com as informa��es pertinentes a reposta para o cliente 
 */  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processa(request, response);
	}  
 
/** 
 * � executado quando � feita uma requisi��o com m�todo POST pelo cliente. 
 * No nosso caso ser� executado quando o cliente submitar o formul�rio, o qual 
 * est� indicado com METHOD="POST" 
 *  
 * @param request Objeto com as informa��es pertinentes a requisi��o 
 * @param response Objeto com as informa��es pertinentes a reposta para o cliente 
 */  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processa(request, response);
	}

	private void processa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		System.out.println("Path = " + path);
	
		RequestDispatcher requestDispatcher = null; 
		String forward = "";
		String nome = "";
		String cpf = "";
		// Abre a pagina na qual se iniciar� o programa.
		if (path.equals("/home.do")) {
			forward = "/WEB-INF/jsp/home.jsp";
		}
		
		// Caso usu�rio digite um endere�o q n�o exista o programa ir� exibir esta p�gina.	
		else {
			forward = "/WEB-INF/jsp/erro/pagina-erro.html";
		}
		

		requestDispatcher = getServletContext().getRequestDispatcher(forward);
		requestDispatcher.forward(request, response);		
	
	}

}
