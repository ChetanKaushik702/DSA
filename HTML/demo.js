console.log("Hello JavaScript!!");
// objects are accessed using named indices whereas array elements are accessed using numbered indices
var obj = {firstName:"Chetan", lastName:"Kaushik", age:"19years"};
var arr = ["Chetan", 'Kaushik', '19years'];
/*console.log(obj);
console.log(arr)*/
console.log(`${obj["firstName"]} ${obj["lastName"]} ${obj["age"]}.`);
console.log(`${arr[0]} ${arr[1]} ${arr[2]}.`);
console.log(Date());