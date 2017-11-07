function load() {
				$.ajax({
					type : 'get',
					contentType : 'application/json',
					url : "/eldermanage/v1/personal/message",
					data : null,
					success : function(result) {
						var staffimg = document.getElementById("staffimg");
						staffimg.innerHTML = result.data.staffbase.staffimg;
						var staffcode = document.getElementById("staffcode");
						staffcode.innerHTML = result.data.staffbase.staffcode;
						var staffname = document.getElementById("staffname");
						staffname.innerHTML = result.data.staffbase.staffname;
						var staffsex = document.getElementById("staffsex");
						staffsex.innerHTML = result.data.staffbase.staffsex;
		
						var date = new Date(result.data.staffbase.staffbirthday + 1000 * 60 * 60 * 8);
						var d = date.toISOString().slice(0, 10);
						staffbirthday.innerHTML = d;
		
		
						var staffiide = document.getElementById("staffiide");
						staffiide.innerHTML = result.data.staffbase.staffiide;
		
						var stafftel = document.getElementById("stafftel");
						stafftel.innerHTML = result.data.staffbase.stafftel;
		
		
		
						var staffdepartmentid = document.getElementById("staffdepartmentid");
						staffdepartmentid.innerHTML = result.data.staffbase.staffdepartmentid;
		
						var departmentname = document.getElementById("departmentname");
						departmentname.innerHTML = result.data.department.departmentname;
		
						var rolecontent = document.getElementById("rolecontent");
						rolecontent.innerHTML = result.data.role.rolecontent;
						
						document.getElementById("olderalter").href = "../personalCenter/personalAlter.html";
		
					},
					error : function() {
						alert('数据库错误')
					}
				})
			}