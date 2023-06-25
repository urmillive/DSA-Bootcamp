// Selection Sort Practice

function selectionSort(array) {
    let left = 0;
    let right = array.length - 1;
    let temp;
    for (let i = 0; i <= right; i++) {
        for (let j = 0; j <= right; j++) {
            if (array[ i ] > array[ j ]) {
                temp = i;
                i = j;
                j = temp;
            }
        }
        console.warn(i);
    }
}
let myArray = [ 25, 35, 5, 40, 33, 99 ];
console.log(selectionSort(myArray));
