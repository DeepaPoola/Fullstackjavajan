import React , { Component } from 'react'
import Navbar from './Navbar/navbar'
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom'
import Home from './Paths/Home'
import Contact from './Paths/Contact'
import About from './Paths/About'
//import Login from './Form/Login'
//import Product from './Product/Product'
class App extends Component {
    render() {
    return (
    <div>
        <Router>
            <Navbar/>
            <Switch>
                <Route path="/home" component={Home}/>
                <Route path="/About" component={About}/>
                <Route path="/Contact" component={Contact}/>
            </Switch>
        </Router>
        
      
        </div>
    )  
    } 
}
export default App