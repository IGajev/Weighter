<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>  
  <script src="/Weighter/resources/js/canvasjs.min.js"></script>
  <script type="text/javascript">
  window.onload = function () {
	  
    var chartWeight = new CanvasJS.Chart("chartContainerWeight",
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

    chartWeight.render();

    var chartFats = new CanvasJS.Chart("chartContainerFats",
    	    {
    	      zoomEnabled: true,      
    	      title:{
    	        text: "Your Fats Percent Over Time" 
    	      },
    	      axisX :{
    	    	title: "Time [day]",
    	        labelAngle: -30
    	      },
    	      axisY :{
    	      	title: "Fats [%]",
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

    chartFats.render();
  }
  </script>
  </head>
  <body>
	<div id="chartContainerWeight" style="height: 370px; max-width: 920px; margin: 0px auto;"></div>
	<br/>
	<div id="Fats" style="display:none">
		<div id="chartContainerFats" style="height: 370px; max-width: 920px; margin: 0px auto;"></div>
	</div>
 </body>
</html>