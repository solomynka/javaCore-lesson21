package lesson21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AppAnnotation {

	public static void main(String[] args) throws Exception {
		
		serialAnnotField(Car.class);
		
	}
public static void serialAnnotField(Class<?> customClass) throws Exception {
	
	Field [] fields = customClass.getDeclaredFields();
	
	for (int i = 0; i < fields.length; i++) {
		Field field = fields[i];
		if(field.getAnnotation(CarAnnotation.class) instanceof CarAnnotation) {
			File file = new File("car.txt");
			
			String annotationValues = field.getAnnotation(CarAnnotation.class).value();
			List<String> val = new ArrayList<>();
			val.add(annotationValues);
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(val);
			oos.close();
			System.out.println("Анотація "+ field.getAnnotation(CarAnnotation.class).value()+ " записана в файл " + file);
		}
		if(!(field.getAnnotation(CarAnnotation.class) instanceof CarAnnotation)) {
			System.out.println(field.getName() + " без анотації");
		}
	}
}


}
