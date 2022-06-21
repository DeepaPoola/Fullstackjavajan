import {BrowserRouter as Router,Route,Switch} from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import Home from './Dummy/Home'
import About from './Dummy/About'
import Contact from './Dummy/Contact'
import Login from './Dummy/Login'
let App=()=>{
    return <div>
        <Router>
            <Navbar/>
            <Login/>
            <Switch>
                <Route path="/home" component={Home}/>
                <Route path="/about" component={About}/>
                <Route path="/contact" component={Contact}/>
            </Switch>
        </Router>

    </div>
}
export default App