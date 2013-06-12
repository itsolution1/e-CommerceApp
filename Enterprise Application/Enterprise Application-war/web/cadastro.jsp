<%-- 
    Document   : cadastro
    Created on : Jun 10, 2013, 12:06:20 AM
    Author     : juliano
--%>


<div id="indexRightColumn">


        <form action="<c:url value='cadastro'/>" method="post">
            Nome: 
            <input type="text" name="nome"><br>
            CPF:
            <input type="text" name="cpf"><br>
            Telefone:
            <input type="text" name="telefone"><br>
            Sexo:
            <input type="radio" name="sexo" value="M">Masculino

            <input type="radio" name="sexo" value="F">Feminino<br>
            Senha:
            <input type="password" name="senha"><br>
            E-mail:
            <input type="text" name="email"><br>
            
            <br>

            Endereco<br>
            <br>
            Logradouro: 
            <input type="text" name="logradouro"><br>
            Complemento:
            <input type="text" name="complemento"><br>
            Numero:
            <input type="text" name="numero"><br>
            Bairo:
            <input type="text" name="bairro"><br>
            Cidade
            <input type="text" name="cidade"><br> 
            UF:
            <input type="text" name="uf"><br>
            CEP:
            <input type="text" name="cep"><br>
          

            <input type="reset" value="Limpar">
            <input type="submit" value="Enviar">

        </form>

            
</div>