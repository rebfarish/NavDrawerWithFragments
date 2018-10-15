package deepdive.cnm.edu.navdrawerwithfragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass. Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends Fragment {

  // TODO: Rename parameter arguments, choose names that match
  // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
  private static final String DRAWABLE_ARG = "drawable";

  // TODO: Rename and change types of parameters
  private int drawable;


  public DemoFragment() {
    // Required empty public constructor
  }

  // TODO: Rename and change types and number of parameters
  public static DemoFragment newInstance(int drawable) {
    DemoFragment fragment = new DemoFragment();
    Bundle args = new Bundle();
    args.putInt(DRAWABLE_ARG, drawable);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      drawable = getArguments().getInt(DRAWABLE_ARG);
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
   View view = inflater.inflate(R.layout.fragment_demo, container, false);
    ImageView demoImage = view.findViewById(R.id.demo_image);
    demoImage.setImageDrawable(getActivity().getDrawable(drawable));
    return view;
  }

}
