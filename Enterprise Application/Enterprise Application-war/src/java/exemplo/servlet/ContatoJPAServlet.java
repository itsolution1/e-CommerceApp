/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jpa.Categoria;
import jpa.Produto;
import jpa.facade.CategoriaFacadeRemote;
import jpa.facade.ContatoFacadeRemote;
import jpa.facade.ProdutoFacadeRemote;

/**
 *
 * @author Calebe de Paula Bianchini
 */
@WebServlet(name = "ContatoJPAServlet", urlPatterns = {"/ContatoJPAServlet"})
public class ContatoJPAServlet extends HttpServlet {

    @EJB
    private CategoriaFacadeRemote categoriaFacade;

    @EJB
    private ProdutoFacadeRemote produtoFacade;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ContatoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de Categorias</h1>");

            out.println("<h2>Cadastrar Categoria</h2>");
            out.println("<form action=\"ContatoJPAServlet\" method=\"post\">");
            out.println("<table>\n<tr>");
            out.println("<td>Nome</td>");
            out.println("</tr>\n<tr>");
            out.println("<td><input name=\"nome_value\" type=\"text\" size=\"50\" value=\"nome\"/></td>");
            out.println("</tr>\n</table>");
            out.println("<input name=\"btn_cadastrar\" type=\"submit\" value=\"Cadastrar\"/>\n</form>");
            if (request.getParameter("btn_cadastrar") != null && request.getParameter("btn_cadastrar").equals("Cadastrar")) {
                try {
                    out.println("<font color=\"red\">");
                    Categoria c = new Categoria(request.getParameter("nome_value"));
                    categoriaFacade.create(c);
                    out.println("Categoria cadastrada com sucesso.");
                } catch (Exception e) {
                    out.println("Erro ao gravar Categoria.");
                } finally {
                    out.println("</font>");
                }
            }
        
            out.println("<h2>Cadastrar Produto</h2>");
            out.println("<form action=\"ContatoJPAServlet\" method=\"post\">");
            out.println("<table>\n<tr>");
            out.println("<td>Nome</td>");
            out.println("<td>Descricao</td>");
            out.println("<td>Preco</td>");
            out.println("</tr>\n<tr>");
            out.println("<td><input name=\"nomepro_value\" type=\"text\" size=\"50\" value=\"nome\"/></td>");
            out.println("<td><input name=\"descricao_value\" type=\"text\" size=\"50\" value=\"descricao\"/></td>");
            out.println("<td><input name=\"preco_value\" type=\"number\" size=\"50\" value=\"preco\"/></td>");
            out.println("</tr>\n</table>");
            out.println("<input name=\"btn_cadastrar\" type=\"submit\" value=\"CadastrarProd\"/>\n</form>");
            if (request.getParameter("btn_cadastrar") != null && request.getParameter("btn_cadastrar").equals("CadastrarProd")) {
                try {
                    out.println("<font color=\"red\">");
                    Produto produto = new Produto(request.getParameter("nomepro_value"),
                                            request.getParameter("descricao_value"),
                                            request.getParameter("preco_value"));
                   
                   String categoriaID = "4";
                   
                   Categoria categoria = categoriaFacade.find(Long.parseLong(categoriaID));
                    
                    categoria.getProdutos().add(produto);
                    
                    categoriaFacade.edit(categoria);
                    
                    
                    out.println("Produto cadastrado com sucesso.");
                } catch (Exception e) {
                    out.println("Erro ao gravar Produto.");
                } finally {
                    out.println("</font>");
                }
            }
            
            out.println("<h2>Produtos Cadastrados</h2>");
            List<Produto> list = produtoFacade.findAll();
            for (Produto produto : list) {
                out.println(produto + "<br/>");
            }
            out.println("<br/>");
            out.println("<a href=\".\">Voltar</a>");;
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
