<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.list, java.alura.javaservletum.Empresa"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    Lista de empresas: <br />
    <ul>
        <%
        List<Empresa> listaEmpresas = (List<Empresa>)req.getAttribute("empresas")
        for (Empresa empresa : listaEmpresas) {
        %>
        <li><%= empresa.getNome() %></li>
        <%
            out.println("<li>" + empresa.getNome() + "</li>");
        }
        %>
    </ul>

</body>
</html>