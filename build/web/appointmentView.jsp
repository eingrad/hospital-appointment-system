<%-- 
    Document   : appointmentView
    Created on : Jan 12, 2024, 5:02:10 AM
    Author     : user
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<%@page import="bean.AppointmentBean"%>
<%@page import="bean.AccountBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/HeaderLog.jsp" %>

<jsp:useBean id="appointments" scope="request" class="java.util.List<bean.AppointmentBean>" />
<jsp:useBean id="doctors" scope="request" class="java.util.List<bean.AccountBean>" />
<jsp:useBean id="patients" scope="request" class="java.util.List<bean.AccountBean>" />
<%!
    Calendar calendar = Calendar.getInstance();
    Date today;
%>

<%    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);

    today = new Date(calendar.getTime().getTime());
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <link href="styles/appointmentview.css" rel="stylesheet">
        <title>Appointment View</title>
    </head>
    <body>
        <div class="content">
            <div class="container">
                <table class="table table-striped table-hover">
                    <!-- column headers -->
                    <thead>
                        <tr>
                            <th>Doctor</th>
                            <th>Patient</th>
                            <th>Date</th>
                            <th>Start Time</th>
                            <th>End Time</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <!-- column data -->
                    <tbody class="table-group-divider">
                        <% for (AppointmentBean a : appointments) {
                        %>
                        <tr>
                            <td>
                                <% for (AccountBean doctor : doctors) {
                                        if (doctor.getAccountId() == a.getAccountDoctorIdFK()) {
                                %>
                                <%= doctor.getFullName()%>
                                <%
                                            break;
                                        }
                                    }
                                %>
                            </td>
                            <td>
                                <% for (AccountBean patient : patients) {
                                        if (patient.getAccountId() == a.getAccountPatientIdFK()) {
                                %>
                                <%= patient.getFullName()%>
                                <%
                                            break;
                                        }
                                    }
                                %>
                            </td>
                            <td><%= a.getDate()%></td>
                            <td><%= a.getStartTime()%></td>
                            <td><%= a.getDuration()%></td>
                            <td colspan="6">
                                <form method="get" action="AppointmentServlet">
                                    <input hidden name="appointmentId" value="<%= a.getAppointmentId()%>">
                                    <input class="btn btn-edit" type="submit" value="Edit" <%= a.getDate().before(today) ? "disabled" : ""%>>
                                </form>
                                <form method="post" action="AppointmentDeleteServlet">
                                    <input hidden name="appointmentId" value="<%= a.getAppointmentId()%>">
                                    <input onclick="confirmDelete(event)" class="btn btn-delete" type="submit" value="Delete">
                                </form>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
                <script>
                    function confirmDelete(event) {
                        if (!confirm('Are you sure you want to delete this appointment?')) {
                            event.preventDefault();
                        }
                    }
                </script>
            </div>
        </div>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
