package bg;

import M8.C0376l;
import android.content.Context;
import bj.C1034e;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xf.b f9105b;

    public o0(Context context, Xf.b bVar) {
        this.f9104a = context;
        this.f9105b = bVar;
        Pattern.compile("[^\\d\\-\\+()\\s\\[\\]*#$&<>:]");
        C1034e.b(new C0376l(this, 19));
        C1034e.b(C1019w.j);
    }
}
