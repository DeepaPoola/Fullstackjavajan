let calculate=(a,b,x)=>{
  return x(a,b)
 
}
let add=(a,b)=>{
    return a+b
}
let multi=(a,b)=>{
    return a*b
}
let result = calculate(10,20,multi)
console.log(result)