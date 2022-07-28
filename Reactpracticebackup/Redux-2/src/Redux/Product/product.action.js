//action types
const INCR="INCR"
const DECR="DECR"
//redux actions
let incrAction=()=>{
    console.log("First")
    return{type:INCR}
}
let decrAction=()=>{
    return{type:DECR}
}
export {INCR,DECR,incrAction,decrAction}
