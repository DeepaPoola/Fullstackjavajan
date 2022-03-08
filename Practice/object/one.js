let employees={id:10,name:"sunny",salary:50000}//object collection of key value pairs
//console.log(typeof(employees))
//console.log(employees)//print same format as what we have given 
/*console.log(employees.id)
console.log(employees.name)//print only values but we have to write many times like this
console.log(employees.salary)*/
for(a in employees){
    //console.log(a)//print only keys
    console.log(employees[a])//print values
}