package N5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0465l0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4143b;
    public final LinearLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f4144d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4145g;

    public /* synthetic */ C0465l0(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, int i) {
        this.f4142a = i;
        this.f4143b = constraintLayout;
        this.c = linearLayout;
        this.f4144d = recyclerView;
        this.e = textView;
        this.f = textView2;
        this.f4145g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4142a) {
        }
        return this.f4143b;
    }
}
