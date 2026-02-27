package M8;

import N5.C0464l;
import N5.C0480t0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0402r2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0402r2 f3362a = new C0402r2(3, C0480t0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycSubmissionSuccessBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_submission_success, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_buttons;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_buttons);
        if (viewFindChildViewById != null) {
            C0464l c0464lA = C0464l.a(viewFindChildViewById);
            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                return new C0480t0((ConstraintLayout) viewInflate, c0464lA);
            }
            i = R.id.nested_scroll_view_form_container;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
