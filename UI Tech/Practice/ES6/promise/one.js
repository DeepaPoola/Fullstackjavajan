let employees = [{ id: 101, name: "Rahul Gandhi", salary: 45000 },
{ id: 102, name: "Sonia Gandhi", salary: 55000 }]
let createEmployee = (emp) => {
    return new Promise((resolve,reject)=>{
        let flag=true;
        setTimeout(() => {
            employees.push(emp) ;
            flag ? resolve("inserted succesfully") : reject("Not Inserted")
             
    }, 2000);
    });   
}
let getEmployee = () => {
    setTimeout(() => {
        let rows = ""
        employees.forEach((employee) => {
            rows += `<tr>
                      <td>${employee.id}</td>   
                      <td>${employee.name}</td>   
                      <td>${employee.salary}</td>   
                    </tr>`
        })
        document.getElementById('data').innerHTML = rows;
    }, 1000);
}
createEmployee({ id: 103, name: "Priyanka Gandhi", salary: 65000 })
.then((msg)=>{
  console.log(msg)
  getEmployee()
})
.catch((error)=>{
    console.error(error)
})