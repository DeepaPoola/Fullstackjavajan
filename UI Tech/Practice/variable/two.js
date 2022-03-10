let a=10;
function add(){
    console.log(a)
}
//let a=20;//throws error i.e, a is already declared
function sub(){
    let a=20
    console.log(a)
}
add()
sub()