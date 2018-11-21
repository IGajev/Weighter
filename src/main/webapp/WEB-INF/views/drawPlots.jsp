<!DOCTYPE HTML>
<html>
<head>  
  <script type="text/javascript">
  window.onload = function () {
    
   
    var chart = new CanvasJS.Chart("chartContainer",
    {
      zoomEnabled: true,      
      title:{
        text: "Your Weight Over Time" 
      },
      axisX :{
    	title: "Time",
        labelAngle: -30
      },
      axisY :{
      	title: "Weight"
      },
      data: [
    	  {
    		  type:"line",
    		  xValueType: "dateTime",
    		  dataPoints:${dataPoints}
    	  }
      ]
      
   });

    chart.render();
  }
  </script>
  <script type="text/javascript" src="https://canvasjs.com/assets/script/canvasjs.min.js"></script></head>
  <body>
    <div id="chartContainer" style="height: 300px; width: 75%;">
    </div>
  </body>
  </html>