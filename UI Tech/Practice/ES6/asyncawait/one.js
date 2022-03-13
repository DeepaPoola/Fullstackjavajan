let employees = [{ id: 10, name: "Sunny", salary: 45000 },
{ id: 20, name: "Deepa", salary: 55000 }]
let createEmployee = (emp) => {
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
            employees.push(emp) ;
            let flag=true;
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
/*(async () => {
    await createEmployee({ id: 103, name: "Rahul", salary:25000 })
    getEmployee()
})
    (); */
let run=async() => {
    await createEmployee({ id: 30, name: "Nallapu",salary:25000 })
    getEmployee()
}
run();