import Validator from 'validator';
import isEmpty from 'lodash/isEmpty';

export default function validateInput(data) {
  let errors = {};
  // if(data.mobile_no.length != 10) {
  //   errors.mobile_no = "Mobile Number should contain 10 digits";
  // }

  //Validating First Name
  if(!Validator.isAlpha(data.first_name)) {
    errors.first_name = "First Name must contains Alphabets only";
  }

  if(Validator.isEmpty(data.first_name)) {
    errors.first_name = "Please enter First Name";
  }

  //Validating Last Name
  if(!Validator.isAlpha(data.last_name)) {
    errors.last_name = "Last Name must contains Alphabets only";
  }

  if(Validator.isEmpty(data.last_name)) {
    errors.last_name = "Please enter Last Name";
  }

  //Validating email
  if(!Validator.isEmail(data.email)) {
    errors.email = "email is not Valid";
  }

  if(Validator.isEmpty(data.last_name)) {
    errors.email = "Please enter email";
  }

  //Validating Mobile Number
  if(data.mobile_no.length != 10) {
    errors.mobile_no = "Mobile Number should contain 10 digits";
  }

  if(!Validator.isNumeric(data.mobile_no)) {
    errors.mobile_no = "Mobile number should contain only numbers";
  }

  //Validating Password
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
