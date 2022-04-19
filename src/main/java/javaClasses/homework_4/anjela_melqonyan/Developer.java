package javaClasses.homework_4.anjela_melqonyan;

 public  class Developer extends Staff{
     public String techStack;
     public String name;
     public String surname;

     public Developer() {
         this.techStack = techStack;
         this.name=name;
         this.surname=surname;
     }

     @Override
     public String getName() {
         return name;
     }

     @Override
     public void setName(String name) {
         this.name = name;
     }

     public String getSurname() {
         return surname;
     }

     @Override
     public void setSurname(String surname) {
         this.surname = surname;
     }

     public String getTechStack() {
         return techStack;
     }

     public void setTechStack(String techStack) {
         this.techStack = techStack;
     }
     @Override
     protected void doWork() {
         System.out.println("Developers name is"+ " " +getName());
         System.out.println("Developers work Type is"+ getTechStack());
     }
 }
