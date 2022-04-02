import React, {Component} from 'react'
class Message extends Component{
  state ={
      qty : 1 ,
      msg :"Hello"
    
      
  }
  updateHandler=(qty)=>{
      this.setState({qty:qty})
      
  }
 render(){
      return <>
       <div>
        <div>{this.state.qty ? <> <i className="fa fa-plus-circle" onClick={this.updateHandler.bind(this,this.state.qty+1)}></i> </> : null}

        
       <h2>Quantity:{this.state.qty}</h2>
       <i className="fa fa-minus-circle" onClick={this.updateHandler.bind(this,this.state.qty-1)}></i></div>
       <h3>Message:{this.state.msg}</h3>
       <button onClick={()=>{
           this.setState({msg:"Good Morning"})
       }}>GM</button>
       
       
             
       </div>
     </>
 }
}
export default Message;