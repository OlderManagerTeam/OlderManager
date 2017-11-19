//新闻统计
$(function() {
	// 开始绘制柱状图
  var ctx, data, myBarChart, option_bars;
  Chart.defaults.global.responsive = true;
  ctx = $('#news-chart').get(0).getContext('2d');
  option_bars = {
    scaleBeginAtZero: true, //y轴标记是否从0开始
    scaleShowGridLines: true,// 是否显示网格线
    scaleGridLineColor: "rgba(0,0,0,.05)",// 网格线的颜色
    scaleGridLineWidth: 1,//网格线的线宽
    scaleShowHorizontalLines: true,// 是否显示横向线
    scaleShowVerticalLines: false,// 是否显示竖向线
    barShowStroke: true,// 是否显示线
    barStrokeWidth: 1,// 线宽
    barValueSpacing: 20,// 柱状块与x值所形成的线之间的距离
    barDatasetSpacing: 3,// 在同一x值内的柱状块之间的间距
    legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
  };// 动画完成后调用的函数(每个柱上显示对应的数据)
  data = {
    //x轴
    labels: ['聚焦医疗', '饮食药膳', '锻炼保健'],
    datasets: [
      {
        label: "My First dataset",
        fillColor: "#FF2D2D",
        strokeColor: "#fff",
        pointColor: "#fff",
        pointStrokeColor: "#fff",
        pointHighlightFill: "#fff",
        pointHighlightStroke: "#1ABC9C",
        data: [6511, 5900, 1280, ]
      }
    ]
  };
  myBarChart = new Chart(ctx).Bar(data, option_bars);
});

//视频量
$(function() {
	  var ctx, data, myLineChart, options;
	  Chart.defaults.global.responsive = true;
	  ctx = $('#videoPie-chart').get(0).getContext('2d');
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
	      value: 60,//插入数据
	      color: "#0080FF",
	      highlight: "#0080FF",
	      label: "健康视频"
	    }, {
	      value: 50,//插入数据
	      color: "#00EC00",
	      highlight: "#00EC00",
	      label: "讲座回放"
	    }    
	  ];
	  myLineChart = new Chart(ctx).Pie(data, options);
	});