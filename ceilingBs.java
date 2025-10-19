package BinarySearch;

class ceiling {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return letters[left % letters.length];
    }

    public static void main(String args[]){
    ceiling obj = new ceiling();
    char[] letters = {'c', 'f', 'j'};
    char target = 'f';
    char result = obj.nextGreatestLetter(letters, target);
    System.out.println("The smallest letter greater than target is: " + result);
}
}
