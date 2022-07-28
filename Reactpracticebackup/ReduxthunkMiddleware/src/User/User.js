import React, { useEffect } from 'react'
import {useDispatch,useSelector} from 'react-redux'
import {loadDataAction} from '../Redux/User/user.action'
const User = () => {
    let dispatch=useDispatch();
    let users=useSelector((state)=>{
        return state.users
    })
    useEffect(()=>{
        //dispatch an action
        dispatch(loadDataAction())
    },[])
  return (
    <div>
        <h1>User</h1>
        <pre>{JSON.stringify(users)}</pre>
    </div>
  )
}

export default User
