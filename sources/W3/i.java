package W3;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6236b;
    public final int c;

    public i(int i, int i4, int i6) throws FormatException {
        super(i);
        if (i4 < 0 || i4 > 10 || i6 < 0 || i6 > 10) {
            throw FormatException.a();
        }
        this.f6236b = i4;
        this.c = i6;
    }
}
