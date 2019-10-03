## 1. Java中栈的实现：Stack关键字

> 后进先出

```java
// 声明栈(此处以Integer类型为例)
Stack<Integer> stack = new Stack<>(); 

stack.push(1);//则将当前对象的头节点存入栈中
stack.push(2);
stack.push(3);

while(!stack.isEmpty()){  //若当前的栈不为空
	System.out.println(stack.pop());//出栈，先输出后进来的
}
```

## 2. Java中队列的实现：

> 先进后出

```java
//Java中LinkedList提供了方法以支持队列的行为，并且它实现了Queue接口，因此LinkedList可以用作Queue的一种实现
Queue<Integer> queue = new LinkedList<>(); //声明队列
queue.offer(1); //添加数据
queue.offer(2);
queue.offer(3);

//出队
while (queue.peek()!=null) //判断队列是否为空
	System.out.println(queue.poll()); //输出队列中的元素
```

