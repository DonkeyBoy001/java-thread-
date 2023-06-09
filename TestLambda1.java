

public class TestLambda1 {

    // 3. 静态内部类

    // 2. 实现类
    static class Like2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        ILike like2 = new Like2();
        like2.lambda();

        // 4. 局部内部类
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }

        like = new Like3();
        like.lambda();

        // 5. 匿名内部类, 没有类的名称，必须 借助接口 or 父类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();

        // 6. lambda简化
        like = () -> {
            System.out.println("I like lambda5");
        };
        like.lambda();
    }
}


// 1. 定义一个函数式接口
interface ILike {
    void  lambda();
}

class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("I like lambda1");
    }
}
