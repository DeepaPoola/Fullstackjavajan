import React, { Component } from 'react'

class Product extends Component {
    state = {
        product_Name: "realme 8 (Cyber Black, 128 GB)",
        image: "https://rukminim2.flixcart.com/image/312/312/kqjtd3k0/mobile/o/4/x/c11-2021-rmx3231-realme-original-imag4j4yrdt7d9cj.jpeg?q=70",
        price: 15999,
        qty: 1
    }
    incrHandler = () => {
        this.setState({ qty: this.state.qty + 1 })
    }
    decrHandler = () => {
        this.setState({qty: this.state.qty - 1})
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
                                        <td>{this.state.product_Name}</td>
                                        <td><img src={this.state.image} height="100px" /></td>
                                        <td>{this.state.price}</td>
                                        <td>{this.state.qty ? <>
                                            <i class="fa fa-minus-circle" onClick={this.decrHandler}></i>
                                        </> : null}
                                        
                                            {this.state.qty}
                                            <i class="fa fa-plus-circle" onClick={this.incrHandler}></i></td>
                                        <td>{this.state.qty * this.state.price}</td>
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