let emp={id:101, sal:2500}
console.log(Object.keys(emp));
//check object is empty or not
/*if(Object.keys(emp).length==0)
{
    console.log("empty")
}
else{
    console.log("not empty")
}*/
Object.keys(emp).length==0?console.log("empty"):console.log("not empty")