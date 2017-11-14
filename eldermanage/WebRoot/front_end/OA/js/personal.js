	//	从这以下
			$.ajax({
				type : 'get',
				contentType : 'application/json',
				url : "/eldermanage/v1/personal/message",
				data : null,
				success : function(result) {
					$("#username").text(result.data.staffbase.staffname);
					document.getElementById("textheadphoto").src = result.data.staffbase.staffimg;
					$("#role").text(result.data.role.rolecontent);
				},
				error : function() {
					alert('数据库错误')
				}
			})
			$.ajax({
				type : 'get',
				contentType : 'application/json',
				url : "/eldermanage/v1/personal/authorization",
				data : null,
			})
				.then(
					function(result) {
						if (result == "未登录") {
							alert(result);
							window.location.href = "/eldermanage/front_end/Front/login.html";
						}
						var str = result.data.toString();
						var authorization = new Array();
						authorization = (str).split(",");
						for (var i = 0; i < authorization.length; i++) {
							document.getElementById(authorization[i]).style = "display:block;";
						}
					}
			)
		
			function logout() {
				$.ajax({
					type : 'delete',
					contentType : false,
					url : "/eldermanage/v1/index/person/accountnumber",
					data : null,
				})
					.then(
						function(result) {
							alert(result.information);
							document.cookie = "password=" + "" + ";path=/";
							window.location.href = "/eldermanage/front_end/Front/login.html";
						}
				)
			}
		//	从这以上是每个页面的加载数据都要的方法