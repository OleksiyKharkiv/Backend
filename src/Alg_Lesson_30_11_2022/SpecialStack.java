package Alg_Lesson_30_11_2022;

import java.util.Stack;

public class SpecialStack {
    //TODO:
    // Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
    // такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
    // которая должна возвращать минимальный элемент из SpecialStack.
    // *** Все эти операции SpecialStack должны быть O(1). Пространство O(n) ***

    private final Stack<Integer> stack = new Stack<>();

    public void push(int e) {
        stack.push(e);
    }

    public void pop() {
        stack.pop();

    }

    public void peek() {
        stack.peek();

    }

    public void empty() {
        stack.empty();

    }

    public void size() {
        stack.size();

    }
    public void print() {
        System.out.println(stack);
    }

    public void getMin() {
//        stack.stream().min();
    }
}
