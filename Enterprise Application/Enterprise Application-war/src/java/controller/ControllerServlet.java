
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package controller;

import carrinho.Carrinho;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jpa.Categoria;
import jpa.Cliente;
import jpa.Endereco;
import jpa.Produto;
import jpa.WishList;
import jpa.facade.CategoriaFacadeRemote;
import jpa.facade.ClienteFacadeRemote;
import jpa.facade.EnderecoFacadeRemote;
import jpa.facade.ProdutoFacadeRemote;
/**
*
* @author juliano
*/
@WebServlet(name = "ControllerServlet",
loadOnStartup = 1,
urlPatterns = {"/categoria",
    "/addCarrinho",
    "/verCarrinho",
    "/atualizaCarrinho",
    "/concluirCompra",
    "/comprar",
    "/addLista",
    "/gravaLista",
    "/verLista",
    "/entra",
    "/sai",
    "/cadastro",
    "/addCadastro",
    })
public class ControllerServlet extends HttpServlet {
    
    @EJB
    private CategoriaFacadeRemote categoriaFacade;
    @EJB
    private ProdutoFacadeRemote produtoFacade;
    @EJB
    private ClienteFacadeRemote clienteFacade;
    @EJB
    private EnderecoFacadeRemote enderecoFacade;
    private boolean logon;
        
    @Override
        public void init() throws ServletException{
        
        //guarda lista de categorias no contexto da servlet
           getServletContext().setAttribute("categorias", categoriaFacade.findAll());
           getServletContext().setAttribute("clientes", clienteFacade.findAll());
        }

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

        String userPath = request.getServletPath();
        Categoria categoriaSelecionada;
        HttpSession session = request.getSession();
        Collection<Produto> produtos;
      
        // se categoria for requisitada
        if (userPath.equals("/categoria")) {
            
            String categoriaID = request.getQueryString();
            
              if (categoriaID != null) {

                // get selected category
                categoriaSelecionada = categoriaFacade.find(Long.parseLong(categoriaID));

                // place selected category in session scope
                session.setAttribute("categoriaSelecionada", categoriaSelecionada);
                
                // pegar todos os produtos da categoria selecioanada
                produtos = categoriaSelecionada.getProdutos();

                // colocando os produtos da categoria no escopo da sessão
                session.setAttribute("produtos", produtos);
      
              }
            
            // se o usuario quer ver o carrinho
        } else if (userPath.equals("/verCarrinho")) {
            
            String clear = request.getParameter("clear");

            if ((clear != null) && clear.equals("true")) {

            Carrinho cart = (Carrinho) session.getAttribute("cart");
            cart.clear();
            }

            userPath = "/carrinho";

            // se o usuario quer concluir a compra
        } else if (userPath.equals("/concluirCompra")) {
            // TODO: Implementar conclusao de compra
            // se o usuario quer ver a lista
        } else if (userPath.equals("/verLista")) {
            // TODO: Implementar lista de desejos
            
            String clear = request.getParameter("clear");

            if ((clear != null) && clear.equals("true")) {

            WishList lista = (WishList) session.getAttribute("lista");
            lista.clear();
            }

            userPath = "/wishlist";
            // se o usuario quer encerrar a sessão
        } else if (userPath.equals("/sai")) {
            // TODO: Implementar sai

        }

        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
        
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        Carrinho cart = (Carrinho) session.getAttribute("cart");
        WishList lista = (WishList) session.getAttribute("lista");
        Cliente cliente = (Cliente) session.getAttribute("cliente");

        // se a acao addCarrinho for chamada
        if (userPath.equals("/addCarrinho")) {
      
            if (cart == null) {

                cart = new Carrinho();
                session.setAttribute("cart", cart);
            }
            
             String produtoId = request.getParameter("produtoId");
                        
             if (!produtoId.isEmpty()) {

                Produto produto = produtoFacade.find(Long.parseLong(produtoId));
                cart.addItem(produto);
            }

            userPath = "/categoria"; 
            
            } else if (userPath.equals("/atualizaCarrinho")) {

            // get input from request
            String produtoId = request.getParameter("produtoId");
            String quantidade = request.getParameter("quantidade");

            Produto produto = produtoFacade.find(Long.parseLong(produtoId));
            cart.update(produto, quantidade);

            userPath = "/carrinho";
            
            
            // se acao addLista for chamada
        } else if (userPath.equals("/addLista")) {
            
            logon = true;
            
            if ((lista == null) && (logon)) {

                lista = new WishList();
                session.setAttribute("lista", lista);
            }
            String produtoId = request.getParameter("produtoId");
                        
             if (!produtoId.isEmpty()) {

                Produto produto = produtoFacade.find(Long.parseLong(produtoId));
                lista.addItem(produto);
                
                session.setAttribute("lista", lista);
            }
             
            userPath = "/categoria";
            // se acao comprar for chamada
            
            
        
        } else if (userPath.equals("/gravaLista")) {
            // TODO: implementar acao grava lista
            
            WishList listaGravar = (WishList)session.getAttribute("lista");
            
            cliente.setLista(listaGravar);
            
            clienteFacade.edit(cliente);
            
            
            
            userPath = "/wishlist";
            

            
        } else if (userPath.equals("/comprar")) {
            // TODO: implementar acao comprar

            userPath = "/confirmacao";
            
            
            // se acao entra for chamada
        } else if (userPath.equals("/entra")) {
     
            
            Cliente cli;
            
            String email = (String) request.getAttribute("email");
            String senha = (String) request.getAttribute("senha");
            
            Collection clientes =  clienteFacade.findAll();
            
             for (Object c: clientes){
                 cli = (Cliente)c;
                 if (cli.getEmail().equals(email) && cli.getSenha().equals(senha)) {
                     request.setAttribute("cliente", cli);
                     userPath = "/";
                     break;   
                 }else{
                     userPath = "naoEncontrado";
                 }
            } 

        } else if (userPath.equals("/cadastro")) {
            
        String cpf = (String) request.getParameter("cpf");
        String nome = (String) request.getParameter("nome");
        String telefone = (String) request.getParameter("telefone");
        String sexo = (String) request.getParameter("sexo");            
        String senha = (String) request.getParameter("senha");
        String email = (String) request.getParameter("email");
        char sex = sexo.charAt(0);
        
        String logradouro = (String) request.getParameter("logradouro");
        String complemento = (String) request.getParameter("complemento");
        String numero = (String) request.getParameter("numero");
        String bairro = (String) request.getParameter("bairro");
        String cidade = (String) request.getParameter("cidade");
        String uf = (String) request.getParameter("uf");
        String cep = (String) request.getParameter("cep");
        

        Endereco endereco = new Endereco(logradouro,complemento,numero,bairro,cidade,uf,cep);
        
        cliente = new Cliente(cpf,nome,telefone,sex,senha,email);
       
        cliente.setEnderecoCadastro(endereco);
        
        clienteFacade.edit(cliente);
   
        userPath = "/cadastroOK";
            
        }

        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}