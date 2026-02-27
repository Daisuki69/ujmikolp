package com.google.i18n.phonenumbers;

/* JADX INFO: loaded from: classes2.dex */
public class NumberParseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10039b;

    public NumberParseException(int i, String str) {
        super(str);
        this.f10039b = str;
        this.f10038a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error type: ");
        int i = this.f10038a;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE");
        sb2.append(". ");
        sb2.append(this.f10039b);
        return sb2.toString();
    }
}
