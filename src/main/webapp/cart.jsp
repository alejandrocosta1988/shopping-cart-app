<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.html"></jsp:include>
</head>

<body>

  <h1>Carrinho de compras</h1>
  
  <table>
  
    <thead>
      <th>Quantidade</th>    
      <th>Descrição</th>    
      <th>Valor unitário</th>    
      <th>Valor total</th>
      <th> </th>
    </thead>
    
    <tbody>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:forEach var="item" items="${cart.items}">
      <tr>
        
        <td>
          <form action="cart" method="post">
            <input type="hidden" name="product-code" 
                   value="<c:out value='${item.product.code}'></c:out>">
            <input type="text" name="quantity"
                   value="<c:out value='${item.quantity}'></c:out>">
            <input type="hidden" name="action" value="updateQuantity">
            <input type="submit" value="Atualizar">
          </form>
        </td>
        
        <td>
          <c:out value="${item.product.description}"></c:out>
        </td>
        
        <td>
          ${item.product.getPriceCurrencyFormat()}
        </td>
        
        <td>
          ${item.getTotalCurrencyFormat()}
        </td>
        
        <td>
          <form action="cart" method="post">
            <input type="hidden" name="product-code" value="${item.product.code}">
            <input type="hidden" name="quantity" value="0">
            <input type="hidden" name="action" value="updateQuantity">
            <input type="submit" value="Deletar">
          </form>
        </td>
        
      </tr>
    </c:forEach>
      
    </tbody>
  
  </table>
  
  <form action="cart" method="post">
    <input type="hidden" name="action" value="shop">
    <input type="submit" value="Continuar comprando">
  </form>
  
  <form action="cart" method="post">
    <input type="hidden" name="action" value="checkout">
    <input type="submit" value="Fechar pedido">
  </form>
  
  <footer>
    <jsp:include page="includes/footer.jsp"></jsp:include>
  </footer>
  
</body>
</html>