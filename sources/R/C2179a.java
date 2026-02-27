package r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import n.t;
import z.AbstractC2540b;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2179a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f19822d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19824b;
    public final HashMap c;

    public C2179a(Drawable.Callback callback, String str, HashMap map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f19824b = str;
        } else {
            this.f19824b = str.concat(numX49.tnTj78("b2RP"));
        }
        if (callback instanceof View) {
            this.f19823a = ((View) callback).getContext();
            this.c = map;
        } else {
            AbstractC2540b.b(numX49.tnTj78("b2Rb"));
            this.c = new HashMap();
            this.f19823a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f19822d) {
            ((t) this.c.get(str)).f18502d = bitmap;
        }
    }
}
