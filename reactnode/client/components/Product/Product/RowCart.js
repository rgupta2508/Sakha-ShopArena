import React,{Component} from 'react';
import CartImage from '../AddTocart/CartImage';
class RowCart extends Component
{
    constructor(props){
        super(props);
        this.state={qty:1};
        this.getQty=this.getQty.bind(this);

    }
    getQty(e)
    {
        this.setState({qty:e.target.value});
    }
    render() {
        return (
            <tr>
                <td>
                    <CartImage images={this.props.product.url}/>
                </td>
                <td>{this.props.product.name}</td>
                <td><input type="number" mim="1"
                    value={this.state.qty}
                    onChange={this.getQty}/>
                </td>
                <td>
                Rs.{this.props.product.cost*this.state.qty}
                </td>
                </tr>
            

        );
    }
}
export default RowCart;