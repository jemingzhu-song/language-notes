/*
    Syntax for declaring Objects in Typescript:
        let <objectName>: {
            <field1>: <field1DataType>,
            <field2>: <field2DataType>,
            <field3>: <field3DataType>
        } = {
            <field1>: <field1Value>
            <field2>: <field2Value>
            <field3>: <field3Value>
        }
    In the above, all fields must be initialised when you create the object

    Syntax for declaring Objects in Typescript with Optional Fields (using the "?" operator):
        let <objectName>: {
            <field1>: <field1DataType>,
            <field2>: <field2DataType>,
            <field3>?: <field3DataType>
        } = {
            <field1>: <field1Value>
            <field2>: <field2Value>
        }
*/
let employee: {
  id: number;
  name: string;
  mobile?: string; // Optional Parameter - we don't have to initialise it when creating this object
} = {
  id: 1,
  name: 'James Chen',
};

// Like JavaScript, we can modify the fields of the object later on
employee.name = 'James Zhu';

/*
    Typescript also allows fields in objects to be "Read-Only", which prevents us from modifying the value
    of the field. 
    
    We do this by using the "readonly" modifier
*/
let manager: {
  readonly id: number; // Read-Only field
  name: string;
} = { id: 20, name: 'Kenny Wong' };

/*
    You can also add functions as fields in objects. Syntax:
    let <objectName>: {
        <functionName>: (<paramName>: <dataType>,...) => <returnType>
    } = {
        <functionName>: (<paramName>: <dataType>,...): <returnType> => {
            // function body
        }
*/
let director: {
  readonly id: number;
  name: String;
  retire: (date: Date) => string;
} = {
  id: 100,
  name: 'William Tin',
  retire: (date: Date): string => {
    console.log('Retire Date: ' + date.toDateString);
    return 'Retire Success!';
  },
};
