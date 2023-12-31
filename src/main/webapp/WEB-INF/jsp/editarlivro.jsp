<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Editar livro</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">
              <h2 class="fw-bold mb-2 text-uppercase">Editar Livro</h2>
              <p class="text-white-50 mb-5">Altere o que deseja!</p>

              <form method="POST" action="/bib/principal/livros/editarlivro">

                <input type="hidden" name="id"  placeholder="" value="${livro.id}" required>

                <div class="form-outline form-white mb-4">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" class="form-control form-control-lg" placeholder="Nome" value="${livro.nome}" required>
                  </div>
                  <div class="form-group">
                    <label for="genero">Gênero</label>
                    <select id="genero" name="genero" class="form-control">
                      <option value="${livro.genero}">${livro.genero}</option>
                      <option value="Ação">Ação</option>
                      <option value="Aventura">Aventura</option>
                      <option value="Romance">Romance</option>
                      <option value="Ficção Científica">Ficção Científica</option>
                      <option value="Mistério">Mistério</option>
                      <option value="Fantasia">Fantasia</option>
                      <option value="Suspense">Suspense</option>
                    </select>
                  </div>
                <input type="hidden" name="acao" value="editarlivro">
                <button class="btn btn-outline-light btn-lg px-5" type="submit">Editar</button>
                <div>
                  <a href="/bib/principal/livros/visualizarlivros" class="text-white-50 fw-bold">Voltar</a>
                </div>
              </form>

            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>



