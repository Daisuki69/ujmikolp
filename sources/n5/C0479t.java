package N5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0479t implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatEditText f4211b;
    public final LinearLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f4212d;
    public final TextView e;
    public final TextView f;

    public C0479t(LinearLayout linearLayout, AppCompatEditText appCompatEditText, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f4210a = linearLayout;
        this.f4211b = appCompatEditText;
        this.c = linearLayout2;
        this.f4212d = recyclerView;
        this.e = textView;
        this.f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4210a;
    }
}
