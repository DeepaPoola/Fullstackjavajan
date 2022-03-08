var a=10//it is not executed overriding by 20
function add(){
    //var a=30;
    console.log(a)
}
var a=20;//redeclaration is possible
function sub(){
    console.log(a)
}
add()
sub()