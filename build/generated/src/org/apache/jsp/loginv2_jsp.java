package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginv2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("<title>Sign Up Form by Colorlib</title>\n");
      out.write("\n");
      out.write("<!-- Font Icon -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("<!-- Main css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\n");
      out.write("\t\t<!-- Sing in  Form -->\n");
      out.write("\t\t<section class=\"sign-in\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"signin-content\">\n");
      out.write("\t\t\t\t\t<div class=\"signin-image\">\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/signin-image.jpg\" alt=\"sing up image\">\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t<a href=\"registration.jsp\" class=\"signup-image-link\">Create an\n");
      out.write("\t\t\t\t\t\t\taccount</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"signin-form\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"form-title\">Sign up</h2>\n");
      out.write("\t\t\t\t\t\t<form method=\"\" action=\"\" class=\"register-form\"\n");
      out.write("\t\t\t\t\t\t\tid=\"login-form\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"username\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"zmdi zmdi-account material-icons-name\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"username\" id=\"username\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Your Name\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"password\"><i class=\"zmdi zmdi-lock\"></i></label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"password\" name=\"password\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"remember-me\" id=\"remember-me\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"agree-term\" /> <label for=\"remember-me\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label-agree-term\"><span><span></span></span>Remember\n");
      out.write("\t\t\t\t\t\t\t\t\tme</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-button\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"signin\" id=\"signin\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-submit\" value=\"Log in\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<div class=\"social-login\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"social-label\">Or login with</span>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"socials\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"display-flex-center zmdi zmdi-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"display-flex-center zmdi zmdi-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"display-flex-center zmdi zmdi-google\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- JS -->\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
