package ReadAgain.设计模式.行为型.Iterator;

public class ConcreteAggregate  implements Aggregate{

    private Integer[] items;

    public ConcreteAggregate(){
        items = new Integer[10];
        for(int i = 0; i < items.length; i++){
            items[i] = i;
        }
    }


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
