/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-05-10 07:30:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.pDetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\r\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("   <head>\r\n");
      out.write("   <meta charset=\"utf-8\">\r\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("   <title>Neos &mdash; 100% Free Fully Responsive HTML5 Template by FREEHTML5.co</title>\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("   <meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\r\n");
      out.write("   <meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\r\n");
      out.write("   <meta name=\"author\" content=\"FREEHTML5.CO\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- \r\n");
      out.write("   //////////////////////////////////////////////////////\r\n");
      out.write("\r\n");
      out.write("   FREE HTML5 TEMPLATE \r\n");
      out.write("   DESIGNED & DEVELOPED by FREEHTML5.CO\r\n");
      out.write("      \r\n");
      out.write("   Website:       http://freehtml5.co/\r\n");
      out.write("   Email:          info@freehtml5.co\r\n");
      out.write("   Twitter:       http://twitter.com/fh5co\r\n");
      out.write("   Facebook:       https://www.facebook.com/fh5co\r\n");
      out.write("\r\n");
      out.write("   //////////////////////////////////////////////////////\r\n");
      out.write("    -->\r\n");
      out.write("\r\n");
      out.write("     <!-- Facebook and Twitter integration -->\r\n");
      out.write("   <meta property=\"og:title\" content=\"\"/>\r\n");
      out.write("   <meta property=\"og:image\" content=\"\"/>\r\n");
      out.write("   <meta property=\"og:url\" content=\"\"/>\r\n");
      out.write("   <meta property=\"og:site_name\" content=\"\"/>\r\n");
      out.write("   <meta property=\"og:description\" content=\"\"/>\r\n");
      out.write("   <meta name=\"twitter:title\" content=\"\" />\r\n");
      out.write("   <meta name=\"twitter:image\" content=\"\" />\r\n");
      out.write("   <meta name=\"twitter:url\" content=\"\" />\r\n");
      out.write("   <meta name=\"twitter:card\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("   <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\r\n");
      out.write("   <link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("   <!-- <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("   \r\n");
      out.write("   <link rel=\"stylesheet\" href=\"../assets/css/animate.css\">\r\n");
      out.write("   <!-- Icomoon Icon Fonts-->\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"../assets/css/icomoon.css\">\r\n");
      out.write("   <!-- Bootstrap  -->\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"../assets/css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"../assets/css/pd.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <!-- Modernizr JS -->\r\n");
      out.write("   <script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("   <!-- FOR IE9 below -->\r\n");
      out.write("   <!--[if lt IE 9]>\r\n");
      out.write("   <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("   <![endif]-->\r\n");
      out.write("\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("   <header>\r\n");
      out.write("      <div class=\"container text-center\">\r\n");
      out.write("         <div class=\"fh5co-navbar-brand\">\r\n");
      out.write("            <a class=\"fh5co-logo\" href=\"index.html\">????????????</a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <nav id=\"fh5co-main-nav\" role=\"navigation\">\r\n");
      out.write("            <ul>\r\n");
      out.write("               <li><a href=\"index.html\" class=\"active\">????????? ??????</a></li>\r\n");
      out.write("               <li><a href=\"work.html\" class=\"active\">????????? ??????</a></li>\r\n");
      out.write("               <li><a href=\"services.html\" class=\"active\">?????????</a></li>\r\n");
      out.write("               <li><a href=\"about.html\" class=\"active\">????????????</a></li>\r\n");
      out.write("               <li><a href=\"contact.html\" class=\"active\">???????????????</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("   </header>\r\n");
      out.write("   <img src=\"images/back2.png\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2 col-sm-12 col-sm-offset-0 col-xs-12 col-xs-offset-0 text-center fh5co-table\">\r\n");
      out.write("               \r\n");
      out.write("                  <h1 class=\"text-center\">????????? ?????? ??????</h1>\r\n");
      out.write("                  <p >?????? ??????</p>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div><!-- end: fh5co-parallax -->\r\n");
      out.write("   <div id=\"fh5co-work-section\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"row text-center\">\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("               <div class=\"fh5co-grid-work\">\r\n");
      out.write("                  <div class=\"work-holder\">\r\n");
      out.write("                     <a href=\"detail_ap.html\"><img src=\"images/ap1.png\" alt=\"Work\"></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"desc\">\r\n");
      out.write("                     <h3><a href=\"#\">[????????????]??????</a></h3>\r\n");
      out.write("                     <span>20% 5,800???</span>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("               <div class=\"fh5co-grid-work\">\r\n");
      out.write("                  <div class=\"work-holder\">\r\n");
      out.write("                     <a href=\"detail_ban.html\"><img src=\"images/ban1.png\" alt=\"Work\"></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"desc\">\r\n");
      out.write("                     <h3><a href=\"detail_ban.html\">[?????? ??????]?????????</a></h3>\r\n");
      out.write("                     <span>15% 25,300???</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("               <div class=\"fh5co-grid-work\">\r\n");
      out.write("                  <div class=\"work-holder\">\r\n");
      out.write("                     <a href=\"detail_ki.html\"><img src=\"images/ki1.png\" alt=\"Work\"></a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"desc\">\r\n");
      out.write("                     <h3><a href=\"detail.ki.html\">[?????????]??????</a></h3>\r\n");
      out.write("                     <span>7% 8,500???</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("   <footer>\r\n");
      out.write("      <div id=\"footer\" class=\"fh5co-border-line\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-8 col-md-offset-2 text-center\">\r\n");
      out.write("                  <p>Copyright 2016 Free Html5 <a href=\"#\">Neos</a>. All Rights Reserved. <br>Made with <i class=\"icon-heart3 love\"></i> by <a href=\"http://freehtml5.co/\" target=\"_blank\">Freehtml5.co</a> / Demo Images: <a href=\"https://www.pexels.com/\" target=\"_blank\">Pexels</a> &amp; <a href=\"http://plmd.me/\" target=\"_blank\">PLMD</a> </p>\r\n");
      out.write("                  <p class=\"fh5co-social-icons\">\r\n");
      out.write("                     <a href=\"#\"><i class=\"icon-twitter-with-circle\"></i></a>\r\n");
      out.write("                     <a href=\"#\"><i class=\"icon-facebook-with-circle\"></i></a>\r\n");
      out.write("                     <a href=\"#\"><i class=\"icon-instagram-with-circle\"></i></a>\r\n");
      out.write("                  </p>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </footer>\r\n");
      out.write("\r\n");
      out.write("   <!-- jQuery -->\r\n");
      out.write("   <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("   <!-- jQuery Easing -->\r\n");
      out.write("   <script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("   <!-- Bootstrap -->\r\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("   <!-- Waypoints -->\r\n");
      out.write("   <script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("   <!-- Owl carousel -->\r\n");
      out.write("   <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("   <!-- Stellar -->\r\n");
      out.write("   <script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <!-- Main JS (Do not remove) -->\r\n");
      out.write("   <script src=\"js/main.js\"></script>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
