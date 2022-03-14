import React from 'react'
import CompB from './CompB'
class CompA extends React.Component{
    id=10;
    name="Sunny"
    render(){
      return <>
           <h2>Component A</h2>
           <hr/>
           <CompB one={"GE"} two={"GM"}/>
           </>
    }
}
export default CompA;