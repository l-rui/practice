package practice.algorithm;

import java.util.Stack;

/**
 * Created by l-rui on 2017/3/23.
 * Implement the following operations of a queue using stacks:
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 *
 * 使用堆栈实现队列的以下操作:
 * push(x) -- 将元素x添加到队列的后面。
 * pop() -- 从队列前面删除元素。
 * peek() -- 获取前面的元素。
 * empty() -- 返回队列是否为空。
 */
public class StacksQueue {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    /** Initialize your data structure here. */
    public StacksQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!stack.isEmpty())
        {
            stack2.push(stack.pop());
        }
        stack2.push(x);
        while(!stack2.isEmpty())
        {
            stack.push(stack2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

}
