import React, { Component } from 'react'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
//import {Provider} from 'react-redux'
//import {store} from './Redux/store'
import Register from './RegisteruseRefhook/Register'
import Signup from './RegisteruseRefhook/Signup'
 class App extends Component {
  render() {
    return (
     
      <Router>
          <Navbar/>
        <Routes>
            <Route path="/register" element={<Register/>}/>
            <Route path="/signup" element={<Signup/>}/>
        </Routes>
      </Router>
      
    )
  }
}

export default App