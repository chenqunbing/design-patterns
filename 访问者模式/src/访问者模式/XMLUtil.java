package 访问者模式;
import java.io.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class XMLUtil {
	public static String getClassName() {
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("config.xml"));
			
			NodeList n1=doc.getElementsByTagName("className");
			String brandName = n1.item(0).getFirstChild().getNodeValue().trim();
			return brandName;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public static Visitor getBean() {
		String className = getClassName();
		
		String classNameFinal=XMLUtil.class.getPackage().getName()+"."+className;
		try {
//			System.out.println(classNameFinal);
			Class forName = Class.forName(classNameFinal);
			Object newInstance = forName.newInstance();
			return  (Visitor) newInstance;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
