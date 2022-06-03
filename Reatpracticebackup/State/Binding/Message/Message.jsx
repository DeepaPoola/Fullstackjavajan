import React from 'react'
class Message extends React.Component{
    state={
      message:"Hello"
    }
    messageHandler=(message)=>{
        this.setState({message:message})
        console.log("Testcase 2")
    }
    
    render(){
        console.log("Testcase 1")
        return <>
         <h1>Message:{this.state.message}</h1>
         <button onClick={this.messageHandler.bind(this,"Good Morning")}>GM</button>
         <button onClick={this.messageHandler.bind(this,"Good Evening")}>GE</button>
         <button onClick={this.messageHandler.bind(this,"Good Night")}>GN</button>
         <button onClick={()=>{
             this.setState({message:"Go for Lunch"})
         }}>GA</button>
      
        </>
    }
}
export default Message