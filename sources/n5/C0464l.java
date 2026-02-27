package N5;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: N5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0464l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4141b;
    public final Button c;

    public /* synthetic */ C0464l(LinearLayout linearLayout, Button button, int i) {
        this.f4140a = i;
        this.f4141b = linearLayout;
        this.c = button;
    }

    public static C0464l a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.maya_kyc_primary_button);
        if (button != null) {
            return new C0464l(linearLayout, button, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.maya_kyc_primary_button)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4140a) {
        }
        return this.f4141b;
    }
}
