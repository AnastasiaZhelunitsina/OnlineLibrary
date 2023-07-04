<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Книги</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>Все книги</h1>
<table>
    <tr>
        <th>Название</th>
        <th>Описание</th>
    </tr>
    <#list books as book>
        <tr>
            <td>${book.title}</td>
            <td>${book.description}</td>
            <td>
                <a href="/books/${book.id}">Перейти</a>
                <a href="/books/${book.id}/delete">Удалить</a>
            </td>
        </tr>
    </#list>
</table>
<br>
<br>
<br>
<br>
<h1>Добавление новой книги</h1>
<form action="/books" method="post">
    <br>
    <label>
        Название добавляемой книги
        <input type="title" name="title" placeholder="Введите название">
    </label>
    <label>
        Описание добавляемой книги
        <input type="text" name="description" placeholder="Введите описание">
    </label>
    <input autofocus type="submit" value="Добавить"/>
</form>
</body>
</html>