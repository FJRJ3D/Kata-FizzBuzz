# Kata FizzBuzz Java
## Requeriments

<strong>Write a program which prints the numbers from 1 to 100:</strong>

### Stage 1:

- Returns **Fizz** if the number is **divisible by 3**.
- Returns **Buzz** if the number is **divisible by 5**.
- Returns **FizzBuzz** if the number is **divisible by both 3 and 5**.
- Returns the number itself if none of the above conditions are met.

### Stage 2:

- Returns **Fizz** if the number is divisible by 3 or if **it contains a 3**. (E.g., Fizz if the number is 534).
- Returns Buzz if the number is divisible by 5 or if **it contains a 5**. (E.g., Buzz if the number is 25).


## Solution:

- I have created different **boolean methods** for each **condition**, first those from the first part of the
exercise and then those from the second part.
- I have created a **test** for each **method** to verify that it works independently.
- Finally, I have created another **method** with a **for loop** and a **conditional statement** to add the **number,
"Fizz", "Buzz", or "FizzBuzz"** to an **ArrayList**.
- I transform the **int** to a **String**.
- I **return** the result of the **ArrayList** in the **method**.
- I create a **test** to check that the **ArrayList** returns the desired results.

 