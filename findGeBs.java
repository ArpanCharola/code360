class findGeBs {
    public static void main(String[] args) {
        findGeBs sol = new findGeBs();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(sol.nextGreatestLetter(letters, target)); // Output: 'c'
    }   
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        // Binary search for smallest letter greater than target
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If left goes past the last index, wrap around to first letter
        return letters[left % letters.length];
    }
}
