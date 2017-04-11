
$(document).ready(function(){
	var sunday=$('#sunday').attr('checked');
	var monday=$('#monday').attr('checked');
	var tuesday=$('#tuesday').attr('checked');
	var wednesday=$('#wednesday').attr('checked');
	var thursday=$('#thursday').attr('checked');
	var friday=$('#friday').attr('checked');
	var saturday=$('#saturday').attr('checked');
	if(sunday=='checked')
	{
		$('#sunday_time').show();
	} else
	{
		$('#sunday_time').hide();
	}
	if(monday=='checked')
	{
		$('#monday_time').show();
	} else
	{
		$('#monday_time').hide();
	}
	if(tuesday=='checked')
	{
		$('#tuesday_time').show();
	} else
	{
		$('#tuesday_time').hide();
	}
	if(wednesday=='checked')
	{
		$('#wednesday_time').show();
	} else
	{
		$('#wednesday_time').hide();
	}
	if(thursday=='checked')
	{
		$('#thursday_time').show();
	} else
	{
		$('#thursday_time').hide();
	}
	if(friday=='checked')
	{
		$('#friday_time').show();
	} else
	{
		$('#friday_time').hide();
	}
	if(saturday=='checked')
	{
		$('#saturday_time').show();
	} else
	{
		$('#saturday_time').hide();
	}
	
   
  
    $('#sunday').on('change', function(){
    	     	 if(this.checked)
    		 {
    		 $('#sunday_time').show();
    		 }else{
    			 $('#sunday_time').hide();
    		 }
     });
    $('#monday').on('change', function(){
    	 if(this.checked)
	 {
	      $('#monday_time').show();
	 }else{
		 $('#monday_time').hide();
	 }
});
    $('#tuesday').on('change', function(){
    	 if(this.checked)
	 {
	     $('#tuesday_time').show();
	 }else{
		 $('#tuesday_time').hide();
	 }
});
    $('#wednesday').on('change', function(){
    	 if(this.checked)
	 {
	     $('#wednesday_time').show();
	 }else{
		 $('#wednesday_time').hide();
	 }
});
    $('#thursday').on('change', function(){
    	 if(this.checked)
	 {
	     $('#thursday_time').show();
	 }else{
		 $('#thursday_time').hide();
	 }
});
    $('#friday').on('change', function(){
    	 if(this.checked)
	 {
	     $('#friday_time').show();
	 }else{
		 $('#friday_time').hide();
	 }
});
    $('#saturday').on('change', function(){
    	 if(this.checked)
	 {
	     $('#saturday_time').show();
	 }else{
		 $('#saturday_time').hide();
	 }
});
    
});
