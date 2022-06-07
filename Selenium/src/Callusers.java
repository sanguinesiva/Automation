
public class Callusers {
	 public static void main(String[] args) throws InterruptedException {
         ArrayList<Users> users = new ArrayList<Users>();
         String line = "";
         String splitBy = ",";
         try
         {
             BufferedReader br = new BufferedReader(new FileReader("testcase.csv"));
             while ((line = br.readLine()) != null)   //returns a Boolean value
             {
                 String[] user = line.split(splitBy);    // use comma as separator
                 String testcasename = user[0];
                 String username = user[1];
                 String password = user[2];

                 Users u = new Users(testcasename,username,password);
                 users.add(u);
             }
         }
         catch (IOException e)
         {
             e.printStackTrace();
         }

         for(Users u : users){
             u.login();
         }
     }

}
