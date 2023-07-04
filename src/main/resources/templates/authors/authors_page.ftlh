<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Все авторы</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>Все авторы</h1>
<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Описание</th>
    </tr>
    <#list authors as author>
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td>${author.description}</td>
            <td>
                <a href="/authors/${author.id}">Перейти</a>
                <a href="/authors/${author.id}/delete">Удалить</a>
            </td>
        </tr>
    </#list>
</table>
<br>
<br>
<br>
<br>
<h1>Добавление нового автора</h1>
<form action="/authors" method="post">
    <br>
    <label>
        Имя
        <input type="text" name="firstName" placeholder="Введите имя">
    </label>
    <label>
        Фамилия
        <input type="text" name="lastName" placeholder="Введите фамилию">
    </label>
    <label>
        Об авторе
        <input type="text" name="description" placeholder="Введите описание">
    </label>
    <input autofocus type="submit" value="Добавить"/>
</form>
</body>
</html>