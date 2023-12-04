package learn.dsa.string.medium;

import java.util.Stack;
/*
 * Leetcode - https://leetcode.com/problems/simplify-path/
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
	In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.
	The canonical path should have the following format:
	
	The path starts with a single slash '/'.
	Any two directories are separated by a single slash '/'.
	The path does not end with a trailing '/'.
	The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
	Return the simplified canonical path.
	
	Example 1:
	
	Input: path = "/home/"
	Output: "/home"
	Explanation: Note that there is no trailing slash after the last directory name.
	
	Example 2:
	
	Input: path = "/../"
	Output: "/"
	Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
	
	Example 3:
	
	Input: path = "/home//foo/"
	Output: "/home/foo"
	Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
	
	Constraints:
	
	1 <= path.length <= 3000
	path consists of English letters, digits, period '.', slash '/' or '_'.
	path is a valid absolute Unix path.
 */
public class M_71Simplify_Path {
	public static void main(String[] args) {
		System.out.println(new M_71Simplify_Path().simplifyPath("/home//foo/"));
	}
	public String simplifyPath(String path) {
		//Deque<String> dq = new ArrayDeque<String>(); // This will not work because iteration order for Deque is top to bottom and here it will be opposite for our answer
		Stack<String> dq = new Stack<String>();
		for(String each : path.split("/")) {
			System.out.println("each : "+each+ " dq : "+dq);
			if(each.equals("..")) {
				if(!dq.isEmpty()) {
					dq.pop();
				}
			}else if(!each.equals(".") && each.length()>0) {
				dq.push(each);
			}
		}
		System.out.println("dq : "+dq.toString());
		return "/"+String.join("/",dq); 
	}
}
