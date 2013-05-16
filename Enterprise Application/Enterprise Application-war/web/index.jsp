
<%-- 
    Document   : index
    Created on : Mar 8, 2013, 1:22:36 AM
    Author     : juliano
--%>

<div id="indexLeftColumn">
    <div id="welcomeText">
        <p>[ Benvindo ]</p>
    </div>
    <div id ="loginArea">
        <p>[ login area ]</p>
        <p><a href="ContatoJPAServlet">Inclusões</a></p><br/>
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


