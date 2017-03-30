package practice.algorithm;

import java.util.Stack;

/**
 * Created by lirui on 2017/3/30.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * 设计一个栈，支持推，弹出，顶部，并在常量时间检索最小元素。
 * push(x) -- 将元素X推到堆栈上。
 * pop() -- 移除栈顶部的元素。
 * top() -- 获取栈顶部元素。
 * getMin() -- 检索堆栈中的最小元素。
 * 思路：设计一个辅助栈，
 * 1、push时，比较当前元素与栈顶元素，当且仅当该元素小于等于栈顶元素时，将元素放入该栈中，否则只放入普通栈中；
 * 2、pop时，比较普通栈栈顶元素和辅助栈栈顶元素，一致则都删除，否则只删除普通栈栈顶元素。
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        if (this.minStack.isEmpty() || x <= this.minStack.peek()) {
            this.minStack.push(x);
        }
        this.stack.push(x);
    }

    public void pop() {
        if (this.stack.peek().equals(this.minStack.peek())) {
            this.minStack.pop();
        }
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }
}
