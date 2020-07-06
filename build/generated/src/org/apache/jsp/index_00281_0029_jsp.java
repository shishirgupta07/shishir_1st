package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_00281_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Question Paper Generator-sLogin</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\r\n");
      out.write("   <link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("    em{\r\n");
      out.write("        padding: 35px;\r\n");
      out.write("        color: red;\r\n");
      out.write("        font-style: normal;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("   </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <div class=\"col-lg-12 text-center\" style=\"box-shadow: 2px 7px 6px silver; \">\r\n");
      out.write("      <img src=\"https://freehomedelivery.net/wp-content/uploads/2017/10/checklist-smaller1.png\" class=\"img-responsive\" height=\"50\" width=\"40\" >\r\n");
      out.write("  <h1 style=\"text-align: center;\">Question Paper Generator</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"container-fluid col-lg-7 mt-5\">\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("    <h5 class=\"card-header info-color white-text text-center py-4\" style=\"background-color: #4b3e8a !important;\">\r\n");
      out.write("    <strong>Log in</strong>\r\n");
      out.write("  </h5>\r\n");
      out.write("    <form id=\"loginform\" method=\"post\" >\r\n");
      out.write("      <div class=\"modal-body mb-0\">\r\n");
      out.write("          <div class=\"md-form form-sm\">\r\n");
      out.write("          <i class=\"fas fa-user prefix active\" style=\"color: #4b3e8a;\"></i>\r\n");
      out.write("          <input type=\"text\" id=\"username\" class=\"form-control\" name=\"username\">\r\n");
      out.write("          <label for=\"form8\" class=\"active\">Username</label>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"md-form form-sm\">\r\n");
      out.write("          <i class=\"fas fa-key prefix active\" style=\"color: #4b3e8a;\"></i>\r\n");
      out.write("          <input type=\"password\" id=\"password\" class=\"form-control\"  name=\"password\">\r\n");
      out.write("          <div style=\"margin-left: 95% !important;\">\r\n");
      out.write("          <i class=\"fa fa-eye-slash prefix active\" aria-hidden=\"true\" id=\"slash\" style=\" color: #4b3e8a; font-size: 15px !important;\"></i>\r\n");
      out.write("          <i class=\"fa fa-eye prefix active\" aria-hidden=\"true\" id=\"eye\" style=\" color: #4b3e8a; font-size: 15px !important;\"></i>\r\n");
      out.write("          </div>\r\n");
      out.write("          <label for=\"form9\" class=\"active\">Password</label>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <div>\r\n");
      out.write("<div class=\"custom-control custom-radio float-left col-lg-2\">\r\n");
      out.write("  <input type=\"radio\" class=\"custom-control-input\" id=\"defaultUnchecked\" name=\"admin\" value=\"admin\">\r\n");
      out.write("  <label class=\"custom-control-label\" for=\"defaultUnchecked\">Admin</label>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"custom-control custom-radio float-left\">\r\n");
      out.write("  <input type=\"radio\" class=\"custom-control-input\" id=\"defaultChecked\"  name=\"admin\" value=\"instructor\" >\r\n");
      out.write("  <label class=\"custom-control-label\" for=\"defaultChecked\">Instructor</label>\r\n");
      out.write("</div>\r\n");
      out.write("         </div>\r\n");
      out.write("          <div class=\"text-center mt-1-half\" >\r\n");
      out.write("          <button class=\"btn btn-info mb-2 waves-effect waves-light\" type=\"submit\" style=\"background-color: #4b3e8a !important;\" >Log in <i class=\"fas fa-send ml-1\"></i></button>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </form>\r\n");
      out.write(" </div>\r\n");
      out.write("</div>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap tooltips -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap core JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- MDB core JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("            $('#eye').hide();\r\n");
      out.write("\r\n");
      out.write("            $('#show ,#slash').click(function(){\r\n");
      out.write("            $('#password').attr(\"type\",\"text\");\r\n");
      out.write("            $('#slash').hide();\r\n");
      out.write("            $('#eye').show();\r\n");
      out.write("             })\r\n");
      out.write("\r\n");
      out.write("             $('#hide, #eye').click(function(){\r\n");
      out.write("             $('#password').attr(\"type\",\"password\");\r\n");
      out.write("             $('#eye').hide();\r\n");
      out.write("             $('#slash').show();\r\n");
      out.write("              })\r\n");
      out.write("              });\r\n");
      out.write("  </script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("       $.validator.addMethod(\r\n");
      out.write("        \"regex\",\r\n");
      out.write("        function(value, element, regexp) {\r\n");
      out.write("            var re = new RegExp(regexp);\r\n");
      out.write("            return this.optional(element) || re.test(value);\r\n");
      out.write("        },\r\n");
      out.write("        \"Incorrect mobile no.\"\r\n");
      out.write(");\r\n");
      out.write("      $( \"#loginform\" ).validate({\r\n");
      out.write("        rules: {\r\n");
      out.write("            username:{\r\n");
      out.write("            required:true,\r\n");
      out.write("            },\r\n");
      out.write("           password: {\r\n");
      out.write("            required: true,\r\n");
      out.write("            minlength: 6\r\n");
      out.write("            },\r\n");
      out.write("        },\r\n");
      out.write("        messages: {\r\n");
      out.write("          \r\n");
      out.write("          username: {\r\n");
      out.write("            required: \"username is required\",\r\n");
      out.write("           },\r\n");
      out.write("          password: {\r\n");
      out.write("            required: \"Password is required\"}\r\n");
      out.write("        } ,\r\n");
      out.write("     submitHandler: function(form) {\r\n");
      out.write("       username=$(\"#username\").val();\r\n");
      out.write("       console.log(username);\r\n");
      out.write("        password=$(\"#password\").val() ;\r\n");
      out.write("       console.log(password);\r\n");
      out.write("       var admin=\"\";\r\n");
      out.write("        var ele = document.getElementsByName('admin'); \r\n");
      out.write("            for(i = 0; i < ele.length; i++) { \r\n");
      out.write("                if(ele[i].checked) \r\n");
      out.write("               admin = ele[i].value; \r\n");
      out.write("            } \r\n");
      out.write("      console.log(admin); \r\n");
      out.write("     datastring=\"username=\"+username+\"&password=\"+password+\"&admin=\"+admin;\r\n");
      out.write("     console.log(datastring);\r\n");
      out.write("     $.ajax({\r\n");
      out.write("          url:\"validate_login.jsp\",\r\n");
      out.write("          type:\"post\",\r\n");
      out.write("          data:datastring,\r\n");
      out.write("          success:function(result){\r\n");
      out.write("              console.log(result);\r\n");
      out.write("              res=result.trim();\r\n");
      out.write("              len=res.length;\r\n");
      out.write("              console.log(len);\r\n");
      out.write("              if(res.localeCompare(\"okadmin\")===0){\r\n");
      out.write("              location.href=\"Dashboard1.jsp\";\r\n");
      out.write("          }else if(res.localeCompare(\"okinstructor\")===0){\r\n");
      out.write("              location.href=\"Dashboard2.jsp\";\r\n");
      out.write("          }else{\r\n");
      out.write("             console.log(\"kuchh nahi mila\");\r\n");
      out.write("          }\r\n");
      out.write("          }\r\n");
      out.write("      });\r\n");
      out.write("   },\r\n");
      out.write("       errorElement: \"em\",\r\n");
      out.write("        errorPlacement: function ( error, element ) {\r\n");
      out.write("          // Add the `help-block` class to the error element\r\n");
      out.write("          error.addClass( \"help-block\" );\r\n");
      out.write("\r\n");
      out.write("          if ( element.prop( \"type\" ) === \"checkbox\" ) {\r\n");
      out.write("            error.insertAfter( element.parent( \"label\" ) );\r\n");
      out.write("          } else {\r\n");
      out.write("            error.insertAfter( element );\r\n");
      out.write("          }\r\n");
      out.write("        },\r\n");
      out.write("        highlight: function ( element, errorClass, validClass ) {\r\n");
      out.write("          $( element ).parents( \".col-sm-5\" ).addClass( \"has-error\" ).removeClass( \"has-success\" );\r\n");
      out.write("        },\r\n");
      out.write("        unhighlight: function (element, errorClass, validClass) {\r\n");
      out.write("          $( element ).parents( \".col-sm-5\" ).addClass( \"has-success\" ).removeClass( \"has-error\" );\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("           \r\n");
      out.write("       );\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
