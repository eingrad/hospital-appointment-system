<%-- 
    Document   : register
    Created on : Jan 14, 2024, 2:56:04 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/HeaderLog.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <link href="styles/registrationStyle.css" rel="stylesheet">
        <title>Registration</title>
    </head>
    <body>
        <div class="content registration-form">
            <form method="post" action="RegistrationServlet">
                <div class="container">
                    <div class="row text-center">
                        <h1>Registration</h1>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <label for="name">Name</label>
                            <input type="text" id="name" name="name" class="form-control">
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <label for="email">Email</label>
                            <input type="email" id="email" name="email" class="form-control">
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <label for="birthdate">Birthdate</label>
                            <input type="date" id="birthdate" name="birthdate" class="form-control">
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <label for="password">Password</label>
                            <input type="password" id="password" name="password" class="form-control">
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <label for="confirmPassword">Confirm Password</label>
                            <input type="password" id="confirmPassword" name="confirmPassword" class="form-control">
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6 text-danger">
                            <% if (request.getAttribute("message") != null) { %>
                                <%= request.getAttribute("message") %>
                            <% } %>
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6 text-center">
                            <input class="btn btn-primary" type="submit" value="Register">
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                </div>
            </form>
        </div>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
