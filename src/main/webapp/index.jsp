<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.html"></jsp:include>
</head>

<body>
  
  <div class="container">
  
    <h1>Lista de itens disponíveis</h1>
    <p>Esses itens não foram lidos de um banco de dados por se tratar de uma versão simplificada da aplicação. O intuito foi praticar o uso de tags JSTL. Posteriormente, os itens serão lidos a partir de um banco de dados MySQL ou PostgreSQL.</p>
    
    <table>
      
      <thead>
        <th>Descrição</th>
        <th>Preço</th>
        <th>Incluir</th>
      </thead>
      
      <tbody>
      
        <tr>
          <td>Descrição do item A</td>
          <td>R$ 17,99</td>
          <td>
            <form action="cart" method="post">
              <input type="hidden" name="product-code" value="pf01">
              <input type="submit" value="Selecionar">
            </form>
          </td>
        </tr>

        <tr>
          <td>Descrição do item B</td>
          <td>R$ 21,99</td>
          <td>
            <form action="cart" method="post">
              <input type="hidden" name="product-code" value="pf02">
              <input type="submit" value="Selecionar">
            </form>
          </td>
        </tr>

        <tr>
          <td>Descrição do item C</td>
          <td>R$ 3,55</td>
          <td>
            <form action="cart" method="post">
              <input type="hidden" name="product-code" value="pf03">
              <input type="submit" value="Selecionar">
            </form>
          </td>
        </tr>
        
      </tbody>
      
    </table>
    
    <p>
      Ir para o <a href="cart?action=see">carrinho</a>
    </p>
    
    <footer>
      <jsp:include page="includes/footer.jsp"></jsp:include>
    </footer>
    
  </div>
  
</body>
</html>