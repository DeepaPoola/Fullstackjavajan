import React from 'react'
class CompB extends React.Component{
    render(){
        return <div>
            <h3>Component B</h3>
            <pre>{JSON.stringify(this.props)}</pre>
            <h4>Employee_Id:{JSON.stringify(this.props.Emp_id)}</h4>
            <h4>Employee_Name{JSON.stringify(this.props.Ename)}</h4>
        </div>
    }
}
export default CompB;