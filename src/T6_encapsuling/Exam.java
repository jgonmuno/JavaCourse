package T6_encapsuling;

class Exam {
   private double mark;
   private int questions;
   private boolean active;

   public void setMark(double mark) throws Exception {
      this.mark = mark;

      if (this.mark < 0){
         throw new Exception("Incorrect mark, please insert a mark above or equal to 0");
      }
   }

   public double getMark(){
      return mark;
   }

   public void setQuestions(int questions){
      this.questions = questions;
   }

   public int getQuestions(){
      return questions;
   }

   public boolean isActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }
}
