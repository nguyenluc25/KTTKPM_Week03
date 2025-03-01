import singleton.BillPughSingleton;
import singleton.EagerInitializedSingleton;
import singleton.LazyInitializedSingleton;
import singleton.StaticBlockSingleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton.hashCode());

        EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton1.hashCode());

        System.out.println("-------------------------------");

        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton.hashCode());

        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton1.hashCode());

        System.out.println("-------------------------------");

        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        System.out.println(lazyInitializedSingleton.hashCode());

        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
        System.out.println(lazyInitializedSingleton1.hashCode());

        System.out.println("-------------------------------");

        


    }
}