/*
    Intersection Types allow you assign a variable or a function parameters to be both data types.

    To declare an intersection type, use the "&" operator to separate two different data types.

    For example:
        let weight: number & string;
    This will mean the "weight" variable is both a "number" and a "string" data type. Technically,
    this is impossible, so we will show a more realistic example below:
*/

// First, we will declare two data types: "Draggable" and "Resizable"
type Draggable = {
  drag: () => void;
};

type Resizable = {
  resize: () => void;
};

// Next, we declare "UIWidget", which is an Intersection Type between both "Draggable" and "Resizeable"
type UIWidget = Draggable & Resizable;

// When we declare a variable that is of type "UIWidget", it now must "implement" methods from both the "Draggable" and
// "Resizeable" data types
let textBox: UIWidget = {
  drag: () => {},
  resize: () => {},
};
