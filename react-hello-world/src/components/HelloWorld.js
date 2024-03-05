import React, { useState, useEffect } from 'react';
import axios from 'axios';

function HelloWorld() {
    const [data, setData] = useState(null);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        axios.get('http://localhost:8080/new')
            .then(response => {
                setData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
    }, []);


    return (
        <div>
            <h1>Hello World</h1>
            <pre>{JSON.stringify(data, null, 1)}</pre>
        </div>
    );
}

export default HelloWorld;