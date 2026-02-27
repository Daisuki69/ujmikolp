package j2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f17687g = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f17688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17689b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f17690d;
    public i e;
    public final byte[] f;

    public l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    B(i, iArr[i4], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f17688a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM = m(0, bArr);
        this.f17689b = iM;
        if (iM > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f17689b + ", Actual length: " + randomAccessFile2.length());
        }
        this.c = m(4, bArr);
        int iM2 = m(8, bArr);
        int iM3 = m(12, bArr);
        this.f17690d = k(iM2);
        this.e = k(iM3);
    }

    public static void B(int i, int i4, byte[] bArr) {
        bArr[i] = (byte) (i4 >> 24);
        bArr[i + 1] = (byte) (i4 >> 16);
        bArr[i + 2] = (byte) (i4 >> 8);
        bArr[i + 3] = (byte) i4;
    }

    public static int m(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void b(byte[] bArr) {
        int iY;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean zI = i();
                    if (zI) {
                        iY = 16;
                    } else {
                        i iVar = this.e;
                        iY = y(iVar.f17683a + 4 + iVar.f17684b);
                    }
                    i iVar2 = new i(iY, length);
                    B(0, length, this.f);
                    t(iY, 4, this.f);
                    t(iY + 4, length, bArr);
                    z(this.f17689b, this.c + 1, zI ? iY : this.f17690d.f17683a, iY);
                    this.e = iVar2;
                    this.c++;
                    if (zI) {
                        this.f17690d = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void c() {
        z(4096, 0, 0, 0);
        this.c = 0;
        i iVar = i.c;
        this.f17690d = iVar;
        this.e = iVar;
        if (this.f17689b > 4096) {
            RandomAccessFile randomAccessFile = this.f17688a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f17689b = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17688a.close();
    }

    public final void f(int i) throws IOException {
        int i4 = i + 4;
        int iW = this.f17689b - w();
        if (iW >= i4) {
            return;
        }
        int i6 = this.f17689b;
        do {
            iW += i6;
            i6 <<= 1;
        } while (iW < i4);
        RandomAccessFile randomAccessFile = this.f17688a;
        randomAccessFile.setLength(i6);
        randomAccessFile.getChannel().force(true);
        i iVar = this.e;
        int iY = y(iVar.f17683a + 4 + iVar.f17684b);
        if (iY < this.f17690d.f17683a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f17689b);
            long j = iY - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i10 = this.e.f17683a;
        int i11 = this.f17690d.f17683a;
        if (i10 < i11) {
            int i12 = (this.f17689b + i10) - 16;
            z(i6, this.c, i11, i12);
            this.e = new i(i12, this.e.f17684b);
        } else {
            z(i6, this.c, i11, i10);
        }
        this.f17689b = i6;
    }

    public final synchronized void g(k kVar) {
        int iY = this.f17690d.f17683a;
        for (int i = 0; i < this.c; i++) {
            i iVarK = k(iY);
            kVar.b(new j(this, iVarK), iVarK.f17684b);
            iY = y(iVarK.f17683a + 4 + iVarK.f17684b);
        }
    }

    public final synchronized boolean i() {
        return this.c == 0;
    }

    public final i k(int i) throws IOException {
        if (i == 0) {
            return i.c;
        }
        RandomAccessFile randomAccessFile = this.f17688a;
        randomAccessFile.seek(i);
        return new i(i, randomAccessFile.readInt());
    }

    public final synchronized void q() {
        try {
            if (i()) {
                throw new NoSuchElementException();
            }
            if (this.c == 1) {
                c();
            } else {
                i iVar = this.f17690d;
                int iY = y(iVar.f17683a + 4 + iVar.f17684b);
                r(iY, this.f, 0, 4);
                int iM = m(0, this.f);
                z(this.f17689b, this.c - 1, iY, this.e.f17683a);
                this.c--;
                this.f17690d = new i(iY, iM);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void r(int i, byte[] bArr, int i4, int i6) throws IOException {
        int iY = y(i);
        int i10 = iY + i6;
        int i11 = this.f17689b;
        RandomAccessFile randomAccessFile = this.f17688a;
        if (i10 <= i11) {
            randomAccessFile.seek(iY);
            randomAccessFile.readFully(bArr, i4, i6);
            return;
        }
        int i12 = i11 - iY;
        randomAccessFile.seek(iY);
        randomAccessFile.readFully(bArr, i4, i12);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i4 + i12, i6 - i12);
    }

    public final void t(int i, int i4, byte[] bArr) throws IOException {
        int iY = y(i);
        int i6 = iY + i4;
        int i10 = this.f17689b;
        RandomAccessFile randomAccessFile = this.f17688a;
        if (i6 <= i10) {
            randomAccessFile.seek(iY);
            randomAccessFile.write(bArr, 0, i4);
            return;
        }
        int i11 = i10 - iY;
        randomAccessFile.seek(iY);
        randomAccessFile.write(bArr, 0, i11);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i11, i4 - i11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f17689b);
        sb2.append(", size=");
        sb2.append(this.c);
        sb2.append(", first=");
        sb2.append(this.f17690d);
        sb2.append(", last=");
        sb2.append(this.e);
        sb2.append(", element lengths=[");
        try {
            g(new A3.i(sb2, 13));
        } catch (IOException e) {
            f17687g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final int w() {
        if (this.c == 0) {
            return 16;
        }
        i iVar = this.e;
        int i = iVar.f17683a;
        int i4 = this.f17690d.f17683a;
        return i >= i4 ? (i - i4) + 4 + iVar.f17684b + 16 : (((i + 4) + iVar.f17684b) + this.f17689b) - i4;
    }

    public final int y(int i) {
        int i4 = this.f17689b;
        return i < i4 ? i : (i + 16) - i4;
    }

    public final void z(int i, int i4, int i6, int i10) throws IOException {
        int[] iArr = {i, i4, i6, i10};
        byte[] bArr = this.f;
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            B(i11, iArr[i12], bArr);
            i11 += 4;
        }
        RandomAccessFile randomAccessFile = this.f17688a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }
}
