package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Carro;

import java.io.PrintWriter;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        Integer anoFabricacao = Integer.parseInt(request.getParameter("anoFabricacao"));

        
        Carro carro = new Carro();
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAnoFabricacao(anoFabricacao);

        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de Carro - Resultado</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado do Cadastro</h1>");
        out.println("<ul>");
        out.println("<li>Modelo: " + carro.getModelo() + "</li>");
        out.println("<li>Marca: " + carro.getMarca() + "</li>");
        out.println("<li>Ano de Fabricação: " + carro.getAnoFabricacao() + "</li>");
        out.println("</ul>");
        out.println("<p>Dados cadastrados com sucesso.</p>");
        out.println("<a href='index.html'>Voltar para Index</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
