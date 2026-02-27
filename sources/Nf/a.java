package Nf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f4397b;
    public static final Charset c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f4398d;
    public static final Charset e;

    static {
        Charset.forName("US-ASCII");
        f4396a = Charset.forName("UTF-16BE");
        f4397b = Charset.forName("UTF-16LE");
        c = Charset.forName("ISO-8859-1");
        f4398d = Charset.forName("Windows-1252");
        e = Charset.forName("UTF-8");
    }
}
