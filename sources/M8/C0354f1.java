package M8;

import N5.C0454g0;
import N5.C0491z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0354f1 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0354f1 f3297a = new C0354f1(3, C0454g0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycIdReviewBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_id_review, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_content;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_content);
        if (viewFindChildViewById != null) {
            int i4 = R.id.button_primary;
            Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_primary);
            if (button != null) {
                i4 = R.id.image_view_captured_photo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_captured_photo);
                if (imageView != null) {
                    i4 = R.id.image_view_status_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_status_icon);
                    if (imageView2 != null) {
                        i4 = R.id.text_view_id_review_header;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_id_review_header);
                        if (textView != null) {
                            i4 = R.id.text_view_id_review_sub_header;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_id_review_sub_header);
                            if (textView2 != null) {
                                i4 = R.id.text_view_secondary;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_secondary);
                                if (textView3 != null) {
                                    C0491z c0491z = new C0491z((ConstraintLayout) viewFindChildViewById, (View) button, (View) imageView, (View) imageView2, textView, textView2, (Object) textView3, 10);
                                    i = R.id.layout_loading;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading);
                                    if (viewFindChildViewById2 != null) {
                                        return new C0454g0((ConstraintLayout) viewInflate, c0491z, N5.Z.a(viewFindChildViewById2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
