<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Категория</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
</head>
<body>
<br>
<br>
<#include "../header/navigation.ftlh">
<h1>Список всех категорий</h1>
<table>
    <tr>
        <th>Название</th>
        <th>Описание</th>
    </tr>
    <#list categories as category>
        <tr>
            <td>${category.name}</td>
            <td>${category.summary}</td>
            <td>
                <a href="/categories/${category.id}">Перейти</a>
                <a href="/categories/${category.id}/delete">Удалить</a>
            </td>
        </tr>
    </#list>
</table>
<br>
<br>
<br>
<br>
<h1>Добавление новой категории</h1>
<form action="/categories" method="post">
    <br>
    <label>
        Название добавляемой категории
        <input type="title" name="name" placeholder="Введите название">
    </label>
    <label>
        Описание добавляемой категории
        <input type="text" name="summary" placeholder="Введите описание">
    </label>
    <input autofocus type="submit" value="Добавить"/>
</form>
</body>
</html>