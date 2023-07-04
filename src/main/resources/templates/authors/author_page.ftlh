<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Автор</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>${author.firstName} ${author.lastName}</h1>
<br>
<h2>${author.description}</h2>
<br>
<br>
<br>
<br>
<h2>Редактировать информацию</h2>
<form action="/authors/${author.id}/update" method="post">
    <br>
    <label>
        Имя
        <input type="text" name="firstName" value=${author.firstName}>
    </label>
    <label>
        Фамилия
        <input type="text" name="lastName" value=${author.lastName}>
    </label>
    <label>
        Об авторе
        <input type="text" name="description" value=${author.description}>
    </label>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>