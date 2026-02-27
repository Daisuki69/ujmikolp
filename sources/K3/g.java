package K3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f2607b;

    static {
        String strName = Charset.defaultCharset().name();
        f2606a = strName;
        f2607b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }
}
