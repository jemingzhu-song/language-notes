/*
    Syntax for Functions in Typescript:

    Normal Function:
        function <functionName>(<paramName>: <variableType>, <paramName>: <variableName>): <returnType> {

        }

    Void Function
    function <functionName>(<paramName>: <variableType>, <paramName>: <variableName>): void {
        
    }

    Typescript also supports inferred types for functions, so you don't necessarily have to specify the return
    type, but it is always best practice to do so anway.
*/
function calculateTax(income: number, taxYear: number): number {
  if (taxYear == 2022) {
    return income * 0.2;
  } else {
    return income * 0.3;
  }
}

/*
    Function Parameters in Typescript also allow you to give declare them as:
        1. Optional Parameters
        2. Give Parameters a Default Value
*/
/* To define an Optional Parameter, use the "?" as the suffix of the parameter name
If you use the parameter, use the "||" operator to give it a "default value" if it is undefined.
*/
function optional(status: String, warning?: String): void {
  if (warning != undefined) {
    console.log('');
  } else {
    console.log(status + (warning || 'Yes'));
  }
}

/* To define an Default Parameter, use the "=" after the parameter name */
function defaultParams(status: String, warning = 'Wrong'): void {
  if (warning != undefined) {
    console.log('');
  }
}
