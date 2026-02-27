package j4;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import ch.r;
import dh.AbstractC1402a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1402a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatEditText f17710b;
    public final r c;

    public b(AppCompatEditText view, r observer) {
        j.h(view, "view");
        j.h(observer, "observer");
        this.f17710b = view;
        this.c = observer;
    }

    @Override // dh.AbstractC1402a
    public final void a() {
        this.f17710b.setOnFocusChangeListener(null);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View v7, boolean z4) {
        j.h(v7, "v");
        if (this.f16510a.get()) {
            return;
        }
        this.c.onNext(Boolean.valueOf(z4));
    }
}
