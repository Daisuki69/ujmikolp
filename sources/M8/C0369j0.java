package M8;

import N5.C0474q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.widget.KycInformationTextView;

/* JADX INFO: renamed from: M8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0369j0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0369j0 f3320a = new C0369j0(3, C0474q.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaBottomSheetDialogFragmentKycConfirmationBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_bottom_sheet_dialog_fragment_kyc_confirmation, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_check_again;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_check_again);
        if (button != null) {
            i = R.id.button_continue;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
            if (button2 != null) {
                i = R.id.image_view_confirmation_icon;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_confirmation_icon)) != null) {
                    i = R.id.text_view_header;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                        i = R.id.text_view_information;
                        if (((KycInformationTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_information)) != null) {
                            i = R.id.text_view_sub_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header)) != null) {
                                return new C0474q((ConstraintLayout) viewInflate, button, button2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
