UrlParm = function() { // url参数
	var data,
		index;
	(function init() {
		data = [];
		index = {};
		var u = window.location.search.substr(1);
		if (u != '') {
			var parms = decodeURIComponent(u).split('&');
			for (var i = 0, len = parms.length; i < len; i++) {
				if (parms[i] != '') {
					var p = parms[i].split("=");
					if (p.length == 1 || (p.length == 2 && p[1] == '')) { // p | p=
						data.push([ '' ]);
						index[p[0]] = data.length - 1;
					} else if (typeof (p[0]) == 'undefined' || p[0] == '') { // =c | =
						data[0] = [ p[1] ];
					} else if (typeof (index[p[0]]) == 'undefined') { // c=aaa
						data.push([ p[1] ]);
						index[p[0]] = data.length - 1;
					} else { // c=aaa
						data[index[p[0]]].push(p[1]);
					}
				}
			}
		}
	})();
	return {
		// 获得参数,类似request.getParameter()
		parm : function(o) { // o: 参数名或者参数次序
			try {
				return (typeof (o) == 'number' ? data[o][0] : data[index[o]][0]);
			} catch (e) {}
		},
		//获得参数组, 类似request.getParameterValues()
		parmValues : function(o) { // o: 参数名或者参数次序
			try {
				return (typeof (o) == 'number' ? data[o] : data[index[o]]);
			} catch (e) {}
		},
		//是否含有parmName参数
		hasParm : function(parmName) {
			return typeof (parmName) == 'string' ? typeof (index[parmName]) != 'undefined' : false;
		},
		// 获得参数Map ,类似request.getParameterMap()
		parmMap : function() {
			var map = {};
			try {
				for (var p in index) {
					map[p] = data[index[p]];
				}
			} catch (e) {}
			return map;
		}
	}
}();
//商城日阅览量
var productid = UrlParm.parm("productid");
if (productid == null)
	productid = 0;
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var productsalesdate,
		storedaybrowse,
		pdsdaysale;
	Chart.defaults.global.responsive = true;
	ctx = $('#visitedDay-chart').get(0).getContext('2d');
	options = {
		scaleShowGridLines : true,
		scaleGridLineColor : "rgba(0,0,0,.05)",
		scaleGridLineWidth : 1,
		scaleShowHorizontalLines : true,
		scaleShowVerticalLines : true,
		bezierCurve : false,
		bezierCurveTension : 0.4,
		pointDot : true,
		pointDotRadius : 4,
		pointDotStrokeWidth : 1,
		pointHitDetectionRadius : 20,
		datasetStroke : true,
		datasetStrokeWidth : 2,
		datasetFill : true,
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	};
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/produtct/daysales?productid=" + productid,
		data : null,
	}).then(function(result) {
		productsalesdate = new Array();
		storedaybrowse = new Array();
		pdsdaysale = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			productsalesdate[result.data.length - i - 1] = new Date(result.data[i].pdsdaydate).toLocaleDateString();
			storedaybrowse[result.data.length - i - 1] = result.data[i].storedaybrowse;
			pdsdaysale[result.data.length - i - 1] = result.data[i].pdsdaysale;
		}
		data = {
			labels : productsalesdate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#1ABC9C",
					pointColor : "#1ABC9C",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : storedaybrowse //添加数据
				},
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#FF4500",
					pointColor : "#FF4500",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : pdsdaysale //添加数据
				},
			]
		};
		myLineChart = new Chart(ctx).Line(data, options);
	})
});
//商城日阅览量
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var productsalesdate,
		storedaybrowse,
		pdsdaysale;
	Chart.defaults.global.responsive = true;
	ctx = $('#visitedMouth-chart').get(0).getContext('2d');
	options = {
		scaleShowGridLines : true,
		scaleGridLineColor : "rgba(0,0,0,.05)",
		scaleGridLineWidth : 1,
		scaleShowHorizontalLines : true,
		scaleShowVerticalLines : true,
		bezierCurve : false,
		bezierCurveTension : 0.4,
		pointDot : true,
		pointDotRadius : 4,
		pointDotStrokeWidth : 1,
		pointHitDetectionRadius : 20,
		datasetStroke : true,
		datasetStrokeWidth : 2,
		datasetFill : true,
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	};
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/produtct/monthsales?productid=" + productid,
		data : null,
	}).then(function(result) {
		productsalesdate = new Array();
		storedaybrowse = new Array();
		pdsdaysale = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			productsalesdate[result.data.length - i - 1] = new Date(result.data[i].pdsdaydate).toLocaleDateString();
			storedaybrowse[result.data.length - i - 1] = result.data[i].storedaybrowse;
			pdsdaysale[result.data.length - i - 1] = result.data[i].pdsdaysale;
		}
		data = {
			labels : productsalesdate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#1ABC9C",
					pointColor : "#1ABC9C",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : storedaybrowse //添加数据
				},
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#FF4500",
					pointColor : "#FF4500",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : pdsdaysale //添加数据
				},
			]
		};
		myLineChart = new Chart(ctx).Line(data, options);
	})
});

/*//商城日销售量柱状图（一周）
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var joindate,
		joincount;
	Chart.defaults.global.responsive = true;
	ctx = $('#sellDay-chart').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 18, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	
	data = {
		//x轴
		labels : [ '周一', '周二', '周三', '周四', '周五', '周六', '周日' ],
		datasets : [
			{
				label : "My First dataset",
				fillColor : "#EE82EE", //背景色，常用transparent透明
				strokeColor : "#fff", //线条颜色，也可用"#ffffff"
				pointColor : "#fff", //点的填充颜色
				pointStrokeColor : "#fff", //点的外边框颜色
				pointHighlightFill : "#fff",
				pointHighlightStroke : "#1ABC9C",
				data : [ 6511, 5900, 1280, 4581, 1000, 5395, 4440 ]
			}
		]
	};
	myBarChart = new Chart(ctx).Bar(data, option_bars);
});
//商城月销售量柱状图
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	Chart.defaults.global.responsive = true;
	ctx = $('#sellMouth-chart').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 10, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	data = {
		//x轴
		labels : [ '一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月' ],
		datasets : [
			{
				label : "My First dataset",
				fillColor : "#EE82EE",
				strokeColor : "#fff",
				pointColor : "#fff",
				pointStrokeColor : "#fff",
				pointHighlightFill : "#fff",
				pointHighlightStroke : "#1ABC9C",
				data : [ 6511, 5900, 1280, 4581, 5678, 5395, 4440, 3055, 1555, 9111, 9999, 8888 ]
			}
		]
	};
	myBarChart = new Chart(ctx).Bar(data, option_bars);
});*/

//商城日团购柱状图（一周）
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var joindate,
		joincount;
	Chart.defaults.global.responsive = true;
	ctx = $('#groupDay-chart').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 18, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/produtct/dayjoingroup",
		data : null,
	}).then(function(result) {
		joindate = new Array();
		joincount = new Array();
		pdsdaysale = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			joindate[result.data.length - i - 1] = new Date(result.data[i].joindate).toLocaleDateString();
			joincount[result.data.length - i - 1] = result.data[i].joingroupid;
		}
		data = {
			//x轴
			labels : joindate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FABE28", //背景色，常用transparent透明
					strokeColor : "#fff", //线条颜色，也可用"#ffffff"
					pointColor : "#fff", //点的填充颜色
					pointStrokeColor : "#fff", //点的外边框颜色
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : joincount
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//商城月团购柱状图
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	Chart.defaults.global.responsive = true;
	ctx = $('#groupMouth-chart').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true, //y轴标记是否从0开始
		scaleShowGridLines : true, // 是否显示网格线
		scaleGridLineColor : "rgba(0,0,0,.05)", // 网格线的颜色
		scaleGridLineWidth : 1, //网格线的线宽
		scaleShowHorizontalLines : true, // 是否显示横向线
		scaleShowVerticalLines : false, // 是否显示竖向线
		barShowStroke : true, // 是否显示线
		barStrokeWidth : 1, // 线宽
		barValueSpacing : 10, // 柱状块与x值所形成的线之间的距离
		barDatasetSpacing : 3, // 在同一x值内的柱状块之间的间距
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	}; // 动画完成后调用的函数(每个柱上显示对应的数据)
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/produtct/monthjoingroup",
		data : null,
	}).then(function(result) {
		joindate = new Array();
		joincount = new Array();
		pdsdaysale = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			joindate[result.data.length - i - 1] = new Date(result.data[i].joindate).toLocaleDateString();
			joincount[result.data.length - i - 1] = result.data[i].joingroupid;
		}
		data = {
			//x轴
			labels : joindate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FABE28", //背景色，常用transparent透明
					strokeColor : "#fff", //线条颜色，也可用"#ffffff"
					pointColor : "#fff", //点的填充颜色
					pointStrokeColor : "#fff", //点的外边框颜色
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : joincount
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//商品库存量
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	Chart.defaults.global.responsive = true;
	ctx = $('#shopPie-chart').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/produtct/typestorecount",
		data : null,
	}).then(function(result) {
		var typestore = result.data;
		data = [
			{
				value : typestore[0].typeid, //插入数据
				color : "#FA2A00",
				highlight : "#FA2A00",
				label : "食物饮品"
			}, {
				value : typestore[1].typeid, //插入数据
				color : "#1ABC9C",
				highlight : "#1ABC9C",
				label : "衣物服饰"
			}, {
				value : typestore[2].typeid, //插入数据
				color : "#FF00FF",
				highlight : "#FF00FF",
				label : "文学艺术"
			}, {
				value : typestore[3].typeid, //插入数据
				color : "#EE82EE",
				highlight : "#EE82EE",
				label : "生活用品"
			}, {
				value : typestore[4].typeid, //插入数据
				color : "#9932CC",
				highlight : "#9932CC",
				label : "娱乐器具"
			}, {
				value : typestore[5].typeid, //插入数据
				color : "#FFFF00",
				highlight : "#FFFF00",
				label : "运动器材"
			}, {
				value : typestore[6].typeid, //插入数据
				color : "#0000CD",
				highlight : "#0000CD",
				label : "医药保健品"
			}, {
				value : typestore[7].typeid, //插入数据
				color : "#FFDAB9",
				highlight : "#FFDAB9",
				label : "电子产品"
			}, {
				value : typestore[8].typeid, //插入数据
				color : "#FABE28",
				highlight : "#FABE28",
				label : "医疗器具"
			}, {
				value : typestore[9].typeid, //插入数据
				color : "#00FF00",
				highlight : "#00FF00",
				label : "家具器材"
			}

		];
		myLineChart = new Chart(ctx).Pie(data, options);
	})
});
//客户购物雷达图
$(function() {
	var ctx,
		data,
		myBarChart,
		option_bars;
	var typecontent,
		typenumber;
	Chart.defaults.global.responsive = true;
	ctx = $('#olderRadar-chart').get(0).getContext('2d');
	option_bars = {
		scaleBeginAtZero : true,
		scaleShowGridLines : true,
		scaleGridLineColor : "rgba(0,0,0,.05)",
		scaleGridLineWidth : 1,
		scaleShowHorizontalLines : true,
		scaleShowVerticalLines : false,
		barShowStroke : false,
		barStrokeWidth : 0,
		barValueSpacing : 5,
		barDatasetSpacing : 1,
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	};
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/produtct/typesales",
		data : null,
	}).then(function(result) {
		typenumber = new Array();
		typecontent = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			typenumber[result.data.length - i - 1] = result.data[i].typenumber;
			typecontent[result.data.length - i - 1] = result.data[i].typecontent;
		}

		data = {
			labels : typecontent,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "rgba(26, 188, 156,0.2)",
					strokeColor : "#1ABC9C",
					pointColor : "#1ABC9C",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : typenumber //插入数据
				}
			]
		};
		myBarChart = new Chart(ctx).Radar(data, option_bars);
	})
});
//商城近日评价
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var ratedate,
		aratecontent,
		bratecontent,
		cratecontent;
	Chart.defaults.global.responsive = true;
	ctx = $('#productdayrate-chart').get(0).getContext('2d');
	options = {
		scaleShowGridLines : true,
		scaleGridLineColor : "rgba(0,0,0,.05)",
		scaleGridLineWidth : 1,
		scaleShowHorizontalLines : true,
		scaleShowVerticalLines : true,
		bezierCurve : false,
		bezierCurveTension : 0.4,
		pointDot : true,
		pointDotRadius : 4,
		pointDotStrokeWidth : 1,
		pointHitDetectionRadius : 20,
		datasetStroke : true,
		datasetStrokeWidth : 2,
		datasetFill : true,
		legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
	};
	$.ajax({
		type : 'get',
		contentType : 'application/json',
		url : "/eldermanage/v1/data/produtct/daysrate?rateid=0&rateolderid=3&productid=" + productid,
		data : null,
	}).then(function(result) {
		ratedate = new Array();
		aratecontent = new Array();
		bratecontent = new Array();
		cratecontent = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			ratedate[result.data.length - i - 1] = new Date(result.data[i].ratedate).toLocaleDateString();
			cratecontent[result.data.length - i - 1] = result.data[i].ratecontent;
		}
		$.ajax({
			type : 'get',
			contentType : 'application/json',
			url : "/eldermanage/v1/data/produtct/daysrate?rateid=2&rateolderid=4&productid=" + productid,
			data : null,
		}).then(function(result) {


			for (i = result.data.length - 1; i >= 0; i--) {
				ratedate[result.data.length - i - 1] = new Date(result.data[i].ratedate).toLocaleDateString();
				bratecontent[result.data.length - i - 1] = result.data[i].ratecontent;
			}
			$.ajax({
				type : 'get',
				contentType : 'application/json',
				url : "/eldermanage/v1/data/produtct/daysrate?rateid=3&rateolderid=6&productid=" + productid,
				data : null,
			}).then(function(result) {


				for (i = result.data.length - 1; i >= 0; i--) {
					ratedate[result.data.length - i - 1] = new Date(result.data[i].ratedate).toLocaleDateString();
					aratecontent[result.data.length - i - 1] = result.data[i].ratecontent;
				}
				data = {
					labels : ratedate,
					datasets : [
						{
							label : "My First dataset",
							fillColor : "rgba(255,255,255,0.2)",
							strokeColor : "#1ABC9C",
							pointColor : "#1ABC9C",
							pointStrokeColor : "#fff",
							pointHighlightFill : "#fff",
							pointHighlightStroke : "#1ABC9C",
							data : cratecontent //添加数据
						},
						{
							label : "My First dataset",
							fillColor : "rgba(255,255,255,0.2)",
							strokeColor : "#1A009C",
							pointColor : "#1ABC9C",
							pointStrokeColor : "#fff",
							pointHighlightFill : "#fff",
							pointHighlightStroke : "#1ABC9C",
							data : bratecontent //添加数据
						},
						{
							label : "My First dataset",
							fillColor : "rgba(255,255,255,0.2)",
							strokeColor : "#FF0000",
							pointColor : "#FF4500",
							pointStrokeColor : "#fff",
							pointHighlightFill : "#fff",
							pointHighlightStroke : "#1ABC9C",
							data : aratecontent //添加数据
						},
					]
				};
				myLineChart = new Chart(ctx).Line(data, options);
			})
		})

	})
});
/*//新闻统计
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	Chart.defaults.global.responsive = true;
	ctx = $('#news-chart').get(0).getContext('2d');
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
	data = {
		//x轴
		labels : [ '聚焦医疗', '饮食药膳', '锻炼保健' ],
		datasets : [
			{
				label : "My First dataset",
				fillColor : "#FF2D2D",
				strokeColor : "#fff",
				pointColor : "#fff",
				pointStrokeColor : "#fff",
				pointHighlightFill : "#fff",
				pointHighlightStroke : "#1ABC9C",
				data : [ 6511, 5900, 1280, ]
			}
		]
	};
	myBarChart = new Chart(ctx).Bar(data, option_bars);
});*/