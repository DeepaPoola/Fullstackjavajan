import React, { Component } from 'react'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import Index from './Home/Index'
import ContactApp from './Contact/ContactApp'
 class App extends Component {
  render() {
    return (
 
      <Router>
          <Navbar/>
        <Routes>
            <Route path='/contact' element={<ContactApp/>}/>
            <Route path='/index' element={<Index/>}/>
        </Routes>
      </Router>
    )
  }
}

export default App