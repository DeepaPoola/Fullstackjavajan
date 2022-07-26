import React, { Component } from 'react'
import {Link} from 'react-router-dom'
class Navbar extends Component {
  render() {
    return (
     
      <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
        
        <Link to="#" className="navbar-brand">React Hooks</Link>
        <div className="ml-auto">
            <ul className="navbar-nav">
                <li className="nav-list">
                    <Link to="/useState" className="nav-link">useState Ex</Link>
                    </li>
                    <li className="nav-list">
                    <Link to="/counter" className="nav-link">Product</Link>
                </li>
            </ul>
        </div>
      </nav>
    )
  }
}

export default Navbar