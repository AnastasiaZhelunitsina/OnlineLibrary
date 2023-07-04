<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
    <title>Профиль</title>
</head>
<body>
<#include "header/navigation.ftlh">
<br>
<br>
<h1>${user.firstName} ${user.lastName}</h1>
<h2>${user.email}</h2>
</body>
</html>
