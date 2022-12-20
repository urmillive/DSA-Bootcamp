#include <iostream>
using namespace std;

class teacher{
    public:
        void display(){
            cout << "display teacher" << endl;
        }
};

int main()
{
    teacher t;
    t.display();
}
