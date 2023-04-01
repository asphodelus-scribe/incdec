Description:
A three variable system used for generating complex patterns of digits, originally designed for procedurally generating art.
For details on use of the program for art generation, see the appendix at the bottom of this document.
*NOTE: this program uses only the integers 1 through 9 with wraparound, meaning that 9+1=1, and similarly that 2-3=9 etc.

Setup:
Accept user input for an integer r, the number of repetitions of the main loop
Accept user input for three integers: c,x,n

Main Loop:
Increment c by n
decrement x by c
decrement n by x
Repeat 

Appendix:
The procedure for generating art by mapping a,b,c values to symbols and colors with numbered repetitions is as follows.
1) Perform the setup routine above
2) Assign a number 1-9 to nine symbols, to be called type A symbols
3) Assign a number 1-9 to nine different symbols, to be called type B symbols
4) Draw type A symbol number a in color b
5) Draw type B symbol number c in color b
6) Perform the main loop above, repeating steps 4 and 5 after each repetition
An example of the output created by this procedure can be seen in the file "art_output.png" 