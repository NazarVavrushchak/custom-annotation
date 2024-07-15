import java.lang.reflect.Field;

public class PrintFieldAnnotationLogic {
    private Object obj;

    public PrintFieldAnnotationLogic(Object obj) {
        this.obj = obj;
    }

    public void printAnnotatedFields() throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(PrintField.class)) {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(obj));
            }
        }
    }
}