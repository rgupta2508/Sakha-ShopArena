import React,{Component} from 'react';
import {Link} from 'react-router';
import { connect } from 'react-redux';
import axios from 'axios';

export default class Home extends Component {
    constructor(props) {
      super(props);
    }
    render() {
        return (
            <div>
              <div className="row">
                <div className="col-xs-12">
                  <h1>Home sweet home!</h1>
                </div>
              </div>
            </div>
        );
    }
}