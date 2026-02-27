package lk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18326a = 0;

    static {
        a(0, 1);
        a(0, 2);
        a(0, 3);
        a(0, 4);
        a(1, 1);
        a(1, 2);
        a(1, 3);
        a(1, 4);
        a(2, 1);
        a(2, 2);
        a(2, 3);
        a(2, 4);
        a(3, 1);
        a(3, 2);
        a(3, 3);
        a(3, 4);
        a(4, 1);
        a(4, 2);
        a(4, 3);
        a(4, 4);
        a(5, 1);
        a(5, 2);
        a(5, 3);
        a(5, 4);
        a(6, 1);
        a(6, 2);
        a(6, 3);
        a(6, 4);
    }

    public static final int a(int i, int i4) {
        if (i4 <= 0 || i4 >= 512) {
            throw new UnsupportedOperationException("Channels count should be 1..511");
        }
        if (i < 0 || i >= 8) {
            throw new UnsupportedOperationException("Data type depth should be 0..7");
        }
        return (i & 7) + ((i4 - 1) << 3);
    }
}
