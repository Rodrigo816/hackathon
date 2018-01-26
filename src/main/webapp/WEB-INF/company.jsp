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
<body class="init">
<div class="top-bar">
    <div class="top-bar-left">
        <ul class="menu" style="float: left;">
            <li class="menu-text">P.I.M.P. - P.I.M.P. Interactive Management Project</li>
            <li>${user.name}</li>

        </ul>
        <span class="welcomeAdmin">Welcome, ${compname}</span>
    </div>

</div>
<div class="row">

    <div class="medium-12 columns head">
        <!--<h2>This will show the list of sellers to this leader</h2>-->

    </div>
    <div id="tableOfIndividuals">
        <!-- use button tag for on page actions -->
        <button class="button button-rounded-hover">Add Team Leader</button>
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
                <td data-label="Name">Cosmaçor</td>
                <td data-label="Email">cosmeticos@azores.pt</td>
                <td data-label="Phone">296628317</td>
                <td data-label="Location">Horta</td>
            </tr>
            <tr>
                <td data-label="Name">Terceira Pneus</td>
                <td data-label="Email">pneus.terceira@rodangra.com</td>
                <td data-label="Phone">295628761</td>
                <td data-label="Location">Angra</td>
            </tr>
            <tr>
                <td data-label="Name">Filhoses da Avó</td>
                <td data-label="Email">doces_tradicionais@quebom.pt</td>
                <td data-label="Phone">295000000</td>
                <td data-label="Location">Angra</td>
            </tr>
            <tr>
                <td data-label="Name">Legumes Faustino</td>
                <td data-label="Email">mercearia.faustino@greenpieces.com</td>
                <td data-label="Phone">981222777</td>
                <td data-label="Location">Praia</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
