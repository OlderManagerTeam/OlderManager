<script type="text/javascript" src="/Public/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" >
$(function() {
	$(".submit").click(function() {
		var name = $("#name").val();
		var username = $("#username").val();
		var password = $("#password").val();
		var gender = $("#gender").val();
		var dataString = 'name='+ name + '&username=' + username + '&password=' + password + '&gender=' + gender;

		if(name=='' || username=='' || password=='' || gender=='')
		{
			$('.success').fadeOut(200).hide();
			$('.error').fadeOut(200).show();
		}
		else
		{
			$.ajax({
				type: "POST",
				url: "join.php",
				data: dataString,
				success: function(){
					$('.success').fadeIn(200).show();
					$('.error').fadeOut(200).hide();
// 这里写成功的操作，例如登录成功时将提示框由hide变为show

}
});
		}
		return false;
	});
});
</script>