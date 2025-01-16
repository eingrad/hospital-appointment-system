package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ExpertiseBean;
import bean.AbsenceBean;

public final class editAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      java.util.List<bean.ExpertiseBean> expertises = null;
      synchronized (request) {
        expertises = (java.util.List<bean.ExpertiseBean>) _jspx_page_context.getAttribute("expertises", PageContext.REQUEST_SCOPE);
        if (expertises == null){
          try {
            expertises = (java.util.List<bean.ExpertiseBean>) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List<bean.ExpertiseBean>");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List<bean.ExpertiseBean>", exc);
          }
          _jspx_page_context.setAttribute("expertises", expertises, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.util.List<bean.AbsenceBean> absences = null;
      synchronized (request) {
        absences = (java.util.List<bean.AbsenceBean>) _jspx_page_context.getAttribute("absences", PageContext.REQUEST_SCOPE);
        if (absences == null){
          try {
            absences = (java.util.List<bean.AbsenceBean>) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List<bean.AbsenceBean>");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List<bean.AbsenceBean>", exc);
          }
          _jspx_page_context.setAttribute("absences", absences, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n");
      out.write("         <link href=\"styles/editAccount.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Edit Your Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"row mb-3\">\n");
      out.write("    <label for=\"name\" class=\"col-sm-2 col-form-label\">Name</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" value=\"");
      out.print( account.getFullName());
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row mb-3\">\n");
      out.write("    <label for=\"email\" class=\"col-sm-2 col-form-label\">Email</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" value=\"");
      out.print( account.getEmail());
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row mb-3\">\n");
      out.write("    <label for=\"birthdate\" class=\"col-sm-2 col-form-label\">Birthdate</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"date\" class=\"form-control\" id=\"birthdate\" name=\"birthdate\" value=\"");
      out.print( account.getBirthDate());
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row mb-3\">\n");
      out.write("    <label for=\"password\" class=\"col-sm-2 col-form-label\">Password</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" value=\"");
      out.print( account.getPassword());
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row mb-3\">\n");
      out.write("    <label for=\"confirmPassword\" class=\"col-sm-2 col-form-label\">Confirm Password</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"confirmPassword\" name=\"confirmPassword\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
 if (account != null && account.isIsDoctor()) {
                        
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Expertise</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <select name=\"expertise\">\n");
      out.write("                                ");
 for (ExpertiseBean e : expertises) {
                                    
      out.write("\n");
      out.write("                                    <option class=\"hover-text\" value=\"");
      out.print( e.getExpertiseId());
      out.write("\"\n");
      out.write("                                            ");
      out.print( account.getExpertiseIdFK() == e.getExpertiseId() ? "selected" : "");
      out.write(">\n");
      out.write("                                        ");
      out.print( e.getName());
      out.write("\n");
      out.write("                                    </option>\n");
      out.write("                                    ");

                                }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                        ");

                    }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col-6 text-danger\">\n");
      out.write("                        ");

                            if (request.getAttribute("message") == null) {
                            } else {
                                
      out.write("\n");
      out.write("                                ");
      out.print( request.getAttribute("message") );
      out.write("\n");
      out.write("                                ");

                            }
                        
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("                            <input class=\"btn btn-primary\" type=\"submit\" value=\"Update Account\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <form method=\"post\" action=\"AbsenceServlet\">\n");
      out.write("                    <div class=\"row text-center\">\n");
      out.write("                        <h2>Manage Absences</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>From Date</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input name=\"fromDate\" type=\"date\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>To Date</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input name=\"toDate\" type=\"date\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col-6 text-danger\">\n");
      out.write("                        ");

                            if (request.getAttribute("absenceMessage") == null) {
                            } else {
                                
      out.write("\n");
      out.write("                                ");
      out.print( request.getAttribute("absenceMessage") );
      out.write("\n");
      out.write("                                ");

                            }
                        
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("                            <input class=\"btn btn-primary\" type=\"submit\" value=\"Add Absence\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                     \n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\"></div>\n");
      out.write("                    <div class=\"col-6\">\n");
      out.write("                        <table class=\"table table-bordered\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">From Date</th>\n");
      out.write("                                    <th scope=\"col\">To Date</th>\n");
      out.write("                                    <th scope=\"col\" colspan=\"2\">Actions</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    for (AbsenceBean a : absences) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <form method=\"post\" action=\"AbsenceUpdateServlet\">\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input name=\"fromDate\" type=\"date\" value=\"");
      out.print( a.getFromDate() );
      out.write("\">\n");
      out.write("                                                </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input name=\"toDate\" type=\"date\" value=\"");
      out.print( a.getToDate());
      out.write("\"></td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input name=\"absenceId\" type=\"hidden\"  value=\"");
      out.print( a.getAbsenceId());
      out.write("\">\n");
      out.write("                                                    <input class=\"btn btn-primary\" type=\"submit\" value=\"Update\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </form>\n");
      out.write("                                            <form method=\"post\" action=\"AbsenceDeleteServlet\">\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input name=\"absenceId\" type=\"hidden\"  value=\"");
      out.print( a.getAbsenceId());
      out.write("\">\n");
      out.write("                                                    <input class=\"btn btn-danger\" type=\"submit\" value=\"Delete\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </form>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
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
