package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f3550b;

    public /* synthetic */ B(ViewGroup viewGroup, int i) {
        this.f3549a = i;
        this.f3550b = viewGroup;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3549a) {
            case 0:
                return (NestedScrollView) this.f3550b;
            default:
                return (LinearLayout) this.f3550b;
        }
    }
}
