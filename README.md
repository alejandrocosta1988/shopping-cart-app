# Shopping Cart App


## Sobre o projeto e seus desafios

Este projeto foi desenvolvido para praticar desenolvimento web com JSP e Servlets. Neste projeto utilizei tags JSTL.
O objetivo do projeto é construir uma aplicação que possibilite ao usuário visualizar diferentes itens, selecionar os itens e adiocioná-los em um carrinho de compras. Sempre que o usuário estiver na tela do carrinho, ele terá duas opções: continuar comprando ou fechar o pedido. Além disso, a partir do carrinho, será possível ao usuário atualizar a quantidade desejada de cada um dos itens, visualizar o preço do item e o preço total de acordo com a quantidade escolhida e excluir itens específicos do carrinho.
O desafio é fazer com que todos os itens sejam exibidos corretamente para o usuário e permitir a adição de novos itens ao carrinho, sem excluir os antigos.

## Estrutura do projeto

O projeto está estruturado com base na arquitetura MVC. Como modelo, temos as classes; `Product`, `CartItem` e `Cart`. Como controller ou controladores temos a classe `CartServlet`. E como view temos as páginas index.jsp, cart.jsp e checkout.jsp.

Na construção da página cart.jsp, JSTL foi utilizado para testar a aplicabilidade. Ao mesmo tempo, procedimentos semelhantes foram realizados utilizando também Expression Language (EL).

As tags JSTL utilizadas foram apenas `<c:forEach>` e `<c:out>`. A primeira foi utilizada para realizar um loop exibindo cada item individual que estava dentro do carrinho de compras. A tag `<c:out>` foi utilizada em alguns pontos do código, mas o mesmo resultado foi obtido em outras parte se utilizando EL. Ao meu ver, EL facilita a leitura e manutenção do código.

## Conclusão geral

Com o desenvolvimento do projeto foi possível ter contato com a utilização de seções do navegador (se seções não fossem utilizadas o carrinho sempre estaria vazio ao se adicionar um novo item), tags JSTL, EL, desenvolvimento de servlets (métodos doGet() e doPost()), dentre vários outros temas.

Posteriormente, a interface gráfica será melhorada com aplicação de CSS. Momentaneamente o objetivo do projeto foi de praticar o desenvolvimento backend com JavaServer Pages (JSP) e Servlets. 


