import {Link} from 'react-router-dom'
let Navbar =()=>{
    return <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
        <Link to="/home" className="navbar-brand">Routing</Link>
        <div className='ml-auto'>
          <ul className='navbar-nav'>
              <li className='nav-item'><Link to="/user" className='nav-link'>User</Link></li>
              <li className='nav-item'><Link to="/home" className='nav-link'>Home</Link></li>
              <li className='nav-item'><Link to="/About" className='nav-link'>About</Link></li>
              <li className='nav-item'><Link to="/Contact" className='nav-link'>Contact</Link></li>
          </ul>
        </div>
    </nav>
}
export default Navbar