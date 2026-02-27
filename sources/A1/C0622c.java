package a1;

import android.content.Context;
import android.net.ConnectivityManager;
import b1.C0858l;
import d1.f;
import defpackage.AbstractC1414e;
import java.net.MalformedURLException;
import java.net.URL;
import l1.InterfaceC1797a;
import o6.C1967a;
import w2.C2373d;

/* JADX INFO: renamed from: a1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0622c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1967a f6979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f6980b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f6981d;
    public final InterfaceC1797a e;
    public final InterfaceC1797a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6982g;

    public C0622c(Context context, InterfaceC1797a interfaceC1797a, InterfaceC1797a interfaceC1797a2) {
        C2373d c2373d = new C2373d();
        C0858l.f8319a.configure(c2373d);
        c2373d.f20681d = true;
        this.f6979a = new C1967a(c2373d, 21);
        this.c = context;
        this.f6980b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6981d = b(C0620a.c);
        this.e = interfaceC1797a2;
        this.f = interfaceC1797a;
        this.f6982g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC1414e.h("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c1.h a(c1.h r7) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0622c.a(c1.h):c1.h");
    }
}
