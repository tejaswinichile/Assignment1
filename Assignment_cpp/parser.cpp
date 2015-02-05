#include<stdio.h>
#include<iostream>

#include<ostream>
#include<string>
#include<fstream>
using namespace std;
class JavaCheck
{
	public:
	int findMethods()
	{
		cout<<"\ninside function";
		ifstream file("input.txt");
		string input_data;
		while(!file.eof())
		{
			getline(file,input_data);
			size_t found=input_data.find("class"); 
			size_t found_cmnt1=input_data.find("//");
			size_t found_cmnt2=input_data.find("*");
			if (found!=std::string::npos)
			{
				if(found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos)
				{continue;}
				string out=input_data.substr(0,input_data.length()-1);
				cout<< "\nclass:\t"<<out;
				
				
				
			}
			size_t found1=input_data.find("(");
			size_t found2=input_data.find("public"); 
			size_t found3=input_data.find("private");
			size_t found4=input_data.find("protected");
			
			
			if ((found1!=std::string::npos))
			{
				if(found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos)
				{continue;}
				
				if((found2!=std::string::npos))
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod Access Specifier:"<<out.substr(0,8);
					cout<< "\nmethod Name:"<<out.substr(7,input_data.length()-1);
					
				}	
				else if((found3!=std::string::npos))
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod:"<<out.substr(0,8);
					cout<< "\nmethod Name:"<<out.substr(8,input_data.length()-1);
					
				}
				else if((found3!=std::string::npos))
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod:"<<out.substr(0,9);
					cout<< "\nmethod Name:"<<out.substr(9,input_data.length()-1);
					
				}
				
			}
			
		
	
		
		
		}
		
		return 0;
	}
	
};
class PhpCheck
{
	public:
	int findMethods()
	{
		cout<<"\ninside function";
		ifstream file("input.txt");
		string input_data;
	
		while(!file.eof())
		{
			getline(file,input_data);
			size_t found=input_data.find("class"); 
			size_t found_cmnt1=input_data.find("//");
			size_t found_cmnt2=input_data.find("*");
			if (found!=std::string::npos)
			{
				if (found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos)
				{continue;}
				string out=input_data.substr(0,input_data.length());
				cout<< "\nclass:\t"<<out;
				
			}
			size_t found1=input_data.find("function");
			size_t found2=input_data.find("public"); 
			size_t found3=input_data.find("private");
			size_t found4=input_data.find("protected");
			
			if ((found1!=std::string::npos))
			{
				if (found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos)
				{continue;}
				if((found2!=std::string::npos))
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod Access Specifier:public"	;
					cout<< "\nmethod Name:"<<out.substr(10,input_data.length()-1);
					
				}	
				else if((found3!=std::string::npos))
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod:private";
					cout<< "\nmethod Name:"<<out.substr(11,input_data.length()-1);
					
				}
				else if((found4!=std::string::npos))
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod:protected";
					cout<< "\nmethod Name:"<<out.substr(12,input_data.length()-1);
					
				}
				else
				{
					string out=input_data.substr(0,input_data.length()-1);
					cout<< "\nmethod:"<<out;
				}
			}
			size_t var=input_data.find("$");
			size_t not_var=input_data.find("->");
			size_t not_var2=input_data.find("=");
			size_t not_var3=input_data.find("return");
			size_t not_var4=input_data.find("(");

			if(var!=std::string::npos){
			if (found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos||not_var!=std::string::npos||not_var2!=std::string::npos||not_var3!=std::string::npos||not_var4!=std::string::npos)
				{continue;}
			cout<<"\nproperties"<<input_data;
			}
			
			
		
		}
		return 0;
	}
	
};
class RubyCheck
{
	public:
	int findMethods()
	{
		cout<<"\ninside function";
		ifstream file("input.txt");
		string input_data;
		while(!file.eof())
		{
			getline(file,input_data);
			size_t found=input_data.find("class"); 
			size_t found_cmnt1=input_data.find("//");
			size_t found_cmnt2=input_data.find("*");  
			if (found!=std::string::npos)
			{
				if(found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos)
				{continue;}
				string out=input_data.substr(0,input_data.length());
				cout<< "\nclass:\t"<<out;
				
				
			}
			size_t found1=input_data.find("def"); 
			if (found1!=std::string::npos)
			{
				if(found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos)
				{continue;}
				
				string out=input_data.substr(0,input_data.length());
				cout<< "\nfunction:\t"<<out;
			}
			size_t var=input_data.find("@@");
			size_t not_var=input_data.find("(");
			
			if(var!=std::string::npos)
			{	if (found_cmnt1!=std::string::npos||found_cmnt2!=std::string::npos||not_var!=std::string::npos)
				{continue;}
				cout<<"\nproperties:"<<input_data;
			}
		}
		return 0;
	}
	
};
int main()
{
	string input_data;	
	JavaCheck java;
	PhpCheck php;
	RubyCheck ruby;
	int set=0;
	
	ifstream file("input.txt");
	
	while(!file.eof())
	{
		getline(file,input_data);
		size_t found=input_data.find("end"); 
		if (found!=std::string::npos)
		{
			cout<< "\nits ruby language";
			set=1;
			break;
		}
		found=input_data.find("php");
		if (found!=std::string::npos)
		{
			cout << "\nits php language:";
			set=2;
			break;
		}
		
	
		
		
	}
	if(file.eof())
	{
		cout<< "\nits java language";
		java.findMethods();
	}
	
	if(set==2)
		php.findMethods();
	else if(set==1)
		ruby.findMethods();
	
	return 0;
}

