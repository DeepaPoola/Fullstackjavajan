let CompD =(props)=>{
    return <div>
        <h2>Component D</h2>
        <pre>{JSON.stringify(props)}</pre>
        <h3>one:{props.one}</h3>
        <h3>Message:{props.Message}</h3>
        <h3>Name:{props.Name}</h3>
    </div>
}
export default CompD