package M8;

import N5.C0483v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class U2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U2 f3233a = new U2(3, C0483v.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaBottomSheetDialogFragmentKycValidationRulesBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_bottom_sheet_dialog_fragment_kyc_validation_rules, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            i = R.id.guideline_end;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end)) != null) {
                i = R.id.guideline_start;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start)) != null) {
                    i = R.id.image_view_header_icon;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_header_icon)) != null) {
                        i = R.id.text_view_header;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                        if (textView != null) {
                            i = R.id.text_view_message;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_message);
                            if (textView2 != null) {
                                return new C0483v(button, textView, textView2, (ConstraintLayout) viewInflate);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
