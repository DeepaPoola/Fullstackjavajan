import React from 'react'
import employees from './Data'
class Employee extends React.Component{
    render(){
        return (
       <div className="container mt-5">
         <div className="row">
             <div className="col-md-8">
              <table className="table table-hover">
                  <thead className="bg-dark text-white">
                      <tr>
                          <th>Id</th>
                          <th>First_Name</th>
                          <th>Last_Name</th>
                          <th>Email</th>
                          <th>Gender</th>
                      </tr>
                  </thead>
                  <tbody>
                      {
                         employees.map((employee)=>{
                          return <tr >
                              <td>{employee.id}</td>
                              <td>{employee.first_name}</td>
                              <td>{employee.last_name}</td>
                              <td>{employee.email}</td>
                              <td>{employee.gender}</td>
                          </tr>
                         })
                        }
                  </tbody>
              </table>
             </div>
        </div>
        </div>
        )

    }
}
export default Employee