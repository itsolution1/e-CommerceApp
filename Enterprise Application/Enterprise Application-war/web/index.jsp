
<%-- 
    Document   : index
    Created on : Mar 8, 2013, 1:22:36 AM
    Author     : juliano
--%>

<div id="indexLeftColumn">
    <div id="welcomeText">
        <p>[ Benvindo ]</p>
        <p><a href="cadastro.jsp">Cadastro</a></p>
    </div>
    <div id ="loginArea">
        <p>[ login area ]</p>
        <form action="<c:url value='entra'/>" method="POST">
            Email:
            <input type="text" name="email"><br>
            Senha:
            <input type="password" name="senha"><br>
            <input type="submit" name="OK">
    
        </form>
    </div>
</div>

<div id="indexRightColumn">

    <c:forEach var="categoria" items="${categorias}">
        <div class="categoryBox">
            <a href="categoria?${categoria.id}">

                <span class="categoryLabelText">${categoria.nome}</span>
                <%-- imagem --%>
            </a>
        </div>
    </c:forEach>        
</div>
</div>
