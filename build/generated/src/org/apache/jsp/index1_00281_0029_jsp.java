package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_00281_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Question Paper Generator-sLogin</title>\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    em{\n");
      out.write("        padding: 35px;\n");
      out.write("        color: red;\n");
      out.write("        font-style: normal;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Start your project here-->\n");
      out.write("  <br>\n");
      out.write("  <div class=\"col-lg-12 text-center\" style=\"box-shadow: 2px 7px 6px silver; \">\n");
      out.write("      <img src=\"https://freehomedelivery.net/wp-content/uploads/2017/10/checklist-smaller1.png\" class=\"img-responsive\" height=\"50\" width=\"40\" >\n");
      out.write("  <h1 style=\"text-align: center;\">Question Paper Generator</h1>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<div class=\"container-fluid col-lg-7 mt-5\">\n");
      out.write("<div class=\"card\">\n");
      out.write("\n");
      out.write("  <h5 class=\"card-header info-color white-text text-center py-4\" style=\"background-color: #4b3e8a !important;\">\n");
      out.write("    <strong>Log in</strong>\n");
      out.write("  </h5>\n");
      out.write("\n");
      out.write(" <!--Body-->\n");
      out.write(" <form id=\"loginform\" method=\"post\" >\n");
      out.write("      <div class=\"modal-body mb-0\">\n");
      out.write("        <div class=\"md-form form-sm\">\n");
      out.write("          <i class=\"fas fa-user prefix active\" style=\"color: #4b3e8a;\"></i>\n");
      out.write("          <input type=\"text\" id=\"username\" class=\"form-control\" name=\"username\">\n");
      out.write("          <label for=\"form8\" class=\"active\">Username</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"md-form form-sm\">\n");
      out.write("          <i class=\"fas fa-key prefix active\" style=\"color: #4b3e8a;\"></i>\n");
      out.write("          <input type=\"password\" id=\"password\" class=\"form-control\"  name=\"password\">\n");
      out.write("          <div style=\"margin-left: 95% !important;\">\n");
      out.write("          <i class=\"fa fa-eye-slash prefix active\" aria-hidden=\"true\" id=\"slash\" style=\" color: #4b3e8a; font-size: 15px !important;\"></i>\n");
      out.write("          <i class=\"fa fa-eye prefix active\" aria-hidden=\"true\" id=\"eye\" style=\" color: #4b3e8a; font-size: 15px !important;\"></i>\n");
      out.write("          </div>\n");
      out.write("          <label for=\"form9\" class=\"active\">Password</label>\n");
      out.write("        </div>\n");
      out.write("<div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("<div class=\"custom-control custom-radio float-left col-lg-2\">\n");
      out.write("  <input type=\"radio\" class=\"custom-control-input\" id=\"defaultUnchecked\" name=\"admin\" value=\"admin\">\n");
      out.write("  <label class=\"custom-control-label\" for=\"defaultUnchecked\">Admin</label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Default checked -->\n");
      out.write("<div class=\"custom-control custom-radio float-left\">\n");
      out.write("  <input type=\"radio\" class=\"custom-control-input\" id=\"defaultChecked\" name=\"defaultExampleRadios\" name=\"instructor\" value=\"instructor\" >\n");
      out.write("  <label class=\"custom-control-label\" for=\"defaultChecked\">Instructor</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("              \n");
      out.write("<br>\n");
      out.write("        <div class=\"text-center mt-1-half\" >\n");
      out.write("          <button class=\"btn btn-info mb-2 waves-effect waves-light\" type=\"submit\" style=\"background-color: #4b3e8a !important;\" >Log in <i class=\"fas fa-send ml-1\"></i></button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    <!--/.Content-->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- SCRIPTS -->\n");
      out.write("  <!-- JQuery -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<!-- Bootstrap tooltips -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- MDB core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.js\"></script>\n");
      out.write("  <!-- /Start your project here-->\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("\n");
      out.write("            $('#eye').hide();\n");
      out.write("\n");
      out.write("            $('#show ,#slash').click(function(){\n");
      out.write("            $('#password').attr(\"type\",\"text\");\n");
      out.write("            $('#slash').hide();\n");
      out.write("            $('#eye').show();\n");
      out.write("             })\n");
      out.write("\n");
      out.write("             $('#hide, #eye').click(function(){\n");
      out.write("             $('#password').attr(\"type\",\"password\");\n");
      out.write("             $('#eye').hide();\n");
      out.write("             $('#slash').show();\n");
      out.write("              })\n");
      out.write("              });\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("   $(document).ready(function(){\n");
      out.write("       $.validator.addMethod(\n");
      out.write("        \"regex\",\n");
      out.write("        function(value, element, regexp) {\n");
      out.write("            var re = new RegExp(regexp);\n");
      out.write("            return this.optional(element) || re.test(value);\n");
      out.write("        },\n");
      out.write("        \"Incorrect mobile no.\"\n");
      out.write(");\n");
      out.write("      $( \"#loginform\" ).validate({\n");
      out.write("        rules: {\n");
      out.write("            username:{\n");
      out.write("            required:true,\n");
      out.write("            },\n");
      out.write("           password: {\n");
      out.write("            required: true,\n");
      out.write("            minlength: 6\n");
      out.write("            },\n");
      out.write("        },\n");
      out.write("        messages: {\n");
      out.write("          \n");
      out.write("          username: {\n");
      out.write("            required: \"username is required\",\n");
      out.write("           },\n");
      out.write("          password: {\n");
      out.write("            required: \"Password is required\"}\n");
      out.write("        } ,\n");
      out.write("     submitHandler: function(form) {\n");
      out.write("       username=$(\"#username\").val();\n");
      out.write("       console.log(username);\n");
      out.write("       password=$(\"#password\").val() ;\n");
      out.write("       console.log(password);\n");
      out.write("       admin=document.getElementById(\"myRadio\").value;\n");
      out.write("       console.log(admin);\n");
      out.write("      datastring=\"username=\"+user+\"&password=\"+password+\"&admin=\"+admin;\n");
      out.write("      $.ajax({\n");
      out.write("          url:\"validate_login.jsp\",\n");
      out.write("          type:\"post\",\n");
      out.write("          data:datastring,\n");
      out.write("          success:function(result){\n");
      out.write("              console.log(result);\n");
      out.write("              if(result==\"ok\"&&admin!=null){\n");
      out.write("              location.href=\"Dashboard1.jsp\";\n");
      out.write("          }else if(result==\"ok\"&&admin==null){\n");
      out.write("              location.href=\"Dashboard2.jsp\";\n");
      out.write("          }else{\n");
      out.write("              out.println(\"username and password doesnot matched\");\n");
      out.write("          }\n");
      out.write("          }\n");
      out.write("      });\n");
      out.write("},\n");
      out.write("\n");
      out.write("        errorElement: \"em\",\n");
      out.write("        errorPlacement: function ( error, element ) {\n");
      out.write("          // Add the `help-block` class to the error element\n");
      out.write("          error.addClass( \"help-block\" );\n");
      out.write("\n");
      out.write("          if ( element.prop( \"type\" ) === \"checkbox\" ) {\n");
      out.write("            error.insertAfter( element.parent( \"label\" ) );\n");
      out.write("          } else {\n");
      out.write("            error.insertAfter( element );\n");
      out.write("          }\n");
      out.write("        },\n");
      out.write("        highlight: function ( element, errorClass, validClass ) {\n");
      out.write("          $( element ).parents( \".col-sm-5\" ).addClass( \"has-error\" ).removeClass( \"has-success\" );\n");
      out.write("        },\n");
      out.write("        unhighlight: function (element, errorClass, validClass) {\n");
      out.write("          $( element ).parents( \".col-sm-5\" ).addClass( \"has-success\" ).removeClass( \"has-error\" );\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("           \n");
      out.write("       );\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
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
