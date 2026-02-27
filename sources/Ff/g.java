package Ff;

import M8.A0;
import M8.T2;
import We.s;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import yf.C2531a;
import yf.o;
import yf.p;
import yf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final byte[] j = {115, 65, 108, 84};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1584b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1585d;
    public boolean f;
    public yf.j h;
    public yf.j i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f1583a = 40;
    public final f c = new f(0, (byte) 0);
    public final Set e = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f1586g = null;

    public static boolean g(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        int length = bArr.length;
        while (length > 0) {
            int i = byteArrayInputStream.read(bArr, bArr.length - length, length);
            if (i < 0) {
                break;
            }
            length -= i;
        }
        if (length == 0) {
            return false;
        }
        if (length == bArr.length) {
            return true;
        }
        StringBuilder sbT = s.t(length, "AES initialization vector not fully read: only ", " bytes read instead of ");
        sbT.append(bArr.length);
        throw new IOException(sbT.toString());
    }

    public final void a(yf.b bVar, long j6, long j7) throws IOException {
        boolean z4 = bVar instanceof q;
        Set set = this.e;
        if (!z4) {
            if (bVar instanceof p) {
                if (set.contains(bVar)) {
                    return;
                }
                set.add(bVar);
                c((p) bVar, j6, j7);
                return;
            }
            if (bVar instanceof yf.d) {
                b((yf.d) bVar, j6, j7);
                return;
            }
            if (bVar instanceof C2531a) {
                C2531a c2531a = (C2531a) bVar;
                for (int i = 0; i < c2531a.f21151a.size(); i++) {
                    a(c2531a.g(i), j6, j7);
                }
                return;
            }
            return;
        }
        if (set.contains(bVar)) {
            return;
        }
        set.add(bVar);
        q qVar = (q) bVar;
        if (yf.j.w0.equals(this.i)) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(qVar.f21279a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d(j6, j7, byteArrayInputStream, byteArrayOutputStream);
            qVar.f21279a = (byte[]) byteArrayOutputStream.toByteArray().clone();
        } catch (IOException e) {
            Log.e("PdfBox-Android", "Failed to decrypt COSString of length " + qVar.f21279a.length + " in object " + j6 + ": " + e.getMessage());
        }
    }

    public final void b(yf.d dVar, long j6, long j7) {
        long j9;
        long j10;
        if (dVar.w(yf.j.f21169B) != null) {
            return;
        }
        yf.b bVarQ = dVar.q(yf.j.f21262x1);
        boolean z4 = yf.j.f21238n1.equals(bVarQ) || yf.j.f21217e0.equals(bVarQ) || ((dVar.q(yf.j.f21192S) instanceof q) && (dVar.q(yf.j.f21253u) instanceof C2531a));
        for (Map.Entry entry : dVar.f21154a.entrySet()) {
            if (!z4 || !yf.j.f21192S.equals(entry.getKey())) {
                yf.b bVar = (yf.b) entry.getValue();
                if ((bVar instanceof q) || (bVar instanceof C2531a) || (bVar instanceof yf.d)) {
                    j9 = j6;
                    j10 = j7;
                    a(bVar, j9, j10);
                } else {
                    j9 = j6;
                    j10 = j7;
                }
                j6 = j9;
                j7 = j10;
            }
        }
    }

    public final void c(p pVar, long j6, long j7) throws IOException {
        if (yf.j.w0.equals(this.h)) {
            return;
        }
        yf.j jVarK = pVar.k(yf.j.f21262x1);
        if ((this.f1585d || !yf.j.f21181J0.equals(jVarK)) && !yf.j.f21176E1.equals(jVarK)) {
            if (yf.j.f21181J0.equals(jVarK)) {
                Af.b bVarK = pVar.K();
                int i = 10;
                byte[] bArr = new byte[10];
                while (i > 0) {
                    int i4 = bVarK.read(bArr, 10 - i, i);
                    if (i4 < 0) {
                        break;
                    } else {
                        i -= i4;
                    }
                }
                bVarK.close();
                if (Arrays.equals(bArr, "<?xpacket ".getBytes(Nf.a.c))) {
                    Log.w("PdfBox-Android", "Metadata is not encrypted, but was expected to be");
                    Log.w("PdfBox-Android", "Read PDF specification about EncryptMetadata (default value: true)");
                    return;
                }
            }
            b(pVar, j6, j7);
            Af.b bVarK2 = pVar.K();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            T2.f(bVarK2, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            o oVarL = pVar.L();
            try {
                try {
                    d(j6, j7, byteArrayInputStream, oVarL);
                } catch (IOException e) {
                    Log.e("PdfBox-Android", e.getClass().getSimpleName() + " thrown when decrypting object " + j6 + Global.BLANK + j7 + " obj");
                    throw e;
                }
            } finally {
                oVarL.close();
            }
        }
    }

    public final void d(long j6, long j7, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        if (this.f && this.f1584b.length == 32) {
            byte[] bArr = new byte[16];
            if (g(bArr, byteArrayInputStream, outputStream)) {
                try {
                    byte[] bArr2 = this.f1584b;
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
                    CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipher);
                    try {
                        try {
                            T2.f(cipherInputStream, outputStream);
                        } catch (IOException e) {
                            if (!(e.getCause() instanceof GeneralSecurityException)) {
                                throw e;
                            }
                            Log.d("PdfBox-Android", "A GeneralSecurityException occurred when decrypting some stream data", e);
                        }
                    } finally {
                        cipherInputStream.close();
                    }
                } catch (GeneralSecurityException e7) {
                    throw new IOException(e7);
                }
            }
        } else {
            byte[] bArr3 = this.f1584b;
            int length = bArr3.length;
            int i = length + 5;
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[length] = (byte) (j6 & 255);
            bArr4[length + 1] = (byte) ((j6 >> 8) & 255);
            bArr4[length + 2] = (byte) ((j6 >> 16) & 255);
            bArr4[length + 3] = (byte) (j7 & 255);
            bArr4[length + 4] = (byte) ((j7 >> 8) & 255);
            MessageDigest messageDigestM = A0.m();
            messageDigestM.update(bArr4);
            if (this.f) {
                messageDigestM.update(j);
            }
            byte[] bArrDigest = messageDigestM.digest();
            int iMin = Math.min(i, 16);
            byte[] bArr5 = new byte[iMin];
            System.arraycopy(bArrDigest, 0, bArr5, 0, iMin);
            if (this.f) {
                byte[] bArr6 = new byte[16];
                if (g(bArr6, byteArrayInputStream, outputStream)) {
                    try {
                        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher2.init(2, new SecretKeySpec(bArr5, "AES"), new IvParameterSpec(bArr6));
                        byte[] bArr7 = new byte[256];
                        while (true) {
                            int i4 = byteArrayInputStream.read(bArr7);
                            if (i4 == -1) {
                                break;
                            }
                            byte[] bArrUpdate = cipher2.update(bArr7, 0, i4);
                            if (bArrUpdate != null) {
                                outputStream.write(bArrUpdate);
                            }
                        }
                        outputStream.write(cipher2.doFinal());
                    } catch (GeneralSecurityException e10) {
                        throw new IOException(e10);
                    }
                }
            } else {
                e(bArr5, byteArrayInputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    public final void e(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        f fVar = this.c;
        fVar.j(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i == -1) {
                return;
            }
            for (int i4 = 0; i4 < i; i4++) {
                fVar.l(bArr2[i4], outputStream);
            }
        }
    }

    public final void f(byte[] bArr, byte[] bArr2, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        f fVar = this.c;
        fVar.j(bArr);
        for (byte b8 : bArr2) {
            fVar.l(b8, byteArrayOutputStream);
        }
    }

    public abstract void h(b bVar, C2531a c2531a, E1.c cVar);
}
