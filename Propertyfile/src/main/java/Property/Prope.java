package Property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prope
{
public static void main(String[] args) throws IOException 
{

FileReader f= new FileReader("C:\\Users\\syamr\\eclipse-workspace\\Propertyfile\\src\\main\\resources\\Login.properties");

Properties p= new Properties();

p.load(f);

System.out.println(p.getProperty("userid"));

System.out.println(p.getProperty("password"));

}	// TODO Auto-generated method stub}



}
