import React from 'react'
import Employee from '../Employee/Employee'
class User extends React.Component{
    user=[{id:10,name:"Sunny"},{id:20,name:"Deepa"}]
    render(){
        return <div>
            <h1>User Component</h1>
            <hr/>
            <Employee userdata={this.user}/>
        </div>
    }
}
export default User