<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 26/01/2018
  Time: 02:51
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
    <title>Seller Start Page</title>

</head>
<body>
    <div class="head">
        <h1>This will show the list of jobs to apply</h1>

    </div>
    <div id="tableOfIndividuals">
        <table class="responsive-card-table unstriped">
            <thead>
                <tr>
                    <th>Company</th>
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
                    <td data-label="Company">EMATER</td>
                    <td data-label="Email">emater@emater.com</td>
                    <td data-label="Phone">295628317</td>
                    <td data-label="Location">Angra</td>
                </tr>

            </tbody>
    </table>
</div>

</body>
</html>
