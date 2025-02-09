package chapter01.exercise005;

public class Exercise005 {
    public static void main(String[] args) {
        var sql = """
        SELECT S_NAME FROM STUDENT S\
        WHERE EXISTS (\
            SELECT 1 FROM STUDENT_COURSE SC\
            WHERE S.S_ID = SC.S_ID AND SC.C_ID = 'C1'\
        );\
""";
        System.out.println(sql.trim().replaceAll(" +", " "));
        
    }

}
