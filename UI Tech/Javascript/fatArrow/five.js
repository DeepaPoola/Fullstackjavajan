var add = msg => "Good Morning";
console.log(add())

var add = msg => "Good Night";//if we use let it is not executed throws an error that add is already declared
console.log(add()) 
/*var wish= () =>{
    console.log("GM")
}
wish()//conflicts function overriding
var wish= () =>{
    console.log("GN")
}
wish()*/