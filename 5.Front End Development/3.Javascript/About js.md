# Contents 
1. Features of javascript
2. Variables
3. Data Types 
4. Arrays 
5. If-Else 
6. Switch 
7. Common operators
8. Loops 
9. Function 
10. anonymos and arrow function 
11. Type coercion
12. Working with json

## 1. Features of JavaScript
- Javascript is genral purpose programming language, mainly used in web development. 
- It is interpreted and dynamically typed (type of variable is not declared but decided at runtime from value of variable).
	
## 2. Variables
- Declrations can be done in one of 3 ways:
	1. `let a = 12, a2;`
	2. `var b = 5, b2;`
	3. `const c = "hello", c2 = "world";`
- var is not used now, as it has sevral drawbacks like you can use a variable first and then declare the variable in js code later(hoisting in js). 
- Another disadvantage with var is that multiple variable can be declared with same name using var.
- const variable must be initialised at declration time and then can not be changed later.
	 
## 3. Data Types 
- It has 8 data types :
	
#### 3.1. Number
- All numbers, ints or floats are only one type Number type in javascript, takes 64 bit.
- let a=16 or a=Number("16");
- all operators of java are supported and behave in same way except divison and comparison.
- divison always do fraction divison and not integer divison.
- (=== and !==) do strict comparison(compare both data types and values of variables also)
- (== and !=) only compare values not types, so ('5'==5 returns true), don't use it.
- a**b returns Math.pow(a, b);
			
#### 3.2 String
- let a="hello", b='hello';
- backslash(\) is used as  escape character.
- template literal string can be used for creating strings with js expression result embeded in it.
- e.g of template lateral, let str = `Hello ${name}`;
- js strings are immutable, can be acessed with str[index];
- properties:
	1. `str.length`: returns the length of string 
- methods:
	`boolean str.includes("substring to test")`
	`String str.toLowerCase()`
	`String str.toUpperCase();`
	`String str.trim();`
	`Array str.split("regex");`
	
				
#### 3.3 Boolean 
- let a= true or false;
		
#### 3.4 Undefined 
-When a variable is declared only and not initialised, it is of type Undefined and has a value undefined.
- e.g let a; now a is of type undefined and have value undefined.
		
#### 3.5 Null
#### 3.6 Object
#### 3.7 BigInt
#### 3.8 Symbol
			
## 4.Arrays in js 
- let ls = [2, "upendra"];
- getting and updating an item can be done using indexing.
- Unlike java, We can store all types in one array like integer, strings.
- properties:
	1. `ls.length`: Lenth of array 
- methods:
	1. `int ls.push(item1, item2,...);`		// push one or more items in end of list and returns new length of list
	2.	`int ls.unshift(item1, int2, ...);`	// push items in front of list.
	3.	`item ls.pop()`						// remove last element and return it
	4.	`item ls.shift()`						// remove first item and return it
	5.	`int ls.indexOf(item)`				// return the index of first item found else -1
	6.	`String ls.join("separator")`			// all items are joined using the separator and returned as string.
	7.	`array ls.map(function)`				// for each index in ls, newls[i] = function(ls[i])		
	8.	`array ls.filter(function)`			// for each index in ls, newls.push(ls[i]) if function(ls[i]) returns true;
		
## 5. if-else block
- any conditional expression except false, null, 0, undefined, NaN, empty string is always test to true.
- syntax:
	```javascript
	if(conditional expression){
	}
	else if(conditional expression){
	}
	else{
	}
	```
	
## 6. switch
- syntax:
	```javascript
	switch (expression) {
		case choice1:
			run this code
			break;

		case choice2:
			run this code instead
			break;

		// include as many cases as you like

		default:
			actually, just run this code
	}
	```
		
## 7 Common operators
- ternary operator: `(condition)?(true then run this code):(else run this code)`
- type of operator: `type of `
		
## 8. Loops
- syntax:
	```javascript
	for(let i=0;i<limit;i++) {
		// execute this code
	}
	
	// enhanced for loop to iterate in array:
	for (const cat of cats) {
		// write code for each item in cats collection
	}

	// while loop  and do-while
	while(condition){ code }
	do{ code }while(condition)
	```

## 9. function
- function like variable created with var is hoisted( a feature in js which allows to use functions, variables, events first and declare them later).
- syntax:
	```javascript
	function functionName(arg1, arg2, arg3, arg4 = "default value"){
		// block of code for function
	}
	```

## 10. anonymos function and arrow function 
- anonymos function and arrow function provide a shortcut syntax to crate a function.
- In js function can also be passed as an argument to another function, can be assigned to a variable, these function can be used in that case.
- syntax:
	```javascript
	// anonymos function 
	const add = function(num1, num2){
						// code logic.
						return num1+num2;
					}
	

	// arrow function syntax 
	const multiply = (num1, num2)=>{return num1*num2};

	// Use this function in normal ways 
	const sum = add(5,5);
	const product = multiply(5,5);
	```
	
## 11. Type coercion
- Js automatically convert the type of variable when used in comparsion, this is known as type coercion.
- e.g '10'==10, will convert the string type '10' to number 10 and then will perform calculations.
- To prevent the type coercion, in js use (=== instead of ==) to compare 2 values.
	
## 12. working with JSON 
- can be any valid js data type like true, false, 12, "hello",null,[],{};
- In case of js object literal is used to create json:
	- key must be enclosed in double brackets
	- value can be any one of valid js data type's value
	- two properties should be separated by ,
		
- Serialisation stands for converting a object to string to sent it across networks.
	- syntax: `let jsonStr = JSON.stringify(jsonObj);`
		
- Deserialisation means to convert a string into program's native object
	- `let jsonObj = JSON.parse(jsonStr);`

	












			
			
