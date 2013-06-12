<%-- 
    Document   : lista
    Created on : May 18, 2013, 12:51:06 AM
    Author     : juliano
--%>

     <c:choose>
        <c:when test="${lista.numeroDeItens > 1}">
            <p>Sua Lista contem ${lista.numeroDeItens} items.</p>
        </c:when>
        <c:when test="${lista.numeroDeItens == 1}">
            <p>Sua Lista contem ${lista.numeroDeItens} item.</p>
        </c:when>
        <c:otherwise>
            <p>Sua Lista está vazia</p>
        </c:otherwise>
    </c:choose>

    <div id="actionBar">
        <%-- limpa cart widget --%>
        <c:if test="${!empty lista && lista.numeroDeItens != 0}">

            <c:url var="url" value="verLista">
                <c:param name="clear" value="true"/>
            </c:url>

            <a href="${url}" class="bubble hMargin">limpar lista</a>
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
        <c:if test="${!empty lista && lista.numeroDeItens != 0}">
            
            <form action="<c:url value='gravaLista'/>" method="POST">
                <input type="submit" value="Salvar">
                
                <input type="hidden"
                             name="lista"
                             value="${lista}">
      
            </form>
            
           
        </c:if>
    </div>

    <c:if test="${!empty lista && lista.numeroDeItens != 0}">

      <h4 id="subtotal">subtotal: R$ ${lista.subtotal}</h4>

      <table id="cartTable">

        <tr class="header">
            <th>produto</th>
            <th>nome</th>
            <th>preco</th>
        </tr>

        <c:forEach var="listItem" items="${lista.items}" varStatus="iter">

          <c:set var="produto" value="${listItem.produto}"/>

          <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
            <td>
              [imagem produto]
            </td>

            <td>${produto.nome}</td>
            
            <td>
                <span class="smallText">( R$ ${produto.preco} / un )</span>
            </td>

          </tr>

        </c:forEach>

      </table>

    </c:if>
</div>