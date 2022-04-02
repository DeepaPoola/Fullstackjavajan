import React, {Component} from 'react'
class Employee extends Component{
    constructor(props){
     super(props)
     console.log("First constructor")
     this.state ={
         currentTime:new Date().toLocaleTimeString()
     }
    }
    render(){
        console.log("Second render")
        return <div>
            <h1>Component</h1>
            <h3>Time:{this.state.currentTime}</h3>
        </div>
    }
}
export default Employee;