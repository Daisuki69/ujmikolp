package w5;

import We.s;
import java.util.ArrayList;

/* JADX INFO: renamed from: w5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2385c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f20699a = new ArrayList(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f20700b = new ArrayList(31);

    static {
        int i = 1;
        int i4 = 1;
        while (i4 <= 12) {
            f20699a.add(i4 < 10 ? s.f(i4, "0") : String.valueOf(i4));
            i4++;
        }
        while (i <= 31) {
            f20700b.add(i < 10 ? s.f(i, "0") : String.valueOf(i));
            i++;
        }
    }
}
