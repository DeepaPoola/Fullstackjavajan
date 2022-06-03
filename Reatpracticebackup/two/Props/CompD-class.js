import React from 'react'
class CompD extends React.Component{
    render(){
        return <div>
            <h1>Component D</h1>
            <pre>{JSON.stringify(this.props)}</pre>
            <h2>Message:{this.props.Message}</h2>
            <h2>one:{this.props.one}</h2>
            <h2>one:{this.props.Name}</h2>
            

        </div>
    }
}
export default CompD