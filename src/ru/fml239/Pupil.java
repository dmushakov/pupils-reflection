package ru.fml239;

public class Pupil
{
    private int grade = 1;
    private boolean repeat = false;
    public static int musor = 10;
    Pupil(int grade)
    {
        this.grade = grade;
    }
    public void nextGrade()
    {
        if (grade < 12)
            grade++;
    }
    public void toRepeat()
    {
        repeat = true;
    }
    @Override
    public String toString()
    {
        String res;
        switch (grade)
        {
            case 1: res = "1st grade";
                break;
            case 2: res = "2nd grade";
                break;
            case 3: res = "3rd grade";
                break;
            case 12: res = "graduate";
                break;
            default: res = "" + grade + "th grade";
        }
        return res + (repeat ? ". Repeat" : "");
    }
    public int getGrade()
    {
        return grade;
    }
    public boolean isRepeat()
    {
        return repeat;
    }
    public float getAge(int age)
    {
        return (float) grade/age;
    }
}
