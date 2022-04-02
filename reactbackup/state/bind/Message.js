import React, {Component} from 'react'
class Message extends Component{
  state ={
      msg : "Hello",
    
      
  }
  updateHandler=(msg)=>{
      this.setState({msg:msg})
  }
 render(){
     return <>
       <div>
           <h2>Message:{this.state.msg}</h2>
           <button onClick={this.updateHandler.bind(this,"Good Morning")}>GM</button>
           <button onClick={this.updateHandler.bind(this,"Good Night")}>GN</button>
       </div>
     </>
 }
}
export default Message;