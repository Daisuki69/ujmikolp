package bg;

import ag.AbstractC0693c;
import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: bg.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1021y extends AbstractC0693c {
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f9140d;

    public C1021y(Context context, ArrayList arrayList, C0965G0 c0965g0) {
        super(context, 1);
        this.c = arrayList;
        this.f9140d = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0954B(this.c, this.f9140d);
    }
}
