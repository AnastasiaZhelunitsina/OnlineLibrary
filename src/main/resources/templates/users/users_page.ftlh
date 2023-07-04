<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
    <title>Все пользователи</title>
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>Все пользователи</h1>
<table>
    <tr>
        <th>Email</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <td>Действия</td>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.email}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>
                <a href="/users/${user.id}">Перейти</a>
                <a href="/users/${user.id}/delete">Удалить</a>
            </td>
        </tr>
    </#list>
</table>
<br>
<br>
<br>
<br>
<h1>Добавление нового пользователя</h1>
<form action="/users" method="post">
    <br>
    <label>
        Email
        <input type="email" name="email" placeholder="Введите почту">
    </label>
    <label>
        Имя
        <input type="text" name="firstName" placeholder="Введите имя">
    </label>
    <label>
        Фамилия
        <input type="text" name="lastName" placeholder="Введите фамилию">
    </label>
    <input autofocus type="submit" value="Добавить"/>
</form>
</body>
</html>
