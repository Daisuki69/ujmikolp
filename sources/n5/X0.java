package N5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4030b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4031d;

    public /* synthetic */ X0(LinearLayout linearLayout, TextView textView, TextView textView2, int i) {
        this.f4029a = i;
        this.f4030b = linearLayout;
        this.c = textView;
        this.f4031d = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4029a) {
        }
        return this.f4030b;
    }
}
