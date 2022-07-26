import React, { Component } from 'react'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import Message from './Message/Message'
import {Provider} from 'react-redux'
import {store} from './Redux/store'
 class App extends Component {
  render() {
    return (
      <Provider store={store}>
      <Router>
          <Navbar/>
        <Routes>
            <Route path="/reduxEx" element={<Message/>}/>
            
        </Routes>
      </Router>
      </Provider>
    )
  }
}

export default App