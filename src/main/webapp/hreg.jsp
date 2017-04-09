
<h2>HEALTHCARE PROFESSIONAL REGISTRATION</h2>
<form action="hreg" method="post">
<table>
<tr><td><label>First Name</label></td><td><input type=text name="first_name" placeholder="Enter First Name"></td></tr>
<tr><td><label>Last name</label></td><td><input type=text name="last_name" placeholder="Enter Last Name"></td></tr>
<tr><td><label>Email</label></td><td><input type=email name=email placeholder="Enter Email"></td></tr>
<tr><td><label>Password</label></td><td><input type=password name=password placeholder="Enter Password"></td></tr>
<tr><td><label>Gender</label></td><td><input type=radio name=gender value="Male">Male &nbsp
                     <input type=radio name=gender value="Female">Female </td></tr>
<tr><td><label>Phone number</label></td><td><input type=number name=phone placeholder="Enter Phone Number"></td></tr>
<tr><td><label>Address</label></td><td><textarea name=address placeholder="Enter Address"></textarea></td></tr>
<tr><td><label>Postal code</label></td><td><input type=number name="postal_code" placeholder="Enter Postal Code"></td></tr>
<tr><td><label>Languages known</label></td><td><input type=text name="languages" placeholder="Enter Languages known"></td></tr>
<tr><td><label>Skill Set</label></td><td><input type=text name="skills" placeholder="Skill Set"></td></tr>
<tr><td><label>Availability through week</label></td><td>
                          <input type=checkbox name=sunday id="sunday">Sunday &nbsp &nbsp &nbsp 
                          <input type=checkbox name=monday id="monday">Monday &nbsp &nbsp 
                          <input type=checkbox name=tuesday id="tuesday">Tuesday &nbsp 
                          <input type=checkbox name=wednesday id="wednesday">Wednesday  
                          <input type=checkbox name=thursday id="thursday">Thursday &nbsp &nbsp  
                          <input type=checkbox name=friday id="friday">Friday &nbsp &nbsp &nbsp 
                          <input type=checkbox name=saturday id="saturday">Saturday  </td></tr>
<tr><td><label>Timings</label></td><td> <textarea name=sunday_time placeholder="Available Time On Sunday" rows=3 cols=10></textarea>
                                        <textarea name=monday_time placeholder="Available Time On Monday" rows=3 cols=10></textarea>
                                        <textarea name=tuesday_time placeholder="Available Time On Tuesday" rows=3 cols=10></textarea>
                                        <textarea name=wednesday_time placeholder="Available Time On wednesday" rows=3 cols=10></textarea>
                                        <textarea name=thursday_time placeholder="Available Time On Thursday" rows=3 cols=10></textarea>
                                        <textarea name=friday_time placeholder="Available Time On Friday" rows=3 cols=10></textarea>
                                        <textarea name=saturday_time placeholder="Available Time On Saturday" rows=3 cols=10></textarea>
<tr><td><input type=reset value="Clear"></td><td><input type=submit value="Register"></td></tr>
</table>

</form>