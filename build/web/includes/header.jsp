<%-- 
    Document   : header
    Created on : Jan 11, 2024, 3:59:03 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="account" scope="session" class="bean.AccountBean"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/base.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        
    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-lg bg-light">
                <div class="includes container-fluid">
                    <a class="navbar-brand" href="index.jsp">
                        <img src="images/Home.png" alt="Home" width="30" height="24">
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <% if (account != null && account.getEmail() != null) {
                            %>
                            <div class="navbar-nav">
                                <a class="nav-link" href="AppointmentServlet">Set Appointment</a>
                                <a class="nav-link" href="AppointmentDisplayServlet">List My Appointments</a>
                                <a class="nav-link" href="EditAccountServlet">Edit Account</a>
                            </div>
                            <%
                        }
                        %>
                    </div>
                </div>
            </nav>
         