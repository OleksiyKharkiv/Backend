package DZ_27_10_2022;

import java.util.Comparator;

class PowerComparator implements Comparator, PowerComparatorInterface {
    @Override
    public int compare(Motorcycles mot1, Motorcycles mot2) {
        return Integer .compare(mot1.power(), mot2.power());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
