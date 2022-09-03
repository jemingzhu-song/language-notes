/* Maps */
/*
    JavaScript Maps are similar to JavaScript Objects, and allow you to store elements in a 
    key: value pair
    The elements in a Map are inserted in an insertion order.
    Unlike a JavaScript Object, a JavaScript Map can contain objects, functions, and other data types
    as the key.
*/

/* 1. Create JavaScript Map */
/*
    The "new Map()" constructor is used to create a Map
    Syntax for creating a map:
        let mapName = new Map();
*/
const map1 = new Map(); // Empty Map
console.log(map1); // Map {}

/* 2. Accessing Map Elements */
/*
    The "get()" method is used to access elements in the Map
    Syntax for accessing elements in a map:
        mapName.get(key);
*/
let map2 = new Map();
map2.set('info', { name: 'Jack', age: 26 });
let information = map2.get('info');
console.log(information); // {name: "Jack", age: "26"}

/* 3. Insert Items into Map */
/*
    The "set()" method is used to insert elements into a Map
    Syntax for inserting into a map:
        mapName.set(element);
*/
// Insert key-value Pair: (key is a String, value is an Object)
let map3 = new Map();
map3.set('info', { name: 'Jack', age: 26 });
console.log(map3);
// Insert key-value Pair: (key is Object, value is a String)
let map4 = new Map();
map4.set({ id: 123, type: 'UID' }, 'Johnson Lin');
console.log(map4);

/* 4. Check Map Elements */
/*
    The "has()" method is used to check if an elemnet is in a Map
    Syntax for checking if element is in a map:
        mapName.has(key);
*/
let map5 = new Map();
map5.set('info', { name: 'Jack', age: '26' });
// check if an element is in Set
console.log(map5.has('info')); // true
console.log(map5.has('infO')); // false

/* 5. Remove Items from Map */
/*
    The "clear()" and "delete()" methods are used to remove elements from a map.
        - clear(): removes ALL key/value pairs from the Map Object
        - delete(key): removes the specified key (and it's corresponding value) from the Map Object

    Syntax for removing elements from a map:
        mapName.clear()
        mapname.delete(key)
*/
let map6 = new Map();
map6.set(1, { name: 'James', age: 21 });
map6.set(2, { name: 'Vicky', age: 22 });
console.log(map6);
map6.delete(3); // false (since key "3" doesn't exist)
map6.delete(2); // true
console.log(map6);

/* 6. Edit Items in a Map */
/*
    The "set()" method can also be used to edit key/value pairs in the map.
*/
let map7 = new Map();
map7.set(1, { name: 'James', age: 21 });
map7.set(2, { name: 'Vicky', age: 22 });
console.log(map7);
map7.set(1, { job: 'Farmer', age: 23 });
console.log(map7);

/* 7. Size of Map */
/*
    The "size" property can be used to check the number of elements in the map.
    Syntax for using the "size":
        mapName.size
*/
let map8 = new Map();
map8.set(1, 'Kim');
map8.set(2, 'Michael');
map8.set(3, 'Johnny');
map8.set(4, 'Johnson');
console.log(map8.size); // 4

/* Iterate through Map */
/*
    There are multiple ways to iterate through the Map:
        1. "for...of" loop
        2. "forEach()" method
        3. "keys()" method to loop through keys of the Map
        4. "values()" method to loop through values of the Map
        5. "entries()" method to loop through the key/value pairs of the Map
*/
// 1. "for...of" loop
/*
    Syntax:
        for (let [keyParameter, valueParameter] of mapName) {
            // body
        }
*/
let map9 = new Map();
map9.set(1, 'Kim');
map9.set(2, 'Michael');
map9.set(3, 'Johnny');
map9.set(4, 'Johnson');

console.log("No. 1) 'for..of' loop");
for (let [key, value] of map9) {
  console.log(key + ': ' + value);
}

// 2. "forEach()" method
/*
    Syntax:
        forEach(function (valueParameter, keyParameter) { 
            // body
        })
*/
console.log("No. 2) 'forEach()' method");
map9.forEach(function (value, key) {
  console.log(key + ': ' + value);
});

// 3. "keys()" method
/*
    Syntax:
        for (let key of mapName.keys()) {
            // body
        }
*/
console.log("No. 3) 'keys()' method");
for (let key of map9.keys()) {
  console.log(key);
}

// 4. "values()" method
/*
    Syntax:
        for (let value of mapNames.values()) {
            // body
        }
*/
console.log("No. 4) 'values()' method");
for (let value of map9.values()) {
  console.log(value);
}
// 5. "entries()" method
/*
    Syntax:
        for (let entry of mapName.entries()) {
            // body
        }
*/
console.log("No. 5) 'entries()' method");
for (let entry of map9.entries()) {
  console.log(entry);
}
