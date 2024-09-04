<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScript Variables and Data Types</title>
    <script>
        // Function to handle user input and display results
        function processInput() {
            // Get user input from the text field
            var userInput = document.getElementById("userInput").value;

            // Process input (e.g., convert to uppercase)
            var result = userInput.toUpperCase();

            // Display the result
            document.getElementById("result").textContent = "Processed Result: " + result;
        }
    </script>
</head>
<body>
   

    <label for="userInput">Enter some text:</label>
    <input type="text" id="userInput">


    <button onclick="processInput()">Process Input</button>

 
    <p id="result"></p>
</body>
</html>
