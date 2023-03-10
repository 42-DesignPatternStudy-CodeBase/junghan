package bridgePattern;

import bridgePattern.impl.AbstractList;

public class Stack<T> extends List<T>{
    public Stack(AbstractList<T> list) {

        super(list);
        System.out.println("Stack를 구현합니다.");
    }

    public void push(T obj) {
        impl.addElement(obj);
    }

    public T pop() {
        return impl.deleteElement(getSize() - 1);
    }

}
