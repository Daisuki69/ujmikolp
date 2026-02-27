package M8;

import N5.C0481u;
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
public final /* synthetic */ class U0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f3231a = new U0(3, C0481u.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaBottomSheetDialogFragmentKycUpgradeExampleBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_bottom_sheet_dialog_fragment_kyc_upgrade_example, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_got_it;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_got_it);
        if (button != null) {
            i = R.id.image_view_information;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_information)) != null) {
                i = R.id.image_view_upgrade_example;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_upgrade_example)) != null) {
                    i = R.id.multi_color_text_view_note;
                    if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.multi_color_text_view_note)) != null) {
                        i = R.id.text_view_header;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                            return new C0481u((ConstraintLayout) viewInflate, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
