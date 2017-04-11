<%@ include file="back1.jsp" %>

<div class="col-xs-2 col-sm-3 col-md-4 col-lg-4"></div>
<div class="col-xs-8 col-sm-6 col-md-4 col-lg-4">
<div class="hlogpos">
<center><h4>PATIENT LOGIN</h4></center>
<form action="plog" method="post" name="s" onsubmit="return validate2();" class="form-group">

<label>Email</label><input type=email name=email class="form-control" placeholder="Enter Email"><br>
<label>Password</label><input type=password name=password class="form-control" placeholder="Enter Password"><br>
<input type=submit value="Login" class="btn btn-default btn-block btn-primary"><br>
<center><a href="preg.jsp">New Patient</a></center>
</form>

</div></div>
<div class="col-xs-8 col-sm-3 col-md-4 col-lg-4"></div>

