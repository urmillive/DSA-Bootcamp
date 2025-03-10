

function search(arr,value){
    for(let i=0;i<arr.length;i++){
        if(value==arr[i]){
            return i;
        }
    }
}

let arr = [1,254,7,49,55];

console.log(search(arr,55));
