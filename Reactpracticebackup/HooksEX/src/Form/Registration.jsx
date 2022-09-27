import React, { useState } from 'react'

const Registration = () => {
    let [terms, setTerms] = useState(false);
    let buttonRef = React.useRef(null)
    let acceptTermsAndCond = (event) => {
        //writing us logic
        console.log(event.target.checked)
        if (event.target.checked == true) {
            buttonRef.current.disabled = false
        }
        else {
            buttonRef.current.disabled = true
        }
    }
    return (
        <div className="container mt-5">
            <div className="row">
                <div className="col-md-5">
                    <div className="card">
                        <div className="card-header">
                            <h5>Registartion Page</h5>
                        </div>
                        <div className="card-body">
                            <form >
                                <div className="form-group">
                                    <input placeholder="User Name" type="text" className="form-control" place="User Name" />
                                </div>
                                <div className="form-group">
                                    <input placeholder="Email Id" type="text" className="form-control" place="User Name" />
                                </div>
                                <div className="form-group">
                                    <input placeholder="Mobile" type="text" className="form-control" place="User Name" />
                                </div>
                                <div className="form-check">
                                    <input type="checkbox" onClick={acceptTermsAndCond} className="form-check-input" />
                                    <label className="form-check-label">Accept Terms & Conditions</label>
                                </div>
                                <input type="submit" value="Registration" disabled ref={buttonRef} />
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Registration