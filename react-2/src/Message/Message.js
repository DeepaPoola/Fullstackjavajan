import React from 'react'
class Message extends React.Component{
    message="Hello! Sunny"
    name= "Nallapu Sunny"
    render(){
        return <div>
            <h5>Message:{this.message}</h5>
            <h4>Name:{this.name}</h4>
        </div>
    }
}
export default Message