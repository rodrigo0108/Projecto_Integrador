<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>StudAlquiler</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


  <!-- Bootstrap core CSS     -->
  	<link href="<c:url value="/resources/css/bootstrap3.min.css" />" rel="stylesheet">

    <!-- Animation library for notifications   -->
    <link href="<c:url value="/resources/css/animate.min.css" />" rel="stylesheet">

    <!--  Paper Dashboard core CSS    -->
    <link href="<c:url value="/resources/css/paper-dashboard.css" />" rel="stylesheet">

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="<c:url value="/resources/css/demo.css" />" rel="stylesheet">


    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="<c:url value="/resources/css/themify-icons.css" />" rel="stylesheet">

</head>
<body>

<div class="wrapper">
	<div class="sidebar" data-background-color="white" data-active-color="danger">

    <!--
		Tip 1: you can change the color of the sidebar's background using: data-background-color="white | black"
		Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
	-->

    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="" class="simple-text">
                    StudAlquiler
                </a>
            </div>

            <ul class="nav">
                <li>
                    <a href="home">
                        <i class="ti-home"></i>
                         <p>Publicación</p>
                    </a>
                </li>
                <li class="active">
                    <a href="perfil">
                        <i class="ti-user"></i>
                        <p>Perfil</p>
                    </a>
                </li>
                
            </ul>
    	</div>
    </div>

    <div class="main-panel">
		<nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar bar1"></span>
                        <span class="icon-bar bar2"></span>
                        <span class="icon-bar bar3"></span>
                    </button>
                    <a class="navbar-brand" href="#">Perfil</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                         <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="margin-right:20px">
                                <i class="ti-github"></i>
								<p>${usuario.nombres}</p>
                            </a>
                        </li>
                        
						<li>
                            <a href="logout">
								<i class="ti-power-off"></i>
								<p>Cerrar sesión</p>
                            </a>
                        </li>
                    </ul>

                </div>
            </div>
        </nav>


        <div class="content">
			
            <div class="container-fluid">
				
                <div class="row">
					
                    <div class="col-lg-4 col-md-5">
                        <div class="card card-user">
                            <div class="image">
                                <img src="img/background.jpg" />
                            </div>
                            <div class="content">
                                <div class="author">
                                  <img class="avatar border-white" src="img/face-2.jpg"/>
                                  <h4 class="title">${usuario.nombres}</h4>
                                </div>
                            </div>
                            <hr>
                       
                        </div>
                        
                    </div>
					
					 <div class="col-lg-8 col-md-5">
                        <div class="card card-user">
                            <div class="content">
							
							<div class="typo-line">
                                    <p><span class="category">Nombres</span>${usuario.nombres}</p>
                            </div>
							<div class="typo-line">
							<p><span class="category">Apellidos</span>${usuario.apellidos}</p>
                            </div>
							<div class="typo-line">
							<p><span class="category">Correo</span>${usuario.email}</p>
                            </div>
							<div class="typo-line">
							<p><span class="category">Estado</span>${usuario.estado}</p>
                            </div>
							<div class="typo-line">
							<p><span class="category">Tipo</span>${usuario.tipo}</p>
                            </div>
							<div class="typo-line">
							<p><span class="category">Teléfono</span>${usuario.telefono}</p>
                            </div>
							</div>
                        </div>
                        
                    </div>

					</div>
					
				
                </div>
            </div>
        </div>


        <footer class="footer">
            <div class="container-fluid">
                
				<div class="copyright pull-right">
                    &copy; <script>document.write(new Date().getFullYear())</script>, StudAlquiler <a href="">Creative Tim</a>
                </div>
            </div>
        </footer>

    </div>
</div>


</body>

       <!--   Core JS Files   -->
    <script src="<c:url value="/resources/js/jquery-1.10.2.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>


</html>
