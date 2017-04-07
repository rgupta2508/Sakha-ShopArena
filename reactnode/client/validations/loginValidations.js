import Validator from 'validator';
import isEmpty from 'lodash/isEmpty';

export default function validateInput(data) {
  let errors = {};
  // if(data.mobile_no.length != 10) {
  //   errors.mobile_no = "email id should contain @";
  // }

  if(!Validator.isEmail(data.mobile_no)) {
    errors.mobile_no = "Should enter a valid email";
  }

  if(Validator.isEmpty(data.mobile_no)) {
    errors.mobile_no = "Please enter Email id";
  }

  if( data.password.length < 6 || data.password.length > 15 ) {
    errors.password = "Password should be between 6 and 15 characters long";
  }

  if(Validator.isEmpty(data.password)) {
    errors.password = "Please enter password";
  }

  return {
    errors,
    isValid:isEmpty(errors)
  }
}
