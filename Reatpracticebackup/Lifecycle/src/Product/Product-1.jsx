import React, {Component} from 'react'
class Product extends Component{
    state={
        pName:"realme C31 (Light Silver, 32 GB)",
        image:"https://rukminim1.flixcart.com/image/416/416/l1dwknk0/mobile/f/t/x/-original-imagcyj4unsxhadw.jpeg?q=70",
        price:10000,
        qty:1
    }
    incrHandler=()=>{
        this.setState({qty:this.state.qty+1})
    }
    decrHandler=()=>{
        this.setState({qty:this.state.qty-1})
    }
    render(){
        return <>
         <div className="container mt-5">
             <div className="row">
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
                            <td>{this.state.pName}</td>
                            <td><img src={this.state.image} height="100px"/></td>
                            <td>{this.state.price}</td>
                            <td>
                                <i className="fa fa-minus-circle" onClick={this.decrHandler}></i>
                                {this.state.qty}
                                <i className="fa fa-plus-circle" onClick={this.incrHandler}></i>
                            </td>
                            <td>{this.state.qty*this.state.price}</td>
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