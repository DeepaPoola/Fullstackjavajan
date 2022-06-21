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
         <div className="container mt-5">
          <div className="row">
              <div className="col-md-6">
                  <div className="card">
                      <div className="card-header">
                        <h4>Quantity:{this.state.qty}</h4>
                      </div>
                      <div className="card-body">
                          <button className="btn btn-success mr-5" onClick={this.decHandler}>Decr</button>
                          <button className="btn btn-warning" onClick={this.incHandler}>Incr</button>
                        </div>
                  </div>
              </div>
          </div>
         </div>
        </>
    }
}
export default Counter