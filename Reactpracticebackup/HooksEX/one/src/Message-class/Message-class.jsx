import React, { Component } from 'react'

class Message extends Component {
    constructor(props) {
        super(props)
        this.state = {
            message: "Hello"
        }
    }
    gmHandler = () => {

        this.setState({ message: "GM" })
    }
    componentDidMount(){}  //birth of component
    componentWillUpdate(){} //update of state
    componentWillUnmount(){} //death
    render() {
        return (
            <div>
                <h1>{this.state.message}</h1>
                <button onClick={this.gmHandler}>GM</button>
            </div>
        )
    }
}
export default Message