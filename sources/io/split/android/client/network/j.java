package io.split.android.client.network;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends n {
    public static final char[] c = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f17602b;

    public j() {
        if ("-._~!$'()*,;&=@:+".matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        char[] charArray = "-._~!$'()*,;&=@:+".concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789").toCharArray();
        int iMax = -1;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        this.f17602b = zArr;
    }
}
