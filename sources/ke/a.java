package Ke;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2648b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ a(int i, Function0 function0) {
        this.f2647a = i;
        this.c = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2647a;
        Callback.onClick_enter(view);
        switch (i) {
            case 0:
                try {
                    j.g(view, "view");
                    if (System.currentTimeMillis() - this.f2648b >= 600) {
                        this.c.invoke();
                    }
                    this.f2648b = System.currentTimeMillis();
                    Callback.onClick_exit();
                    return;
                } finally {
                }
            default:
                try {
                    j.g(view, "view");
                    if (System.currentTimeMillis() - this.f2648b >= 600) {
                        this.c.invoke();
                    }
                    this.f2648b = System.currentTimeMillis();
                    Callback.onClick_exit();
                    return;
                } finally {
                }
        }
    }
}
