import React from 'react'
class Employee extends React.Component{
    render(){
        return <div>
            <h1>Employee Component</h1>
            <pre>{JSON.stringify(this.props)}</pre>
            <h2>Ename:{this.props.userdata[0].name}</h2>
            <h2>Eid:{this.props.userdata[1].id}</h2> 
        </div>
    }
}
export default Employee