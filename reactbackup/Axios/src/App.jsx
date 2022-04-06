import React , { Component } from 'react'
import Navbar from './Navbar/navbar'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Home from './Paths/Home'
import Contact from './Paths/Contact'
import About from './Paths/About'
import User from './User/User'
//import Login from './Form/Login'
//import Product from './Product/Product'
class App extends Component {
    render() {
    return (
    <div>
        <Router>
            <Navbar/>
            <Routes>
                <Route path="/user" element={<User/>}/>
                <Route path="/home" element={<Home/>}/>
                <Route path="/about" element={<About/>}/>
                <Route path="/contact" element={<Contact/>}/>
            </Routes>
        </Router>
        
      
        </div>
    )  
    } 
}
export default App