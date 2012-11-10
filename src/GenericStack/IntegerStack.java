package GenericStack;

//The IntegerStack can only store Integer, so what if i want to store String, Boolean, Double, Map, or some other
//objects. What could i use?

public class IntegerStack {

    private StackNode top = new StackNode();

    public void push(int val) {
        top = new StackNode(val, top);
    }

    public Integer pop() {
        if (top.empty())
            throw new NullPointerException();
        Integer result = top.val;
        top = top.topPointer;
        return result;
    }

    private class StackNode {
        private StackNode topPointer;
        private Integer val;

        public StackNode(Integer val, StackNode topPointer) {
            this.val = val;
            this.topPointer = topPointer;
        }

        public StackNode() {
            this.topPointer = null;
            this.val = null;
        }

        public boolean empty() {
            if (topPointer == null)
                return true;
            return false;
        }
    }
}
