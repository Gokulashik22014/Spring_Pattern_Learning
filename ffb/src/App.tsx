import axios from "axios";
import React, { useEffect, useState } from "react";

type User = {
  name: string;
  password: string;
};
const App = () => {
  const [user, setUser] = useState<User>({
    name: "",
    password: "",
  });
  useEffect(() => {
    const getAllUsers = async () => {
      await axios
        .get("http://localhost:3000/get-users")
        .then((res) => console.log(res.data))
        .catch((err) => console.log(err));
    };
    getAllUsers();
  }, []);
  const handleClick = async () => {
    await axios.post("http://localhost:3000/add-user", user);
  };
  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setUser((prev) => ({
      ...prev,
      [name]: value, // update field dynamically
    }));
  };
  return (
    <div>
      <input
        type="text"
        value={user?.name}
        onChange={handleChange}
        name="name"
      />
      <input
        type="password"
        value={user?.password}
        onChange={handleChange}
        name="password"
      />
      <button onClick={handleClick}>click me</button>
    </div>
  );
};

export default App;
