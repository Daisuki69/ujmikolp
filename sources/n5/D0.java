package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f3580b;
    public final TextView c;

    public /* synthetic */ D0(LinearLayout linearLayout, TextView textView, int i) {
        this.f3579a = i;
        this.f3580b = linearLayout;
        this.c = textView;
    }

    public static D0 a(View view) {
        int i = R.id.image_view_camera_icon;
        if (((ImageView) ViewBindings.findChildViewById(view, R.id.image_view_camera_icon)) != null) {
            i = R.id.text_view_camera_permission_description;
            if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_camera_permission_description)) != null) {
                i = R.id.text_view_camera_permission_header;
                if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_camera_permission_header)) != null) {
                    i = R.id.text_view_enable_camera;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_view_enable_camera);
                    if (textView != null) {
                        return new D0((LinearLayout) view, textView, 0);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3579a) {
        }
        return this.f3580b;
    }
}
