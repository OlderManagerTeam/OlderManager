//商品库存量
$(function() {
	  var ctx, data, myLineChart, options;
	  Chart.defaults.global.responsive = true;
	  ctx = $('#shopPie-chart').get(0).getContext('2d');
	  options = {
	    showScale: false,
	    scaleShowGridLines: false,
	    scaleGridLineColor: "rgba(0,0,0,.05)",
	    scaleGridLineWidth: 0,
	    scaleShowHorizontalLines: false,
	    scaleShowVerticalLines: false,
	    bezierCurve: false,
	    bezierCurveTension: 0.4,
	    pointDot: false,
	    pointDotRadius: 0,
	    pointDotStrokeWidth: 2,
	    pointHitDetectionRadius: 20,
	    datasetStroke: true,
	    datasetStrokeWidth: 4,
	    datasetFill: true,
	    legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	  };
	  data = [
	    {
	      value: 150,//插入数据
	      color: "#FA2A00",
	      highlight: "#FA2A00",
	      label: "铜牌用户"
	    }, {
	      value: 50,//插入数据
	      color: "#00FF00",
	      highlight: "#00FF00",
	      label: "银牌用户"
	    }, {
	      value: 100,//插入数据
	      color: "#9932CC",
	      highlight: "#9932CC",
	      label: "金牌用户"
	    },{
	      value: 100,//插入数据
		  color: "#1E90FF",
		  highlight: "#1E90FF",
		  label: "铂金用户"
	    },{
		  value:50,//插入数据
		  color: "#FFFF00",
		  highlight: "#FFFF00",
		  label: "钻石用户"	    	
	    }
	    
	  ];
	  myLineChart = new Chart(ctx).Pie(data, options);
	});