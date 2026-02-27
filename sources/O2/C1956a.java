package o2;

import df.o;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1956a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.a f18760b = new l2.a();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f18761d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final o e = new o(16, (byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1957b f18762a;

    public C1956a(C1957b c1957b) {
        this.f18762a = c1957b;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }
}
