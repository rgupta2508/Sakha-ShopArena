import React,{Component} from 'react';
import RegistrationForm from './RegistrationForm';
import {Link} from 'react-router';
import { connect } from 'react-redux';
import axios from 'axios';
import {RegistrationLogo} from '../common/Logos';

export default class Registration extends Component {
    constructor(props) {
      super(props);
    }
    render() {
        return (
            <div>
              <div className="row">
                <div className="col-xs-12">                  
                   <RegistrationLogo id="large_logo" className="large-logo"/>
                  <RegistrationForm/>
                </div>
              </div>
            </div>
          
        );
    }
}