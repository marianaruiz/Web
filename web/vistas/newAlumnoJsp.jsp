<%-- 
    Document   : newAlumnoJsp
    Created on : 7/03/2015, 06:29:56 PM
    Author     : Mariana
--%>
<%@page import="java.util.ResourceBundle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../CSS/bootstrap/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../CSS/bootstrap/signin.css" rel="stylesheet" type="text/css">
        <script src="../js/jquery/jquery-2.1.1.js"></script>
        <script src="../CSS/bootstrap/bootstrap.js"></script>
        <title>Ingresar Alumno</title>
    </head>
    <body>
     <div class="navbar navbar-inverse " role="navigation">
        <div class="navbar-header ">
            <a class="navbar-brand  " href="ReAdmin.html">Administrador</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              
              <li><a href="ReAdmin.html">Perfil</a></li>
              
             <li class="dropdown active">
			<a class="dropdown-toggle"data-toggle="dropdown"href="#">
			Alumnos
			<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="registroAlumno.html">Registrar Alumno</a></li>
				<li><a href="../VerAlumnosS">Ver Alumnos</a></li>
				
			</ul>
		</li>
                
                <li class="dropdown">
			<a class="dropdown-toggle"data-toggle="dropdown"href="#">
			Profesores
			<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="registroProfesor.html">Registrar Profesor</a></li>
				<li><a href="../VerProfesorS">Ver Profesores</a></li>
				
			</ul>
		</li>
                
                 <li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown"href="#">
			Carreras
			<b class="caret"></b>
			</a>
			<ul class="dropdown-menu">
				<li><a href="Crearcarrera.html">Crear Carrera</a></li>
				
				
			</ul>
		</li>
                         
            </ul>
            </div>
        </div>
        <div class="jumbotron boxlogin">
            <html:form action="/crearAlumno" >   
                <fieldset>
                  <legend class="form-signin-heading">Datos del Alumno</legend>
                  <table>
                      <tr>
                            <td>No.Boleta</td>
                            <td><html:password property="boleta" styleClass="form-control"/></td>
                      </tr>
                      <tr>
                          <td>Nombre</td>
                          <td><html:text property="nombre" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Apallido Paterno </td>
                          <td><html:text property="paterno" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Apellido Materno </td>
                          <td><html:text property="materno" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td>Correo ElectronicoCorreo Electronico</td>
                          <td><html:text property="email" styleClass="form-control" /></td>
                      </tr>
                      <tr>
                          <td></td>
                          <td></td>
                      </tr>
                      <tr>
                          <td><html:submit value="cancelar" styleClass="btn btn-lg btn-success"/></td>
                          <td><html:submit value="crear" styleClass="btn btn-lg btn-success"/></td>
                      </tr>
                  </table>
            </fieldset>
            </html:form>
        </div>
    </body>
</html>
