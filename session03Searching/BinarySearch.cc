/*
	



 */


int recursiveBinarySearch(int x[], int L, int R, int target) {
	if ( )
		return;

	return ...

}
int binarySearchCallsRecursive(int x[], int n, int target) {
	return recursiveBinarySearch(x, 0, n-1, target);

//O(log2 n) omega(1)
int binarySearch(int x[], int n, int target) {
	int L = 0, R = n-1;
	while (R > L) {
		int guess = (L+R)/2;
		if (target > x[guess])
			L = guess + 1;
		else if (target < x[guess])
			R = guess - 1;
		else
			return guess;
	}
	return -1;
}


//binarySearch(list, n, 100000000000); //O(1)

//O(log2 n) omega(1)
int binarySearch(int x[], int n, int target) {
	if (x[n-1] > target || x[0] < target)
		return -1;
	int L = 0, R = n-1;
	while (R > L) {
		int guess = (L+R)/2;
		if (target > x[guess])
			L = guess + 1;
		else if (target < x[guess])
			R = guess - 1;
		else
			return guess;
	}
	return -1;
}
