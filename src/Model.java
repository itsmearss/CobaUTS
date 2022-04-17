import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Model {
    private String pengirim;
    private String pesan;
    private String penerima;

    List<Model> Message;

    public Model(String pengirim, String pesan, String penerima){
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.pesan = pesan;
        this.Message = new ArrayList<Model>();
    }

    public void addItem(Model pesan){
        this.Message.add(pesan);
    }
    public String getMessage(){
        return String.format("Penerima: %-12s \nPesan: %-12s %n", penerima, pesan);
    }

    public String getPenerima(){
        return penerima;
    }

//    public void lihatPesan(){
//        for(int i = 0; i < Message.size(); i++) {
//            System.out.println(toString(Message.get(i)));
//        }
//    }



}
