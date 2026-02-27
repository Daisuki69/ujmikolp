package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4188b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4189d;

    public /* synthetic */ q1(LinearLayout linearLayout, ImageView imageView, TextView textView, int i) {
        this.f4187a = i;
        this.f4188b = linearLayout;
        this.c = imageView;
        this.f4189d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4187a) {
        }
        return this.f4188b;
    }
}
