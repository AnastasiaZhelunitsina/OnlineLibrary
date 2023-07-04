<#import "spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
    <title>Sign Up</title>
</head>
<body>
<a href="?lang=en">English</a>
<a href="?lang=ru">Русский</a>
<form action="/signUp" method="post">
    <label> Ваше имя
        <input type="text" placeholder="Введите имя" name="firstName">
    </label>
    <label> Ваша Фамилия
        <input type="text" placeholder="Введите фамилию" name="lastName">
    </label>
    <label> Ваш Email
        <input type="email" placeholder="Введите email" name="email">
    </label>
    <label>Ваш Пароль
        <input type="password" placeholder="Введите password" name="password">
    </label>
    <input type="checkbox" name="remeberMe">Запомни меня
    </label>
    <input type="submit" value="Регистрация">
</form>
</body>
</html>
