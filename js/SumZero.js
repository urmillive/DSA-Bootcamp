//Problem 1 :  Checking sum zero
//[-5,-4,-3,-2,0,2,4,6,8]

// o(o^2) quadric time complexity

function getSomePairZero(array) {
    for (let number of array) {
        for (let j = 1; j < array.length; j++) {
            if (number + array[ j ] === 0) {
                return [ number, array[ j ] ];
            }
        }
    }
}

let myArray = [ -5, -4, -3, -2, 0, 2, 4, 6, 8 ];
console.log(getSomePairZero(myArray));
