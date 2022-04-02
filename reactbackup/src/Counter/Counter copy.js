import React from 'react'
class Counter extends React.Component{
    state={
      quaty:1
    }
    incHandler=()=>{
      this.setState({quaty:this.state.quaty+1})
    }
    decHandler=()=>{
      this.setState({quaty:this.state.quaty-1})
    }
    render(){
        return <>
          <h1>Counter Component</h1>
          <h1>Quatity:{this.state.quaty}</h1>
          <button onClick={this.incHandler}>Increment</button>
          <button onClick={this.decHandler}>Decrement</button>
        </>
    }
}
export default Counter