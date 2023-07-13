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
    <link rel="stylesheet" href="css/style.css">
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


                                <c:url var="registra" value="/livros/registrarlivro"/>
                                <form:form action="${registra}" method="post" modelAttribute="livro">

                                    <form:input type="text" path="nome" placeholder="Nome"/> <br><br>

                                    <form:select path="genero">
                                        <form:option value="" label="Selecione um gênero"/>
                                        <form:option value="Ficção" label="Ficção"/>
                                        <form:option value="Romance" label="Romance"/>
                                        <form:option value="Suspense" label="Suspense"/>
                                        <form:option value="Aventura" label="Aventura"/>
                                    </form:select> <br><br>

                                    <input class="btn btn-outline-light btn-lg px-5" type="submit" value="Cadastrar">

                                </form:form>

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



