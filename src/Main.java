import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        user.name = "Nazar";
        user.surname = "Vavrushchak";
        user.age = 18;
        user.setPassword("secret-password");
        Field[] fields = user.getClass().getFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(PrintField.class)){
                System.out.println("Java see our annotation");
            }
        }
        PrintFieldAnnotationLogic logic = new PrintFieldAnnotationLogic(user);
        logic.printAnnotatedFields();
    }
}