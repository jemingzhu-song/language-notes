/* ---------- Javascript Introduction ---------- */
// Here we will explore some examples of what JavaScript can do, especially in regards to HTML/CSS

/* ---------- Javascript Can Change HTML Content ---------- */
// One of many JavaScript HTML methods is getElementById().

// The example below "finds" an HTML element (with id="demo"), and changes the element content (innerHTML) to "Hello JavaScript":
document.getElementById('demo').innerHTML = 'Hello JavaScript';

/* ---------- Javascript Can Change HTML Attribute Values ---------- */
// JavaScript can also change the value of the src (source) attribute of an <img> tag:

/* ---------- Javascript Can Change HTML Styles (CSS) ---------- */
// Changing the style of an HTML element, is a variant of changing an HTML attribute:
document.getElementById('demo').style.fontSize = '35px';

/* ---------- Javascript Can Hide HTML Elements ---------- */
// Hiding HTML elements can be done by changing the display style:
document.getElementById('demo').style.display = 'none';

/* ---------- Javascript Can Show HTML Elements ---------- */
// Showing hidden HTML elements can also be done by changing the display style:
document.getElementById('demo').style.display = 'block';

/* ---------- The <script> Tag ---------- */
// In HTML, JavaScript code is inserted between <script> and </script> tags.
// <script>
document.getElementById('demo').innerHTML = 'My First JavaScript';
// </script>

/* ---------- JavaScript in <head> or <body> ---------- */
// You can place any number of scripts in an HTML document
// Scripts can be placed in the <body>, or in the <head> section of an HTML page, or in both

/* ---------- JavaScript in <head> ---------- */
// In this example, a Javascript function is placed in the <head> section of an HTML page.
// The function is invoked (called) when a button is clicked:

// <!DOCTYPE html>
// <html>
// <head>
// <script>
// function myFunction() {
//   document.getElementById("demo").innerHTML = "Paragraph changed.";
// }
// </script>
// </head>
// <body>
// <h2>Demo JavaScript in Head</h2>
// <p id="demo">A Paragraph</p>
// <button type="button" onclick="myFunction()">Try it</button>
// </body>
// </html>

/* ---------- JavaScript in <body> ---------- */
// In this example, a JavaScript function is placed in the <body> section of an HTML page.
// NOTE: Placing scripts at the bottom of the <body> element improves the display speed, because script interpretation
// slows down the display
// The function is invoked (called) when a button is clicked:
// <!DOCTYPE html>
// <html>
// <body>
// <h2>Demo JavaScript in Body</h2>
// <p id="demo">A Paragraph</p>
// <button type="button" onclick="myFunction()">Try it</button>
// <script>
// function myFunction() {
//   document.getElementById("demo").innerHTML = "Paragraph changed.";
// }
// </script>
// </body>
// </html>

/* ---------- External JavaScript ---------- */
// Scripts can also be placed in external files
function myFunction() {
  document.getElementById('demo').innerHTML = 'Paragraph changed.';
}
// External scripts are practical when the same code is used in many different web pages.
// JavaScript files have the same file extension ".js"
// To use an external script, put the name of the script file in the src (source) attribute of a <script> tag:
<script src='myScript.js'></script>;
// You can place an external script reference in <head> or <body> as you like
// The script will behave as if it was located exactly where the <script> tag is located
// NOTE: External scripts cannot contain <script> tags

/* ---------- External JavaScript Advantages ---------- */
// Placing scripts in external files has some advantages:
// • It separates HTML and code
// • It makes HTML and JavaScript easier to read and maintain
// • Cached JavaScript files can speed up page loads
// To add several script files to one page - use several script tags:
// <script src="myScript1.js"></script>
// <script src="myScript2.js"></script>

/* ---------- External References ---------- */
// An external script can be referenced in 3 different ways:
// • With a full URL (a full web address)
// • With a file path (like /js/)
// • Without any path
// This example uses a full URL to link to myScript.js
{
  /* <script src="https://www.w3schools.com/js/myScript.js"></script> */
}
// This example uses a file path to link to myScript.js:
{
  /* <script src="/js/myScript.js"></script> */
}
// This example uses no path to link to myScript.js:
{
  /* <script src="myScript.js"></script> */
}
