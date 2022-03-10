let employees =[{id:10,name:"Sunny",salary:50000},{id:20,name:"Deepa",salary:25000}]//creating object
//console.log(typeof(employees))
//console.log(employees)
//reading object
for( emp of employees){
    /*console.log(emp.id);
    console.log(emp.name);*/
    //console.log(Object.keys(emp))//print keys
    console.log(Object.values(emp))//print values
    
}
//updating object
employees.loc="Guntur"
console.log(employees)
