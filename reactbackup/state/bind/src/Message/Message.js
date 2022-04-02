import React, {Component} from 'react'
class Message extends Component{
  state ={
      product :{
      qty : 1 ,
      msg :"Hello"
    
      } 
  }
  updateHandler=(qty)=>{
      this.setState({...this.state.product,qty:qty})
      
  }
 render(){
      return <>
       <div>
        <div>{this.state.product.qty ? <> <i className="fa fa-plus-circle" onClick={this.updateHandler.bind(this,this.state.product.qty+1)}></i> </> : null}

        
       <h2>Quantity:{this.state.product.qty}</h2>
       <i className="fa fa-minus-circle" onClick={this.updateHandler.bind(this,this.state.product.qty-1)}></i></div>
       <h3>Message:{this.state.product.msg}</h3>
      
       
       
             
       </div>
     </>
 }
}
export default Message;