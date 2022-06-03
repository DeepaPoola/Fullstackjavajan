import React from 'react'
class Login extends React.Component{
    state={
        email:" ",
        password:" "
    }
    emailHandler=(event)=>{
      console.log(event.target.value)
    }
    passwordHandler=(event)=>{
        console.log(event.target.value)
        this.setState({password:event.target.value})
      }
      submitHandler=(event)=>{
        event.preventDefault()
        console.log(this.state)
      }
    render(){
        return <div>
        <h1>Login Form</h1>
        <pre>{JSON.stringify(this.state)}</pre>
        <form onSubmit={this.submitHandler}>
            <label>Email</label>
            <input type="text" onChange={this.emailHandler}/>
            <br/>
            <label>Password</label>
            <input type="password" onChange={this.passwordHandler}/>
            <br/>
            <input type="submit" value="Login"/>
        </form>
        </div>
    }
}
export default Login