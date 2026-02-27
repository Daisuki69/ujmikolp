package zf;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import xf.C2476a;
import yf.C2531a;
import yf.j;
import yf.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21394b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21395a;

    public static void a(ArrayList arrayList, long j, C2476a c2476a) throws IOException {
        if (j < 0) {
            StringBuilder sb2 = new StringBuilder("negative array index: ");
            sb2.append(j);
            sb2.append(" near offset ");
            c2476a.a();
            sb2.append(c2476a.f20984b);
            throw new IOException(sb2.toString());
        }
        if (j < arrayList.size()) {
            return;
        }
        StringBuilder sbS = androidx.camera.core.impl.a.s(j, "array index overflow: ", " >= ");
        sbS.append(arrayList.size());
        sbS.append(" near offset ");
        c2476a.a();
        sbS.append(c2476a.f20984b);
        throw new IOException(sbS.toString());
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int i = inputStream.read(bArr);
        if (i > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, i);
            byte[] bArr2 = new byte[1024];
            boolean z4 = false;
            while (true) {
                try {
                    try {
                        int iInflate = inflater.inflate(bArr2);
                        if (iInflate == 0) {
                            if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                                break;
                            } else {
                                inflater.setInput(bArr, 0, inputStream.read(bArr));
                            }
                        } else {
                            outputStream.write(bArr2, 0, iInflate);
                            z4 = true;
                        }
                    } catch (DataFormatException e) {
                        if (!z4) {
                            throw e;
                        }
                        Log.w("PdfBox-Android", "FlateFilter: premature end of stream due to a DataFormatException");
                    }
                } finally {
                    inflater.end();
                }
            }
        }
        outputStream.flush();
    }

    public static yf.d d(p pVar, int i) {
        j jVar = j.f21233l0;
        j jVar2 = j.m0;
        yf.b bVarQ = pVar.q(jVar);
        if (bVarQ == null && jVar2 != null) {
            bVarQ = pVar.q(jVar2);
        }
        j jVar3 = j.f21219f0;
        j jVar4 = j.f21208a0;
        yf.b bVarQ2 = pVar.q(jVar3);
        if (bVarQ2 == null && jVar4 != null) {
            bVarQ2 = pVar.q(jVar4);
        }
        if ((bVarQ instanceof j) && (bVarQ2 instanceof yf.d)) {
            return (yf.d) bVarQ2;
        }
        boolean z4 = bVarQ instanceof C2531a;
        if (z4 && (bVarQ2 instanceof C2531a)) {
            C2531a c2531a = (C2531a) bVarQ2;
            if (i < c2531a.f21151a.size()) {
                yf.b bVarK = c2531a.k(i);
                if (bVarK instanceof yf.d) {
                    return (yf.d) bVarK;
                }
            }
        } else if (bVarQ2 != null && !z4 && !(bVarQ2 instanceof C2531a)) {
            Log.e("PdfBox-Android", "Expected DecodeParams to be an Array or Dictionary but found ".concat(bVarQ2.getClass().getName()));
        }
        return new yf.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0166, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0285 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zf.e b(java.io.InputStream r31, java.io.OutputStream r32, yf.p r33, int r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.b.b(java.io.InputStream, java.io.OutputStream, yf.p, int):zf.e");
    }
}
