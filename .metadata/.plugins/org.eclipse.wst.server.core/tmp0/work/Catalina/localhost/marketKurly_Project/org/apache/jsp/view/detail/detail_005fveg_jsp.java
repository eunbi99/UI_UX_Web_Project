/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2021-05-11 11:09:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.detail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_005fveg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>바나나</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .detail{\r\n");
      out.write("            float: left;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-left: 150px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <meta property=\"og:title\" content=\"\"/>\r\n");
      out.write("    <meta property=\"og:image\" content=\"\"/>\r\n");
      out.write("    <meta property=\"og:url\" content=\"\"/>\r\n");
      out.write("    <meta property=\"og:site_name\" content=\"\"/>\r\n");
      out.write("    <meta property=\"og:description\" content=\"\"/>\r\n");
      out.write("    <meta name=\"twitter:title\" content=\"\" />\r\n");
      out.write("    <meta name=\"twitter:image\" content=\"\" />\r\n");
      out.write("    <meta name=\"twitter:url\" content=\"\" />\r\n");
      out.write("    <meta name=\"twitter:card\" content=\"\" />\r\n");
      out.write(" \r\n");
      out.write("    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write(" \r\n");
      out.write("    <!-- <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'> -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- Animate.css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/animate.css\">\r\n");
      out.write("    <!-- Icomoon Icon Fonts-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/icomoon.css\">\r\n");
      out.write("    <!-- Bootstrap  -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/bootstrap.css\">\r\n");
      out.write(" \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/custom.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/pd.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/index.css\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    <!-- Modernizr JS -->\r\n");
      out.write("    <script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("    <!-- FOR IE9 below -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("   <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <div id=\"header\">\r\n");
      out.write("      <div id=\"userMenu\">\r\n");
      out.write("         <!-- <div></div> 샛별배송 없애는 대신 div태그 가능-->\r\n");
      out.write("         <div class=\"sub_tit\" style=\"font-size: 13px;\">샛별배송</div>\r\n");
      out.write("         <ul class=\"list_menu\">\r\n");
      out.write("            <li class=\"menu none_sub menu_admin\"><a href=\"admin/productList.jsp\" class=\"link_menu\">관리자</a></li> \r\n");
      out.write("            <span class=\"bar\"></span>\r\n");
      out.write("            <li class=\"menu none_sub menu_join\"><a href=\"join/signUp.jsp\" class=\"link_menu\">회원가입</a></li> \r\n");
      out.write("            <span class=\"bar\"></span>\r\n");
      out.write("            <li class=\"menu none_sub menu_login\"><a href=\"join/logIn.jsp\" class=\"link_menu\">로그인</a></li>\r\n");
      out.write("            <span class=\"bar\"></span>\r\n");
      out.write("            <li class=\"menu lst dropdown\"><a href=\"#\" class=\"link_menu\"><button class=\"dropbtn\" style=\"margin-left: 0px;\">고객센터 ▼</button></a>\r\n");
      out.write("               <div class=\"dropdown-content\">\r\n");
      out.write("                  <a href=\"admin/adminBoard.jsp\">게시판</a>\r\n");
      out.write("                  <a href=\"admin/qnaBoard.jsp\">1:1문의</a>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("               </div> \r\n");
      out.write("            </li>\r\n");
      out.write("         </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <header style=\"padding-bottom: 3px\">\r\n");
      out.write("      <div class=\"container text-center\">\r\n");
      out.write("         <div class=\"fh5co-navbar-brand\">\r\n");
      out.write("            <a class=\"fh5co-logo\" href=\"index.jsp\" style=\"font-size: 15px\"><img  style =\"display : block; margin : auto; height:110px;\" src=\"../assets/images/logo.png\" href=\"../index.jsp\"></a>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <nav id=\"fh5co-main-nav\" role=\"navigation\" style=\"font-family: sans-serif\">\r\n");
      out.write("            <ul class=\"list_menu\">\r\n");
      out.write("               <li class=\"menu lst dropdown\"><a href=\"#\" class=\"active link_menu\"><button class=\"dropbtn\" style=\"margin-left: 0px; font-size: 18px; padding:5px;font-family:sans-serif\">전체 카테고리</button></a>\r\n");
      out.write("                  <div class=\"dropdown-content\">\r\n");
      out.write("                     <a href=\"category/meat_product.jsp\">육류</a>\r\n");
      out.write("                     <a href=\"category/veg_product.jsp\">채소</a>\r\n");
      out.write("                     <a href=\"category/fruit_product.jsp\">과일</a>\r\n");
      out.write("                     <a href=\"category/pet_product.jsp\">애견</a>                     \r\n");
      out.write("                  </div> \r\n");
      out.write("               </li>\r\n");
      out.write("\r\n");
      out.write("               <li><a href=\"#new\">신상품</a></li>\r\n");
      out.write("               <li><a href=\"#best\">베스트</a></li>\r\n");
      out.write("               <li><a href=\"#sale\">알뜰쇼핑</a></li>\r\n");
      out.write("               <li><a href=\"mypage/orderList.jsp\">마이페이지</a></li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("         </nav>\r\n");
      out.write("   </header>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<body>\r\n");
      out.write("   <div id=\"container\">\r\n");
      out.write("   <div id=\"content\">\r\n");
      out.write("    <section>\r\n");
      out.write("        <div>\r\n");
      out.write("    <div class =\"detail2\">\r\n");
      out.write("      <img src=\"../assets/images/veg1.png\" align=\"left\" width=\"500px\" height=\"650px\" alt=\"Work\">\r\n");
      out.write("    </div> \r\n");
      out.write("    <div class=\"product01\">\r\n");
      out.write("      <strong>농약 걱정 없는 1등 수입 바나나</strong>\r\n");
      out.write("      <hr width =\"500px;\">\r\n");
      out.write("        <p>당일 입고 당일배송되는 유기농 바나나(500g내외)\r\n");
      out.write("           \r\n");
      out.write("        </p>\r\n");
      out.write("        <p>회원 할인가</p>\r\n");
      out.write("        <strong>3,150원</strong>\r\n");
      out.write("        <hr width =\"500px;\">\r\n");
      out.write("        <div class=\"motive\">\r\n");
      out.write("        <p>판매단위 &emsp; &emsp;&emsp;1팩</p>\r\n");
      out.write("        <p>중량/용량 &emsp; &emsp;&emsp;475g~500g</p>\r\n");
      out.write("        <hr width =\"500px;\">\r\n");
      out.write("        <p>배송구분 &emsp; &emsp;&emsp;샛별배송/택배배송</p>\r\n");
      out.write("        <hr width =\"500px;\">\r\n");
      out.write("        <p>원산지&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;수입산(페루,멕시코)</p>\r\n");
      out.write("        <p>포장타입 &emsp; &emsp;&emsp;상온/종이포장</p>\r\n");
      out.write("        <p>유통기한 &emsp; &emsp;&emsp;농산물로 별도의 유동기한은 없으나 가급적 빠르게 <br>&nbsp;&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;드시는게 좋습니다</p>\r\n");
      out.write("        <p>안내사항 &emsp; &emsp;&emsp;수분이있는 과일의 특성상 약 5%의 중량차이가 있습니다</p>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <button type=\"button1\">장바구니 담기</button>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("</section>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class =\"z1\">\r\n");
      out.write("<section id=\"per\">\r\n");
      out.write("    <img src=\"../assets/images/ve4.png\"style=\"margin-left:auto;margin-right:auto; display:block\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <h3>농약 걱정 없는 1등 수입과일</h3>\r\n");
      out.write("    <h2>유기농 바나나</h2>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <p>국내 전체 수입량의 10%도 채 되지 않는 유기농 바나나, 아이 어른 할 것 없이 모두가<br>\r\n");
      out.write("        자주 즐기는 간식인 만큼 꼭 유기농으로 드리고 싶습니다. </p>\r\n");
      out.write("   <br>\r\n");
      out.write("   <br>\r\n");
      out.write("    <img src=\"../assets/images/ve5.png\" style=\"margin-left:auto;margin-right:auto; display:block\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <p>컬리의 유기농 바나나는 약품 처리 대신 전용 선박에서 온도와 습도를 업격하게 조절하여 유기농 수확 상태 그대로 반입합니다<br>\r\n");
      out.write("    과연 유기농으로 재배했다고 해서 더 맛있을까요? 하고 의심을 한 것이 사실입니다. 화학 비료없이도 자랐다면 맛도, 영양도 크기도 조금 부족할거 같았거든요<br>\r\n");
      out.write("이러한 생각도 잠시, 컬리는 보자마자 첫눈에 반헤버렸습니다. 흠집 없이 단단하고 곧게 뻗는 자태, 도톰한 껍질을 깔 떄 풍겨오는 <br>\r\n");
      out.write("자연스럽고 싱그러운 향기, 절정은 과육을 한입 베어 물었을 떄이죠. 칼륨이 풍부한 바나나는 건강에도 좋은 간식거리가 되어줄 거에요. </p>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div id=\"footer\" class=\"fh5co-border-line\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8 col-md-offset-2 text-center\">\r\n");
      out.write("                    <p>Copyright 2016 Free Html5 <a href=\"#\">Neos</a>. All Rights Reserved. <br>Made with <i class=\"icon-heart3 love\"></i> by <a href=\"http://freehtml5.co/\" target=\"_blank\">Freehtml5.co</a> / Demo Images: <a href=\"https://www.pexels.com/\" target=\"_blank\">Pexels</a> &amp; <a href=\"http://plmd.me/\" target=\"_blank\">PLMD</a> </p>\r\n");
      out.write("                    <p class=\"fh5co-social-icons\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"icon-twitter-with-circle\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"icon-facebook-with-circle\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"icon-instagram-with-circle\"></i></a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- jQuery Easing -->\r\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Waypoints -->\r\n");
      out.write("<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("<!-- Owl carousel -->\r\n");
      out.write("<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("<!-- Stellar -->\r\n");
      out.write("<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Main JS (Do not remove) -->\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
