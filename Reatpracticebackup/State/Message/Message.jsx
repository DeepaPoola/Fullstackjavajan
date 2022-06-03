import React from 'react'
class Message extends React.Component{
    state={
        message:"Hello"
    }
    gmHandler=()=>{
        this.setState({message:"Good Morning"})
        console.log("testcase 2")
    }
    gaHandler=()=>{
        this.setState({message:"Good Afternoon"})
        
    }
    gnHandler=()=>{
        this.setState({message:"Good Night"})
        
    }
    render(){
        console.log("testcase 1")
        return <>
         <h1>Message:{this.state.message}</h1>
         <button onClick={this.gmHandler}>GM</button>
         <button onClick={this.gaHandler}>GA</button>
         <button onClick={this.gnHandler}>GN</button>
        </>
    }
}
export default Message