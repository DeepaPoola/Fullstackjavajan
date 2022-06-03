import CompB from './CompB'
let CompA=()=>{
    let message="Good evening"
    return <div>
        <h1>Component A</h1>
        <hr/>
        <CompB one={"GM"} Message={message} name={"Sunny"}/>
    </div>
}
export default CompA