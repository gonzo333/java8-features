public interface Formula {

    default double calculate (int a){
        return Math.abs(a);
    }
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
