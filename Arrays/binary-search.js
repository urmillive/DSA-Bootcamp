function search(arr,key){
    let start=0;
    let end = arr.length-1;
    let mid = Math.floor(start + (end-start)/2)

    while(start<=end){
        if(arr[mid]==key){
            return mid;
        }
        if(key>arr[mid]){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
        mid = Math.floor(start + (end-start)/2)
    }
    return 0;
}

let arr = [3,5,9,13,27,55];
console.log(search(arr,27));
