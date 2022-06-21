
let Navbar=()=> {
    
        return<nav className="navbar navbar-dark bg-dark navbar-expand-lg">
        <a href='#' className="navbar-brand">Navbar Component</a>
        <div className="ml-auto">
            <ul className="navbar-nav">
                <li className="nav-list">
                   
                    <a href="#" className="nav-link"><i class="fas fa-home"></i>Home</a>
                    
                </li>
                <li className="nav-list">
                    <a href="#" className="nav-link"><i class="fas fa-id-badge"></i>Contact Us</a>
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
    
}
export default Navbar