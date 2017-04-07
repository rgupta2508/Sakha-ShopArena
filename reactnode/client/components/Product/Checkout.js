import React, { Component } from 'react';
import Product from './Product/ProductComponent';
import Cart from './Product/Cart';


class Checkout extends Component {
  
  constructor(props) {
    super(props);
    this.state = { currency: "INR", cartProducts: [] };
    this.handleClick = this.handleClick.bind(this);
  }
  handleClick() {
    // if(this.state.currency=="INR")
    //     this.setState({currency:"USD"});    
    // else
    //     this.setState({currency:"INR"});  
    this.setState((prevData) => ({
      currency: prevData.currency == "INR" ? "USD" : "INR"
    }));
  }
  render() {
    return (
      <div>
        <div className="cartList">
          <Cart prods={this.state.cartProducts} />
        </div>
        <h3>total</h3>
      </div>
    );
  }
}
export default Checkout;