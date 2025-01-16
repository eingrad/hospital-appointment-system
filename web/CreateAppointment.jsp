<%-- 
    Document   : CreateAppointment
    Created on : Jan 16, 2024, 1:55:10 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.AccountBean"%>
<%@include file="includes/HeaderLog.jsp" %>

<jsp:useBean id="appointment" scope="request" class="bean.AppointmentBean" />
<jsp:useBean id="doctors" scope="request" class="java.util.List<bean.AccountBean>" />
<jsp:useBean id="patients" scope="request" class="java.util.List<bean.AccountBean>" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <style>body, html {
  height: 100%;
  margin: 0;
}

.content {
  min-height: calc(100vh - 70px); /* Adjust 70px to your footer's height */
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 20px;
}

.appointment-form {
  background-color: #f9f9f9;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  width: 100%;
  max-width: 500px; /* Set a max-width for larger screens */
}

.appointment-form h1 {
  color: #333;
  margin-bottom: 20px;
}

.form-group {
  margin-bottom: 15px;
}

.form-group label {
  display: block;
  margin-bottom: 5px;
}

.form-control {
  width: 100%;
  padding: 8px;
  border: 1px solid #ddd;
  border-radius: 4px;
}

.btn-primary {
  background-color: #0056b3;
  border-color: #0056b3;
  color: white;
  padding: 10px 15px;
  border-radius: 4px;
  cursor: pointer;
}

.btn-primary:hover {
  background-color: #003d82;
}

.text-danger {
  color: #dc3545;
}

.footer-container {
    width: 100%;
    position: fixed;
    left: 0;
    bottom: 0;
}
        </style>
        <title>Appointment</title>
    </head>
    <body> 
        <div class="content">
            <form method="post" action="AppointmentServlet" class="appointment-form">
                <div class="container">
                    <div class="row text-center">
                        <h1>Appointment</h1>
                    </div>
                    
                    <br>
                    
                    <% if (account.isIsDoctor()) {
                        %>
                        <div class="row">
                            <div class="col"></div>
                            <div class="col">
                                <label>Patient</label>
                            </div>
                            <div class="col">
                                <select name="accountPatientIdFK">
                                    <% for (AccountBean patient : patients) {
                                        %>
                                        <option class="hover-text" value="<%= patient.getAccountId()%>"
                                                <%= patient.getAccountId()== appointment.getAccountPatientIdFK()? "selected" : ""%>>
                                            <%= patient.getFullName() %>
                                        </option>
                                        <%
                                    }
                                    %>
                                </select>
                            </div>
                            <div class="col"></div>
                        </div>
                                
                        <input hidden name="accountDoctorIdFK" value="<%= account.getAccountId() %>">
                        <%
                    } else {
                        %>
                        <div class="row">
                            <div class="col"></div>
                            <div class="col">
                                <label>Doctor:</label>
                            </div>
                            <div class="col">
                                <select name="accountDoctorIdFK">
                                    <% for (AccountBean doctor : doctors) {
                                        %>
                                        <option class="hover-text" value="<%= doctor.getAccountId()%>"
                                                <%= doctor.getAccountId()== appointment.getAccountDoctorIdFK()? "selected" : ""%>>
                                            <%= doctor.getFullName() %>
                                        </option>
                                        <%
                                    }
                                    %>
                                </select>
                            </div>
                            <div class="col"></div>
                        </div>
                                
                        <input hidden name="accountPatientIdFK" value="<%= account.getAccountId() %>">
                        <%
                    }
                    %>
                    
                    <br>
                    
                    <div class="row">
                        <div class="col"></div>
                        <div class="col">
                            <label>Date</label>
                        </div>
                        <div class="col">
                            <input name="date" type="date" value="<%= appointment.getDate() %>">
                        </div>
                        <div class="col"></div>
                    </div>
                    
                    <br>
                    
                    <div class="row">
                        <div class="col"></div>
                        <div class="col">
                            <label>Start Time: </label>
                        </div>
                        <div class="col">
                            <input name="startTime" type="time" value="<%= appointment.getStartTime() %>">
                        </div>
                        <div class="col"></div>
                    </div>
                    
                    <br>
                    
                    <div class="row">
                        <div class="col"></div>
                        <div class="col">
                            <label>End Time: </label>
                        </div>
                        <div class="col">
                            <input name="duration" type="time" value="<%= appointment.getDuration() %>">
                        </div>
                        <div class="col"></div>
                    </div>
                    
                    <br>
                    
                    <div class="row">
                        <div class="col"></div>
                        <div class="col-6 text-danger">
                        <%
                            if (request.getAttribute("errorMessage") == null) {
                            } else {
                                %>
                                <%= request.getAttribute("errorMessage") %>
                                <%
                            }
                        %>
                        </div>
                        <div class="col"></div>
                    </div>
                        
                    <input hidden name="appointmentId" value="<%= appointment.getAppointmentId()%>">
                        
                    <br>
                    
                    <div class="row">
                        <div class="col"></div>
                        <div class="col-2">
                            <input class="btn btn-primary" type="submit"  value="<%= appointment.getAppointmentId() > 0 ? "Update" : "Create" %> Appointment">
                        </div>
                        <div class="col"></div>
                    </div>
                </div>
            </form>
        </div>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
