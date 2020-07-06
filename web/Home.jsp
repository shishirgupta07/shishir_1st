
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Dashboard</title>

        <!-- Font Awesome -->
        <link rel="shortcut icon" type="image/ico" href="question.ico">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.min.css" integrity="sha256-UzFD2WYH2U1dQpKDjjZK72VtPeWP50NoJjd26rnAdUI=" crossorigin="anonymous" />
        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <!-- Bootstrap core CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css" rel="stylesheet">

        <link  rel="stylesheet" type="text/css" href="compiled.css">

        <style type="text/css">
            * {
                box-sizing: border-box;
            }
            body,html
            {
            	overflow: hidden;
            }
            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            /* Float four columns side by side */
            .column {
                float: left;
                width: 30%;
                padding: 10 10px;
            }

            /* Remove extra left and right margins, due to padding in columns */
            .row {margin: 0 -5px;}

            /* Clear floats after the columns */
            .row:after {
                content: "";
                display: table;
                clear: both;
            }

            /* Style the counter cards */
            .card {
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); /* this adds the "card" effect */

                text-align: center;
                background-color: #f1f1f1;
            }

            /* Responsive columns - one column layout (vertical) on small screens */
            @media screen and (max-width: 600px) {
                .column {
                    width: 100%;
                    display: block;
                    margin-bottom: 20px;
                }
            }
        </style>

    </head>
    <body >

        <!-- Sidebar navigation -->
        <ul id="slide-out" class="side-nav fixed  custom-scrollbar " style="width: 240px; background-color: #4b3e8a; transform: translateX(0%)" >
            <!-- Logo -->

            <!-- Side navigation links -->
            <li>
                <ul class="collapsible collapsible-accordion">
                    <li><a class="collapsible-header waves-effect arrow-r" href="Dashboard.jsp"><i class="fa fa-home white-text" ></i>&nbsp&nbsp&nbsp Home</a>

                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-chalkboard-teacher white-text"></i>&nbsp&nbsp&nbsp Manage Instructors</a>

                    </li>
                    <li class=""><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-question-circle white-text"></i>&nbsp&nbsp&nbsp Manage Questions</a>

                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-graduation-cap white-text"></i>&nbsp&nbsp&nbsp Manage Courses</a>

                    </li>
                    <li class=""><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-swatchbook white-text"></i>&nbsp&nbsp&nbsp Manage Subjects</a>

                    </li>
                    <li class=""><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-book white-text"></i>&nbsp&nbsp&nbsp Manage Units</a>

                    </li>
                    <li class=""><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-file-alt white-text"></i>&nbsp&nbsp&nbsp Question Papers</a>

                    </li>
                </ul>
            </li>
             </ul>
            <!--/. Side navigation links -->
            <div class="sidenav-bg mask-strong"></div>
       
        <!--/. Sidebar navigation -->
        <!-- Navbar -->
        <div class="container">
            <nav class="navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav">
                <!-- SideNav slide-out button -->


                <a href="#" data-activates="slide-out" class=" button-collapse" style="color:#4b3e8a; left: -5px !important;"><i class="fa fa-bars"></i></a>
                

                <a class="navbar-brand" Style="color:#4b3e8a; position: sticky;
    left: 25%; " href="#"> <i class="fas fa-book-reader prefix  fa-lg"></i>&nbsp<b style="font-size: 18px;">Question Paper Generator</b></a>


                <button type="button" class="btn btn-rounded white-text ml-auto btn-sm" style="background-color:#4b3e8a"><i class="fas fa-sign-out-alt"></i>Logout</button>



            </nav>
        </div>
        <div class="" style="height: 90px;">
        </div>
        <div >
            <div class="row" >
                <div class="col-lg-3"></div>
                <div class="col-lg-3">
                    <div class="card"><!-- Card -->


                        <!-- Card image -->


                        <!-- Card content -->
                        <div class="card-body">

                            <!-- Title -->
                            <h4 class="card-title"><a>INSTRUCTORS</a></h4>
                            <!-- Text -->
                            <p class="card-text" >Here you can add,view or update instructors.</p>
                            <!-- Button -->
                            <a href="#" class="btn " style="background-color: #4b3e8a; color:white;">Manage Instructors</a>

                        </div>

                    </div>
                </div>
                <!-- Card -->

                <div class="col-lg-3">
                    <div class="card"><!-- Card -->


                        <!-- Card image -->

                        <!-- Card content -->
                        <div class="card-body">

                            <!-- Title -->
                            <h4 class="card-title"><a>Questions</a></h4>
                            <!-- Text -->
                            <p class="card-text">Here you can add,remove or edit a question.</p>
                            <!-- Button -->
                            <a href="#" class="btn " style="background-color: #4b3e8a; color:white;">Manage Questions</a>

                        </div>

                    </div>
                    <!-- Card --></div>

                <div class="col-lg-3">
                    <div class="card"><!-- Card -->


                        <!-- Card image -->

                        <!-- Card content -->
                        <div class="card-body">

                            <!-- Title -->
                            <h4 class="card-title"><a>Courses</a></h4>
                            <!-- Text -->
                            <p class="card-text">Here you can add,view or edit courses.</p>
                            <pre></pre>
                            <a href="#" class="btn " style="background-color: #4b3e8a; color:white;">Manage Courses</a>

                        </div>

                    </div>
                    <!-- Card -->
                </div>

            </div>
            <br><br>
            <!-- Card -->
            <div class="row" ><div class="col-lg-3"></div>
                <div class="col-lg-3">
                    <div class="card"><!-- Card -->


                        <!-- Card image -->


                        <!-- Card content -->
                        <div class="card-body">

                            <!-- Title -->
                            <h4 class="card-title"><a>Subjects</a></h4>
                            <!-- Text -->
                            <p class="card-text">Here you can add,view or edit subjects.</p>
                            <!-- Button -->
                            <a href="#" class="btn " style="background-color: #4b3e8a; color:white;">Manage subjects</a>

                        </div>

                    </div>
                    <!-- Card --></div>
                <div class="col-lg-3">
                    <div class="card"><!-- Card -->


                        <!-- Card image -->

                        <!-- Card content -->
                        <div class="card-body">

                            <!-- Title -->
                            <h4 class="card-title"><a>Units</a></h4>
                            <!-- Text -->
                            <p class="card-text">Here you can add,remove or edit units.</p>
                            <!-- Button -->
                            <a href="#" class="btn " style="background-color: #4b3e8a; color:white;">Manage Units<b style="color: #4b3e8a">...</b></a>

                        </div>

                    </div>
                    <!-- Card -->
                </div>
                <div class="col-lg-3">
                    <div class="card"><!-- Card -->


                        <!-- Card image -->

                        <!-- Card content -->
                        <div class="card-body">

                            <!-- Title -->
                            <h4 class="card-title"><a>Question paper</a></h4>
                            <!-- Text -->
                            <p class="card-text">Here you can generate question paper.</p>
                            <!-- Button -->
                            <a href="#" class="btn " style="background-color: #4b3e8a; color:white;">Question paper</a>

                        </div>

                    </div>
                    <!-- Card -->
                </div>

            </div>
        </div>


        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
        <script>

            // SideNav Initialization
            $(".button-collapse").sideNav();

            new WOW().init();

        </script><div class="drag-target" style="left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>




        <div class="hiddendiv common"></div>
    </body>
</html>
