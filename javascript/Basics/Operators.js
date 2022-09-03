/* Arithmetic Operators */
/*
   Operator	        Name	                        Example

   +	            Addition	                    x + y
   -	            Subtraction	                    x - y
   *	            Multiplication	                x * y
   /	            Division	                    x / y
   %	            Remainder	                    x % y
   ++	            Increment (increments by 1)	    ++x or x++
   --	            Decrement (decrements by 1)	    --x or x--
   **	            Exponentiation (Power)	        x ** y
*/

/* Comparison Operators */
/*
Operator	        Description	                                            Example

==	                Equal to: returns true if the operands                  x == y
                    are equal	                                            
!=	                Not equal to: returns true if the operands              x != y
                    are not equal	                                        
===	                Strict equal to: true if the operands are equal         x === y
                    and of the same type	                                
!==	                Strict not equal to: true if the operands are           x !== y
                    equal but of different type or not equal at all	        
>	                Greater than: true if left operand is greater than      x > y
                    the right operand	                                    
>=	                Greater than or equal to: true if left operand          x >= y
                    is greater than or equal to the right operand	        
<	                Less than: true if the left operand is less than        x < y
                    the right operand	                                    
<=	                Less than or equal to: true if the left operand is      x <= y
                    less than or equal to the right operand	                
*/

// equal operator: ==
console.log(2 == 2); // true
console.log(2 == '2'); // true

// not equal operator: !=
console.log(3 != 2); // true
console.log('hello' != 'Hello'); // true

// strict equal operator: ===
console.log(2 === 2); // true
console.log(2 === '2'); // false

// strict not equal operator: !==
console.log(2 !== '2'); // true
console.log(2 !== 2); // false

/* Logical Operators */
/*
Operator	Description	                                    Example

&&	        Logical AND: true if both the operands are      x && y
            true, else returns false	
||	        Logical OR: true if either of the operands      x || y
            is true; returns false if both are false	
!	        Logical NOT: true if the operand is false       !x
            and vice-versa.	
*/

/* Assignment Operators */
/*
Operator        Name	                    Example

=	            Assignment operator	        a = 7; // 7
+=	            Addition assignment	        a += 5; // a = a + 5
-=	            Subtraction Assignment	    a -= 2; // a = a - 2
*=	            Multiplication Assignment	a *= 3; // a = a * 3
/=	            Division Assignment	        a /= 2; // a = a / 2
%=	            Remainder Assignment	    a %= 2; // a = a % 2
**=	            Exponentiation Assignment	a **= 2; // a = a**2
*/
