#include <iostream>
using namespace std;
int main()
{
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
    // write code here
    int a, b, result;
    cin >> a >> b;
    result = a + b;
    cout << result << endl;

    return 0;
}
