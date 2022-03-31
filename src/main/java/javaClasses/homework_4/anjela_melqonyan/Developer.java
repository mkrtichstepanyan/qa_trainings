package javaClasses.homework_4.anjela_melqonyan;

 public  class Developer extends Staff{
     public String techStack;
     public Developer(String techStack) {
         this.techStack = techStack;
     }
     public Developer() {
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
