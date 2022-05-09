import { productReducer } from './Product/product.reducer'
import { combineReducers } from 'redux';
import { messageReducer } from './Message/message.reducer'
let rootReducer = combineReducers({ product: productReducer, message: messageReducer });
export { rootReducer }