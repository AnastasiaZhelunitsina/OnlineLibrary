<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
    <title>Пользователь</title>
</head>
<body>
<#include "../header/navigation.ftlh">
<br>
<br>
<h1>${user.firstName} ${user.lastName}</h1>
<br>
<br>
<h2>Редактировать информацию</h2>
<form action="/users/${user.id}/update" method="post">
    <label>
        Email
        <input type="email" name="email" value=${user.email}>
    </label>
    <label>
        Имя
        <input type="text" name="firstName" value=${user.firstName}>
    </label>
    <label>
        Фамилия
        <input type="text" name="lastName" value=${user.lastName}>
    </label>
<#--    <label>-->
<#--        Возраст-->
<#--        <input type="text" name="age" value=${user.age}>-->
<#--    </label>-->
    <br>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>