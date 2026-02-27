package N5;

import android.view.View;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0452f1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4092b;
    public final TextView c;

    public /* synthetic */ C0452f1(TextView textView, TextView textView2, int i) {
        this.f4091a = i;
        this.f4092b = textView;
        this.c = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4091a) {
        }
        return this.f4092b;
    }
}
