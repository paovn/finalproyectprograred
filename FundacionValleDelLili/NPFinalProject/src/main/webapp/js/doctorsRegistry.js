document.addEventListener('DOMContentLoaded', init,false);

var ccTXT;
var nameTXT;
var surnameTXT;
var ageTXT;
var phoneTXT;
var emailTXT;
var passwordTXT;
var verifypasswordTXT;
var registerBTN;

function init(){

    ccTXT = document.getElementById("ccTXT");
    nameTXT = document.getElementById("nameTXT");
    surnameTXT = document.getElementById("surnameTXT");
    ageTXT = document.getElementById("ageTXT");
    phoneTXT = document.getElementById("phoneTXT");
    emailTXT = document.getElementById("emailTXT");
    passwordTXT = document.getElementById("passwordTXT");
    verifypasswordTXT = document.getElementById("verifypasswordTXT");
    registerBTN = document.getElementById("registerBTN");
    
    
    registerBTN.addEventListener("click",()=>{
        console.log("CC" + ccTXT.value);
        console.log("name" + nameTXT.value);
        var doctor = new Doctor(ccTXT.value,nameTXT.value,surnameTXT.value,ageTXT.value,phoneTXT.value,emailTXT.value,passwordTXT.value);
        var json = doctor.toJson();
        console.log(json);
        insertDoctor(json); 
    });

}

function insertDoctor(json){
    var http = new XMLHttpRequest();
    http.onreadystatechange = function(){
        if(this.readyState == 4 && this.status == 200){
            insertSalida.innerHTML = this.responseText;
            alert("The doctor has been saved");
        }
    }
    http.open("POST", "web/doctor/insert");
    http.setRequestHeader("Content-Type","application/json");
    http.send(json);
}


