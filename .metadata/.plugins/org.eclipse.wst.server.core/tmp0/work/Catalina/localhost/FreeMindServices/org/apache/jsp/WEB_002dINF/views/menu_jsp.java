/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M8
 * Generated at: 2017-03-10 12:59:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<aside class=\"main-sidebar\">\r\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <ul class=\"sidebar-menu\">\r\n");
      out.write("        <li class=\"header\">All Forms</li>\r\n");
      out.write("        <!-- Optionally, you can add icons to the links -->\r\n");
      out.write("        <li class=\"dropdown-submenu\">\r\n");
      out.write("          <a href=\"#\"><span>Purchase</span> <i class=\"icon-change fa pull-right fa-angle-left\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("               <form action=\"productOpeningStockEntry.html\" name=\"productOpeningStockEntry\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.productOpeningStockEntry.submit()\" class=\"list-margin\" >Product Stock</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("               <form action=\"materialReceivedEntry.html\" name=\"materialReceivedEntry\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.materialReceivedEntry.submit()\" class=\"list-margin\" >MaterialReceivedEntry</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("               <form action=\"purchaseInvoiceEntry.html\" name=\"purchaseInvoiceEntry\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.purchaseInvoiceEntry.submit()\" class=\"list-margin\" >PurchaseInvoiceEntry</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"dropdown-submenu\">\r\n");
      out.write("          <a href=\"#\"><span>Sales</span> <i class=\"fa fa-angle-left pull-right\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("               <form action=\"#\" name=\"working\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.working.submit()\" class=\"list-margin\" >Working</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"dropdown-submenu\">\r\n");
      out.write("          <a href=\"#\"><span>Financial Accounting</span> <i class=\"fa fa-angle-left pull-right\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("               <form action=\"journalVouchersEntry.html\" name=\"journalVouchersEntry\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.journalVouchersEntry.submit()\" class=\"list-margin\" >Journal Voucher</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"dropdown-submenu\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><span>Master Files</span> <i class=\"fa fa-angle-left pull-right\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("              <form action=\"accounts.html\" name=\"accounts\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.accounts.submit()\" class=\"list-margin\" >Accounts</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("              <form action=\"productInformationMaster.html\" name=\"productInformationMaster\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.productInformationMaster.submit()\" class=\"list-margin\" >Product</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("              <form action=\"technical.html\" name=\"technical\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.technical.submit()\" class=\"list-margin\" >Technical</a>\r\n");
      out.write("               </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("              <form action=\"catagory.html\" name=\"catagory\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.catagory.submit()\" class=\"list-margin\" >Category</a>\r\n");
      out.write("              </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("              <form action=\"packing.html\" name=\"packing\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.packing.submit()\" class=\"list-margin\" >Packing</a>\r\n");
      out.write("              </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("              <form action=\"accountType.html\" name=\"accountType\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.accountType.submit()\" class=\"list-margin\" >Account Type</a>\r\n");
      out.write("              </form>     \r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("            <form action=\"district.html\" name=\"district\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.district.submit()\" class=\"list-margin\" >District</a>\r\n");
      out.write("              </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("            <form action=\"state.html\" name=\"state\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.state.submit()\" class=\"list-margin\" >State</a>\r\n");
      out.write("              </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-align\">\r\n");
      out.write("            <form action=\"routeCode.html\" name=\"routeCode\" method=\"POST\">\r\n");
      out.write("                 <a href=\"javascript:document.routeCode.submit()\" class=\"list-margin\" >RouteCode</a>\r\n");
      out.write("              </form>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("   <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("      <li class=\"active\"><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\r\n");
      out.write("      <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>");
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
