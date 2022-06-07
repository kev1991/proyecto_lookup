<%-- 
    Document   : IniciarSesion
    Created on : 16-mar-2022, 15:49:03
    Author     : Kebin Martinez
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap"
              rel="stylesheet">




        <title>Look_Up</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- dsabilitado -->





        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
              integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

        <link rel="stylesheet" href="assets/css/animated.css">
        <link rel="stylesheet" href="assets/css/owl.css">
        <link rel="stylesheet" href="assets/js/Contactenos.js">

        <link rel="stylesheet" href="assets/css/login.css">

    </head>

    <body>
        <!-- ***** NAV BAR INICIO***** -->


        <!-- ***** Preloader Start ***** -->
        <div id="js-preloader" class="js-preloader">
            <div class="preloader-inner">
                <span class="dot"></span>
                <div class="dots">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
            </div>
        </div>
        <!-- ***** Preloader End ***** -->

        <!-- ***** Header Area Start ***** -->
        <header class="header-area header-sticky wow slideInDown" data-wow-duration="0.75s" data-wow-delay="0s">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav class="main-nav">
                            <!-- ***** Logo Start ***** -->
                            <a href="Home.html" class="logo">
                                <img src="./assets/images//LOGO_1.png" alt="Chain App Dev">
                            </a>
                            <!-- ***** Logo End ***** -->

                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- ***** Header Area End ***** -->  


        <!-- ***** NAV BAR FIN***** -->





        <div id="modal" class="popupContainer" style="display:none;">
            <div class="popupHeader">
                <span class="header_title">Iniciar Sesion</span>
                <span class="modal_close"><i class="fa fa-times"></i></span>
            </div>
        </div>

        <!-- Scripts -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/js/owl-carousel.js"></script>
        <script src="assets/js/animation.js"></script>
        <script src="assets/js/imagesloaded.js"></script>
        <script src="assets/js/popup.js"></script>
        <script src="./assets/js/custom.js"></script>

        <div class="main-banner wow fadeIn" id="top" data-wow-duration="1s" data-wow-delay="0.5s">


            <form method="post" action="Usuario">
                <div class="content">
                    <div class="content">
                        <div class="container1">
                            <div class="row">
                                <div class="col-md-5">
                                    <img src="./assets/images/login.png" alt="Image" class="img-fluid">
                                </div>
                                <div class="col-md-6 contents">
                                    <div class="row justify-content-center">
                                        <div class="col-md-7">
                                            <div class="mb-9">


                                                <h3>Iniciar Sesion</h3>
                                                <p class="mb-4">Ingresa con nosotros para asi obtener el mejor servicio del
                                                    area.
                                                </p>
                                            </div>
                                            <form action="#" method="post">
                                                <div class="form-group first">

                                                    <input type="text" class="form-control" id="username" name="txtUsuario" placeholder="Usuario">

                                                </div>

                                                <div class="form-group last mb-4">

                                                    <input type="password" class="form-control" id="password" name="txtClave" placeholder="Contraseña">

                                                </div>

                                                <div class="d-flex mb-3 align-items-center">
                                                    <label class="control control--checkbox mb-0"><span
                                                            class="caption">Recordar
                                                            contraseña </span>
                                                        <input type="checkbox" checked="checked" />
                                                        <div class="control__indicator"></div>
                                                </div>
                                                <div class="d-flex mb-3 align-items-center">
                                                    <label class="control control--checkbox mb-0"><span
                                                            class="caption">Acepta
                                                            terminos y condiciones</span>
                                                        <input type="checkbox" checked="checked" />
                                                        <div class="control__indicator"></div>
                                                    </label>
                                                    <br>
                                                </div>
                                                <div class="contenedor">
                                                    <button class="btn btn-primary" >Iniciar Sesión</button>
                                                    <input type="hidden" value="1" name="opcion">
                                                </div>

                                                </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>


        </div>
        



    </body>

</html>     