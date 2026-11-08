#include <iostream>
using namespace std;
int countDigits(int num){
    int count=0;
    do{
        count++;
        num/=10;
    }while(num!=0);
    return count;
}
int power(int base,int power){
    int p=1;
    for(int i=0;i<power;i++)
        p*=base;
    return p;
}
void isArmstrong(int num){
    int temp=num;
    int sum=0;
    int count=countDigits(num);
    while(num!=0){
        int lastdigit=num%10;
        sum=sum+power(lastdigit,count);
        num/=10;
    }
    if(temp==sum)
        cout<<temp<<" is Armstrong number"<<endl;
    else
        cout<<temp<<" is not a Armstrong number"<<endl;
}
int main() {
    isArmstrong(152);
    isArmstrong(153);
     return 0;
}
