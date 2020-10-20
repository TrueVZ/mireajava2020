package ru.mirea.lab14;

public class Search {
    public static Comparable linearSearch(Comparable[] arr, Comparable target) {
        int index = 0;
        boolean found = false;
        while (index < arr.length && !found) {
            if (arr[index].compareTo(target) == 0) {
                found = true;
            } else {
                index++;
            }
        }
        if (found) {
            return arr[index];
        }
        return null;
    }

    public static Comparable binarySearchRec(int l, int r, Comparable[] arr, Comparable target) {
        if (r >= l && l < arr.length - 1) {
            int mid = (l+r) / 2;
            if (arr[mid].compareTo(target) == 0) {
                return arr[mid];
            }
            if (arr[mid].compareTo(target) > 0) {
                return binarySearchRec(l, mid - 1, arr, target);
            }
            return binarySearchRec(mid + 1, r, arr, target);
        }
        return null;
    }

    public static Comparable binarySearch(Comparable[] arr, Comparable target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid].equals(target)) {
                return arr[mid];
            }
            if (arr[mid].compareTo(target) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return null;
    }
}


