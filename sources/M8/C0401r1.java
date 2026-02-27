package M8;

import N5.C0459i0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0401r1 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0401r1 f3361a = new C0401r1(3, C0459i0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycLivenessCaptureBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_liveness_capture, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_loading;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading);
        if (viewFindChildViewById != null) {
            N5.Z zA = N5.Z.a(viewFindChildViewById);
            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_media_permission);
            if (viewFindChildViewById2 != null) {
                int i4 = R.id.image_view_media_icon;
                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.image_view_media_icon)) != null) {
                    i4 = R.id.text_view_enable_media;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_enable_media);
                    if (textView != null) {
                        i4 = R.id.text_view_media_permission_description;
                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_media_permission_description)) != null) {
                            i4 = R.id.text_view_media_permission_header;
                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_media_permission_header)) != null) {
                                return new C0459i0((ConstraintLayout) viewInflate, zA, new N5.A((ConstraintLayout) viewFindChildViewById2, textView, 1));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i4)));
            }
            i = R.id.layout_media_permission;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
