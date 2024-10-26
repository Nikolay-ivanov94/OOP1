public class Hogwarts {
    public static void main(String[] args){
        Slytherin dracoMalcfoy = new Slytherin("Draco Malfoy", 90, 67, 76, 60, 80);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 70, 50, 40, 77, 68);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 70, 92, 89,23,66);

        Claw choChang = new Claw("Cho Chang", 75, 34, 78,68,95);
        Claw padmaPatil = new Claw("Padma Patil", 64, 86,29,26,96);
        Claw marcusBelby = new Claw("Marcus Belby", 26, 54, 76,54,36);

        Puffendui zachariasSmith = new Puffendui("Zacharias Smith", 94, 91, 3,17,35);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 25, 49, 23,79,44);
        Puffendui justinFinchFletchley = new Puffendui("Justin Finch-Fletchley" , 27, 85, 30,20,19);

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 75, 95, 50,70,99);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 100, 90, 100,100,95);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50,30,10,67,35);

        //Gryffindor
        harryPotter.studentInformationGryffindor();
        hermioneGranger.studentInformationGryffindor();
        ronWeasley.studentInformationGryffindor();

        System.out.println();
        //Puffendui
        zachariasSmith.studentInformationPuffendui();
        cedricDiggory.studentInformationPuffendui();
        justinFinchFletchley.studentInformationPuffendui();

        System.out.println();
        //Claw
        choChang.studentInformationClaw();
        padmaPatil.studentInformationClaw();
        marcusBelby.studentInformationClaw();

        System.out.println();
        //Slytherin
        dracoMalcfoy.studentInformationSlytherin();
        grahamMontague.studentInformationSlytherin();
        gregoryGoyle.studentInformationSlytherin();

        System.out.println();

        Gryffindor.studentComparisonGryffindor(harryPotter, hermioneGranger);
        Puffendui.studentComparisonPuffendui(zachariasSmith, justinFinchFletchley);
        Claw.studentComparisonClaw(padmaPatil, marcusBelby);
        Slytherin.studentComparisonSlytherin(dracoMalcfoy, gregoryGoyle);

        System.out.println();

        Student.powerOfMagicTransgressionDistance(dracoMalcfoy, harryPotter);
    }
}