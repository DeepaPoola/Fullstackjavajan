import React from 'react'
class CompD extends React.Component{
    render(){
        return <>
         <h3>Component D</h3>
         <pre>{JSON.stringify(this.props)}</pre>
         <h3>EmpId:{JSON.stringify(this.props.Emp_Id)}</h3>
        </>
    }
}
export default CompD;