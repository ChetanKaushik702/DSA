/*This program defines a function that receives a 1D array, its size and an integer as arguments
  and returns how many times the integer occurs in the array.*/

#include <stdio.h>

int func(int [],int,int);
int main(){
    int size=12;
    int arr[size] = {1,2,2,2,2,3,4,5,6,7,8,9};
    int num;
    printf("Enter an integer to know how many times it occurs in array: ");
    scanf("%d",&num);

    int count = func(arr,size,num);
    printf("The integer %d occurs %d times in the array.\n",num,count);
    return 0;
}
int func(int j[], int n, int found){
    int count = 0;
    for(int i=0;i<n;i++){
        if(j[i] == found)
            count++;
    }
    return count;
}
