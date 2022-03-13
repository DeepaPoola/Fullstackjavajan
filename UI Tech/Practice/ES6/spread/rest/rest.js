//rest operator used for functions
/*function add(a){
    console.log(a)
}
add(10)
add(10,20)
add(10,20,30)*/
/*function add(a,...b){
    console.log(b)
}
add(10)
add(10,20)
add(10,20,30)*/
let add=(a,...b)=>{
  console.log(b)
}
add(10)
add(10,20)
add(10,20,30)