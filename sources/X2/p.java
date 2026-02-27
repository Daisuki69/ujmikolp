package X2;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final HashMap c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6522b;

    public p(Context context, String str) {
        this.f6521a = context;
        this.f6522b = str;
    }

    public final synchronized void a() {
        this.f6521a.deleteFile(this.f6522b);
    }
}
