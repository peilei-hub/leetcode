package leet.leet21_40;

/**
 * @author: wangpeilei
 * @date: 2021/04/27 23:29
 **/
public class A28 {
    public static void main(String[] args) {

    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle == null || needle.length() == 0) {
                return 0;
            }
            char[] charArray = haystack.toCharArray();
            char[] needleArray = needle.toCharArray();

            // 思想：长度为needleArray.length的子串顺序匹配一次
            for (int i = 0; i < charArray.length; i++) {
                for (int j = 0; j < needleArray.length; j++) {
                    if (i + j > charArray.length - 1) {
                        return -1;
                    }

                    if (charArray[i + j] != needleArray[j]) {
                        break;
                    }

                    if (j == needleArray.length - 1) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

}
