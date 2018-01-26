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
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Individual Start Page</title>

</head>
<body>
<div class="head">
    <h1>This will show the list of sellers to this leader</h1>

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
            <td data-label="Name">${name}</td>
            <td data-label="Email">${email}</td>
            <td data-label="Phone">${phone}</td>
            <td data-label="Location">${location}</td>
        </tr>
        <tr>
            <td data-label="Name">Joao</td>
            <td data-label="Email">joao@joao.com</td>
            <td data-label="Phone">935372988</td>
            <td data-label="Location">Angra</td>
        </tr>

        </tbody>
    </table>
</div>
<!-- use button tag for on page actions -->
<button class="button button-rounded-hover">Add Seller to the team</button>

</body>
</html>
