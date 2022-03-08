/*function display(){
    document.getElementById("form1,next1");
    form1.style.left="-450px"
    form2.style.left="40px"
    progress.style.width="240px"
}
function data(){
    document.getElementById("form2,back1")
    form1.style.left="40px"
    form2.style.left="450px"
    progress.style.width="120px"
}
function forward(){
    document.getElementById("form2,next2");
    form2.style.left="-450px"
    form3.style.left="40px"
    progress.style.width="360px"
}
let move=()=>{
    document.getElementById("form3,back2");
    form2.style.left="40px"
    form3.style.left="450px"
    progress.style.width="240px"
}*/
function validate(){
    let email = document.getElementById("userEmail").value;
    let password = document.getElementById("userPassword").value;
    if (email == "") {
        document.getElementById("emailMessage").innerHTML = "Please Enter Email";
        return false
    }
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (email.match(regexEmail)) {
        return false;
    } else {
        document.getElementById("emailMessage").innerHTML = "Please Enter Proper Email";
        return false;
    }
    if (password == "" || password.length < 6) {
        document.getElementById("passwordMessage").innerHTML = "Please Enter Proper Password & Min 6 Char"
        return false
    }
}