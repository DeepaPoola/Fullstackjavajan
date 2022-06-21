//import React from 'react'
/*class Message extends React.Component{
    message = "Good Morning";
    name="Sunny"
    emp ={id:10,ename:"Deepa",salary:30000}
    render(){
        return <div>
            <h2 style={{color: "pink"}}>Message Componnet</h2>
            <h3 style={{backgroundColor: "lightblue"}}>Message:{this.message}</h3>
            <h3>Name:{this.name}</h3>
            <h4>Emp Id:{this.emp.id} and Salary:{this.emp.salary}</h4>
        </div>
    }
}*/
let Message=()=>{
var message="Good Morning"
var emp={id:10,name:"Sunny",salary:30000}
return <div>
    <h2>Message Component</h2>
    <h3>Message:{message}</h3>
    <h4>Emp Id:{emp.id} and Salary:{emp.salary}</h4>
</div>
}
export default Message