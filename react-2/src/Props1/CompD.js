function CompD(props){
    return <>
    <h3>Component D</h3>
        <pre>{JSON.stringify(props)}</pre>
        <h3>Empid:{props.Emp_id}</h3>
        <h3>EmpName:{props.Ename}</h3>
    </>
}
export default CompD;