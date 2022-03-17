import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {
    
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        Collections.sort(heroes);
        System.out.println("\nOrder by name:");
        showList(heroes);
            
        Comparator<Hero> heroAgeComparator = new Comparator<Hero>(){
            @Override
            public int compare(Hero hero1, Hero hero2) {
                return Integer.compare(hero2.getAge(), hero1.getAge());
            }
        };

        Collections.sort(heroes, heroAgeComparator);
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> hero) {
        for (Hero heroes : hero) {
            System.out.println(heroes.getName() + ", " + heroes.getAge());
        }    
    }

}