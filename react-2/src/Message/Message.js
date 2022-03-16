import React from 'react'
class Message extends React.Component {
    state ={
        message : "Hello"
    }
    gmHandler=()=>{
        console.log("Test Two")
        this.setState({message:"Good Morning"})
    }
    gaHandler=()=>{
      this.setState({message:"Good Afternoon"})
    }
    render(){console.log("Test One")
        return <>
        <h1>Message component</h1>
        <h1>Message:{this.state.message}</h1>
        <button onClick={this.gmHandler}>Hello</button>
        <button onClick={this.gaHandler}>Bye</button>
        </>
    }
    
    
}


export default Message