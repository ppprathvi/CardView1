package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.cardview.BookDetails;
import info.androidhive.cardview.ButtonClick;
import info.androidhive.cardview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends Fragment {

    EditText checkin_hr ;
    EditText checkin_min ;
    EditText checkin_sec ;
    EditText checkout_hr ;
    EditText checkout_min ;
    EditText checkout_sec ;
    EditText date_year;
    EditText date_month;
    EditText date_date;

    public BookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_book, container, false);


        checkin_hr = (EditText) view.findViewById(R.id.checkin_hr);
        checkin_min = (EditText) view.findViewById(R.id.checkin_min);
        checkin_sec = (EditText) view.findViewById(R.id.checkin_sec);
        checkout_hr = (EditText) view.findViewById(R.id.checkout_hr);
        checkout_min = (EditText) view.findViewById(R.id.checkout_min);
        checkout_sec = (EditText) view.findViewById(R.id.checkout_sec);
        date_year =(EditText) view.findViewById(R.id.date_year);
        date_month =(EditText) view.findViewById(R.id.date_month);
        date_date =(EditText) view.findViewById(R.id.date_date);

        checkin_hr.setText("10");
        checkin_min.setText("10");
        checkin_sec.setText("10");
        checkout_hr.setText("10");
        checkout_min.setText("10");
        checkout_sec.setText("10");
        date_year.setText("10");
        date_month.setText("10");
        date_date.setText("10");

        Button button = (Button) view.findViewById(R.id.book_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(),BookDetails.class);

                startActivity(intent);
            }
        });
        return view;

    }

}
