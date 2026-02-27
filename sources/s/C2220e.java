package s;

import defpackage.AbstractC1414e;
import java.util.ArrayList;

/* JADX INFO: renamed from: s.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2220e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f19973b;
    public final double c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19974d;
    public final String e;

    public C2220e(ArrayList arrayList, char c, double d10, String str, String str2) {
        this.f19972a = arrayList;
        this.f19973b = c;
        this.c = d10;
        this.f19974d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + AbstractC1414e.c(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f19973b, this.e, this.f19974d);
    }
}
