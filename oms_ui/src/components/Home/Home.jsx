import React from "react";
import './Home.scss'
import { Outlet,Link } from 'react-router-dom'

const Home = () => {

    return(
        <div>
            <header className="header">
              <h4>OMS</h4>
                </header>
            <section className="tcenter">
                <h1>Stock list</h1>
                <table>
                    <thead>
                    <tr>
                        <th>sl</th>
                        <th>Stcock name</th>
                        <th>price($)</th>
                        <th>action</th>
                    </tr>
                    </thead>
                    <tr>
                        <td>01</td>
                        <td>Tata</td>
                        <td>100</td>
                        <td><button><Link to="/buy">Buy</Link></button> <button><Link to="/sel">sell</Link></button></td>
                    </tr>
                </table>
            </section>
            <h2>Order Details</h2>
            <Link to="/myorders"> MyOrders </Link> <br />
            <Outlet></Outlet>
        </div>
    )

}
export default Home;