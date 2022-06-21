import {BrowserRouter as Router,Route,Routes} from "react-router-dom"
import Navbar from './Navbar/Navbar'
import Home from './Dummy/Home'
import About from './Dummy/About'
import Contact from './Dummy/Contact'
import User from './Axios/User'
let App=()=>{
    return <div>
       <Router>
           <Navbar/>
           
           <Routes>
               {/*<Route exact path="/" element={<Home/>}/>*/}
               <Route path="/user" element={<User/>}/>
               <Route path="/home" element={<Home/>}/>
               <Route path="/about" element={<About/>}/>
               <Route path="/contact" element={<Contact/>}/>
           </Routes>
       </Router>
    </div>
}
export default App