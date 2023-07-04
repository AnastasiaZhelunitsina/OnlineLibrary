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
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>${category.name}</h1>
<br>
<h2>${category.description}</h2>
<br>
<br>
<br>
<br>
<h2>Редактировать информацию</h2>
<form action="/categories/${category.id}/update" method="post">
    <label>
        Название категории
        <input type="text" name="name" value=${category.name}>
    </label>
    <br>
    <label>
        Описание
        <input type="text" name="summary" value=${category.summary}>
    </label>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>