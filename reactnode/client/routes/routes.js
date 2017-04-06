import React from 'react';
import { Route, IndexRoute } from 'react-router';

import App from '../App';
import Login from '../components/Login/Login';
import Home from '../components/Home';
import About from '../components/About';

import Checkout from '../components/mycomponents/Checkout';


import requireAuth from '../utils/requireAuth';

export default (
  <Route path = "/" component={App}>
    <IndexRoute component={Login} />
    <Route path= "home" component={Home} />
    <Route path= "about" component={About} />

    <Route path= "checkout" component={Checkout} />

  </Route>
)
