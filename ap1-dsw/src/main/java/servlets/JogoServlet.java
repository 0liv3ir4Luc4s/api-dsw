package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JogoServlet
 */
@WebServlet(urlPatterns = "/JogoServlet")
public class JogoServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		Integer n;
		PrintWriter writer = response.getWriter();
		
		writer.write("<html>");
		writer.write("<head><title>Sucesso</title>");
		writer.write("<meta charset=\"UTF-8\">");
		writer.write("<title>Jogo - API - DSW - Output</title></head>");
		writer.write("<link href=\"style.css\" rel=\"stylesheet\"/>");
		writer.write("<body>");
		writer.write("<h1>Jogo - Output</h1>");
		writer.write("<ul>");
		for(int i = 1; i <= request.getParameterMap().values().size(); i++) {
			n = Integer.parseInt(request.getParameter("n"+i));
			writer.write("<li>");
			writer.write("Número "+i+"("+n+")"+": "+(n % 2 == 0 ? "Par" : "Ímpar"));
			writer.write("</li>");
		}
		writer.write("</ul>");
		writer.write("<a href=\"index.html\">voltar</a>");
		writer.write("</body>");
		writer.write("</html>");
	}

}
