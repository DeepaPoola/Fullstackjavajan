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
         <span Style="margin:15px">
         <button onClick={this.messageHandler.bind(this,"Good Morning")}>GM</button>
         </span>
         <span Style="margin:15px">
         <button onClick={this.messageHandler.bind(this,"Good Evening")}>GE</button>
         </span>
         <span Style="margin:15px">
         <button onClick={this.messageHandler.bind(this,"Good Night")}>GN</button>
         </span>
         <span Style="margin:15px">
         <button onClick={()=>{
             this.setState({message:"Go for Lunch"})
         }}>GA</button>
      </span>
        </>
    }
}
export default Message