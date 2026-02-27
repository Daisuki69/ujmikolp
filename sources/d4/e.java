package d4;

/* JADX INFO: loaded from: classes3.dex */
public enum e {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16271b;

    e(int[] iArr, int i) {
        this.f16270a = iArr;
        this.f16271b = i;
    }

    public final int a(g gVar) {
        int i = gVar.f16272a;
        return this.f16270a[i <= 9 ? (char) 0 : i <= 26 ? (char) 1 : (char) 2];
    }
}
