package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class v3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.jsp");
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
      bean.AccountBean account = null;
      synchronized (session) {
        account = (bean.AccountBean) _jspx_page_context.getAttribute("account", PageContext.SESSION_SCOPE);
        if (account == null){
          account = new bean.AccountBean();
          _jspx_page_context.setAttribute("account", account, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"styles/base.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("                <div class=\"includes container-fluid\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                        <img src=\"images/home.png\" alt=\"Home\" width=\"30\" height=\"24\">\n");
      out.write("                    </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("                        ");
 if (account != null && account.getEmail() != null) {
                            
      out.write("\n");
      out.write("                            <div class=\"navbar-nav\">\n");
      out.write("                                <a class=\"nav-link\" href=\"AppointmentServlet\">Set Appointment</a>\n");
      out.write("                                <a class=\"nav-link\" href=\"AppointmentDisplayServlet\">List My Appointments</a>\n");
      out.write("                                <a class=\"nav-link\" href=\"EditAccountServlet\">Edit Account</a>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                        }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"navbar-text\">\n");
      out.write("                        ");
 if (account != null && account.getEmail() != null) {
                            
      out.write("\n");
      out.write("                            <a class=\"nav-link\" href=\"LogoutServlet\">Logout</a>\n");
      out.write("                            ");

                        } else {
                            
      out.write("\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                            ");

                        }
                        
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"styles/base.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <form method=\"post\" action=\"LoginServlet\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row text-center\">\n");
      out.write("                        <h1>Login</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Email</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input name=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input name=\"password\" type=\"password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
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
      out.write("                            <input class=\"btn btn-primary\" type=\"submit\" value=\"Login\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                        \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("                        \n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <p>No account yet? <a href=\"registration.jsp\">Register now</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"text-center bg-light footer-container\">\n");
      out.write("                <div>\n");
      out.write("                    © 2023 Copyright: UiTM\n");
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
