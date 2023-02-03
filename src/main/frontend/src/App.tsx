import {useEffect, useState} from "react";

function App() {
    const [message, setMessage] = useState("");

    useEffect(() => {
        fetch("/api/hello")
            .then((response) => {
                return response.json();
            })
            .then((data) => {
                setMessage(data.message);
            });
    }, []);

    return (
            <div>
                <h1>{message}</h1>
            </div>
    );
}

export default App;