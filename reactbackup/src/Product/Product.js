import React, { Component } from 'react'

class Product extends Component {
    state = {
        product :{
        name: "realme 8 (Cyber Black, 128 GB)",
        image: "https://rukminim2.flixcart.com/image/312/312/kqjtd3k0/mobile/o/4/x/c11-2021-rmx3231-realme-original-imag4j4yrdt7d9cj.jpeg?q=70",
        price: 15999,
        qty: 1
        }
        
    }
    /*incrHandler = () => {
        this.setState({ product : {...this.state.product,qty:this.state.product.qty + 1 }})
    }
    decrHandler = () => {
        this.setState({product:{...this.state.product, qty:this.state.product.qty-1}})
     }*/
     updateHandler=(a,qty)=>{
         this.setState({...this.state.product,qty :qty})
     }
    render() {
        return (
            <div>
                <div className="container mt-5">
                    <div className="row">
                        <div className="col-md-7">
                            <table className="table table-hover">
                                <thead className="bg-info">
                                    <th>Name</th>
                                    <th>Image</th>
                                    <th>Price</th>
                                    <th>Qty</th>
                                    <th>Total Price</th>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>{this.state.product.name}</td>
                                        <td><img src={this.state.product.image} height="100px" /></td>
                                        <td>{this.state.product.price}</td>
                                        <td>{this.state.product.qty ? <>
                                            <i className="fa fa-minus-circle" onClick={this.updateHandler.bind(this.state.product.qty-1)}></i>
                                        </> : null}
                                        
                                        {this.state.product.qty}
                                            <i className="fa fa-plus-circle" onClick={this.updateHandler.bind(this,this.state.product.qty+1)}></i></td>
                                        <td>{this.state.product.qty * this.state.product.price}</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Product