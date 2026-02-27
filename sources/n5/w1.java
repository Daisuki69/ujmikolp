package N5;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4256b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f4257d;
    public final TextView e;
    public final TextView f;

    public /* synthetic */ w1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, int i) {
        this.f4255a = i;
        this.f4256b = constraintLayout;
        this.c = constraintLayout2;
        this.f4257d = appCompatImageView;
        this.e = textView;
        this.f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4255a) {
        }
        return this.f4256b;
    }
}
