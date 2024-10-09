public class utama
{
    public static void main(String[] args) throws Exception
    {
        student s1 = new student("Test", 10);
        student s2 = new student();

        tutor t = new tutor(s1, s2);
        t.s1.details();
    }
}
