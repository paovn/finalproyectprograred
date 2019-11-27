document.addEventListener('DOMContentLoaded',init, false);

var ccTXT;
var nameTXT;
var lastnameTXT;
var ageTXT;
var phoneTXT;
var emailTXT;
var doctorTXT;

var registerBTN;

function init(){
	  ccTXT = document.getElementById("ccTXT");
	    nameTXT = document.getElementById("nameTXT");
	    lastnameTXT = document.getElementById("lastnameTXT");
	    ageTXT = document.getElementById("ageTXT");
	    
	    phoneTXT = document.getElementById("phoneTXT");
	    emailTXT = document.getElementById("emailTXT");
	    doctorTXT=document.getElementById("doctorTXT");
	    registerBTN=document.getElementById("registerBTN");
	    
	
	    
	    registerBTN.addEventListener("click", ()=> {
	    	
	    	var patient= new Patient(nameTXT.value,lastnameTXT.value,doctorTXT.value,phoneTXT.value,emailTXT.value,ageTXT.value,ccTXT.value);
	    	var json= patient.toJson();
	    	console.log(json);
            alert("The Patient has been saved");
            alert(json);
	    	sendPost(json);
	    	 
	     });
}




function sendPost(json){
	var http=new XMLHttpRequest();
	http.onreadystatechange = function(){
				if(this.readyState==4 && this.status==200){
					alert(this.responseText);
					//insertSalida.innerHTML=this.responseTXT;
		}
		 
	}
	http.open("POST","web/patient/insert");
	http.setRequestHeader("Content-Type","application/json");
	http.send(json);
}


