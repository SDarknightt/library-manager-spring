<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>

<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">

                        <div class="mb-md-5 mt-md-4 pb-5">
                            <h2 class="fw-bold mb-2 text-uppercase">Cadastrar Livro</h2>
                            <p class="text-white-50 mb-5">Por favor insira os dados!</p>


                            <form method="POST" action="/bib/principal/livros/registrarlivro">
                                <div class="form-outline form-white mb-4">
                                    <input type="text" name="nome" class="form-control form-control-lg" placeholder="Nome" required>
                                </div>

                                <div class="form-group">
                                    <label for="livro">Livro</label>
                                    <select id="livro" name="genero" class="form-control">
                                                <option disabled selected>Selecione um livro</option>
                                            <option disabled selected>Seleciona um gênero.</option>
                                            <option value="Ação">Ação</option>
                                            <option value="Aventura">Aventura</option>
                                            <option value="Romance">Romance</option>
                                            <option value="Ficção Científica">Ficção Científica</option>
                                            <option value="Mistério">Mistério</option>
                                            <option value="Fantasia">Fantasia</option>
                                            <option value="Suspense">Suspense</option>
                                    </select>
                                </div>

                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Cadastrar</button>
                            </form>

                            </form>

                                <div>
                                    <a href="/bib/principal/livros/" class="text-white-50 fw-bold">Voltar</a>
                                </div>
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



