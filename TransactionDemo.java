import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

record Transaction(Integer id, String type, Double value){

}

public class TransactionDemo{
    public static void main(String[] args){

        List<Transaction> list = Arrays.asList(
            new Transaction(123, "income", 15.0),
            new Transaction(124, "expense", 25.0),
            new Transaction(125, "expense", 132.0),
            new Transaction(126, "income", 20.0)
        );

        List<Transaction> incomeTransactions = new ArrayList<>();
        for(Transaction t: list){
            if(t.type().equals("income")){
                incomeTransactions.add(t);
            }
        }

        Collections.sort(incomeTransactions, (v1, v2) -> v2.value().compareTo(v1.value()));

        List<Integer> transactionIds = new ArrayList<>();
        for(Transaction r: incomeTransactions){
            transactionIds.add(r.id());
        }
        
        System.out.println(transactionIds);

    }
}