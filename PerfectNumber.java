// Perfect Number or Strong Number

#include <iostream>
using namespace std;
int fact(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    return fact;
}
void isPerfect(int num){
    int temp=num;
    int sum=0;
    while(num!=0){
        int lastdigit=num%10;
        sum=sum+fact(lastdigit);
        num/=10;
    }
    if(temp==sum)
        cout<<temp<<" is perfect number"<<endl;
    else
        cout<<temp<<" is not a perfect number"<<endl;
}
int main() {
    isPerfect(144);
    isPerfect(145);
     return 0;
}
