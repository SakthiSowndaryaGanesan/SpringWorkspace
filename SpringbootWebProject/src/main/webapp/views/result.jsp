

<%@page language ="java" %>

<html>
     <body>
         <h2> Students dashboard </h2>
         <h3> ${student1} </h3>
 <%--${result} will correctly pick the result value from request scope, which is where Spring MVC places it when you use mv.addObject().--%>
     <p> Welcome to the ${course} world</p>

     </body>
</html>