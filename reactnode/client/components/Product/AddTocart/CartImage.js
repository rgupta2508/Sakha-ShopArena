import React, { Component } from 'react';

class CartImage extends Component {
    render() {
        return (
           <div>
            <img src={this.props.images} alt="Img" />
            </div>
        );
    }
}

export default CartImage;