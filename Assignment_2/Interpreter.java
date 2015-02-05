import java.io.FileNotFoundException;
import java.io.*;


public class Interpreter {

	public Interpreter() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	protected void findJavaMethods()
	{
		FileReader fr=null;
		BufferedReader br=null;
		String content=new String();
		String line=new String();
		
		try
		{
			fr=new FileReader("input.txt");
			br=new BufferedReader(fr);
			String classNm=new String();
			
			while((line=br.readLine())!=null)
			{
				if(line.contains("class"))
				{
					System.out.println("class:"+line.substring(0,line.length()-1));
					String []strArr=line.split(" ");
					if(strArr.length>3)
					{
						System.out.println("Access specifier:"+strArr[0]);
						System.out.println("class name:"+strArr[2]);
						classNm=strArr[2];
					}
					else
					{
						System.out.println("Access specifier:default");
						System.out.println("class name:"+strArr[1]);
						classNm=strArr[1];
					}
				}
				
				if(line.contains("(")&&line.contains(")"))
				{
					if(line.contains("for")||line.contains("catch")||line.contains("print")||line.contains("if")||line.contains("=")||line.contains("while")||line.contains(classNm))
					System.out.println("");
					else
					{
					String str=line;
					int i=0;
					for(i=0;i<str.length();)			
					{
						if(str.charAt(i)==' ')
						i++;	
						else
						break;		
					}
					System.out.println("Indentation:"+i);
						line=line.trim();
						String []strArr=line.split(" ");
						
						if(line.contains("public")||line.contains("private")||line.contains("protected"))
						{
							System.out.println("method Access Specifier:"+strArr[0]);
							System.out.println("method is:"+line.substring(0,line.length()-1));
						}
						else
						{
							System.out.println("method Access Specifier:default");
							System.out.println("method is:"+line.substring(0,line.length()-1));
						}
						
					}
					
					
				}
				if(line.contains("int")||line.contains("String")||line.contains("char")||line.contains("float")||line.contains("boolean"))
				{
					if(line.contains("(")&&line.contains(")"))
					{}
					else if(line.contains(";"))
					{
						System.out.println("properties"+line);
					}
					
				}
				
			}
				
			//System.out.println(""+content);
		}
		catch(Exception e)
		{
			System.out.print("Exception"+e);
		}
		
		try
		{
			fr.close();
		}catch(Exception e){}


	}
	protected void findPhpMethod()
	{
		FileReader fr=null;
		BufferedReader br=null;
		String content=new String();
		String line=new String();
		
		try
		{
			fr=new FileReader("input.txt");
			br=new BufferedReader(fr);
			String classNm=new String();
			
			while((line=br.readLine())!=null)
			{
				if(line.contains("class"))
				{
					System.out.println("class:"+line.substring(0,line.length()-1));
					String []strArr=line.split(" ");
					
						System.out.println("class name:"+strArr[1]);
						
					
				}
				
				if(line.contains("(")&&line.contains(")")&&line.contains("function"))
				{
					String str=line;
					int i=0;
					for(i=0;i<str.length();)			
					{
						if(str.charAt(i)==' ')
						i++;	
						else
						break;		
					}
					System.out.println("indentation:"+i);
					line=line.trim();
					String []strArr=line.split(" ");
					if(strArr.length>3)
					{
						System.out.println("function name:"+strArr[2]);
						System.out.println("function Access specifier:"+strArr[0]);
					}
					else
					System.out.println("function name:"+strArr[1]);
					
					
				}
				
				if(line.contains("$"))
				{
					if(line.contains("->")||line.contains("{")||line.contains("(")){}
					else
					System.out.println("properties:"+line);				
				}
			}

				
			//System.out.println(""+content);
		}
		catch(Exception e)
		{
			System.out.print("Exception"+e);
		}
		
		try
		{
			fr.close();
		}catch(Exception e){}

	}
	protected void findRubyMethod()
	{
		FileReader fr=null;
		BufferedReader br=null;
		String content=new String();
		String line=new String();
		
		try
		{
			fr=new FileReader("input.txt");
			br=new BufferedReader(fr);
			String classNm=new String();
			
			while((line=br.readLine())!=null)
			{
				if(line.contains("class"))
				{
					System.out.println("class:"+line.substring(0,line.length()-1));
					String []strArr=line.split(" ");
					
						System.out.println("class name:"+strArr[1]);
						
					
				}
				
				if(line.contains("def"))
				{
					String str=line;
					
					int i=0;
					for(i=0;i<str.length();)			
					{
						if(str.charAt(i)==' ')
						i++;	
						else
						break;		
					}
					System.out.println("indentation:"+i);
					line=line.trim();
					String []strArr=line.split(" ");
					char []whiteSpaces=line.toCharArray();
					
					if(strArr.length>3)
					{
						System.out.println("function name:"+strArr[2]);
						
					}
					else
					System.out.println("function name:"+strArr[1]);
					
					
				}
				if(line.contains("@"))
					System.out.println("properties"+line);
				
				
			}
				
			//System.out.println(""+content);
		}
		catch(Exception e)
		{
			System.out.print("Exception"+e);
		}
		
		try
		{
			fr.close();
		}catch(Exception e){}

	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=null;
		
		BufferedReader br=null;
		String content=new String();
		String line=new String();
		String str="         teju";
		//System.out.println(""+str.length());
		/*int i=0;
		for(i=0;i<str.length();)			
		{
			if(str.charAt(i)==' ')
				i++;	
			else
				break;		
		}*/
		//System.out.println("indentation"+i);
		try
		{
			fr=new FileReader("input.txt");
			br=new BufferedReader(fr);
			
			while((line=br.readLine())!=null)
			{
				
				
				content=content+line;
				
			}
				if((content.contains("class"))&&(content.contains("end")))
				{
					System.out.println("file type is ruby");
					new Interpreter().findRubyMethod();
					
				}
				else if(content .contains("php"))
				{
					System.out.println("php");
					new Interpreter().findPhpMethod();
					
					
					
				}
				else
				{
					System.out.println("java");
					
					new Interpreter().findJavaMethods();
					
				}
			//System.out.println(""+content);
		}
		catch(Exception e)
		{
			System.out.print("Exception"+e);
		}
		
		try
		{
			fr.close();
		}catch(Exception e){}
		
		
	}

}
