//独居统计
$(function() {
	  var ctx, data, myLineChart, options;
	  Chart.defaults.global.responsive = true;
	  ctx = $('#singlePie-chart').get(0).getContext('2d');
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
	      label: "独居"
	    }, {
	      value: 50,//插入数据
	      color: "#00EC00",
	      highlight: "#00EC00",
	      label: "非独居"
	    }    
	  ];
	  myLineChart = new Chart(ctx).Pie(data, options);
	});

//活动统计
$(function() {
	// 开始绘制柱状图
  var ctx, data, myBarChart, option_bars;
  Chart.defaults.global.responsive = true;
  ctx = $('#action-chart').get(0).getContext('2d');
  option_bars = {
    scaleBeginAtZero: true, //y轴标记是否从0开始
    scaleShowGridLines: true,// 是否显示网格线
    scaleGridLineColor: "rgba(0,0,0,.05)",// 网格线的颜色
    scaleGridLineWidth: 1,//网格线的线宽
    scaleShowHorizontalLines: true,// 是否显示横向线
    scaleShowVerticalLines: false,// 是否显示竖向线
    barShowStroke: true,// 是否显示线
    barStrokeWidth: 1,// 线宽
    barValueSpacing: 10,// 柱状块与x值所形成的线之间的距离
    barDatasetSpacing: 3,// 在同一x值内的柱状块之间的间距
    legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
  };// 动画完成后调用的函数(每个柱上显示对应的数据)
  data = {
    //x轴
    labels: ['一月', '二月', '三月', '四月', '五月', '六月', '七月','八月','九月','十月','十一月','十二月'],
    datasets: [
      {
        label: "My First dataset",
        fillColor: "#00EC00",
        strokeColor: "#fff",
        pointColor: "#fff",
        pointStrokeColor: "#fff",
        pointHighlightFill: "#fff",
        pointHighlightStroke: "#1ABC9C",
        data: [6511, 5900, 1280, 4581, 5678, 5395, 4440,3055,1555,9111,9999,8888]
      }
    ]
  };
  myBarChart = new Chart(ctx).Bar(data, option_bars);
});
//商城日销售量柱状图（一周）
$(function() {
	// 开始绘制柱状图
  var ctx, data, myBarChart, option_bars;
  Chart.defaults.global.responsive = true;
  ctx = $('#lecture-chart').get(0).getContext('2d');
  option_bars = {
    scaleBeginAtZero: true, //y轴标记是否从0开始
    scaleShowGridLines: true,// 是否显示网格线
    scaleGridLineColor: "rgba(0,0,0,.05)",// 网格线的颜色
    scaleGridLineWidth: 1,//网格线的线宽
    scaleShowHorizontalLines: true,// 是否显示横向线
    scaleShowVerticalLines: false,// 是否显示竖向线
    barShowStroke: true,// 是否显示线
    barStrokeWidth: 1,// 线宽
    barValueSpacing: 10,// 柱状块与x值所形成的线之间的距离
    barDatasetSpacing: 3,// 在同一x值内的柱状块之间的间距
    legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
  };// 动画完成后调用的函数(每个柱上显示对应的数据)
  data = {
    //x轴
    labels: ['一月', '二月', '三月', '四月', '五月', '六月', '七月','八月','九月','十月','十一月','十二月'],
    datasets: [
      {
        label: "My First dataset",
        fillColor: "#EE82EE",
        strokeColor: "#fff",
        pointColor: "#fff",
        pointStrokeColor: "#fff",
        pointHighlightFill: "#fff",
        pointHighlightStroke: "#1ABC9C",
        data: [6511, 5900, 1280, 4581, 5678, 5395, 4440,3055,1555,9111,9999,8888]
      }
    ]
  };
  myBarChart = new Chart(ctx).Bar(data, option_bars);
});


//老人日访问总次数
$(function() {
var ctx, data, myLineChart, options;
Chart.defaults.global.responsive = true;
ctx = $('#visitedDay-chart').get(0).getContext('2d');
options = {
  scaleShowGridLines: true,
  scaleGridLineColor: "rgba(0,0,0,.05)",
  scaleGridLineWidth: 1,
  scaleShowHorizontalLines: true,
  scaleShowVerticalLines: true,
  bezierCurve: false,
  bezierCurveTension: 0.4,
  pointDot: true,
  pointDotRadius: 4,
  pointDotStrokeWidth: 1,
  pointHitDetectionRadius: 20,
  datasetStroke: true,
  datasetStrokeWidth: 2,
  datasetFill: true,
  legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
};
data = {
  labels: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
  datasets: [
    {
      label: "My First dataset",
      fillColor: "rgba(26, 188, 156,0.2)",
      strokeColor: "#1ABC9C",
      pointColor: "#1ABC9C",
      pointStrokeColor: "#fff",
      pointHighlightFill: "#fff",
      pointHighlightStroke: "#1ABC9C",
      data: [65, 59, 80, 81, 56, 55, 40]//添加数据
    }, 
  ]
};
myLineChart = new Chart(ctx).Line(data, options);
});
//老人月访问总次数
$(function() {
var ctx, data, myLineChart, options;
Chart.defaults.global.responsive = true;
ctx = $('#visitedMouth-chart').get(0).getContext('2d');
options = {
scaleShowGridLines: true,
scaleGridLineColor: "rgba(0,0,0,.05)",
scaleGridLineWidth: 1,
scaleShowHorizontalLines: true,
scaleShowVerticalLines: true,
bezierCurve: false,
bezierCurveTension: 0.4,
pointDot: true,
pointDotRadius: 4,
pointDotStrokeWidth: 1,
pointHitDetectionRadius: 20,
datasetStroke: true,
datasetStrokeWidth: 2,
datasetFill: true,
legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
};
data = {
labels: ['一月', '二月', '三月', '四月', '五月', '六月', '七月','八月','九月','十月','十一月','十二月'],
datasets: [
   {
    label: "My Second dataset",
    fillColor: "rgba(34, 167, 240,0.2)",
    strokeColor: "#22A7F0",
    pointColor: "#22A7F0",
    pointStrokeColor: "#fff",
    pointHighlightFill: "#fff",
    pointHighlightStroke: "#22A7F0",
    data: [28, 48, 40, 33, 45, 27, 34,48, 40, 33, 56, 27]//添加数据
  }
]
};
myLineChart = new Chart(ctx).Line(data, options);
});