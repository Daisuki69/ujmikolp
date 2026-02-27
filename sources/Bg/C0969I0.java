package bg;

import M8.C0376l;
import android.content.Context;

/* JADX INFO: renamed from: bg.I0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0969I0 extends AbstractC0971J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0973L f8814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8815b;

    public C0969I0(EnumC0973L parameter, String str) {
        kotlin.jvm.internal.j.h(parameter, "parameter");
        this.f8814a = parameter;
        this.f8815b = str;
    }

    @Override // bg.AbstractC0971J0
    public final void b(Context context, C1005j c1005j, O4.k kVar, StringBuilder sb2) {
        AbstractC0971J0.c(c1005j, kVar, new C0376l(this, 24));
    }
}
