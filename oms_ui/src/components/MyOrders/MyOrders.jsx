import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

function App() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(false);
  useEffect(() => {
    setLoading(true);
    fetch("http://10.10.125.39:9090/api/v1/oms/orders")
      .then((response) => response.json())
      .then((json) => setUsers(json))
      .finally(() => {
        setLoading(false);
      });
  }, []);

  return (
    <div className="App">
      {loading ? (
        <div>Loading...</div>
      ) : (
        <div className="tcenter">
          <h1>My Orders</h1>
          <table border={1}>
            <tr>
              <th>Stock Name</th>
              <th>Order Type</th>
              <th>Quantity</th>
              <th>Order Status</th>
              <th>Details</th>
            </tr>
            {users.map((user) => (
              <tr key={user.order_id}>
                <td>{user.order_item}</td>
                <td>{user.order_type}</td>
                <td>{user.order_quantity}</td>
                <td>{user.order_status}</td>
                <td>  <Link to="/orderstatus"> Check </Link></td>
              </tr>
            ))}
          </table>
        </div>
      )}
    </div>
  );
}

export default App;