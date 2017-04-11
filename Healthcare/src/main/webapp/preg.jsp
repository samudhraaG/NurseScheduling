<%@ include file="back1.jsp" %>
<div><center><h4>PATIENT REGISTRATION</h4></center></div>
<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4"></div>



<form action="preg" method="post" name="s" onsubmit="return validate3();" class="form-group">
<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
<label>First Name</label><input type=text  name="first_name" placeholder="Enter First Name" class="form-control"><br>
<label>Last name</label><input type=text  name="last_name" placeholder="Enter Last Name" class="form-control"><br>
<label>Email</label><input type=email name=email placeholder="Enter Email" class="form-control"><br>
<label>Password</label><input type=password name=password placeholder="Enter Password" class="form-control"><br>
<input type=reset value="Clear" class="btn btn-default btn-block btn-danger"><br></div>

                     <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
                     <label>Gender</label>
                     <div>
                     <input type=radio name=gender value="Male">Male &nbsp
                     <input type=radio name=gender value="Female">Female 
                     </div><br>
<label>Phone number</label><input type=number name=phone placeholder="Enter Phone Number" class="form-control"><br>
<label>Address</label><textarea name=address placeholder="Enter Address" class="form-control"></textarea><br>
<label>Postal code</label><input type=number name="postal_code" placeholder="Enter Postal Code" class="form-control"><br>
<input type=submit value="Register" class="btn btn-default btn-block btn-primary" ><br>


</form>
</div>
