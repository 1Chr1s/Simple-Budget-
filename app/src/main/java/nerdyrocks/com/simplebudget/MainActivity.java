package nerdyrocks.com.simplebudget;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Variables:
    Button enterButton;
    EditText enteredIncome;
    TextView needsOutput;
    TextView wantsOutput;
    TextView investmentsOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTextViews();
        setButton();
    }

    @Override
    protected void onPause(){
        super.onPause();

    }
    // Creating the textviews:
    private void setTextViews(){
        enteredIncome = (EditText)findViewById(R.id.income_input);
        needsOutput = (TextView)findViewById(R.id.needs_Output);
        wantsOutput = (TextView)findViewById(R.id.wants_Output);
        investmentsOutput = (TextView)findViewById(R.id.investment_Output);

    }
    private void setButton(){
        enterButton = (Button)findViewById(R.id.enter_Button);
        enterButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        if(isValidNumber((String)enteredIncome.getText().toString())){

        }

    }

    private boolean isValidNumber(String num){
        StringBuilder SBuilder = new StringBuilder(num);
        int index = SBuilder.indexOf(".");

       if(isOnlyNumbers(num)) {
           if(validCents(index, num)) {
               return true;
           }
       }
       return false;
    }

    private boolean validCents(int decimalIndex, String number){
        if((number.length() - decimalIndex) <= 2 ) {
            return true;
        }
        return false;
    }

    private boolean isOnlyNumbers (String s){
        // Variables:
        StringBuilder temp = new StringBuilder(s);
        int ascii0 = 48;
        int ascii9 = 57;
        int asciiPeriod = 46;

        for(int x = 0; x < temp.length(); x++) {
           if(temp.charAt(x) < ascii0 || temp.charAt(x) > ascii9 || temp.charAt(x) == asciiPeriod) {
                return false;
           }
        }// End of for() loop
        return true;
    }
}
