import com.ipiecoles.java.java220.Employe;
import com.ipiecoles.java.java220.Entreprise;
import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Employe em = new Employe("Martin", "KH","75484", LocalDate.now(), 4520d);
        Employe em2 = new Employe("Martin", "KH","75484", LocalDate.now(), 4520d);
        em2.augmenterSalaire(0.50);
        System.out.println(em2);

    }
}
