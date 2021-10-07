/* ---------- JavaScript Operators ---------- */
/* ---------- JavaScript Arithmetic Operators ---------- */
// Operator	    Description
// +	        Addition
// -	        Subtraction
// *	        Multiplication
// **	        Exponentiation (ES2016)
// /	        Division
// %	        Modulus (Division Remainder)
// ++	        Increment
// --	        Decrement

/* ---------- JavaScript Assignment Operators ---------- */
// Operator	    Example	    Same As
// =	        x = y	    x = y
// +=	        x += y	    x = x + y
// -=	        x -= y	    x = x - y
// *=	        x *= y	    x = x * y
// /=	        x /= y	    x = x / y
// %=	        x %= y	    x = x % y
// **=	        x **= y	    x = x ** y

/* ---------- JavaScript String Operators ---------- */
// The + operator can also be used to add (concatenate) strings.
let text1 = 'John';
let text2 = 'Doe';
let text3 = text1 + ' ' + text2;
// The result of text3 will be:
// John Doe

// The += assignment operator can also be used to add (concatenate) strings:
let text4 = 'What a very ';
text4 += 'nice day';
// The result of text1 will be:
// What a very nice day

/* ---------- JavaScript Comparison Operators ---------- */
// Operator	    Description
// ==	        equal to
// ===	        equal value and equal type
// !=	        not equal
// !==	        not equal value or not equal type
// >	        greater than
// <	        less than
// >=	        greater than or equal to
// <=	        less than or equal to
// ?	        ternary operator

/* ---------- JavaScript Logical Operators ---------- */
// Operator	    Description
// &&	        logical and
// ||	        logical or
// !	        logical not

/* ---------- JavaScript Type Operators ---------- */
// Operator	    Description
// typeof	    Returns the type of a variable
// instanceof	Returns true if an object is an instance of an object type

/* ---------- JavaScript Bitwise Operators ---------- */
// Bit operators work on 32 bits numbers.
// Any numeric operand in the operation is converted into a 32 bit number. The result is converted back to a JavaScript number.
// Operator	    Description	            Example	            Same as	        Result	    Decimal
// &	        AND	                    5 & 1	            0101 & 0001	    0001	    1
// |	        OR	                    5 | 1	            0101 | 0001	    0101	    5
// ~	        NOT	                    ~ 5	                ~0101	        1010	    10
// ^	        XOR	                    5 ^ 1	            0101 ^ 0001	    0100	    4
// <<	        Zero fill left shift	5 << 1	            0101 << 1	    1010	    10
// >>	        Signed right shift	    5 >> 1	            0101 >> 1	    0010	    2
// >>>	        Zero fill right shift	5 >>> 1	            0101 >>> 1	    0010	    2
