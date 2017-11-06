<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

  <head>
	 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>StudAlquiler</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="<c:url value="/resources/css/font-awesome.min.css" />" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/clean-blog.min.css" />" rel="stylesheet">
	
	<style>
	header.masthead {background-image:url("<c:url value="/resources/img/bg.jpg" />");}
	</style>
  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand" href="">StudAlquiler</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="">Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="nosotros">Sobre nosotros</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="empieza">Empieza tu búsqueda</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="sesion">Inicio de sesión</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Page Header -->
    <header class="masthead"  >
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h1>StudAlquiler</h1>
              <span class="subheading">Un lugar donde encontrarás los mejores alquileres</span>
            </div>
          </div>
        </div>
      </div>
    </header>

    <!-- Main Content -->
	<br>
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="list-inline text-center">
              <h1 class="title" style="font-size:250%">
                Bienvenido
              </h1>

        </div>
      </div>
    </div>
	</div>
	
	  <article>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <p>Este portal está dirigido a los estudiantes que pasan por la necesidad de poder alquilar una habitación, considerando las diversas dificultades que significa poder ubicarse lo más cerca posible a su centro de estudio.</p>
			<h2 class="section-heading">Principal objetivo</h2>
			<p>El principal objetivo de esta plataforma es permitir a los estudiantes la búsqueda del mejor lugar para alquilar una habitación, que cuente con los servicios que este necesite y la cercanía a su zona de estudio sea universidad o instituto, brindándoles información a través de la aplicación móvil y web que dispondrá de servicios tales como ver el mapa la ubicación y dirección exacta de las habitaciones, además de una búsqueda de acuerdo al costo mínimo y máximo, lugar y servicios que ofrecen(baño propio, internet, etc.). Además, contará con un espacio para las personas que desean alquilar habitaciones, publicándose en esta plataforma, y permitirá compartirla a través de todas las redes sociales para
lograr un mayor alcance y obtener un mayor pública que necesita de estos servicios.</p>
			<img class="img-fluid" src="<c:url value="/resources/img/estudiante.jpg" />">
			<span class="caption text-muted">La opción más rápida y efectiva.</span>
			</div>
        </div>
      </div>
    </article>	
    <hr>

    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <ul class="list-inline text-center">
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-github fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
            </ul>
            <p class="copyright text-muted">Copyright &copy; StudAlquiler 2017</p>
          </div>
        </div>
      </div>
    </footer>




    <!-- Bootstrap core JavaScript -->
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.bundle.min.js" />"></script>

    <!-- Custom scripts for this template -->
    <script src="<c:url value="/resources/js/clean-blog.min.js" />"></script>

  </body>

</html>
