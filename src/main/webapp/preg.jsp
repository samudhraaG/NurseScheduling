<h2>PATIENT REGISTRATION</h2>
<form action="preg" method="post">
<table>
<tr><td><label>First Name</label></td><td><input type=text  name="first_name" placeholder="Enter First Name"></td></tr>
<tr><td><label>Last name</label></td><td><input type=text  name="last_name" placeholder="Enter Last Name"></td></tr>
<tr><td><label>Email</label></td><td><input type=email name=email placeholder="Enter Email"></td></tr>
<tr><td><label>Password</label></td><td><input type=password name=password placeholder="Enter Password"></td></tr>
<tr><td><label>Gender</label></td><td><input type=radio name=gender value="Male">Male &nbsp
                     <input type=radio name=gender value="Female">Female </td></tr>
<tr><td><label>Phone number</label></td><td><input type=number name=phone placeholder="Enter Phone Number"></td></tr>
<tr><td><label>Address</label></td><td><textarea name=address placeholder="Enter Address"></textarea></td></tr>
<tr><td><label>Postal code</label></td><td><input type=number name="postal_code" placeholder="Enter Postal Code"></td></tr>
<tr><td><input type=reset value="Clear"></td><td><input type=submit value="Register"></td></tr>

</form>