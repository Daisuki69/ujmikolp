package M8;

import N5.C0438b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: renamed from: M8.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0334a1 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0334a1 f3264a = new C0334a1(3, C0438b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/FragmentMayaFatcaBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.fragment_maya_fatca, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_primary);
        if (button != null) {
            i = R.id.image_view_header_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_header_icon);
            if (imageView != null) {
                i = R.id.text_view_secondary;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_secondary);
                if (textView != null) {
                    i = R.id.text_view_subtitle_header;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_subtitle_header);
                    if (htmlTextView != null) {
                        i = R.id.text_view_title_header;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                        if (textView2 != null) {
                            return new C0438b((ConstraintLayout) viewInflate, button, imageView, textView, htmlTextView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
