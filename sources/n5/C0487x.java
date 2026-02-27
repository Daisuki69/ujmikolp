package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0487x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4259b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f4260d;

    public /* synthetic */ C0487x(ConstraintLayout constraintLayout, TextView textView, Button button, int i) {
        this.f4258a = i;
        this.f4259b = constraintLayout;
        this.c = textView;
        this.f4260d = button;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4258a) {
        }
        return this.f4259b;
    }
}
