const employees = require('./employees.js')

function displayData() {
    
    let row = ""
    for (emp of employees) {
        
        row = row + `<tr>   <td> ${emp.id}</td>
                            <td> ${emp.name.toUpperCase()}</td>
                            <td> ${emp.email}</td> 
                      <tr>`
                     
    }
    document.getElementById('tbody_Data').innerHTML = row
}
