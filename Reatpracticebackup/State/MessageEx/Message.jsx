import React from 'react'
class Message extends React.Component{
    message="Hello"
    gmHandler=()=>{
     console.log("testcase 123")
     this.message="Good Morning"
     console.log(this.message)
     this.forceUpdate()
    }
    render(){
        return <>
         <h1>Message Component</h1>
         <h2>Message:{this.message}</h2>
         <button onClick={this.gmHandler}>GM</button>
         <button>GN</button>
         
       
        </>
    }
}
export default Message