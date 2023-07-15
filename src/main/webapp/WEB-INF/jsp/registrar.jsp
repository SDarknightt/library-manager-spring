<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Usuário</title>
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
                            <h2 class="fw-bold mb-2 text-uppercase">Cadastrar Usuário</h2>
                            <p class="text-white-50 mb-5">Por favor insira seus dados!</p>

                            <form method="POST" action="/bib/usuario/cadastrarusuario">
                                <div class="form-outline form-white mb-4">
                                    <input type="text" name="nome" class="form-control form-control-lg" placeholder="Nome" required>
                                </div>

                                <div class="form-outline form-white mb-4">
                                    <input type="text" name="cpf" class="form-control form-control-lg" placeholder="CPF" oninput="formatarCPF(this)"  maxlength="14" required>
                                </div>

                                <div class="form-outline form-white mb-4">
                                    <input type="text" name="login" class="form-control form-control-lg" placeholder="Login" required>
                                </div>

                                <div class="form-outline form-white mb-4">
                                    <input type="password" name="senha" class="form-control form-control-lg" placeholder="Senha"/>
                                </div>

                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Cadastrar</button>
                            </form>

                            <div>
                                <a href="/bib/usuario/logarusuario" class="text-white-50 fw-bold">Voltar</a>
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
<script>
    function formatarCPF(campo) {
        var valor = campo.value.replace(/\D/g, ''); // Remove caracteres não numéricos
        valor = valor.replace(/(\d{3})(\d)/, "$1.$2"); // Insere o primeiro ponto após 3 dígitos
        valor = valor.replace(/(\d{3})(\d)/, "$1.$2"); // Insere o segundo ponto após 3 dígitos
        valor = valor.replace(/(\d{3})(\d{1,2})$/, "$1-$2"); // Insere o traço antes dos últimos 2 dígitos
        campo.value = valor;
    }
</script>
</body>
</html>


