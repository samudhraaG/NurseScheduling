<%@ include file="back1.jsp" %>

<center><h4>HEALTHCARE PROFESSIONAL REGISTRATION</h4></center>
<form action="hreg" method="post" name="s" onsubmit="return validate();" class="form-group">
<div class="container">
<div class="col-lg-4">

<label>First Name</label><input type=text name="first_name" placeholder="Enter First Name" class="form-control"><br>
<label>Last name</label><input type=text name="last_name" placeholder="Enter Last Name" class="form-control"><br>
<label>Email</label><input type=email name=email placeholder="Enter Email" class="form-control"><br>
<label>Gender</label><div>
                     <input type=radio name=gender value="Male">Male 
                     <input type=radio name=gender value="Female" >Female <br><br>
                     </div>
</div>
<div class="col-lg-4">
<label>Password</label><input type=password name=password placeholder="Enter Password" class="form-control"><br>                   
<label>Phone number</label><input type=number name=phone placeholder="Enter Phone Number" class="form-control"><br>                     
<label>Postal code</label><input type=number name="postal_code" placeholder="Enter Postal Code" class="form-control"><br>
</div>
<div class="col-lg-4">
<label>Languages known</label><input type=text name="languages" placeholder="Enter Languages known" class="form-control"><br>
<label>Skill Set</label><input type=text name="skills" placeholder="Skill Set" class="form-control"><br>
<label>Address</label><textarea name=address placeholder="Enter Address" class="form-control"></textarea><br> 
</div>
</div>
<div class="container">
<center><label>Availability through week</label></center>

<div class="col-lg-1">
 <input type=checkbox name=sunday  id="sunday" value=on >Sunday  
 </div>                   <div class="col-lg-2">
                          <input type=checkbox name=monday id="monday" >Monday   
                          </div>
                          <div class="col-lg-2">
                          <input type=checkbox name=tuesday id="tuesday" >Tuesday  
                          </div>
                          <div class="col-lg-2">
                          <input type=checkbox name=wednesday id="wednesday">Wednesday
                          </div>  
                          <div class="col-lg-2">
                          <input type=checkbox name=thursday id="thursday">Thursday 
                          </div> 
                          <div class="col-lg-1">  
                          <input type=checkbox name=friday id="friday">Friday  
                          </div>
                          <div class="col-lg-2">
                          <input type=checkbox name=saturday id="saturday">Saturday  </div>
                         
                          
 </div>              
 <div class="container">         
<center><label>Timings</label> </center>
<div class="col-lg-1"> 
<textarea name=sunday_time  id="sunday_time" placeholder="Available Time On Sunday" class="form-control" rows=3 cols=10></textarea>
</div>                                  <div class="col-lg-2">
                                        <textarea name=monday_time id="monday_time" class="form-control" placeholder="Available Time On Monday" rows=3 cols=10></textarea>
                                        </div>
                                        <div class="col-lg-2">
                                        <textarea name=tuesday_time id="tuesday_time" class="form-control" placeholder="Available Time On Tuesday" rows=3 cols=10></textarea>
                                      </div>
                                      <div class="col-lg-2">
                                        <textarea name=wednesday_time id="wednesday_time" class="form-control" placeholder="Available Time On wednesday" rows=3 cols=10></textarea>
                                       </div>
                                       <div class="col-lg-2">
                                        <textarea name=thursday_time id="thursday_time" class="form-control" placeholder="Available Time On Thursday" rows=3 cols=10></textarea>
                                        </div>
                                        <div class="col-lg-1">
                                        <textarea name=friday_time id="friday_time" class="form-control" placeholder="Available Time On Friday" rows=3 cols=10></textarea>
                                       </div>
                                       <div class="col-lg-2">
                                        <textarea name=saturday_time id="saturday_time" class="form-control" placeholder="Available Time On Saturday" rows=3 cols=10></textarea>
                                          </div>
                                          </div><br>
 <div class="container">      
 <div class="col-lg-6">                                     
<input type=reset value="Clear" class="btn btn-default btn-block btn-danger">
</div>
 <div class="col-lg-6"> 
<input type=submit value="Register" class="btn btn-default btn-block btn-primary"><br>
</div>
</div>
</form>
