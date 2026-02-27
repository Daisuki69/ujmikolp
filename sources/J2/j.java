package j2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17686b;
    public final /* synthetic */ l c;

    public j(l lVar, i iVar) {
        this.c = lVar;
        this.f17685a = lVar.y(iVar.f17683a + 4);
        this.f17686b = iVar.f17684b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i4) < 0 || i4 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.f17686b;
        if (i6 <= 0) {
            return -1;
        }
        if (i4 > i6) {
            i4 = i6;
        }
        int i10 = this.f17685a;
        l lVar = this.c;
        lVar.r(i10, bArr, i, i4);
        this.f17685a = lVar.y(this.f17685a + i4);
        this.f17686b -= i4;
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f17686b == 0) {
            return -1;
        }
        l lVar = this.c;
        lVar.f17688a.seek(this.f17685a);
        int i = lVar.f17688a.read();
        this.f17685a = lVar.y(this.f17685a + 1);
        this.f17686b--;
        return i;
    }
}
