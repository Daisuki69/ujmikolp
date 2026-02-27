package M8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b3 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f3274a = new b3(3, N5.B0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycWeWillTakeItFromHereBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_we_will_take_it_from_here, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_back;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_back);
        if (button != null) {
            i = R.id.button_view_details;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_view_details);
            if (button2 != null) {
                i = R.id.constraint_layout_information_box;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_information_box);
                if (constraintLayout != null) {
                    i = R.id.image_view_rockon;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_rockon)) != null) {
                        i = R.id.image_view_warning_icon;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_warning_icon)) != null) {
                            i = R.id.text_view_header;
                            if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                i = R.id.text_view_header_subtext;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                                    i = R.id.text_view_information_description;
                                    MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_information_description);
                                    if (multiColorTextView != null) {
                                        i = R.id.text_view_information_header;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_information_header);
                                        if (textView != null) {
                                            return new N5.B0((ConstraintLayout) viewInflate, button, button2, constraintLayout, multiColorTextView, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
