package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0468n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4160b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f4161d;
    public final TextView e;

    public /* synthetic */ C0468n(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView, int i) {
        this.f4159a = i;
        this.f4160b = constraintLayout;
        this.c = button;
        this.f4161d = button2;
        this.e = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4159a) {
        }
        return this.f4160b;
    }
}
