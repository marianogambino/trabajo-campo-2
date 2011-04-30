package org.apache.jsp.tc2.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<html xmlns:ui=\"http://java.sun.com/jsf/facelets\"\r\n");
      out.write("\t  xmlns:h=\"http://java.sun.com/jsf/html\"\r\n");
      out.write("\t  xmlns:p=\"http://primefaces.prime.com.tr/ui\">\r\n");
      out.write("  \r\n");
      out.write("<ui:composition template=\"../../WEB-INF/facelets/templates/loginTmp.jsp\">\r\n");
      out.write("\t\r\n");
      out.write("\t<ui:define name=\"content\">\r\n");
      out.write("   \t\t<h:outputLabel value=\"MARIANO\"/>\r\n");
      out.write("   \t\t  \r\n");
      out.write("   \t\t<p:breadCrumb>\r\n");
      out.write("\t\t\t<p:menuitem label=\"Categories\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"Sports\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"Football\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"Countries\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"Spain\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"F.C. Barcelona\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"Squad\" url=\"#\" />\r\n");
      out.write("\t\t\t<p:menuitem label=\"Lionel Messi\" url=\"#\" />\r\n");
      out.write("\t\t</p:breadCrumb>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t           \r\n");
      out.write("   \t</ui:define>\r\n");
      out.write("\r\n");
      out.write("</ui:composition>\r\n");
      out.write("\r\n");
      out.write("</html>\t\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
