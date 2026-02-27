package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class zzee {
    private final String info;
    private int position = 0;

    public zzee(String str) {
        this.info = str;
    }

    public final boolean hasNext() {
        return this.position < this.info.length();
    }

    public final int next() {
        String str = this.info;
        int i = this.position;
        this.position = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt < 55296) {
            return cCharAt;
        }
        int i4 = cCharAt & 8191;
        int i6 = 13;
        while (true) {
            String str2 = this.info;
            int i10 = this.position;
            this.position = i10 + 1;
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt2 < 55296) {
                return i4 | (cCharAt2 << i6);
            }
            i4 |= (cCharAt2 & 8191) << i6;
            i6 += 13;
        }
    }
}
