/* Switch Statement */
/*
    The JavaScript switch statement is used in decision making.
    Syntax of the JavaScript switch statement is:
        switch(variable/expression) {
            case value1:  
                // body of case 1
                break;

            case value2:  
                // body of case 2
                break;

            case valueN:
                // body of case N
                break;

            default:
                // body of default
        }
*/

let value = 1;
switch (value) {
  case 1:
    console.log('Monday');
    break;
  case 2:
    console.log('Tuesday');
    break;
  case 3:
    console.log('Wednesday');
    break;
  case 4:
    console.log('Thursday');
    break;
  case 5:
    console.log('Friday');
    break;
  default:
    console.log('Weekend!');
    break;
}
