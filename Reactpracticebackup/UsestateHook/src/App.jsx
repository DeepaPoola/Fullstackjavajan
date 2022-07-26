import React, { Component } from 'react'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import Message from './Hook/Message'
import Counter from './Hook/Counter'
 class App extends Component {
  render() {
    return (
 
      <Router>
          <Navbar/>
        <Routes>
            <Route path="/useState" element={<Message/>}/>
            <Route path='/counter' element={<Counter/>}/>
        </Routes>
      </Router>
    )
  }
}

export default App