<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
    <title>Книга</title>
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>${book.title}</h1>
<br>
<br>
<h2>${book.description}</h2>
<br>
<br>
<br>
<h2>Редактировать информацию</h2>
<form action="/books/${book.id}/update" method="post">
    <br>
    <label>
        Название книги
        <input type="text" name="title" value=${book.title}>
    </label>
    <label>
        Описание
        <input type="text" name="description" value=${book.description}>
    </label>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>