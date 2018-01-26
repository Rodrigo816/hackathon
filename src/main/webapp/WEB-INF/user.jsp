<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 26/01/2018
  Time: 02:42
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
    <link rel="stylesheet" type="text/css" href="style.css?3566678">
    <title>Individual Start Page</title>

</head>
<body class="int">

<div class="top-bar">
    <div class="top-bar-left">
        <ul class="menu" style="float: left;">
            <li class="menu-text">P.I.M.P. - P.I.M.P. Interactive Management Project</li>
            <li>${user.name}</li>

        </ul>
        <span class="welcomeAdmin">Welcome, ${user_name}</span>
    </div>

</div>
<div class="row">

    <div class="medium-12 columns head">
       <!--<h2>This will show the list of sellers to this leader</h2>-->

    </div>
    <div id="tableOfIndividuals">
        <!-- use button tag for on page actions -->
        <button class="button button-rounded-hover">Add Seller to the team</button>
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
                <td data-label="Name">Rodrigo</td>
                <td data-label="Email">rodrigo@howtoswear.pt</td>
                <td data-label="Phone">98674123</td>
                <td data-label="Location">Praia</td>
            </tr>
            <tr>
                <td data-label="Name">Sofia</td>
                <td data-label="Email">sofia_sleepy_head@almofadas.pt</td>
                <td data-label="Phone">964352754</td>
                <td data-label="Location">Angra</td>
            </tr>
            <tr>
                <td data-label="Name">David(sem E)</td>
                <td data-label="Email">emborca_red_bull@energy.pt</td>
                <td data-label="Phone">404NoTFounD</td>
                <td data-label="Location">Praia</td>
            </tr>
            <tr>
                <td data-label="Name">Amélia</td>
                <td data-label="Email">party_all_night@nightowls.pt</td>
                <td data-label="Phone">927555444</td>
                <td data-label="Location">Praia</td>
            </tr>
            <tr>
                <td data-label="Name">João Martins</td>
                <td data-label="Email">washing_machine@laundry.com</td>
                <td data-label="Phone">1111110000000</td>
                <td data-label="Location">Angra</td>
            </tr>

            </tbody>
        </table>
    </div>
</div>


</body>
</html>
