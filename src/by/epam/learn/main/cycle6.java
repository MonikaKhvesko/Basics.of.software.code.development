package by.epam.learn.main;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class cycle6 {
    public static void main(String[] args) {
        for(char a=0;a<255;a++){
            try {
                System.out.printf(a +"(" + (int)a  + "), ");
            } catch (Exception ex) {
                System.out.printf("Exeption(" + (int)a + "), ");
            }
        }

    }
}
