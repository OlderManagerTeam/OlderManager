//客户人数统计
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var branchname,
		branchmanagerid;
	Chart.defaults.global.responsive = true;
	ctx = $('#oldercount').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 20, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/branch/oldercount",
		data : null,
	}).then(function(result) {
		branchname = new Array();
		branchmanagerid = new Array();
		for (i = 0; i < result.data.length; i++) {
			branchname[i] = result.data[i].branchname
			branchmanagerid[i] = result.data[i].branchmanagerid;
		}

		data = {
			//x轴
			labels : branchname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : branchmanagerid
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//分店kpi统计
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var branchname,
		branchkpi;
	Chart.defaults.global.responsive = true;
	ctx = $('#KPI').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 20, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/branch/KPI",
		data : null,
	}).then(function(result) {
		branchname = new Array();
		branchkpi = new Array();
		for (i = 0; i < result.data.length; i++) {
			branchname[i] = result.data[i].branchname
			branchkpi[i] = result.data[i].branchkpi;
		}

		data = {
			//x轴
			labels : branchname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : branchkpi
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//分店活动讲座统计
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var branchname,
		branchmanagerid;
	Chart.defaults.global.responsive = true;
	ctx = $('#branchactioncount').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 20, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/branch/branchactioncount",
		data : null,
	}).then(function(result) {
		branchname = new Array();
		branchmanagerid = new Array();
		for (i = 0; i < result.data.length; i++) {
			branchname[i] = result.data[i].branchname
			branchmanagerid[i] = result.data[i].branchmanagerid;
		}

		data = {
			//x轴
			labels : branchname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : branchmanagerid
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//分店活动讲座老人参加统计
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var branchname,
		branchmanagerid;
	Chart.defaults.global.responsive = true;
	ctx = $('#branchactionjoin').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 20, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/branch/branchactionjoin",
		data : null,
	}).then(function(result) {
		branchname = new Array();
		branchmanagerid = new Array();
		for (i = 0; i < result.data.length; i++) {
			branchname[i] = result.data[i].branchname
			branchmanagerid[i] = result.data[i].branchmanagerid;
		}

		data = {
			//x轴
			labels : branchname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : branchmanagerid
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//分店活动讲座老人参加统计
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var branchname,
		branchmanagerid;
	Chart.defaults.global.responsive = true;
	ctx = $('#branchvisit').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 20, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/branch/branchvisit",
		data : null,
	}).then(function(result) {
		branchname = new Array();
		branchmanagerid = new Array();
		for (i = 0; i < result.data.length; i++) {
			branchname[i] = result.data[i].branchname
			branchmanagerid[i] = result.data[i].branchmanagerid;
		}

		data = {
			//x轴
			labels : branchname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : branchmanagerid
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//老人星级统计
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	Chart.defaults.global.responsive = true;
	ctx = $('#brancholderlevel').get(0).getContext('2d');
	options = {
		showScale : false,
		scaleShowGridLines : false,
		scaleGridLineColor : "rgba(0,0,0,.05)",
		scaleGridLineWidth : 0,
		scaleShowHorizontalLines : false,
		scaleShowVerticalLines : false,
		bezierCurve : false,
		bezierCurveTension : 0.4,
		pointDot : false,
		pointDotRadius : 0,
		pointDotStrokeWidth : 2,
		pointHitDetectionRadius : 20,
		datasetStroke : true,
		datasetStrokeWidth : 4,
		datasetFill : true,
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	};
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/branch/brancholderlevel",
		data : null,
	}).then(function(result) {
		
		data = [
			{
				value : result.data[2].olderid, //插入数据
				color : "#FA2A00",
				highlight : "#FA2A00",
				label : "铜牌用户"
			}, {
				value : result.data[3].olderid, //插入数据
				color : "#00FF00",
				highlight : "#00FF00",
				label : "银牌用户"
			}, {
				value : result.data[0].olderid, //插入数据
				color : "#9932CC",
				highlight : "#9932CC",
				label : "金牌用户"
			},  {
				value : result.data[1].olderid, //插入数据
				color : "#FFFF00",
				highlight : "#FFFF00",
				label : "钻石用户"
			}

		];
		myLineChart = new Chart(ctx).Pie(data, options);
	})
}); /*
//性别统计

$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	Chart.defaults.global.responsive = true;
	ctx = $('#sexPie-chart').get(0).getContext('2d');
	options = {
		showScale : false,
		scaleShowGridLines : false,
		scaleGridLineColor : "rgba(0,0,0,.05)",
		scaleGridLineWidth : 0,
		scaleShowHorizontalLines : false,
		scaleShowVerticalLines : false,
		bezierCurve : false,
		bezierCurveTension : 0.4,
		pointDot : false,
		pointDotRadius : 0,
		pointDotStrokeWidth : 2,
		pointHitDetectionRadius : 20,
		datasetStroke : true,
		datasetStrokeWidth : 4,
		datasetFill : true,
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	};
	data = [
		{
			value : 60, //插入数据
			color : "#0080FF",
			highlight : "#0080FF",
			label : "独居"
		}, {
			value : 50, //插入数据
			color : "#00EC00",
			highlight : "#00EC00",
			label : "非独居"
		}
	];
	myLineChart = new Chart(ctx).Pie(data, options);
});*/