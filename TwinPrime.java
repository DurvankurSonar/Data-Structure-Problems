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
        if(isPrime(i) && isPrime(i+2)){
            cout<< i <<" and "<<i+2<<" are twin primes"<<endl;
            count++;
        }
    }
    cout<<"total no. of pairs of twin prime numbers between 1 to 50 :"<<count<<endl;
     return 0;
}
