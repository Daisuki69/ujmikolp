package ai;

import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ai.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0713b implements io.split.android.client.utils.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7238a;

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            AbstractC1414e.o(e, new StringBuilder(numX49.tnTj78("buCP")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    @Override // io.split.android.client.utils.a
    public final byte[] a(byte[] bArr) throws Throwable {
        Throwable th2;
        ?? r82;
        GZIPInputStream gZIPInputStream;
        byte[] bArr2;
        switch (this.f7238a) {
            case 0:
                return bArr;
            case 1:
                byte[] byteArray = null;
                if (bArr.length != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            try {
                                bArr2 = new byte[10240];
                            } catch (IOException e) {
                                e = e;
                                Ri.a.g("Gzip format error: " + e.getLocalizedMessage());
                            } catch (Exception e7) {
                                e = e7;
                                Ri.a.g("Error decompressing gzip: " + e.getLocalizedMessage());
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            r82 = bArr;
                            b(byteArrayOutputStream);
                            b(r82);
                            b(byteArrayInputStream);
                            throw th2;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        gZIPInputStream = null;
                    } catch (Exception e11) {
                        e = e11;
                        gZIPInputStream = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                        r82 = 0;
                        b(byteArrayOutputStream);
                        b(r82);
                        b(byteArrayInputStream);
                        throw th2;
                    }
                    while (true) {
                        int i = gZIPInputStream.read(bArr2);
                        if (i < 0) {
                            byteArray = byteArrayOutputStream.toByteArray();
                        } else {
                            byteArrayOutputStream.write(bArr2, 0, i);
                        }
                        b(byteArrayOutputStream);
                        b(gZIPInputStream);
                        b(byteArrayInputStream);
                        break;
                    }
                }
                return byteArray;
            default:
                if (bArr.length != 0) {
                    try {
                        Inflater inflater = new Inflater();
                        inflater.setInput(bArr);
                        byte[] bArr3 = new byte[10240];
                        int iInflate = inflater.inflate(bArr3);
                        inflater.end();
                        return Arrays.copyOfRange(bArr3, 0, iInflate);
                    } catch (DataFormatException e12) {
                        Ri.a.g(numX49.tnTj78("buC2") + e12.getLocalizedMessage());
                    } catch (Exception e13) {
                        AbstractC1414e.o(e13, new StringBuilder(numX49.tnTj78("buCb")));
                    }
                }
                return null;
        }
    }
}
