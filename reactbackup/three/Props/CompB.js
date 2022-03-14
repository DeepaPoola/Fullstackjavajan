import React from 'react'
class CompB extends React.Component{
    render(){
        return <div>
            <h3>Component B</h3>
            <pre>{JSON.stringify(this.props)}</pre>
        </div>
    }
}
export default CompB;