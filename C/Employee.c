/*Read/write from/to a file in text and binary mode*/
#include <stdio.h>
int main()
{
	FILE *fp;
	struct emp
	{
		char name[40]; int age; float bs;
	};
	struct emp e;
	fp = fopen("Employee.DAT","w");
	fprintf(fp,"%s %d %f",e.name,e.age,e.bs);
	fclose(fp);
	
	fp = fopen("Employee.DAT","r");
	while((fscanf(fp,"%s %d %f",&e.name,&e.age,&e.bs)) != EOF)
		printf("%s %d %f\n",e.name,e.age,e.bs);
	
	fclose(fp);

	fp =fopen("Employee.DAT","wb");
	
	fwrite(&e,sizeof(e),1,fp);
	fclose(fp);
	
	fp = fopen("Employee.DAT","rb");
	while((fread(&e,sizeof(e),1,fp) == 1))
		printf("%s %d %f\n",e.name,e.age,e.bs);

	fclose(fp);
	
	return 0;
}