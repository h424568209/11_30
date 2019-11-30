public class Main_11_27_2 {
    /**
     * 子串判断
     * @param p  数组
     * @param n  位数
     * @param s 字符串
     * @return 是否是s的子串
     */
    public boolean[] chkSubStr(String[] p, int n, String s) { // 创建boolean数组
        boolean[]hasSub=new boolean[p.length]; //遍历数组 使用集合中特有功能
        for (int i = 0; i < p.length; i++) {
        hasSub[i]=s.contains(p[i]);
        }
        return hasSub;
        }
}
