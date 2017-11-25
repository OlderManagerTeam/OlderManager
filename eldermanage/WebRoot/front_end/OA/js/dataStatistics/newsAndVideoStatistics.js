//一周最热视频
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var videoheat,
		videoname;
	Chart.defaults.global.responsive = true;
	ctx = $('#weekheatvedio').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/video/weekheatvedio",
		data : null,
	}).then(function(result) {
		videoheat = new Array();
		videoname = new Array();
		for (i = 0; i < result.data.length; i++) {
			videoname[i] = result.data[i].videoname
			videoheat[i] = result.data[i].videoheat;
		}
		data = {
			//x轴
			labels : videoname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : videoheat
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//一周上传视频情况
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var videopublishdate,
		videotime,
		videoid;
	Chart.defaults.global.responsive = true;
	ctx = $('#weekaddvedio').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/video/weekaddvedio",
		data : null,
	}).then(function(result) {
		videopublishdate = new Array();
		videoid = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			videopublishdate[result.data.length - i - 1] = new Date(result.data[i].videopublishdate).toLocaleDateString();
			videoid[result.data.length - i - 1] = result.data[i].videoid;
		}
		$.ajax({
			type : 'get',
			contentType : 'application/json',
			url : "/eldermanage/v1/data/video/weekvediotime",
			data : null,
		}).then(function(result) {

			videotime = new Array();
			for (i = result.data.length - 1; i >= 0; i--) {
				videotime[result.data.length - i - 1] = result.data[i].videotime;
			}


			data = {
				labels : videopublishdate,
				datasets : [
					{
						label : "My First dataset",
						fillColor : "rgba(255,255,255,0.2)",
						strokeColor : "#1ABC9C",
						pointColor : "#0080FF",
						pointStrokeColor : "#fff",
						pointHighlightFill : "#fff",
						pointHighlightStroke : "#1ABC9C",
						data : videoid //添加数据
					},
					{
						label : "My First dataset",
						fillColor : "rgba(255,255,255,0.2)",
						strokeColor : "#0080FF",
						pointColor : "#1ABC9C",
						pointStrokeColor : "#fff",
						pointHighlightFill : "#fff",
						pointHighlightStroke : "#1ABC9C",
						data : videotime //添加数据
					},
				]
			};
			myLineChart = new Chart(ctx).Line(data, options);
		})
	})
});
//一周收藏最多
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var videoheat,
		videoname;
	Chart.defaults.global.responsive = true;
	ctx = $('#weekvediocolle').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/video/weekvediocolle",
		data : null,
	}).then(function(result) {
		videoheat = new Array();
		videoname = new Array();
		for (i = 0; i < result.data.length; i++) {
			videoname[i] = result.data[i].videoname
			videoheat[i] = result.data[i].videoheat;
		}
		data = {
			//x轴
			labels : videoname,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : videoheat
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});
//一周视频访问量
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var videopublishdate,
		videotime,
		videoid;
	Chart.defaults.global.responsive = true;
	ctx = $('#weekvedioview').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/video/weekvedioview",
		data : null,
	}).then(function(result) {
		videopublishdate = new Array();
		videoid = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			videopublishdate[result.data.length - i - 1] = new Date(result.data[i].videopublishdate).toLocaleDateString();
			videoid[result.data.length - i - 1] = result.data[i].videoid;
		}
		data = {
			labels : videopublishdate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#1ABC9C",
					pointColor : "#0080FF",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : videoid //添加数据
				},
			]
		};
		myLineChart = new Chart(ctx).Line(data, options);
	})
});
//一周新闻访问量
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var newsissueddate,
		newsheat;
	Chart.defaults.global.responsive = true;
	ctx = $('#weeknewsview').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/news/weeknewsview",
		data : null,
	}).then(function(result) {
		newsissueddate = new Array();
		newsheat = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			newsissueddate[result.data.length - i - 1] = new Date(result.data[i].newsissueddate).toLocaleDateString();
			newsheat[result.data.length - i - 1] = result.data[i].newsheat;
		}
		data = {
			labels : newsissueddate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#1ABC9C",
					pointColor : "#0080FF",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : newsheat //添加数据
				},
			]
		};
		myLineChart = new Chart(ctx).Line(data, options);
	})
});
//一周上传新闻
$(function() {
	var ctx,
		data,
		myLineChart,
		options;
	var newsissueddate,
		newsid;
	Chart.defaults.global.responsive = true;
	ctx = $('#weekaddnews').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/news/weekaddnews",
		data : null,
	}).then(function(result) {
		newsissueddate = new Array();
		newsid = new Array();
		for (i = result.data.length - 1; i >= 0; i--) {
			newsissueddate[result.data.length - i - 1] = new Date(result.data[i].newsissueddate).toLocaleDateString();
			newsid[result.data.length - i - 1] = result.data[i].newsid;
		}
		data = {
			labels : newsissueddate,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "rgba(255,255,255,0.2)",
					strokeColor : "#1ABC9C",
					pointColor : "#0080FF",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : newsid //添加数据
				},
			]
		};
		myLineChart = new Chart(ctx).Line(data, options);
	})
});
//一周最热新闻
$(function() {
	// 开始绘制柱状图
	var ctx,
		data,
		myBarChart,
		option_bars;
	var newstitle,
	newsheat;
	Chart.defaults.global.responsive = true;
	ctx = $('#weeknewsheat').get(0).getContext('2d');
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
		url : "/eldermanage/v1/data/news/weeknewsheat",
		data : null,
	}).then(function(result) {
		newstitle = new Array();
		newsheat = new Array();
		for (i = 0; i < result.data.length; i++) {
			newstitle[i] = result.data[i].newstitle
			newsheat[i] = result.data[i].newsheat;
		}
		data = {
			//x轴
			labels : newstitle,
			datasets : [
				{
					label : "My First dataset",
					fillColor : "#FF2D2D",
					strokeColor : "#fff",
					pointColor : "#fff",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "#1ABC9C",
					data : newsheat
				}
			]
		};
		myBarChart = new Chart(ctx).Bar(data, option_bars);
	})
});