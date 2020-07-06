<%@page import="jdbc.SqlUtil"%>
<html>
        <head>
                    <title></title>
                    
                            <!-- Latest compiled and minified CSS -->
                            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

                            <!-- jQuery library -->
                            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

                            <!-- Latest compiled JavaScript -->
                            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
                            
        </head>
        <body>
            <div class="container">
                <form>
                    <h1 class="text-center"> paper generator</h1>
                    course name<input type="text" name=" " class="form-control"><br>
                                        <select  class="form-control" >
                                            <option> select any one </option>
                                            <%
                                                SqlUtil.connectDatabase();
                                                
                                            %>
                                        </select>
                </form>
            </div>
        </body>
</html>