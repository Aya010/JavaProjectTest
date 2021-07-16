package entity;

import java.util.List;

public class Josephul {
    private int start;
    private int step;
    private int index;
    public List<Person> people;

    public Josephul(int start, int step) {
        this.start = start;
        this.step = step;
        this.index = this.start - 1;
    }

    public void append(Person person) {
        this.people.add(person);
    }

    public Person pop() {
        index = get_pop_order(index);
        return people.remove(index);
    }

    private int get_pop_order(int current) {
        int num = people.size();
        current = (current + step - 1) % num;
        return current;
    }
}
