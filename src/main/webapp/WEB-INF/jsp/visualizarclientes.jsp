<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <title>Visualizar Clientes</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg fixed-top bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bib/usuario/principal/">Biblioteca</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="/bib/principal/livros/">Livros</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bib/principal/reservas/">Reservas</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="/bib/principal/clientes/">Clientes</a>
        </li>
        <li class="nav-item">
          <a  class="nav-link" href="/bib/principal/clientes/">Voltar</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<section class="vh-100 gradient-custom">
  <div class="container mt-5">
    <h1 class="text-center titulo">Clientes Cadastrados</h1>

    <table class="table table-striped table-bordered table-dark">
      <c:if test="${not empty clientes}">
        <thead class="thead-dark">
        <tr>
          <th>Nome</th>
          <th>CPF</th>
          <th>Deletar</th>
          <th>Editar</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${clientes}" var="cliente">
          <tr>
            <td>${cliente.getNome()}</td>
            <td>${cliente.getCpf()}</td>
            <td>
              <form method="POST" action="/bib/principal/clientes/deletarcliente">
                <div class="form-group">
                  <input type="hidden" name="id" class="form-control" value="${cliente.getId()}">
                </div>
                <button class="btn btn-outline-danger btn-md" type="submit">Deletar</button>
              </form>
            </td>
            <td>
              <form method="POST" action="/bib/principal/clientes/selecionacliente">
                <div class="form-group">
                  <input type="hidden" name="id" class="form-control" value="${cliente.getId()}">
                </div>
                <button class="btn btn-outline-info btn-md" type="submit">Editar</button>
              </form>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </c:if>
    </table>
  </div>
</section>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>



