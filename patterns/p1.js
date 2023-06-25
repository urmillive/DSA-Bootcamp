let i = 0;
for (; ; i++) {
    if (i % 2 == 0) {
        setTimeout(() => {
            console.log(i);
        }, 5000);
    } else {
        if (i > 10) {
            break;
        } else {
            continue;
        }
    }
}
``