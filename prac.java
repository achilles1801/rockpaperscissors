public class prac {

    public double getAvg(double[] avgs) throws IllegalArgumentException {

        double exam1;
        double exam2;
        double exam3;
        if (avgs.length != 3 || avgs == null) {
            throw new IllegalArgumentException();

        } else {
            exam1 = avgs[0];
            exam2 = avgs[1];
            exam3 = avgs[2];

            return ((exam1 * .27) + (exam2 * .27) + (exam3 * .3)) / .84;
        }

    }

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            int remainder = x % y;
            return gcd(y, remainder);
        }
    }

    public static void main(String[] args) {
        double[] grades = { 90.0, 80.0, 90.0 };
        prac yuh = new prac();
        double average = yuh.getAvg(grades);
        System.out.println(yuh.gcd(8, 4));


    }

}

public void addAtIndex(<T> data , int ind){
    if (ind >= 0 && ind<= size) // check if ind is valid 
    if (head == null && size == 0) //handle first edge case (emptiness) {
        head = new Node<t>(data,head); //make a new head which is currently pointing to null 
    
    else {
    //edgecaseforfirstindex
    }
    else if (){
    Node<T> current = head;
    Int index = 0; //keep track of where were at in the linked list 
    while(current!=null){
    if (index == ind-1){
    Node<t> newNode = new Node<t>(data); /* the node were tryna insert in between the head (current) and the one next to it */
    newNode.next = current.next; // make them point the same direction
    curr.next = newNode; //my new node becomes inserted 
    Size++; //we just added an element 
    }
    else {
    Current = current.next; // go to the next node 
    Index++; //keep track of index 
    }
    }
    }
}

public int rsum(int[] arr) {
    return rsum(arr, 0);
}

private int rsum(int[] arr, int n) {
    if (n >= arr.length) {
        return 0;
    } else {
        return arr[n] + rsum(arr, n + 1);
    }
}
    
int rBinarySearch(int[] arr, int target) {
    return rbinarySearch(arr, 0, arr.length - 1, target);
}

int rBinarySearch(int[] arr, int start, int end, int target) {
    if (end < start) { // base case
        return -1;
    }
    int mid = (start + end) / 2;
    if (target == arr[mid]) {
        return mid; // base case
    } else if (target < arr[mid]) {
        return rBinarySearch(arr, start, mid - 1, target); // recursive case
    } else {
        return rBinarySearch(arr, mid + 1, end, target); // recursive case
    }
}

public void reverseListRecursively(ArrayList<String> list) {
    reverseListRecursively(list, 0, list.size() - 1);
}

public void reverseListRecursively(ArrayList<String> list, int left, int right) {
    if (left < right) {
        // Swap
        String temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
        // Recurse
        reverseListRecursively(list, left + 1, right - 1);
    }
}