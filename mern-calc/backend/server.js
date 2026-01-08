// server.js
const express = require("express");
const cors = require("cors");
const app = express();
app.use(cors());
app.listen(5000, () => {
  // When Running the background case using the port 5000 and app.listen is a method
  // 5000 is the port number for express server
  console.log("Server running at port 5000");
});
app.get("/api/calc", (req, res) => {
  //req = request used for the getting from the client; res = response
  const x = +req.query.n1; // req giving the input as String so convert it into integer + or (parseInt);
  const y = +req.query.n2;
  const ope = req.query.op;
  let operator = "";
  switch (ope) {
    case "add":
      operator += "+";
      break;
    case "sub":
      operator += "-";
      break;
    case "mul":
      operator += "*";
      break;
    case "div":
      operator += "/";
      break;
    default:
      operator += "Invalid";
      break;
  }
  let result = 0;
  switch (ope) {
    case "add":
      result = x + y;
      break;
    case "sub":
      result = x - y;
      break;
    case "mul":
      result = x * y;
      break;
    case "div":
      result = x / y.toFixed(2);
      break;
    default:
      result = "Invalid input";
      break;
  }
  res.send(`${x} ${operator} ${y} : ${result}`);
});
//  control + c for stopping the server
//  http://localhost:5000/api/calc? url for running in the chrome;

// Factorial
app.get("/api/fact", (req, res) => {
  const num = +req.query.number;
  let result = 1;
  for (let i = num; i > 0; i--) {
    result *= i;
  }
  res.send(`Factorial of ${num} is ${result}`);
});

// Greatest common divisor
app.get("/api/gcd", (req, res) => {
  const a = +req.query.n1;
  const b = +req.query.n2;
  let m = Math.min(a, b);
  //   let result;
  //   if (b == 0) {
  //     result = a;
  //   } else if (a == 0) {
  //     result = b;
  //   } else {
  //     while (m > 0) {
  //       if (a % m == 0 && b % m == 0) {
  //         result = m;
  //         break;
  //       } else {
  //         m--;
  //       }
  //     }
  //   }
  function gcd(a, b) {
    if (a == 0) return b;
    if (b == 0) return a;
    else {
      while (a != b) {
        if (a > b) a -= b;
        else b -= a;
      }
      return a;
    }
  }
  let result = gcd(a, b);
  //   let res1 = (a * b) / result; for lcd answer
  res.send(`GCD of ${a} & ${b} is ${result}`);
});

// LCD
app.get("/api/lcd", (req, res) => {
  const a = +req.query.n1;
  const b = +req.query.n2;
  function gcd(a, b) {
    if (a == 0) return b;
    if (b == 0) return a;
    else {
      while (a != b) {
        if (a > b) a -= b;
        else b -= a;
      }
      return a;
    }
  }
  let result = gcd(a, b);
  let res1 = (a * b) / result;
  let answer = `LCM ${res1} GCD ${result} `;
  res.send(answer);
  //   res.send("alsddjlj"); control is not getting the chance to get the execution of this
});
