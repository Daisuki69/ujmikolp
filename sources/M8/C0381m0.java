package M8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0381m0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0381m0 f3335a = new C0381m0(3, N5.r.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaBottomSheetDialogFragmentKycDnfbpWhyNeededBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_bottom_sheet_dialog_fragment_kyc_dnfbp_why_needed, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.maya_kyc_primary_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_primary_button);
        if (button != null) {
            i = R.id.text_view_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
            if (textView != null) {
                i = R.id.text_view_header;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                if (textView2 != null) {
                    return new N5.r(button, textView, textView2, (ConstraintLayout) viewInflate);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
