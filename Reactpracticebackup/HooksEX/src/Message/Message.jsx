import React, { useState } from 'react'
let Message = () => {
    
    let [counter, setCounter] = useState(0);
    let [message, setMessage] = useState("Hello")
    let [marks, setMarks] = useState([10, 20, 30])
    let [product, setProduct] = useState({});


    return <div>
        <h2>Message Component : {message}</h2>
        <button onClick={() => { setMessage("GM") }}>GM</button>
        <button onClick={() => { setMessage('GN') }}>GN</button>
    </div>
}
export default Message