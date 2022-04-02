import React from 'react'
import CompD from './CompD'
class CompC extends React.Component{
    id=10;
    name="Sunny";
    render(){
      return <>
           <h2>Component C</h2>
           <hr/>
           <CompD Emp_id={this.id} Ename={this.name}/>
           </>
    }
}
export default CompC;
