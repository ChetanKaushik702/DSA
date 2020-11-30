class Leaders2 {
    public static void leaders(int a[]) {
        System.out.print(a[a.length-1] + " ");
        int offset = a[a.length -1];
        for (int i=a.length-2; i>=0; i--) {
            if (a[i] >= offset) {
                System.out.print(a[i] + " ");
                offset = a[i];
            }
        }
    }
}
