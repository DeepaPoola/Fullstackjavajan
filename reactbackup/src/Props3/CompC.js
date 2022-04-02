import CompD from './CompD'
let CompC=()=>{
    let id=10;
    let name="Sunny"
    return <div>
          <h2>Component C</h2>
          <hr/>
          <CompD Emp_Id={id} Empname={name}/>
    </div>
}
export default CompC;