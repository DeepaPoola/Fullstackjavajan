//action types
const GM="GM"
const GN="GN"
//action
let gmAction=()=>{
    console.log("Test gmAction")
    return {type:GM}
}
let gnAction=()=>{
    console.log("Test gnAction")
    return {type:GN}
}
export {gmAction,gnAction,GM,GN}
//action - is a function,it return actionable objects