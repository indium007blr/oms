import React from "react";
import './Home.scss'

const Home = () => {

    return(
        <div>
            <header className="header">
            <div><h4>OMS</h4></div>
                <div><button>login</button></div>
                </header>
            <section>
                <h1>Stock list</h1>
                <table style={{borde:"border-collapse collapse"}}>
                    <tr>
                        <th>sl</th>
                        <th>Stcock name</th>
                        <th>price</th>
                        <th>action</th>
                    </tr>
                    <tr>
                        <td>01</td>
                        <td>Tata</td>
                        <td>100$</td>
                        <td><button>buy</button> <button>sell</button></td>
                    </tr>
                </table>
            </section>
        </div>
    )

}
export default Home;