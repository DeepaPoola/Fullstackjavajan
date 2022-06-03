import React, {Component} from 'react'
class Product extends Component{
    state={
        product:{
        pName:"realme C31 (Light Silver, 32 GB)",
        image:"https://rukminim1.flixcart.com/image/416/416/l1dwknk0/mobile/f/t/x/-original-imagcyj4unsxhadw.jpeg?q=70",
        price:9000,
        qty:1
        },
        product1:{
            pName:"realme C31 (Light Silver, 32 GB)",
            image:"https://rukminim1.flixcart.com/image/416/416/l1dwknk0/mobile/f/t/x/-original-imagcyj4unsxhadw.jpeg?q=70",
            price:10000,
            qty:1
            }
    }
    incrdecrHandler=(qty)=>{
      this.setState({product:{...this.state.product,qty:qty}
      
    })
    }
    decrincrHandler=(qty)=>{
        this.setState({product1:{...this.state.product1,qty:qty}
        
      })
      }
   
   render(){
       return <>
       <div className="container mt-5">
         <div className="row">
            
             <div className="col-md-7">
                 <table className="table table-hover">
                 <thead className="bg-info">
                      <th>Image</th>
                      <th>Name</th>
                      <th>Price</th>
                      <th>Quantity</th>
                      <th>Total Price</th>
                  </thead>
                  <tbody>
                      <tr>
                          
                      <td><a href="#"><img src={this.state.product.image} height="200px"/></a></td>
                          <td><b>{this.state.product.pName}</b>
                          <ul>
                              <li>3 GB RAM| 32 GB ROM| Expandable Upto 1 TB</li>
                              <li>16.56 cm(6.52 inch) HD Display</li>
                          </ul></td>
                          
                         
                          <td>{this.state.product.price}</td>
                          <td>{this.state.product.qty ? <>
                           <i className="fa fa-minus-circle" onClick={this.incrdecrHandler.bind(this,this.state.product.qty-1)}></i>
                          </> :null}
                            {this.state.product.qty}
                            <i className="fa fa-plus-circle" onClick={this.incrdecrHandler.bind(this,this.state.product.qty+1)}></i>
                          </td>
                          <td>{this.state.product.qty * this.state.product.price}</td>
                          
                      </tr>
                      
                  </tbody>
                 </table>
             </div>
             <div className="col-md-5">
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
                          <td>{this.state.product1.pName}</td>
                          <td><img src={this.state.product1.image} height="100px"/></td>
                          <td>{this.state.product1.price}</td>
                          <td>{this.state.product1.qty ? <>
                           <i className="fa fa-minus-circle" onClick={this.decrincrHandler.bind(this,this.state.product1.qty-1)}></i>
                          </> :null}
                            {this.state.product1.qty}
                            <i className="fa fa-plus-circle" onClick={this.decrincrHandler.bind(this,this.state.product1.qty+1)}></i>
                          </td>
                          <td>{this.state.product1.qty * this.state.product1.price}</td>
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