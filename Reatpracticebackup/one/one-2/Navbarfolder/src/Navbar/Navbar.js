//import React from 'react'
import React,{Component} from 'react'
/*let Navbar=()=>{
   return <nav>
       <a href="#">Navbar Component</a>
   </nav>
}*/

class  Navbar extends Component{
    render(){
        return(
<nav className="navbar navbar-dark bg-dark navbar-expand-lg">
                <a href='#' className="navbar-brand">Navbar Component</a>
                <div className="ml-auto">
                    <ul className="navbar-nav">
                        <li className="nav-list">
                            <a href="#" className="nav-link">Home</a>
                        </li>
                    
                        <li className="nav-list">
                            <a href="#" className="nav-link">Contact Us</a>
                        </li>
                    
                   
                        <li className="nav-list">
                            <a href="#" className="nav-link">About Us</a>
                        </li>
                        
                        <li className="nav-list">
                            <a href="#" className="nav-link">Feedback</a>
                        </li>
                    </ul>
                </div>
            </nav>
        )
    }
}

export default Navbar