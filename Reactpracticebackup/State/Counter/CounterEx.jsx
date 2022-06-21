import React from 'react'
class Counter extends React.Component{
    state={
        qty:1
    }
    decHandler=()=>{
        this.setState({qty:this.state.qty-1})
    }
    incHandler=()=>{
        this.setState({qty:this.state.qty+1})
    }
    render(){
        return <>
         <h1>Counter Component</h1>
         <h1>Quantity:{this.state.qty}</h1>
         <button onClick={this.decHandler}>Decr</button>
         <button onClick={this.incHandler}>Incr</button>
        </>
    }
}
export default Counter