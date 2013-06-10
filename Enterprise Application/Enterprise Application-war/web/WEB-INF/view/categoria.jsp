<%-- 
    Document   : categoria
    Created on : Mar 9, 2013, 12:51:06 AM
    Author     : juliano
--%>

<div id="categoryLeftColumn">
    <c:forEach var="categoria" items="${categorias}">
        <c:choose>
            <c:when test="${categoria.nome == categoriaSelecionada.nome}">
                <div class="categoryButton" id="selectedCategory">
                    <span class="categoryText">
                        ${categoria.nome}
                    </span>
                </div>
            </c:when>
            <c:otherwise>
                <a href="<c:url value='categoria?${categoria.id}'/>" class="categoryButton">
           
                    <span class="categoryText">
                        ${categoria.nome}
                    </span>
                </a>
            </c:otherwise>
        </c:choose>

    </c:forEach>
</div>

<div id="categoryRightColumn">

    <p id="categoryTitle">${categoriaSelecionada.nome}</p>

    <table id="productTable">

        <c:forEach var="produto" items="${produtos}" varStatus="iter">

            <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
                <td>
                    [imagem produto]
                </td>

                <td>
                    ${produto.nome}
                    <br>
                    <span class="smallText">${produto.descricao}</span>
                </td>

                <td>R$ ${produto.preco}</td>

                <td>
                    <form action="<c:url value='addCarrinho'/>" method="post">
                        <input type="hidden"
                               name="produtoId"
                               value="${produto.id}">
                        <input type="submit"
                               name="submit"
                               value="+Carrinho">
                    </form>
                        
                    <form action="<c:url value='addLista'/>" method="post">
                              <input type="hidden"
                               name="produtoId"
                               value="${produto.id}">
                              <input type="submit"
                               name="submitList"
                               value="+WishList">
                    </form>                        
                </td>
            </tr>

        </c:forEach>

    </table>
</div>