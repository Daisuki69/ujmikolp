package zj;

/* JADX INFO: renamed from: zj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C2580b extends C2579a {
    public static final boolean c(char c, char c10, boolean z4) {
        if (c == c10) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
