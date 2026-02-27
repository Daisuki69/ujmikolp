package M8;

import N5.C0472p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0361h0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0361h0 f3309a = new C0361h0(3, C0472p.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaBottomSheetDialogFragmentKycConfirmExitBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_bottom_sheet_dialog_fragment_kyc_confirm_exit, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_cancel);
        if (button != null) {
            i = R.id.button_confirm;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_confirm);
            if (button2 != null) {
                i = R.id.image_view_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_icon);
                if (imageView != null) {
                    i = R.id.text_view_description;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description)) != null) {
                        i = R.id.text_view_header;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                            return new C0472p((ConstraintLayout) viewInflate, button, button2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
