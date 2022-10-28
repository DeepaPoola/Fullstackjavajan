import React from 'react'
import Navbar from './Navbar/Navbar'
import {BrowserRouter as Router,Link,Route,Routes} from 'react-router-dom'
import Home from './Product/Home'
import Products from './Product/Products'
import Admin from './Product/Admin'
import UpdateProduct from './Product/UpdateProduct'
const App = ()=>{
  return (
    <div>
      <Router>
        <Navbar/>
        <Routes>
          <Route path="/home" element={<Home/>}/>
          <Route path="/products" element={<Products/>}/>
          <Route path="/admin" element={<Admin/>}/>
          <Route path="/create" element={<Home/>}/>
          <Route path="/update" element={<UpdateProduct/>}/>
          
        
        </Routes>
      </Router>
    </div>
  )
}

export default App;
