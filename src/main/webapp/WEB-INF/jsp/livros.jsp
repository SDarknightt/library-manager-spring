<!DOCTYPE html>
<html>
<head>
  <title>Livros</title>
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
          <a class="nav-link active" aria-current="page" href="/bib/principal/livros/">Livros</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bib/principal/reservas/">Reservas</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bib/principal/clientes/">Clientes</a>
        </li>
        <li class="nav-item">
          <a  class="nav-link" href="/bib/usuario/principal/">Voltar</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="card bg-dark text-white" style="border-radius: 1rem;">
        <div class="card-body p-5 text-center">
          <h1>Livros</h1>
          <div class="row">
            <div class="col-sm-6 mb-3 mb-sm-0">
              <div class="card">
                <div class="card-body">
                  <a href="registrarlivro" class="btn btn-info">Cadastrar</a>
                </div>
              </div>
            </div>
            <div class="col-sm-6">
              <div class="card">
                <div class="card-body">
                  <a href="visualizarlivros" class="btn btn-info">Visualizar</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>




