import {Link} from 'react-router-dom'
let Navbar=()=>{
    return <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
       {/*} <div className="navbar-brand">
            <h1>Navbar</h1>
       </div>*/}
        <Link to="#" className="Navbar-brand">Router6</Link>
        <div className="ml-auto">
            <ul className="navbar-nav">
                <li className="nav-list"><Link to="/home" className="nav-link">Home</Link></li>
                <li className="nav-list"><Link to="/about" className="nav-link">About</Link></li>
                <li className="nav-list"><Link to="/contact" className="nav-link">Contact</Link></li>
            </ul>
        
        </div>
    </nav>
}
export default Navbar