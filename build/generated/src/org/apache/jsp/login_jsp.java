package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <img src=\"images/Home.png\" alt=\"Home\" width=\"30\" height=\"24\">\n");
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
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("         ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Arial', sans-serif;\n");
      out.write("                background-color: #f4f7f6;\n");
      out.write("                background-image: url(\"images/bghospitalLogin.png\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .h2{\n");
      out.write("                font-family: 'Copperplate', fantasy;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .login-container {\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 2rem;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 400px;\n");
      out.write("            }\n");
      out.write("            form {\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap: 1rem;\n");
      out.write("            }\n");
      out.write("            input[type=\"text\"],\n");
      out.write("            input[type=\"password\"] {\n");
      out.write("                padding: 0.5rem;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 1rem;\n");
      out.write("            }\n");
      out.write("            input[type=\"text\"]:focus,\n");
      out.write("            input[type=\"password\"]:focus {\n");
      out.write("                border-color: #007bff;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                font-size: 1rem;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            button {\n");
      out.write("                padding: 0.6rem;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background-color: #007bff;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 1rem;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("            button:hover {\n");
      out.write("                background-color: #0056b3;\n");
      out.write("            }\n");
      out.write("            @media (max-width: 600px) {\n");
      out.write("                .login-container {\n");
      out.write("                    width: 90%;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <div class=\"w3-container w3-center w3-animate-top\">\n");
      out.write("            <form action=\"LoginServlet\" method=\"POST\">\n");
      out.write("                \n");
      out.write("                <h2 class=\"h2\">Login</h2>\n");
      out.write("                ");
 if (request.getAttribute("message") != null) { 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                        ");
      out.print( request.getAttribute("message") );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"email\" class=\"form-label\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" value=\"Login\">Login</button>\n");
      out.write("                <a href=\"registration.jsp\" class=\"btn btn-primary\" role=\"button\">Register</a>\n");
      out.write("           \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("<script>\n");
      out.write("        \n");
      out.write("    document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("\n");
      out.write("    // Smooth Form Animation\n");
      out.write("    const loginContainer = document.querySelector('.login-container');\n");
      out.write("    loginContainer.style.opacity = 0;\n");
      out.write("    setTimeout(() => {\n");
      out.write("    loginContainer.style.opacity = 1;\n");
      out.write("        loginContainer.style.transform = 'translateY(0)';\n");
      out.write("    }, 100);\n");
      out.write("\n");
      out.write("    // Input Field Validation\n");
      out.write("    const emailInput = document.getElementById('email');\n");
      out.write("    const passwordInput = document.getElementById('password');\n");
      out.write("\n");
      out.write("    emailInput.addEventListener('input', function() {\n");
      out.write("        if (!this.value.includes('@')) {\n");
      out.write("            this.style.borderColor = 'red';\n");
      out.write("        } else {\n");
      out.write("            this.style.borderColor = '#ddd';\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    passwordInput.addEventListener('input', function() {\n");
      out.write("        if (this.value.length < 8) {\n");
      out.write("            this.style.borderColor = 'red';\n");
      out.write("        } else {\n");
      out.write("            this.style.borderColor = '#ddd';\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // Interactive Button\n");
      out.write("    const loginButton = document.querySelector('button[type=\"submit\"]');\n");
      out.write("    loginButton.addEventListener('mouseover', function() {\n");
      out.write("        this.style.backgroundColor = '#0062cc';\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    loginButton.addEventListener('mouseout', function() {\n");
      out.write("        this.style.backgroundColor = '#007bff';\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // Responsive Background\n");
      out.write("    // Add any background animations or effects here if needed.\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
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
