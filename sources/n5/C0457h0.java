package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: renamed from: N5.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0457h0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4104b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MultiColorTextView f4105d;
    public final HtmlTextView e;
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HtmlTextView f4106g;
    public final HtmlTextView h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f4107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f4108l;
    public final TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f4109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f4110o;

    public C0457h0(ConstraintLayout constraintLayout, ImageView imageView, Button button, MultiColorTextView multiColorTextView, HtmlTextView htmlTextView, RecyclerView recyclerView, HtmlTextView htmlTextView2, HtmlTextView htmlTextView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.f4103a = constraintLayout;
        this.f4104b = imageView;
        this.c = button;
        this.f4105d = multiColorTextView;
        this.e = htmlTextView;
        this.f = recyclerView;
        this.f4106g = htmlTextView2;
        this.h = htmlTextView3;
        this.i = textView;
        this.j = textView2;
        this.f4107k = textView3;
        this.f4108l = textView4;
        this.m = textView5;
        this.f4109n = textView6;
        this.f4110o = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4103a;
    }
}
