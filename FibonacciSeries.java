#include <iostream>
using namespace std;

int main() {
    int n=10;
    int a=0,b=1;
    int c;
    for(int i=1;i<n;i++){
        cout<<a<<" ";
        c=a+b;
        a=b;
        b=c;
    }
     return 0;
}

