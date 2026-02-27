package G5;

import android.text.Editable;
import android.text.TextWatcher;
import t6.C2272c;
import t6.C2273d;
import t6.C2274e;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1757b;
    public final C2272c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2273d f1758d;
    public final C2273d e;
    public final C2272c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2274e f1759g;

    public n(String str, int i, C2272c c2272c, C2273d c2273d, C2273d c2273d2, C2272c c2272c2, C2274e c2274e) {
        this.f1756a = str;
        this.f1757b = i;
        this.c = c2272c;
        this.f1758d = c2273d;
        this.e = c2273d2;
        this.f = c2272c2;
        this.f1759g = c2274e;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r2 = zj.C2576A.H(r1)
            if (r2 == 0) goto L10
            t6.d r1 = r0.e
            r1.invoke()
            return
        L10:
            t6.c r2 = r0.c
            java.lang.String r3 = r0.f1756a
            if (r3 == 0) goto L2b
            boolean r3 = com.paymaya.common.utility.AbstractC1213b.U(r3, r1)
            if (r3 != 0) goto L24
            t6.d r3 = r0.f1758d
            r3.invoke()
            kotlin.Unit r3 = kotlin.Unit.f18162a
            goto L29
        L24:
            r2.invoke()
            kotlin.Unit r3 = kotlin.Unit.f18162a
        L29:
            if (r3 != 0) goto L30
        L2b:
            r2.invoke()
            kotlin.Unit r2 = kotlin.Unit.f18162a
        L30:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r0.f1757b
            if (r3 >= r2) goto L4f
            int r2 = r1.length()
            if (r2 < 0) goto L4a
            int r1 = r1.length()
            if (r1 <= r3) goto L44
            goto L4a
        L44:
            t6.e r1 = r0.f1759g
            r1.invoke()
            return
        L4a:
            t6.c r1 = r0.f
            r1.invoke()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.n.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
