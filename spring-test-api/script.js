fetch('http://localhost:8080/api/1/movie/all')
  .then((response) => response.json())
  .then((data) => console.log(data));

console.log('My movie list');