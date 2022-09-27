import React, { Component } from 'react'
//import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'

//import {Provider} from 'react-redux'
//import {store} from './Redux/store'
//import Message from './Message/Message'
//import User from './User/User'
import Registration from "./Form/Registration"
 class App extends Component {
  render() {
    return (
     
      <div>

      <nav className='navbar navbar-dark bg-dark'>
        <a className="navbar-brand" href="#">Registration Example</a>
      </nav>
        {/*<User /> */}
        {/*<Message> */}
        <Registration/>
     
    </div>
  )
      
    
  }
}

export default App