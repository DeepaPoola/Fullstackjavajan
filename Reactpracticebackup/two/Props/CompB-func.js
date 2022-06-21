
let CompB=(props)=>{
    return <div>
        <h1>Component B</h1>
        <pre>{JSON.stringify(props)}</pre>
        <h4>one:{props.one}</h4>
        <h3>Name:{props.name}</h3>
        <h3>Name:{props.Message}</h3>
    </div>
}
export default CompB
