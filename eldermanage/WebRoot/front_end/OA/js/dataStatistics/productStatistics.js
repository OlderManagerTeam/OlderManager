//商城日销售量柱状图（一周）
$(function() {
	// 开始绘制柱状图
  var ctx, data, myBarChart, option_bars;
  Chart.defaults.global.responsive = true;
  ctx = $('#sellDay-chart').get(0).getContext('2d');
  option_bars = {
    scaleBeginAtZero: true, //y轴标记是否从0开始
    scaleShowGridLines: true,// 是否显示网格线
    scaleGridLineColor: "rgba(0,0,0,.05)",// 网格线的颜色
    scaleGridLineWidth: 1,//网格线的线宽
    scaleShowHorizontalLines: true,// 是否显示横向线
    scaleShowVerticalLines: false,// 是否显示竖向线
    barShowStroke: true,// 是否显示线
    barStrokeWidth: 1,// 线宽
    barValueSpacing: 45,// 柱状块与x值所形成的线之间的距离
    barDatasetSpacing: 3,// 在同一x值内的柱状块之间的间距
    legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
  };// 动画完成后调用的函数(每个柱上显示对应的数据)
  data = {
    //x轴
    labels: ['好评', '中评',  '差评'],
    datasets: [
      {
        label: "My First dataset",
        fillColor: "#7FFFD4",//背景色，常用transparent透明
        strokeColor: "#fff",//线条颜色，也可用"#ffffff"
        pointColor: "#fff",//点的填充颜色
        pointStrokeColor: "#fff",//点的外边框颜色
        pointHighlightFill: "#fff",
        pointHighlightStroke: "#1ABC9C",
        data: [6511, 5900, 1280]
      }
    ]
  };
  myBarChart = new Chart(ctx).Bar(data, option_bars);
});