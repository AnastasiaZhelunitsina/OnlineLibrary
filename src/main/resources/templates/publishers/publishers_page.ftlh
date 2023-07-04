<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Все издательства</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>Все издательства</h1>
<table>
    <tr>
        <th>Название</th>
    </tr>
    <#list publishers as publisher>
        <tr>
            <td>${publisher.name}</td>
            <td>
                <a href="/publishers/${publisher.id}">Перейти</a>
                <a href="/publishers/${publisher.id}/delete">Удалить</a>
            </td>
        </tr>
    </#list>
</table>
<br>
<br>
<h1>Добавление нового издательства</h1>
<form action="/publishers" method="post">
    <label>
        Название добавляемого издательства
        <input type="text" name="name" placeholder="Введите название">
    </label>
    <input autofocus type="submit" value="Добавить"/>
</form>
</body>
</html>