#include <stdio.h>
#include <limits.h>
void merge(int [],int ,int ,int );
void mergeSort(int [], int ,int);
void arrDisplay(int [], int );

int main()
{
    int arr[] = { 23,12,24,56,-19,-89,0,78};
    int n = sizeof(arr)/sizeof(int);
    printf("Initial array is\n");
    arrDisplay(arr,n);
    mergeSort(arr,0,n-1);
    printf("Sorted array is\n");
    arrDisplay(arr,n);

    return 0;
}
void arrDisplay(int arr[],int n)
{
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
    printf("\n");
}
void merge(int arr[],int p,int q,int r)
{
    int n1 = q-p+1;
    int n2 = r-q;
    int a[n1+1],b[n2+1];

    for(int i=0;i<n1;i++)
        a[i] = arr[p+i];
    for(int i=0;i<n2;i++)
        b[i] = arr[q+1+i];

    a[n1] = b[n2] = INT_MAX;
    int i=0,j=0;
    while(i<n1 && j<n2)
    {
    for(int k=p;k<=r;k++)
    {
        if(a[i] <= b[j])
        {
            arr[k] = a[i];
            i++;
        }
        else
        {
            arr[k] = b[j];
            j++;
        }
	if(i == n1) 
	   for(int t=j; t<n2; t++)	arr[k] = a[t];
	if(j == n2)
	   for(int t=i; t<n1; t++)	arr[k] = a[t];
    }
    }
}
void mergeSort(int arr[], int p,int r)
{
    if(p<r)
    {
        int q = (p+r)/2;
        mergeSort(arr,p,q);
        mergeSort(arr,q+1,r);
        merge(arr,p,q,r);
    }
}
