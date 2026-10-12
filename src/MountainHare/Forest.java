package MountainHare;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares = new ArrayList<>();
    static private String season;

public Forest (ArrayList<MountainHare> hares){
    this.hares = hares;
}

    public String setSeason() {
        return season;
    }

    static void setSeason(String newSeason) {
        if (newSeason.equals("Зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    @Override
    public String toString() {
        return "Forest{" +
                "hares=" + hares +
                '}';
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}


//public class Forest {
//    private ArrayList<MountainHare> hares;
//
//    // объявите недостающие переменные и добавьте конструктор
//
//    // добавьте метод setSeason(String newSeason)
//    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
//
//    // добавьте метод printHares()
//
//}