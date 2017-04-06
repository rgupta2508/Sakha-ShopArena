import React, { Component } from 'react';
import ProductComponent from './ProductComponent';
import RowCart from './RowCart';

let productImage=[];
class Cart extends Component {
    componentWillMount() {
productImage=[
{id:100,stock:true,url:'http://icons.iconarchive.com/icons/danleech/simple/256/facebook-icon.png',name:'Product 1',cost:1000},
{id:101,stock:false,url:'http://icons.iconarchive.com/icons/danleech/simple/256/facebook-icon.png',name:'Product 2',cost:2000},
{id:102,stock:true,url:'http://icons.iconarchive.com/icons/danleech/simple/256/facebook-icon.png',name:'Product 3',cost:3000}
];}
render()
{
    let rows=productImage.map(
        (p)=><RowCart product={p} key={p.id}/>
    );
    return(
        <table>
            <tr>
                <th>Image</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Cost</th>
            </tr>
            {rows}
            
            </table>
    );
}
}

export default Cart;