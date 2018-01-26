<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 26/01/2018
  Time: 01:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-float.css">
    <link rel="stylesheet" type="text/css" href="style.css">
    <!--<link rel="stylesheet" type="text/css" href="css/teste.css"> -->

    <title>Company Start Page</title>
</head>
<body>

<div class="top-bar">
    <div class="top-bar-left">
        <ul class="menu">
            <li class="menu-text">P.I.M.P - P.I.M.P Interactive Management Project </li>
            <li> ${company.name}</li>

        </ul>
    </div>
    <div class="top-bar-right">
        <ul class="menu">
            <li><a href="#">Three</a></li>
            <li><a href="#">Four</a></li>
            <li><a href="#">Five</a></li>
            <li><a href="#">Six</a></li>
        </ul>
    </div>
</div>
<div class="row">

    <div class="medium-12 columnshead">
        <h2>This will show the list of sellers to this leader</h2>

    </div>
    <div id="tableOfIndividuals">
        <table class="responsive-card-table unstriped">
            <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Location</th>
            </tr>
            </thead>
            <tbody>

            <tr>
                <td data-label="Name">Joao</td>
                <td data-label="Email">joao@joao.com</td>
                <td data-label="Phone">935372988</td>
                <td data-label="Location">Angra</td>
            </tr>
            <tr>
                <td data-label="Name">Maria</td>
                <td data-label="Email">maria@maria.com</td>
                <td data-label="Phone">962660244</td>
                <td data-label="Location">Angra</td>
            </tr>
            <tr>
                <td data-label="Name">Isabel</td>
                <td data-label="Email">isabel@isabel.org</td>
                <td data-label="Phone">965535598</td>
                <td data-label="Location">Funchal</td>
            </tr>


            </tbody>
        </table>

        <!-- use button tag for on page actions -->
        <button class="button button-rounded-hover">Add Leader</button>
    </div>

</body>
</html>
