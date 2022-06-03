import React, {Component} from 'react'
class Product extends Component{
    state={ 
        product:{
        pName:"realme C31 (Light Silver, 32 GB)",
        image:"https://rukminim1.flixcart.com/image/416/416/l1dwknk0/mobile/f/t/x/-original-imagcyj4unsxhadw.jpeg?q=70",
        price:9000,
        qty:1
        },
        productDetails:{}
    }
    incrHandler=()=>{
      this.setState({product:{...this.state.product,qty:this.state.product.qty+1}
    })
    }
    decrHandler=()=>{
        this.setState({product:{...this.state.product,qty:this.state.product.qty-1}})
    }
   render(){
       return <>
       <div className="container mt-5">
         <div className="row">
             <pre>{JSON.stringify(this.state)}</pre>
             <div className="col-md-7">
                 <table className="table table-hover">
                  <thead className="bg-info">
                      <th>Name</th>
                      <th>Image</th>
                      <th>Price</th>
                      <th>Quantity</th>
                      <th>Total Price</th>
                  </thead>
                  <tbody>
                      <tr>
                          <td>{this.state.product.pName}</td>
                          <td><img src={this.state.product.image} height="100px"/></td>
                          <td>{this.state.product.price}</td>
                          <td>{this.state.product.qty ? <>
                           <i className="fa fa-minus-circle" onClick={this.decrHandler}></i>
                          </> :null}
                            {this.state.product.qty}
                            <i className="fa fa-plus-circle" onClick={this.incrHandler}></i>
                          </td>
                          <td>{this.state.product.qty * this.state.product.price}</td>
                      </tr>
                  </tbody>
                 </table>
             </div>
         </div>
       </div>
       </>
   }
}
export default Product