function load() {
				$.ajax({
					type : 'get',
					contentType : 'application/json',
					url : "/eldermanage/v1/personal/message",
					data : null,
					success : function(result) {
						var staffimg = document.getElementById("staffolderimg");
						staffimg.src = result.data.staffbase.staffimg;
						var staffname = document.getElementById("staffname");
						staffname.value = result.data.staffbase.staffname;
		
		
						var staffsex = document.getElementById("select2-staffsex-container");
						staffsex.innerHTML = result.data.staffbase.staffsex;
						staffsex.title = result.data.staffbase.staffsex;
						staffsex.value = result.data.staffbase.staffsex;
		
						var date = new Date(result.data.staffbase.staffbirthday + 1000 * 60 * 60 * 8);
						var d = date.toISOString().slice(0, 10);
		
						var staffbirthday = document.getElementById("staffbirthday");
						staffbirthday.value = d;
		
						var staffiide = document.getElementById("staffiide");
						staffiide.value = result.data.staffbase.staffiide;
		
						var stafftel = document.getElementById("stafftel");
						stafftel.value = result.data.staffbase.stafftel;
		
					},
					error : function() {
						alert('数据库错误')
					}
				})
			};

			
			$("#altersubmit").click(function() {
				var form = new FormData(document.getElementById("personalalter"));
				form.append("staffsex", $("#staffsex option:selected").text());
				$.ajax({
					type : 'post',
					url : "/eldermanage/v1/personal/update/message",
					data : form,
					processData : false,
					contentType : false,
					success : function(result) {
						//var resultdata = JSON.parse(result);
						//alert(result.success);
						if (result.success) {
							alert(result.information)
							window.location.href = "/eldermanage/front_end/OA/html/personalCenter/personalCenter.html";
						}
					},
					error : function() {
						alert('fail')
					}
				})
			});
			
			
			$(document).ready(function() {
				// Generate a simple captcha
		
				$('#personalalter').bootstrapValidator({
					//        live: 'disabled',
					message : 'This value is not valid',
					feedbackIcons : {
						valid : 'glyphicon glyphicon-ok-circle',
						invalid : 'glyphicon glyphicon-remove-circle',
						validating : 'glyphicon glyphicon-refresh',
					},
					fields : {
						//检验用户名
						staffname : {
							message : '姓名不能为空',
							validators : {
								//验证名字是否为空
								notEmpty : {
									message : '姓名不能为空'
								},
								//验证名字长度
								stringLength : {
									min : 2,
									max : 6,
									message : '姓名只能2到6位汉字'
								},
								//验证名字是不是中文
								regexp : {
									regexp : /^[\u4e00-\u9fa5]+$/,
									message : '名字只能是中文'
								},
							}
						},
						staffiide : {
							validators : {
								//身份证是否为空
								notEmpty : {
									message : '身份证不能为空'
								},
								//身份证格式
								regexp : {
									regexp : /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/,
									message : '请输入正确的身份证格式'
								}
							}
						},
						staffimg : {
							validators : {
								//密码不能为空
								notEmpty : {
									message : '照片不能为空'
								},
							}
						},
						staffsex: {
							validators : {
								//密码不能为空
								notEmpty : {
									message : '性别不能为空'
								},
							}
						},
						stafftel : {
							validators : {
								notEmpty : {
									message : '电话不能为空'
								},
								regexp : {
									regexp : /^1[3|5|8]{1}[0-9]{9}$/,
									message : '请输入正确的电话号码格式,例如：187XXXXXXXX'
								}
							}
						},
						staffbirthday : {
							validators : {
								notEmpty : {
									message : '日期不能为空'
								},
								date : {
									format : 'YYYY-MM-DD',
									message : '请输入正确的日期格式'
								}
							}
						},
					}
				});
		
				// Validate the form manually
		
			});
			
			$('select').select2();
			$('#branchname').next('span').width(200);
			
			$("#staffimg").fileinput({
				showUpload : false,
				showCaption : false,
				browseClass : "btn btn-primary btn-lg",
				fileType : "any",
				previewFileIcon : "<i class='glyphicon glyphicon-king'></i>"
			});