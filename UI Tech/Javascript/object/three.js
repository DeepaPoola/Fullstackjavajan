let employees = {id:101, name :"sunny", salary:50000}
//read key and values
console.log(employees)
console.log(employees.id)
//read using for in
/*for(a in employees)
{
    //console.log(a)
    console.log(employees[a])

}*/
//updating values
/*employees.loc="guntur"
console.log(employees)
console.log(Object.keys(employees))//print keys
console.log(Object.values(employees))//print values*/
console.log(Object.entries(employees));//it gives like entries [ [ 'id', 101 ], [ 'name', 'sunny' ], [ 'salary', 50000 ] ]
 

