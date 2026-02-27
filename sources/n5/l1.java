package N5;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4147b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4148d;
    public final TextView e;
    public final TextView f;

    public /* synthetic */ l1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, int i) {
        this.f4146a = i;
        this.f4147b = constraintLayout;
        this.c = textView;
        this.f4148d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4146a) {
        }
        return this.f4147b;
    }
}
