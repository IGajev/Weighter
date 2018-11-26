<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>  
  <script src="${pageContext.request.contextPath}/resources/canvasjs.min.js"></script>
  <script type="text/javascript">
  window.onload = function () {
    
   
    var chart = new CanvasJS.Chart("chartContainerWeight",
    {
      zoomEnabled: true,      
      title:{
        text: "Your Weight Over Time" 
      },
      axisX :{
    	title: "Time [day]",
        labelAngle: -30
      },
      axisY :{
      	title: "Weight [kg]",
      	includeZero: false
      },
      data: [
    	  {
    		  type:"line",
    		  xValueType: "dateTime",
    		  dataPoints:${dataPointsWeight}
    	  }
      ]
      
   });

    chart.render();

    var chart = new CanvasJS.Chart("chartContainerFats",
    	    {
    	      zoomEnabled: true,      
    	      title:{
    	        text: "Your Weight Over Time" 
    	      },
    	      axisX :{
    	    	title: "Time [day]",
    	        labelAngle: -30
    	      },
    	      axisY :{
    	      	title: "Weight [kg]",
    	      	includeZero: false
    	      },
    	      data: [
    	    	  {
    	    		  type:"line",
    	    		  xValueType: "dateTime",
    	    		  dataPoints:${dataPointsFats}
    	    	  }
    	      ]
    	      
    	   });

    	    chart.render();
  }
  </script>
  </head>
  <body>
	<div id="chartContainerWeight" style="height: 370px; max-width: 920px; margin: 0px auto;"></div>
	<br/>
	<div id="chartContainerFats" style="height: 370px; max-width: 920px; margin: 0px auto;"></div>
  </body>
</html>