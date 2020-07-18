package by.epam.learn.main;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class LineProgram4 {
    public static void main(String[] args) {
        double R=111.444;
        Double X=(R*1000)%1000+(int)R/1000.0;
        System.out.println(X);
    }
}
