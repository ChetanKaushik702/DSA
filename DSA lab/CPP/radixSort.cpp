#include <bits/stdc++.h>
using namespace std;

void radixSort(int a[], int n, int b, int k){
	// b is the base in which we are working

	for(int p=1; p<k; p*=b){

		int count[b];
		for(int i=0;i<b;i++) count[i] = 0;

		for(int i=0;i<n;i++){	// (a[i]/p)%b gives the current digit
			count[(a[i]/p)%b]++;
		}

		for(int i=1;i<b;i++) count[i] += count[i-1];
		// This gives us the cumulative sum and hence the actual
		// position in array for the variables

		int newarr[n];

		for(int i=n-1;i>=0;i--){
		// start from end to maintain that:
		// for same count, relative position in array remains same
			newarr[count[(a[i]/p)%b] - 1] = a[i];
			count[(a[i]/p)%b]--;
		}

		for(int i=0;i<n;i++) a[i] = newarr[i];

	}
}


int main(){
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++) cin>>a[i];
	radixSort(a,n,n,n*n);
	for(int i=0;i<n;i++) cout<<a[i]<<" ";cout<<endl;
}