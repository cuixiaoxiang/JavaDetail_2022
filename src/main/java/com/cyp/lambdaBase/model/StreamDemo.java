package com.cyp.lambdaBase.model;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

    }

    private static List<Author> getAuthors() {
        //数据初始化
        Author author1 = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);

        Author author2 = new Author(2L, "亚索", 15, "狂风也追不上他的思考速度", null);
        Author author3 = new Author(3L, "易", 14, "是这个世界在限制它的思维", null);
        Author author4 = new Author(3L, "易", 14, "是这个世界在限制它的思维", null);
//书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();
        List<Book> books4 = new ArrayList<>();

        return null;
    }
}
