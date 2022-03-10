let employees =[{id:10,name:"poola",salary:50000},{id:20,name:"deepa",salary:25000}]
let createEmployee = (emp,me)=>{
    setTimeout(()=>{
    employees.push(emp);
    me()
    },2000)//execute in 2 sec
}
let getEmployee=()=>{
    setTimeout(()=>{
     let rows =" "
     employees.map((employee)=>{
         rows +=`<tr>
                  <td>${employee.id}</td>
                  <td>${employee.name}</td>
                  <td>${employee.salary}</td>
                 </tr>`
     })
     document.getElementById('data').innerHTML=rows;
    },1000)//execute in 1 sec
    
}
createEmployee({id:30,name:"Sunny",salary:50000},getEmployee)
//getEmployee()//if we declare here it is not updated 3rd value