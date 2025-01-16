<%-- 
    Document   : login
    Created on : Jan 14, 2024, 4:37:02 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login Page</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA">
        <style>
            body {
                font-family: 'Arial', sans-serif;
                background-color: #f4f7f6;
                background-image: url("images/bghospitalLogin.png");
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }
            
            .h2{
                font-family: 'Copperplate', fantasy;
            }
            
            .login-container {
                background-color: white;
                padding: 2rem;
                border-radius: 8px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                width: 100%;
                max-width: 400px;
            }
            form {
                display: flex;
                flex-direction: column;
                gap: 1rem;
            }
            input[type="text"],
            input[type="password"] {
                padding: 0.5rem;
                border: 1px solid #ddd;
                border-radius: 4px;
                font-size: 1rem;
            }
            input[type="text"]:focus,
            input[type="password"]:focus {
                border-color: #007bff;
                outline: none;
            }
            label {
                font-size: 1rem;
                color: #333;
            }
            button {
                padding: 0.6rem;
                border: none;
                border-radius: 4px;
                background-color: #007bff;
                color: white;
                font-size: 1rem;
                cursor: pointer;
                transition: background-color 0.3s ease;
            }
            button:hover {
                background-color: #0056b3;
            }
            @media (max-width: 600px) {
                .login-container {
                    width: 90%;
                }
        </style>
    </head>
    <body>
    
        <div class="login-container">
            <div class="w3-container w3-center w3-animate-top">
            <form action="LoginServlet" method="POST">
                
                <h2 class="h2">Login</h2>
                <% if (request.getAttribute("message") != null) { %>
                    <div class="alert alert-danger" role="alert">
                        <%= request.getAttribute("message") %>
                    </div>
                <% } %>
                
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>
                <button type="submit" class="btn btn-primary" value="Login">Login</button>
                <a href="registration.jsp" class="btn btn-primary" role="button">Register</a>
           
            </form>
            </div>
        </div>
                
               
<script>
        
    document.addEventListener('DOMContentLoaded', function() {

    // Smooth Form Animation
    const loginContainer = document.querySelector('.login-container');
    loginContainer.style.opacity = 0;
    setTimeout(() => {
    loginContainer.style.opacity = 1;
        loginContainer.style.transform = 'translateY(0)';
    }, 100);

    // Input Field Validation
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');

    emailInput.addEventListener('input', function() {
        if (!this.value.includes('@')) {
            this.style.borderColor = 'red';
        } else {
            this.style.borderColor = '#ddd';
        }
    });

    passwordInput.addEventListener('input', function() {
        if (this.value.length < 8) {
            this.style.borderColor = 'red';
        } else {
            this.style.borderColor = '#ddd';
        }
    });

    // Interactive Button
    const loginButton = document.querySelector('button[type="submit"]');
    loginButton.addEventListener('mouseover', function() {
        this.style.backgroundColor = '#0062cc';
    });

    loginButton.addEventListener('mouseout', function() {
        this.style.backgroundColor = '#007bff';
    });

    // Responsive Background
    // Add any background animations or effects here if needed.
});

</script>
<%@include file="includes/footer.jsp" %>
    </body>
</html>
