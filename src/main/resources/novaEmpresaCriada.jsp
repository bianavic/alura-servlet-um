// java server page == jsp == pagina dinamica java

<%
// scriptlet
String nomeEmpresa = (String)req.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>

<html>
<body>
// <% out.nomeEmpresa %>
Empresa <%= nomeEmpresa %> cadastrada com sucesso
</body>
</html>
