import java.util.*;

class emp implements Comparable<emp>{
    int id;

    emp(int id){
        this.id = id;
    }

    @Override
    public int compareTo(emp e) {
        return this.id - e.id;
    }

    public String toString(){
        return "Id: " + id;
    }
}
public class empID {
    public static void main(String[] args) {
        List<emp> ob = new ArrayList<>();

        ob.add(new emp(10));
        ob.add(new emp(5));
        ob.add(new emp(2));
        ob.add(new emp(5));

        Collections.sort(ob);
        System.out.println(ob);
    }
}