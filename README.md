# NumberToWords
A Java application that gets an integer and returns its digits in words

The way the code works, in order to get each digit of the integer, returns the words
of these digits in reverse order. That is why a function that reverses the digits is
needed.

The reversal mentioned above causes problems in case the integer ends with one or
more zeros. Eg. 100 --> 001 --> 1. This can be solved with a function that counts the
integer's number of digits. It is then used to print out the word "Zero" for every
digit that was "lost" at the reversal.

The final result of the application is:
100 --> "One Zero Zero"
123 --> "One Two Three"
