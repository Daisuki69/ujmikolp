package r4;

import a.AbstractC0617a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.liaoinstan.springview.widget.SpringView;

/* JADX INFO: renamed from: r4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2188a extends AbstractC0617a {
    public final String c = C2188a.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19849d;

    public C2188a(int i) {
        this.f19849d = i;
    }

    @Override // t4.h
    public final void a(int i, View view) {
        Log.v(this.c, "onDropAnim:" + i);
    }

    @Override // t4.h
    public final void b() {
        Log.d(this.c, "onStartAnim");
    }

    @Override // a.AbstractC0617a, t4.h
    public final void c() {
        Log.d(this.c, "onPreDrag");
    }

    @Override // t4.h
    public final void d() {
        Log.d(this.c, "onFinishAnim");
    }

    @Override // a.AbstractC0617a, t4.h
    public final void e() {
        Log.d(this.c, "onResetAnim");
    }

    @Override // t4.h
    public final void f(View view, boolean z4) {
        Log.d(this.c, "onLimitDes:" + z4);
    }

    @Override // a.AbstractC0617a, t4.h
    public final void g() {
        Log.d(this.c, "onFinishDrag");
    }

    @Override // t4.h
    public final View h(LayoutInflater layoutInflater, SpringView springView) {
        return layoutInflater.inflate(this.f19849d, (ViewGroup) springView, false);
    }
}
