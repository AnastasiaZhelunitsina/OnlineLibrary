<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
    <title>Sign In</title>
</head>
<body>
<a href="/signUp">Регистрация</a>
<form action="/signIn" method="post">
    <label>Ваш Email
        <input type="email" placeholder="Введите email" name="email">
    </label>
    <label>Ваш Пароль
        <input type="password" placeholder="Введите password" name="password">
    </label>
    <label>
        <input type="checkbox" name="rememberMe">Запомни меня
    </label>
    <input type="submit">
</form>
</body>
</html>
