package M8;

import N5.C0450f;
import N5.C0451f0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInfoSection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f3241a = new W0(3, C0451f0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycFaceAuthenticationTipsBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_face_authentication_tips, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.image_view_selfie;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_selfie);
        if (imageView != null) {
            i = R.id.layout_buttons;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_buttons);
            if (viewFindChildViewById != null) {
                C0450f c0450fA = C0450f.a(viewFindChildViewById);
                int i4 = R.id.maya_info_section;
                if (((KycMayaInfoSection) ViewBindings.findChildViewById(viewInflate, R.id.maya_info_section)) != null) {
                    i4 = R.id.nested_scroll_view_form_container;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                        i4 = R.id.text_view_description;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description)) != null) {
                            i4 = R.id.text_view_title;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title)) != null) {
                                return new C0451f0((ConstraintLayout) viewInflate, imageView, c0450fA);
                            }
                        }
                    }
                }
                i = i4;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
