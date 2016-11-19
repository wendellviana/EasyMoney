package br.com.easymoney.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletGeral extends HttpServlet{
	
	/** 
 * É executado quando é feita uma requisição com método GET pelo cliente. 
 *  
 * @param request Objeto com as informações pertinentes a requisição 
 * @param response Objeto com as informações pertinentes a reposta para o cliente 
 */  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processa(request, response);
	}  
 
/** 
 * É executado quando é feita uma requisição com método POST pelo cliente. 
 * No nosso caso será executado quando o cliente submitar o formulário, o qual 
 * está indicado com METHOD="POST" 
 *  
 * @param request Objeto com as informações pertinentes a requisição 
 * @param response Objeto com as informações pertinentes a reposta para o cliente 
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
		// Abre a pagina na qual se iniciará o programa.
		if (path.equals("/home.do")) {
			forward = "/WEB-INF/jsp/home.jsp";
		}
		
		// Caso usuário digite um endereço q não exista o programa irá exibir esta página.	
		else {
			forward = "/WEB-INF/jsp/erro/pagina-erro.html";
		}
		

		requestDispatcher = getServletContext().getRequestDispatcher(forward);
		requestDispatcher.forward(request, response);		
	
	}

}
