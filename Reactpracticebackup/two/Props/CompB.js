import React from 'react'
class CompB extends React.Component{
    render(){
        return <div>
            <h2>Component B</h2>
            <pre>{JSON.stringify(this.props)}</pre>
            <h2>One:{this.props.one}</h2>
            <h2>Message:{this.props.Message}</h2>
            <h2>Name:{this.props.name}</h2>
        </div>
    }
}
export default CompB
