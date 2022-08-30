import java.lang.reflect.Method;

public class simpleUnitTester {
    int failedCount = 0;

    public int execute(Class clazz) throws Exception {


        // your code
        Method[] mth = clazz.getDeclaredMethods();
        for (Method m: mth){
            String mName = m.getName();
            System.out.println(m);
            if(mName.startsWith("test") && m.getReturnType() == boolean.class){
                System.out.println(mName);
                Class<?> r = m.getReturnType();
                Object obj = clazz.getDeclaredConstructor().newInstance();
                Object prova = m.invoke(obj);
                if ((boolean) prova){

                } else {
                    failedCount++;
                }
            }
        }
        return failedCount;
    }

    public static void main(String[] args) throws Exception {
        Class<?> ref = Class.forName("Reflection");


        simpleUnitTester unit = new simpleUnitTester();

        System.out.println(unit.execute(ref));

    }

}