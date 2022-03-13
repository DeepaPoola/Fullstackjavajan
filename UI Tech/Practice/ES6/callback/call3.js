let calculate=(a,b,c)=>{
    let result;
    if(c=="add"){
           result= a+b
    }
    if(c=="multi")
    {
            result=a*b
    }
    return result
    
}
let result1=calculate(10,20,"multi")
console.log(result1)
