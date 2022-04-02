function CompD(props){
    return <div>
        <h3>Component D</h3>
        <pre>{JSON.stringify(props)}</pre>
        <h3>EmpId={JSON.stringify(props.Emp_Id)}</h3>
    </div>
}
export default CompD;