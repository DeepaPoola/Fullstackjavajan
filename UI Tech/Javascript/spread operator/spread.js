let a =[10,20,30];
let b=[];
for(x of a){
    b.push(x)
}
a[0]=5
console.log(a)
console.log(b)
//spread operator use in array and object