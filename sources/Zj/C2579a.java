package zj;

import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: zj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C2579a {
    public static void a(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbT = We.s.t(i, "radix ", " was not in valid range ");
            sbT.append(new IntRange(2, 36, 1));
            throw new IllegalArgumentException(sbT.toString());
        }
    }

    public static boolean b(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
