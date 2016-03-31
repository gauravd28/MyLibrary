import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModelMaker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ModelMaker m = new ModelMaker();
		String[] members =new String[]{"int","Roll_Number","String","Name","float","Marks"};
		m.makeModel("Student",members);
		System.out.println("DOne!!!");
	}
	
	public void makeModel(String name, String[] members) throws IOException
	{
		String filename=name+".java";
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
		
		/*
		 *  Start Class
		 */
		
		bw.write("public class "+name+" {\n\n");
		
	
		
		/*
		 * Default constructor;
		 */
		bw.write("\t/*\n\t * Constructors\n\t*/\n\n");;
		bw.write("\tpublic "+name+"(){\n\n");
		
		for(int i=0;i<members.length;i=i+2)
		{
			switch(members[i])
			{
			case "int":
				bw.write("\tthis."+members[i+1]+" = 0;\n");
				
				break;
				
			case "long":
				bw.write("\tthis."+members[i+1]+" = 0;\n");
				
				break;
				
			case "String":
				bw.write("\tthis."+members[i+1]+" = null;\n");
				
				break;
				
			case "float":
				bw.write("\tthis."+members[i+1]+" = 0.0;\n");
				
				break;
				
			case "double":		
				bw.write("\tthis."+members[i+1]+" = 0.0;\n");
				
				break;
				
			
			}
			
		}
		bw.write("\n\t}\n\n");
		
		
		
		
		
		/*
		 * Start Parameterized Constructor
		 */
		
		String paraList="";
		bw.write("\tpublic "+name+"(");
		for(int i=0;i<members.length;i=i+2)
		{
			if(paraList.equals(""))
				paraList = members[i]+" "+members[i+1];
			else
				paraList = paraList+", "+members[i]+" "+members[i+1];
		}
		bw.write(paraList);
		bw.write("){\n\n");
		
		
		
		for(int i=0;i<members.length;i=i+2)
		{
			bw.write("\tthis."+members[i+1]+" = "+members[i+1]+";\n");
			
		}
		bw.write("\n\t}\n\n");
		
		
		
		
		/*
		 * Start Setters and Getters
		 */
		bw.write("\t/*\n\t * Setters and Getters\n\t*/\n\n");;
		for(int i=0;i<members.length;i=i+2)
		{
			String type = members[i];
			String var = members[i+1];
			
			bw.write("\tpublic void set"+var.toUpperCase()+"("+type+" "+var+" ){\n\n");
			
			bw.write("\tthis."+var+" = "+var+";\n\n\t}");
			
			
			
			bw.write("\n\n\tpublic "+type+" get"+var.toUpperCase()+"(){\n\n");
			
			bw.write("\treturn this."+var+";\n\n\t}");
			
		}
		
		
		/*
		 * TO String function
		 */
		bw.write("\n\n\t/*\n\t * Overridden toString Function\n\t*/\n\n");;
		bw.write("\n\n\t@Override\n");
		String memberList="";
		bw.write("\tpublic String toString(){\n\n"); 
		bw.write("\treturn ");
		for(int i=0;i<members.length;i=i+2)
		{
			if(memberList.equals(""))
				memberList = "\""+members[i+1]+" = \"+this."+members[i+1];
			else
				memberList =memberList+ "+ \", \"+"+"\""+members[i+1]+" = \"+this."+members[i+1];
		}
		memberList += ";";
		bw.write(memberList+"\n\n\t}");
		
		
		/*
		 * Close Class
		 */
		
		bw.write("\n\n}");
		bw.close();
	}

 @Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
