import java.io.*;
public class Login{
    public static void main (String[]args)throws IOException{
       
        BufferedReader dataIn= new BufferedReader (new InputStreamReader(System.in));

        String nama="",password="";
        while(true){
            System.out.print("Masukkan ID User : ");
            nama= dataIn.readLine();
            System.out.print("Masukkan Password : ");
            password=dataIn.readLine();

            if (nama.equals("171530018")&& password.equals("mahasiswa123")){
                System.out.println("Selamat Datang "+nama);
                break;
            }else if(nama.equals("171530018")== false){
                System.out.println("User salah");
            }else if(password.equals("mahasiswa123")== false){
                System.out.println("Password salah");
            }
        }
    }
}