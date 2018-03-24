# SWEN 301 Project 1 - Ryan Cherry - 300339331

## Features implemented:
1. HTML Output
2. Paragraphs
3. Italics
4. Bold
5. Headings
6. Numbered Lists
7. Bulleted Lists
8. Separators
9. Blockquotes
10. Inline Code
11. Block Code

For lists, I have not implemented sub-lists, or the ability to split one element over multiple lines

## Commands:
My program takes in a text file with the markdown code as input. 
This file must be in the same level as the jar, or have the path to it specified

To run the program with acceptance tests: `java -jar projectWithTests.jar file` 
where file is replaced by the input file name 

To run the program without acceptance tests: `java -jar projectWithoutTests.jar file` 
where file is replaced by the input file name

## External Resources:
To do numbered lists, I found a regex code from https://stackoverflow.com/questions/16331423/whats-the-java-regular-expression-for-an-only-integer-numbers-string
and modified it to suit my needs.  
