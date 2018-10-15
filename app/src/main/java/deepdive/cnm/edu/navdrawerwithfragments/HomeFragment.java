package deepdive.cnm.edu.navdrawerwithfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass. Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

  // TODO: Rename parameter arguments, choose names that match
  // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
  private static final String TEXT_ARG = "text";

  // TODO: Rename and change types of parameters
  private String text;

  public HomeFragment() {
    // Required empty public constructor
  }



  public static HomeFragment newInstance(String text) {
    HomeFragment fragment = new HomeFragment();
    Bundle args = new Bundle();
    args.putString(TEXT_ARG, text);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      text = getArguments().getString(TEXT_ARG);
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_home, container, false);
    TextView homeText = view.findViewById(R.id.home_text);
    homeText.setText(text);
    return view;
  }

}
