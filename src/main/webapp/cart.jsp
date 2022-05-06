<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="includes/head.html"></jsp:include>
</head>

<body>

  <h1>Carrinho de compras</h1>
  
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