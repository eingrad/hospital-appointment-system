<%-- 
    Document   : editAccount
    Created on : Jan 12, 2024, 3:30:10 AM
    Author     : user
--%>

<%@page import="bean.ExpertiseBean"%>
<%@page import="bean.AbsenceBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/HeaderLog.jsp" %>

<jsp:useBean id="expertises" scope="request" class="java.util.List<bean.ExpertiseBean>" />
<jsp:useBean id="absences" scope="request" class="java.util.List<bean.AbsenceBean>" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <link href="styles/editAccount.css" rel="stylesheet">
        <title>Edit Your Information</title>
    </head>
    <body>
         <div class="content">
            <div class="container">
                <form method="post" action="EditAccountServlet" class="edit-account-form">
    <h1 class="text-center mb-4">Edit Account</h1>
    
    <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text" class="form-control" id="name" name="name" value="<%= account.getFullName()%>">
    </div>
    
    <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" name="email" value="<%= account.getEmail()%>">
    </div>
    
    <div class="mb-3">
        <label for="birthdate" class="form-label">Birthdate</label>
        <input type="date" class="form-control" id="birthdate" name="birthdate" value="<%= account.getBirthDate()%>">
    </div>
    
    <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" name="password" value="<%= account.getPassword()%>">
    </div>
    
    <div class="mb-3">
        <label for="confirmPassword" class="form-label">Confirm Password</label>
        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
    </div>

    <% if (account != null && account.isIsDoctor()) { %>
        <div class="mb-3">
            <label for="expertise" class="form-label">Expertise</label>
            <select class="form-control" id="expertise" name="expertise">
                <% for (ExpertiseBean e : expertises) { %>
                    <option value="<%= e.getExpertiseId()%>" <%= account.getExpertiseIdFK() == e.getExpertiseId() ? "selected" : ""%>><%= e.getName()%></option>
                <% } %>
            </select>
        </div>
    <% } %>

    <% if (request.getAttribute("message") != null) { %>
        <div class="alert alert-danger" role="alert">
            <%= request.getAttribute("message") %>
        </div>
    <% } %>
    
    <div class="text-center">
        <button type="submit" class="btn btn-primary">Update Account</button>
    </div>
</form>
                <br>
                <br>
                <br>
                <div class="manage-absences-container">
                <form method="post" action="AbsenceServlet">
                    <div class="row text-center">
                        <h2>Manage Absences</h2>
                    </div>
                    <br>
                    <div class="mb-3">
        <label for="fromDate" class="form-label">From Date</label>
        <input type="date" class="form-control" id="fromDate" name="fromDate">
    </div>
                    
             <div class="mb-3">
                <label for="toDate" class="form-label">To Date</label>
                <input type="date" class="form-control" id="toDate" name="toDate">
             </div>

                    <br>
                    <div class="row">
                        <div class="col"></div>
                        <div class="col-6 text-danger">
                        <%
                            if (request.getAttribute("absenceMessage") == null) {
                            } else {
                                %>
                                <%= request.getAttribute("absenceMessage") %>
                                <%
                            }
                        %>
                        </div>
                        
                        <div class="col"></div>
                    </div>
                    <br>
                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">Add Absence</button>
                    </div>
                </form>
                     
                <br>

                <div class="table-responsive">
                     <table class="table table-bordered">
                        <thead class="table-light">
                           <tr>
                            <th scope="col">From Date</th>
                            <th scope="col">To Date</th>
                            <th scope="col" colspan="2">Actions</th>
                           </tr>
                        </thead>
                        <tbody>
                                <%
                                    for (AbsenceBean a : absences) {
                                        %>
                                        <tr>
                                            <form method="post" action="AbsenceUpdateServlet">
                                                <td>
                                                    <input name="fromDate" type="date" value="<%= a.getFromDate() %>">
                                                </td>
                                                <td>
                                                    <input name="toDate" type="date" value="<%= a.getToDate()%>"></td>
                                                <td>
                                                    <input name="absenceId" type="hidden"  value="<%= a.getAbsenceId()%>">
                                                    <input class="btn btn-primary" type="submit" value="Update">
                                                </td>
                                            </form>
                                            <form method="post" action="AbsenceDeleteServlet">
                                                <td>
                                                    <input name="absenceId" type="hidden"  value="<%= a.getAbsenceId()%>">
                                                    <input class="btn btn-danger" type="submit" value="Delete">
                                                </td>
                                            </form>
                                        </tr>
                                        <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                    <div class="col"></div>
                </div>
            </div>
        </div>
        <br>
        <br>
        
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
