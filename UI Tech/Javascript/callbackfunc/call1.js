let calculate=(a,b,c)=>{
    let result;
    if(c=="sum"){
        result=a+b
    }
    if(c=="multi"){
       result = a*b;
    }
    return result;
}
let  result1=calculate(10,20,"sum");
let result2=calculate(10,20,"multi")
console.log(result1)
console.log(result2)