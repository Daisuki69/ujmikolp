package M8;

import N5.C0448e0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class R0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R0 f3218a = new R0(3, C0448e0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycEverythingClearBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_everything_clear, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_use_this_photo;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_use_this_photo);
        if (button != null) {
            i = R.id.card_view_photo_container;
            if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_photo_container)) != null) {
                i = R.id.image_view_taken_photo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_taken_photo);
                if (imageView != null) {
                    i = R.id.text_view_additional_description;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_additional_description)) != null) {
                        i = R.id.text_view_header;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                            i = R.id.text_view_retake;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_retake);
                            if (textView != null) {
                                return new C0448e0((ConstraintLayout) viewInflate, button, imageView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
