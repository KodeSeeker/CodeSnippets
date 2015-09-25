/*
http://stackoverflow.com/questions/3758402/swapping-pair-of-bits-in-a-byte

It works by handling the low bits and high bits of each bit-pair separately and then combining the result:

The expression x & 0b10101010 extracts the high bit from each pair, and then >> 1 shifts it to the low bit position.
Similarly the expression (x & 0b01010101) << 1 extracts the low bit from each pair and shifts it to the high bit position.
The two parts are then combined using bitwise-OR.

Since not all languages allow you to write binary literals directly, you could write them in for example hexadecimal:

Binary        Hexadecimal  Decimal 
0b10101010    0xaa         170
0b01010101    0x55         85


*/

// If using binary,for hex/dec refer above

x = ((x & 0b10101010) >> 1) | ((x & 0b01010101) << 1)


