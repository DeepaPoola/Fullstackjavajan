let a=[10,20,30,40,50]//creating array
//reading array
for( b of a){
  console.log(b)
}
a.push(60);//updating value at last
console.log(a)
a.pop()//deleting array at last
console.log(a)
a.unshift(5)//upadting value at first index
console.log(a)
a.shift()//deleting value at first index
console.log(a)