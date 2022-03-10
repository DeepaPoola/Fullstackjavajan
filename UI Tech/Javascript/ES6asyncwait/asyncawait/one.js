let employees =[{"id":1,"name":"Connor","email":"cwittrington0@bluehost.com","gender":"Female"},
{"id":2,"name":"Corey","email":"cmateus1@cdc.gov","gender":"Male"},
{"id":3,"name":"Brenden","email":"bbartoszek2@usda.gov","gender":"Male"},
{"id":4,"name":"Adlai","email":"abuckoke3@harvard.edu","gender":"Female"},
{"id":5,"name":"Horace","email":"hmacgiany4@latimes.com","gender":"Female"},
{"id":6,"name":"Ram","email":"rolanda5@opensource.org","gender":"Male"},
{"id":7,"name":"Jayson","email":"jjellings6@mozilla.org","gender":"Male"},
{"id":8,"name":"Verile","email":"vswains7@youtube.com","gender":"Female"},
{"id":9,"name":"Kellby","email":"kdommerque8@thetimes.co.uk","gender":"Male"},
{"id":10,"name":"Prissie","email":"pamerighi9@craigslist.org","gender":"Male"}]

let createEmployee=(emp)=>{
 return new Promise((resolve,reject)=>{
setTimeout(() => {

    employees.push(emp)
    let flag = true;
    flag ? resolve("Inserted Successfully") : reject("Unable insert New Employees");
}, 2000);
 });
}
let getEmployee = ()=>{
    setTimeout(() => {
       let rows=" " ;
       employees.forEach((emp)=>{
           rows+=`<tr>
           <td>${emp.id}</td>
           <td>${emp.name}</td>
           <td>${emp.email}</td>
           <td>${emp.gender}</td>
           </tr>`
       })
       document.getElementById("tbody-data").innerHTML = rows;
    }, 1000);
}
let run = async()=>{
await createEmployee({id:11,name:"Sunny",email:"sunnydeepa@gmail.com",gender:"Male"})
getEmployees()
}
run();

