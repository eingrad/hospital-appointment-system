package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.sql.Date;
import bean.AppointmentBean;
import bean.AccountBean;

public final class appointmentView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Calendar calendar = Calendar.getInstance();
    Date today;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/HeaderLog.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      bean.AccountBean account = null;
      synchronized (session) {
        account = (bean.AccountBean) _jspx_page_context.getAttribute("account", PageContext.SESSION_SCOPE);
        if (account == null){
          account = new bean.AccountBean();
          _jspx_page_context.setAttribute("account", account, PageContext.SESSION_SCOPE);
        }
      }
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"styles/custom.css\" rel=\"stylesheet\"> <!-- Link to Custom CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <nav class=\"navbar navbar-expand-md custom-navbar\">\n");
      out.write("                <div class=\"includes container-fluid\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                        <img src=\"images/Home.png\" alt=\"Home\" width=\"40\" height=\"34\">\n");
      out.write("                    </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("                        ");
 if (account != null && account.getEmail() != null) { 
      out.write("\n");
      out.write("                            <div class=\"navbar-nav\">\n");
      out.write("                                <a class=\"nav-link\" href=\"AppointmentServlet\">Create Appointment</a>\n");
      out.write("                                <a class=\"nav-link\" href=\"AppointmentDisplayServlet\">List Appointments</a>\n");
      out.write("                                <a class=\"nav-link\" href=\"EditAccountServlet\">Edit Account</a>\n");
      out.write("                            </div>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"navbar-text\">\n");
      out.write("                        ");
 if (account != null && account.getEmail() != null) { 
      out.write("\n");
      out.write("                            <a class=\"nav-link\" href=\"LogoutServlet\">Logout</a>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
      java.util.List<bean.AppointmentBean> appointments = null;
      synchronized (request) {
        appointments = (java.util.List<bean.AppointmentBean>) _jspx_page_context.getAttribute("appointments", PageContext.REQUEST_SCOPE);
        if (appointments == null){
          try {
            appointments = (java.util.List<bean.AppointmentBean>) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List<bean.AppointmentBean>");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List<bean.AppointmentBean>", exc);
          }
          _jspx_page_context.setAttribute("appointments", appointments, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.util.List<bean.AccountBean> doctors = null;
      synchronized (request) {
        doctors = (java.util.List<bean.AccountBean>) _jspx_page_context.getAttribute("doctors", PageContext.REQUEST_SCOPE);
        if (doctors == null){
          try {
            doctors = (java.util.List<bean.AccountBean>) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List<bean.AccountBean>");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List<bean.AccountBean>", exc);
          }
          _jspx_page_context.setAttribute("doctors", doctors, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.util.List<bean.AccountBean> patients = null;
      synchronized (request) {
        patients = (java.util.List<bean.AccountBean>) _jspx_page_context.getAttribute("patients", PageContext.REQUEST_SCOPE);
        if (patients == null){
          try {
            patients = (java.util.List<bean.AccountBean>) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List<bean.AccountBean>");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List<bean.AccountBean>", exc);
          }
          _jspx_page_context.setAttribute("patients", patients, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      out.write('\n');
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);

    today = new Date(calendar.getTime().getTime());

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"styles/appointmentview.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Appointment View</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <table class=\"table table-striped table-hover\">\n");
      out.write("                    <!-- column headers -->\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Doctor</th>\n");
      out.write("                            <th>Patient</th>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th>Start Time</th>\n");
      out.write("                            <th>End Time</th>\n");
      out.write("                            <th>Actions</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <!-- column data -->\n");
      out.write("                    <tbody class=\"table-group-divider\">\n");
      out.write("                        ");
 for (AppointmentBean a : appointments) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                ");
 for (AccountBean doctor : doctors) {
                                        if (doctor.getAccountId() == a.getAccountDoctorIdFK()) {
                                
      out.write("\n");
      out.write("                                ");
      out.print( doctor.getFullName());
      out.write("\n");
      out.write("                                ");

                                            break;
                                        }
                                    }
                                
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                ");
 for (AccountBean patient : patients) {
                                        if (patient.getAccountId() == a.getAccountPatientIdFK()) {
                                
      out.write("\n");
      out.write("                                ");
      out.print( patient.getFullName());
      out.write("\n");
      out.write("                                ");

                                            break;
                                        }
                                    }
                                
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
      out.print( a.getDate());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getStartTime());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( a.getDuration());
      out.write("</td>\n");
      out.write("                            <td colspan=\"6\">\n");
      out.write("                                <form method=\"get\" action=\"AppointmentServlet\">\n");
      out.write("                                    <input hidden name=\"appointmentId\" value=\"");
      out.print( a.getAppointmentId());
      out.write("\">\n");
      out.write("                                    <input class=\"btn btn-edit\" type=\"submit\" value=\"Edit\" ");
      out.print( a.getDate().before(today) ? "disabled" : "");
      out.write(">\n");
      out.write("                                </form>\n");
      out.write("                                <form method=\"post\" action=\"AppointmentDeleteServlet\">\n");
      out.write("                                    <input hidden name=\"appointmentId\" value=\"");
      out.print( a.getAppointmentId());
      out.write("\">\n");
      out.write("                                    <input onclick=\"confirmDelete(event)\" class=\"btn btn-delete\" type=\"submit\" value=\"Delete\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <script>\n");
      out.write("                    function confirmDelete(event) {\n");
      out.write("                        if (!confirm('Are you sure you want to delete this appointment?')) {\n");
      out.write("                            event.preventDefault();\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"text-center bg-light footer-container\">\n");
      out.write("                <div>\n");
      out.write("                    © 2024 Copyright: Hospital Murni\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
