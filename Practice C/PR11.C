/*This program involves the declaration of a structure called student containing his name, age and address and initialize 3 structure varibles.
  Also, we define a function to which these variables are passed and this function should convert the names into uppercase. Finally, we print
  these structure varibles.*/

  #include <stdio.h>
  #include <string.h>

  struct Student{
    char name[19]; int age; char add[60];
  };

  void upper_names(struct Student*,struct Student*,struct Student*);
  int main()
  {
        struct Student s1 = {"Chetan Kaushik",17,"Tatarpur, Palwal, Faidabad"};
        struct Student s2 = {"Kartik Kaushik",19,"Ballabhgarh, Faridabad"};
        struct Student s3 = {"Kirti Kaushik",17,"Ballabhgarh, Faridabad"};
      upper_names(&s1,&s2,&s3);


      printf("1. Name: %s\t\tAge = %d\tAddress = %s.\n",s1.name,s1.age,s1.add);
      printf("2. Name: %s\t\tAge = %d\tAddress = %s.\n",s2.name,s2.age,s2.add);
      printf("3. Name: %s\t\tAge = %d\tAddress = %s.\n",s3.name,s3.age,s2.add);
      return 0;
  }

  void upper_names(struct Student *s1, struct Student *s2, struct Student *s3)
  {
      strupr(s1->name);
      strupr(s2->name);
      strupr(s3->name);
  }
