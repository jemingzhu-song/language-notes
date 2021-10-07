// https://www.youtube.com/watch?v=cuEtnrL9-H0

// Note: You cannot just run this file like: "node fetch.js" and then the request will be sent by fetch,
// you need to use fetch inside of a React application.

/* ---------- Sending GET Requests ---------- */
fetch('https://reqres.in/api/users')
  .then((res) => res.json()) // Convert the response object to JSON
  .then((data) => console.log(data)); // Outputs the JSON data inside the response to the console

// To check if the fetch request is successfull or not:
fetch('https://reqres.in/api/users')
  .then((res) => {
    if (res.ok) {
      // request is ok
      console.log('Success');
    } else {
      console.log('Not Successful');
    }
    res.json(); // Convert the response object to JSON
  })
  .then((data) => console.log(data)); // Outputs the JSON data inside the response to the console

/* ---------- Sending CRUD Requests ---------- */
fetch('https://reqres.in/api/users', {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json', // We tell fetch that we will be parsing/sending JSON
  },
  // We put the data we want to send inside the body: {}
  body: JSON.stringify({
    // JSON.stringify() will send the data in JSON format
    name: 'User 1',
  }),
});
