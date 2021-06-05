#include <stdio.h>
#include <limits.h>
#define ll long long
#define f(i,s,e) for(long long int i=s; i<e; i++)
#define cf(i,s,e) for(long long int i=s; i<=e; i++)
ll Dfn(ll idx, ll taken, ll n, ll k, ll arr[]);
ll giveAns(ll arr[], ll n, ll k);
void mergeSort (ll a[], ll beg, ll end);
void merge (ll a[], ll beg, ll mid, ll end);
void swap(ll *a, ll *b);
ll min(ll a, ll b);

ll dp[4020][4020];
ll pref[4020];

ll Dfn(ll idx, ll taken, ll n, ll k, ll arr[]) {
    if(taken >= k && (pref[idx]-taken)>=k)  return 0;
    else if (idx >= n)  return 1e10;
    else if (dp[idx][taken] != -1)  return dp[idx][taken];

    ll c1 = Dfn(idx+1, min(taken+arr[idx], pref[idx]-taken), n, k, arr);
    ll c2 = Dfn(idx+1, min(pref[idx]-taken+arr[idx], taken), n, k, arr);

    dp[idx][taken] = 1+min(c1, c2);
    return dp[idx][taken];
}

ll giveAns(ll arr[], ll n, ll k) {
    f(i, 0, n/2) swap(&arr[i], &arr[n-i-1]);
    cf(i, 0, n+10) {
        pref[i] = 0;
        cf(j, 0, k+10)  dp[i][j] = -1;
    }
    cf(i, 1, n) pref[i] = pref[i-1] + arr[i-1];
    ll ans = Dfn(0, 0, n, k, arr);
    return ans > 1e9 ? -1 : ans;
}

void merge(ll arr[],ll p,ll q,ll r)
{
    ll n1 = q-p+1;
    ll n2 = r-q;
    ll a[n1+1],b[n2+1];

    for(ll i=0;i<n1;i++)
        a[i] = arr[p+i];
    for(ll i=0;i<n2;i++)
        b[i] = arr[q+1+i];

    a[n1] = b[n2] = LONG_MAX;
    ll i=0,j=0;
    for(ll k=p;k<=r;k++)
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
    }
}
void mergeSort(ll arr[], ll p,ll r)
{
    if(p<r)
    {
        ll q = (p+r)/2;
        mergeSort(arr,p,q);
        mergeSort(arr,q+1,r);
        merge(arr,p,q,r);
    }
}

void swap(ll *a, ll *b) {
    ll temp = *a;
    *a = *b;
    *b = temp;
}
ll min(ll a, ll b) {
    return (a <= b) ? a : b;
} 

int main() {
    int t;
    scanf("%d", &t);
    while(t-- > 0) {
        ll n, k;
        scanf("%lld %lld", &n, &k);
        ll h[n];
        for (ll i=0; i<n; i++)
            scanf("%lld", &h[i]);
        if (n == 1) printf("-1\n");
        else {
            mergeSort(h, 0, n-1);
            printf("%lld\n", giveAns(h, n, k));
        }
    }
}