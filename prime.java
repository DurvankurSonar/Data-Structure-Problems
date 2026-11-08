#include <iostream>
using namespace std;
bool isPrime(int num){
    if(num==1){
        return false;
    }
     int divisor=2;
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            divisor++;
            return false;
        }        
    }
    return true;
}
int main() {
    int count =0;
    for(int i=1;i<=50;i++){
  if(isPrime(i)){
      cout<<i<<" prime"<<endl;
      count++;
  }
    else
      cout<<i<<" not prime"<<endl;
    }
    cout<<"total no. of prime numbers between 1 to 50 :"<<count<<endl;
     return 0;
}
