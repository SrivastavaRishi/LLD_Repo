package BehaviorDesingPattern.Template;

public abstract class Template {
    public abstract void fun1();
    public abstract void fun2();
    public abstract void fun3();
    public abstract void fun4();
    public final void implementation(){
        fun1();
        fun2();
        fun3();
        fun4();
    }
}
