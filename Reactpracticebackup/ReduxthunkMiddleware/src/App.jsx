import React, { Component } from 'react'
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import {Provider} from 'react-redux'
import {store} from './Redux/store'
import User from './User/User'
 class App extends Component {
  render() {
    return (
      <Provider store={store}>
      <Router>
          <Navbar/>
        <Routes>
            <Route path="/user" element={<User/>}/>

        </Routes>
      </Router>
      </Provider>
    )
  }
}

export default App