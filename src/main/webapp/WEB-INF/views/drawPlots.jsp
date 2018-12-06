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
      	includeZero: false,
		stripLines: [{
			value: ${requiredWeight},
			label: "Required Weight",
			labelFontColor: "#808080",
			labelAlign: "near"
		}]
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
    	      	includeZero: false,
    			stripLines: [{
    				value: ${requiredFatsPercent},
    				label: "Required Fats",
    				labelFontColor: "#808080",
    				labelAlign: "near"
    			}]
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
	<div id="chartContainerWeight" style="height: 370px; max-width: 1200px; margin: 0px auto;"></div>
	<br/>
	<div id="Fats" style="display:none">
		<div id="chartContainerFats" style="height: 370px; max-width: 1200px; margin: 0px auto;"></div>
	</div>
 </body>
</html>