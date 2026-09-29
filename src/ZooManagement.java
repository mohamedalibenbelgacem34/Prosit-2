public class ZooManagement {
    public static void main(String[] args) {

        // Animal lion = new Animal();
        // lion.family = "Félin";
        // lion.name = "Simba";
        // lion.age = 5;
        // lion.isMammal = true;

        // Zoo myZoo = new Zoo();
        // myZoo.name = "Belvédère";
        // myZoo.city = "Tunis";
        // myZoo.nbrCages = 20;
        // myZoo.animals = new Animal[25];

        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal aigle = new Animal("Oiseau", "Rex", 3, false);
        Animal singe = new Animal("Primate", "Coco", 7, true);

        Zoo myZoo = new Zoo("Belvédère", "Tunis", 20);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = aigle;
        myZoo.animals[2] = singe;

        myZoo.displayZoo();
        // System.out.println(myZoo);
        // System.out.println(myZoo.toString());

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
    }
}