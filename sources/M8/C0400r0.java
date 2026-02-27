package M8;

import N5.C0439b0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0400r0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0400r0 f3360a = new C0400r0(3, C0439b0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycDocumentIdGuideBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_document_id_guide, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_container_upload_and_continue;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.button_container_upload_and_continue);
        if (linearLayout != null) {
            i = R.id.button_continue;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
            if (button != null) {
                i = R.id.button_upload;
                Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_upload);
                if (button2 != null) {
                    i = R.id.linear_layout_container;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_container)) != null) {
                        i = R.id.nested_scroll_view;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view);
                        if (nestedScrollView != null) {
                            i = R.id.recycler_view_capture_guide;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_capture_guide);
                            if (recyclerView != null) {
                                return new C0439b0((ConstraintLayout) viewInflate, linearLayout, button, button2, nestedScrollView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
