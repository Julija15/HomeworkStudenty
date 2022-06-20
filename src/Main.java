import javax.naming.Name;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        Student student0 = new Student("Anna");
        Student student1 = new Student("Vasja");
        Student student2 = new Student("Vlad");
        Student student3 = new Student("Mariya");
        Student student4 = new Student("Julija");
        students.add(student0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);
        Stream<Student> studentStream = students.stream();
        HashMap<Name, Student> studentHashMapHashMap = new HashMap<>();
        HashSet<Student> students1 = new HashSet<>();

        // Вернуть количество людей с моим именем в независимости от регистра
        int n = (int) studentStream.filter(student4::equals).count();
        System.out.println(n);

        // выбрать имена на А
//        Predicate<Student> aName;
//        aName = (student) -> {
//            if ('A' != student.hashCode ()) {
//                return false;
//            }
//            return true;
//        };
//        Stream<Student> studentStream1 = students.stream(); // Конвертация массива в поток строк
//        Stream<Student> resStream = studentStream1.filter(aName); // Получаем список, отфильтрованный по предикату
//        System.out.println(resStream); // Выводим количество имен
    }

}
