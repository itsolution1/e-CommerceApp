<%-- 
    Document   : wishlist
    Created on : May 18, 2013, 12:51:06 AM
    Author     : juliano
--%>


    <c:choose>
        <c:when test="${wishlist.numeroDeItens > 1}">
            <p>Seu carrinho contem ${wishlist.numeroDeItens} items.</p>
        </c:when>
        <c:when test="${wishlist.numeroDeItens == 1}">
            <p>Sua WishList contem ${wishlist.numeroDeItens} item.</p>
        </c:when>
        <c:otherwise>
            <p>Sua WishList está vazia</p>
        </c:otherwise>
    </c:choose>

    <div id="actionBar">
        <%-- limpa cart widget --%>
        <c:if test="${!empty wishlist && wishlist.numeroDeItens != 0}">

            <c:url var="url" value="verCarrinho">
                <c:param name="clear" value="true"/>
            </c:url>

            <a href="${url}" class="bubble hMargin">limpar carrinho</a>
        </c:if>

        <%-- continua shopping widget --%>
        <c:set var="value">
            <c:choose>
                <%-- if 'selectedCategory' session object exists, send user to previously viewed category --%>
                <c:when test="${!empty categoriaSelecionada}">
                    categoria
                </c:when>
                <%-- otherwise send user to welcome page --%>
                <c:otherwise>
                    /
                </c:otherwise>
            </c:choose>
        </c:set>

        <c:url var="url" value="${value}"/>
        <a href="${url}" class="bubble hMargin">continuar comprando</a>

        <%-- checkout widget --%>
        <c:if test="${!empty cart && cart.numeroDeItens != 0}">
            <a href="<c:url value='checkout'/>" class="bubble hMargin">Concluir compra &#x279f;</a>
        </c:if>
    </div>

    <c:if test="${!empty cart && cart.numeroDeItens != 0}">

      <h4 id="subtotal">subtotal: R$ ${cart.subtotal}</h4>

      <table id="cartTable">

        <tr class="header">
            <th>produto</th>
            <th>nome</th>
            <th>preco</th>
            <th>quantidade</th>
        </tr>

        <c:forEach var="cartItem" items="${cart.items}" varStatus="iter">

          <c:set var="product" value="${cartItem.produto}"/>

          <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
            <td>
              [imagem produto]
            </td>

            <td>${produto.nome}</td>

            <td>
                R$ ${cartItem.total}
                <br>
                <span class="smallText">( R$ ${produto.preco} / un )</span>
            </td>

            <td>
                <form action="<c:url value='/atualizaCarrinho'/>" method="post">
                    <input type="hidden"
                           name="productId"
                           value="${produto.id}">
                    <input type="text"
                           maxlength="2"
                           size="2"
                           value="${cartItem.quantidade}"
                           name="quantity"
                           style="margin:5px">
                    <input type="submit"
                           name="submit"
                           value="update">
                </form>
            </td>
          </tr>

        </c:forEach>

      </table>

    </c:if>
</div>