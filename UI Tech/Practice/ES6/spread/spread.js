/*let size = [38, 40, 42, 44]
let new_size = size;
size[0] = 39;
console.log(size);
console.log(new_size)*/
let a=[10,20,30,40]
let b=[];
for(c of a){
    b.push(c)
    
}
//b[0]=5//instead of 10 , 5 will be printed
b.unshift(5)
console.log(b)
console.log(a)