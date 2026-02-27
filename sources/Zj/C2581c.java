package zj;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: zj.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2581c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2581c f21467a = new C2581c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f21468b;
    public static volatile Charset c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f21469d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.f(charsetForName, "forName(...)");
        f21468b = charsetForName;
        kotlin.jvm.internal.j.f(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.j.f(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.j.f(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.j.f(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.j.f(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
