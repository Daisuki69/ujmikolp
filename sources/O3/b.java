package O3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f4633b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f4634d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4632a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char[] c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char[] e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f4633b = cArr;
        f4634d = cArr;
    }

    public static void a(int i, int i4, int[] iArr) {
        int i6 = ((i << 8) + i4) - 1;
        int i10 = i6 / 1600;
        iArr[0] = i10;
        int i11 = i6 - (i10 * 1600);
        int i12 = i11 / 40;
        iArr[1] = i12;
        iArr[2] = i11 - (i12 * 40);
    }

    public static int b(int i, int i4) {
        int i6 = i - (((i4 * 149) % 255) + 1);
        return i6 >= 0 ? i6 : i6 + 256;
    }
}
