/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2023-02-10 07:00:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.web.servlets.Servlets;
import org.openxava.util.Locales;
import org.openxava.util.XavaPreferences;
import org.openxava.web.style.XavaStyle;
import org.openxava.web.style.Themes;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1676012314467L));
    _jspx_dependants.put("jar:file:/C:/Users/jesus/Downloads/XD-main/XD-main/HOTEL1/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425996668000L));
    _jspx_dependants.put("jar:file:/C:/Users/jesus/Downloads/XD-main/XD-main/HOTEL1/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425996668000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1676012307628L));
    _jspx_dependants.put("/naviox/../xava/imports.jsp", Long.valueOf(1676012316896L));
    _jspx_dependants.put("/naviox/indexExt.jsp", Long.valueOf(1676012314806L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.web.style.XavaStyle");
    _jspx_imports_classes.add("org.openxava.web.style.Themes");
    _jspx_imports_classes.add("org.openxava.web.servlets.Servlets");
    _jspx_imports_classes.add("org.openxava.util.Locales");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

Servlets.setCharacterEncoding(request, response);
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      com.openxava.naviox.Modules modules = null;
      synchronized (session) {
        modules = (com.openxava.naviox.Modules) _jspx_page_context.getAttribute("modules", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (modules == null){
          modules = new com.openxava.naviox.Modules();
          _jspx_page_context.setAttribute("modules", modules, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

String windowId = context.getWindowId(request);
context.setCurrentWindowId(windowId);
if ("true".equals(request.getParameter("init"))) {
	context.resetModule(request);
}
String app = request.getParameter("application");
String module = context.getCurrentModule(request);
modules.setCurrent(request); 
String oxVersion = org.openxava.controller.ModuleManager.getVersion();
String title = (String) request.getAttribute("naviox.pageTitle");
if (title == null) title = modules.getCurrentModuleDescription(request); 
boolean hasModules = modules.hasModules(request); 		
org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context
		.get(app, module, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
manager.setApplicationName(request.getParameter("application"));
manager.setModuleName(module); // In order to show the correct description in head 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>");
      out.print(title);
      out.write("</title>\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/layout.css?ox=");
      out.print(oxVersion);
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/");
      out.print(Themes.getCSS(request));
      out.write("?ox=");
      out.print(oxVersion);
      out.write("\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/materialdesignicons.css?ox=");
      out.print(oxVersion);
      out.write("\">\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/dwr-engine.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Modules.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Folders.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body ");
      out.print(XavaStyle.getBodyClass(request));
      out.write(">\n");
      out.write("\t\n");
      out.write("\t<div id=\"main\"> \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t");
 if (hasModules) { 
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write('\n');
      out.write('	');
      out.write('	');
 } 
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"module-wrapper\">\n");
      out.write("\t\t\t<div id=\"module_header\">\n");
      out.write("\t\t\t\t ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "moduleHeader.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
 if ("SignIn".equals(module)) {  
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "signIn.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t\t<div id=\"module\"> \t\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../xava/module.jsp?application=" + app + "&module=" + module + "&htmlHead=false", out, false);
      out.write("\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div> \n");
      out.write("\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/naviox/js/naviox.js?ox=");
      out.print(oxVersion);
      out.write("'></script> \n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\tnaviox.lockSessionMilliseconds = ");
      out.print(com.openxava.naviox.model.Configuration.getInstance().getLockSessionMilliseconds());
      out.write("; \n");
      out.write("\t\tnaviox.application = \"");
      out.print(app);
      out.write("\";\n");
      out.write("\t\tnaviox.module = \"");
      out.print(module);
      out.write("\";\n");
      out.write("\t\tnaviox.locked = ");
      out.print(context.get(request, "naviox_locked"));
      out.write(";\n");
      out.write("\t\tnaviox.init();\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
