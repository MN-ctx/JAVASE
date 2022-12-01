// sss
package com.itheima.test;

// import com.itheima.test2.Student;

import com.itheima.test2.Student;
//import com.itheima.test3.Student;

/*
    不同包下的相互访问

        1. 先导包后访问 (import)
        2. 通过全类名(包名+类名)访问
                com.itheima.test2.Student stu = new com.itheima.test2.Student();
                应用场景: 多个包下,出现了相同的类名称, 就可以使用这种访问进行区分
 */
public class TestPackage {
    public static void main(String[] args) {
        Student stu = new Student();

        com.itheima.test3.Student stu2 = new com.itheima.test3.Student();
    }
}
