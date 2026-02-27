package j4;

import android.view.View;
import ch.r;
import com.dynatrace.android.callback.Callback;
import dh.AbstractC1402a;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: j4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1668a extends AbstractC1402a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f17709b;
    public final r c;

    public ViewOnClickListenerC1668a(View view, r observer) {
        j.h(view, "view");
        j.h(observer, "observer");
        this.f17709b = view;
        this.c = observer;
    }

    @Override // dh.AbstractC1402a
    public final void a() {
        this.f17709b.setOnClickListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v7) {
        Callback.onClick_enter(v7);
        try {
            j.h(v7, "v");
            if (!this.f16510a.get()) {
                this.c.onNext(Unit.f18162a);
            }
            Callback.onClick_exit();
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }
}
