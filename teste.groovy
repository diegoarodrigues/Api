static void main(String[] args) {
      int count;
      new File("c:/temp").eachFile() { file->
         println file.getAbsolutePath()
         count ++;
      }
      println count;
   }