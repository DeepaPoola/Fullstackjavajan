import React from 'react'
class Login extends React.Component{
    state={
      username:" ",
      email:" ",
      password:" ",
      mobile:" ",
      termsconditions:false
    }
    updateFormHandler = (event) => {
      this.setState({ [event.target.name]: event.target.value })
  }
  submitHandler = (event) => {
      event.preventDefault();
      console.log(this.state)
  }
    render(){
      return <div className="container mt-6">
        <pre>{JSON.stringify(this.state)}</pre>
        <div className="row">
          <div className="col-md-5">
             <div className="card">
               <div className="card-header">
               <h1>Registration Form</h1>
               </div>
               <div className="card-body">
                 <form onSubmit={this.submitHandler}>
                   <div className="form-group">
                     <input type="text" className="form-control" name="username" placeholder="Name" onChange={this.updateFormHandler}/>
                   </div>
                   <div className="form-group">
                     <input type="email" className="form-control" name="email" placeholder="Email" onChange={this.updateFormHandler}/>
                   </div>
                   <div className="form-group">
                     <input type="password" className="form-control" name="password" placeholder="Password" onChange={this.updateFormHandler}/>
                   </div>
                   <div className="form-group">
                     <input type="number" className="form-control" name="mobile" placeholder="Mobile" onChange={this.updateFormHandler}/>
                   </div>
                   <div>
                     <input type="checkbox"/>Please accept Terms&Conditions
                   </div>
                   <div className="form-group">
                     <input type="submit" className="btn btn-primary"/>
                   </div>
                 </form>
               </div>
             </div>
          </div>
        </div>

      </div>
    }
}
export default Login