import './App.css';
import Home from './components/Home/Home';
import MyOrders from './components/MyOrders/MyOrders';
import Buy from './components/BuyStocks/Buy'
import SellStocks from './components/SellStocks/SellStocks'
import OrderStatus from './components/OrderStatus/OrderStatus'
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
  return (
    <div>
     <BrowserRouter>
     <Routes>
          <Route path="/" element={<Home/>}>
          <Route path="buy" element={<Buy />} />
          <Route path="sel" element={<SellStocks />} />
          <Route path="myorders" element={<MyOrders />} />
          <Route path="orderstatus" element={<OrderStatus />} />
        </Route>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
