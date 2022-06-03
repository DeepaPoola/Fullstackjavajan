import React from 'react'
import CompD from './CompD'
class CompC extends React.Component{
     message="Good Morning"
     emp={id:10,name:"Sunny"}
    render(){
        return <div>
            <h1>Component C</h1>
            <CompD one={"GM"} Message={this.message} Name={this.emp.name}/>
            </div>

    }
}
export default CompC