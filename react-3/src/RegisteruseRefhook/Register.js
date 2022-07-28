import React,{useRef} from 'react'
import image from '../Assets/Images/tcs.png'
const Register = () => {
    let imageE1=useRef(null)
    let clickHandler=()=>{
        console.log(imageE1.current)
    }
  return (
    <React.Fragment>
        <img src={image} alt=" " ref={imageE1}/>
        <button onClick={clickHandler}>Click</button>
    </React.Fragment>
  )
}

export default Register