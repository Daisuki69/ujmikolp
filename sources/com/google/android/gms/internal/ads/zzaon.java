package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaon {
    public static X509Certificate[][] zza(String str) throws SecurityException, IOException, zzaok {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair pairZza = zzaoo.zza(randomAccessFile2);
            try {
                if (pairZza == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 82);
                    sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb2.append(length);
                    sb2.append(" bytes");
                    throw new zzaok(sb2.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZza.first;
                long jLongValue = ((Long) pairZza.second).longValue();
                long j = (-20) + jLongValue;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzaok("ZIP64 APK not supported");
                    }
                }
                long jZzb = zzaoo.zzb(byteBuffer);
                if (jZzb >= jLongValue) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(jZzb).length() + 82 + String.valueOf(jLongValue).length());
                    sb3.append("ZIP Central Directory offset out of range: ");
                    sb3.append(jZzb);
                    sb3.append(". ZIP End of Central Directory offset: ");
                    sb3.append(jLongValue);
                    throw new zzaok(sb3.toString());
                }
                if (zzaoo.zzd(byteBuffer) + jZzb != jLongValue) {
                    throw new zzaok("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZzb < 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(jZzb).length() + 67);
                    sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb4.append(jZzb);
                    throw new zzaok(sb4.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jZzb - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzaok("No APK Signing Block before ZIP Central Directory");
                }
                long j6 = jZzb;
                long j7 = byteBufferAllocate.getLong(0);
                if (j7 < byteBufferAllocate.capacity() || j7 > 2147483639) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j7).length() + 37);
                    sb5.append("APK Signing Block size out of range: ");
                    sb5.append(j7);
                    throw new zzaok(sb5.toString());
                }
                int i = (int) (8 + j7);
                long j9 = j6 - ((long) i);
                if (j9 < 0) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j9).length() + 39);
                    sb6.append("APK Signing Block offset out of range: ");
                    sb6.append(j9);
                    throw new zzaok(sb6.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j9);
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j10 = byteBufferAllocate2.getLong(0);
                if (j10 != j7) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 63 + String.valueOf(j7).length());
                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                    sb7.append(j10);
                    sb7.append(" vs ");
                    sb7.append(j7);
                    throw new zzaok(sb7.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j9));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb8.append("end < start: ");
                    sb8.append(iCapacity);
                    sb8.append(" < 8");
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb9 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb9.append("end > capacity: ");
                    sb9.append(iCapacity);
                    sb9.append(" > ");
                    sb9.append(iCapacity2);
                    throw new IllegalArgumentException(sb9.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i4 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i4++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i4).length() + 59);
                            sb10.append("Insufficient data to read size of APK Signing Block entry #");
                            sb10.append(i4);
                            throw new zzaok(sb10.toString());
                        }
                        long j11 = byteBufferSlice.getLong();
                        if (j11 < 4 || j11 > 2147483647L) {
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i4).length() + 45 + String.valueOf(j11).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i4);
                            sb11.append(" size out of range: ");
                            sb11.append(j11);
                            throw new zzaok(sb11.toString());
                        }
                        int i6 = (int) j11;
                        int iPosition2 = byteBufferSlice.position() + i6;
                        if (i6 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb12 = new StringBuilder(String.valueOf(i4).length() + 45 + String.valueOf(i6).length() + 13 + String.valueOf(iRemaining).length());
                            sb12.append("APK Signing Block entry #");
                            sb12.append(i4);
                            sb12.append(" size out of range: ");
                            sb12.append(i6);
                            sb12.append(", available: ");
                            sb12.append(iRemaining);
                            throw new zzaok(sb12.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrZzb = zzb(randomAccessFile.getChannel(), new zzaoj(zzi(byteBufferSlice, i6 - 4), jLongValue2, j6, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrZzb;
                        }
                        long j12 = j6;
                        byteBufferSlice.position(iPosition2);
                        j6 = j12;
                    }
                    throw new zzaok("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th2) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzaoj zzaojVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzj = zzj(zzaojVar.zza());
                int i = 0;
                while (byteBufferZzj.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzc(zzj(byteBufferZzj), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(androidx.media3.datasource.cache.c.m(new StringBuilder(String.valueOf(i).length() + 37), "Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(map, fileChannel, zzaojVar.zzb(), zzaojVar.zzc(), zzaojVar.zzd(), zzaojVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e7) {
                throw new SecurityException("Failed to read list of signers", e7);
            }
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }

    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzj = zzj(byteBuffer);
        ByteBuffer byteBufferZzj2 = zzj(byteBuffer);
        byte[] bArrZzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzk2 = null;
        byte[] bArrZzk3 = null;
        int i = -1;
        int i4 = 0;
        while (byteBufferZzj2.hasRemaining()) {
            i4++;
            try {
                ByteBuffer byteBufferZzj3 = zzj(byteBufferZzj2);
                if (byteBufferZzj3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i6 = byteBufferZzj3.getInt();
                arrayList.add(Integer.valueOf(i6));
                if (i6 != 513 && i6 != 514 && i6 != 769) {
                    switch (i6) {
                        case 257:
                        case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED /* 258 */:
                        case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED /* 259 */:
                        case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED /* 260 */:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZzf = zzf(i6);
                    int iZzf2 = zzf(i);
                    if (iZzf != 1 && iZzf2 == 1) {
                    }
                }
                bArrZzk3 = zzk(byteBufferZzj3);
                i = i6;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i4).length() + 34), "Failed to parse signature record #", i4), e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i4).length() + 34), "Failed to parse signature record #", i4), e);
            }
        }
        if (i == -1) {
            if (i4 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED /* 258 */:
                case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED /* 259 */:
                case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED /* 260 */:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED /* 258 */:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED /* 259 */:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED /* 260 */:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzj);
            if (!signature.verify(bArrZzk3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzj.clear();
            ByteBuffer byteBufferZzj4 = zzj(byteBufferZzj);
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (byteBufferZzj4.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer byteBufferZzj5 = zzj(byteBufferZzj4);
                    if (byteBufferZzj5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i11 = byteBufferZzj5.getInt();
                    arrayList2.add(Integer.valueOf(i11));
                    if (i11 == i) {
                        bArrZzk2 = zzk(byteBufferZzj5);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i10).length() + 31), "Failed to parse digest record #", i10), e);
                } catch (BufferUnderflowException e11) {
                    e = e11;
                    throw new IOException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i10).length() + 31), "Failed to parse digest record #", i10), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzf3 = zzf(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzf3), bArrZzk2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzk2)) {
                throw new SecurityException(zzg(iZzf3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzj6 = zzj(byteBufferZzj);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (byteBufferZzj6.hasRemaining()) {
                i12++;
                byte[] bArrZzk4 = zzk(byteBufferZzj6);
                try {
                    arrayList3.add(new zzaol((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzk4)), bArrZzk4));
                } catch (CertificateException e12) {
                    throw new SecurityException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i12).length() + 30), "Failed to decode certificate #", i12), e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new SecurityException(We.s.q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e14) {
            e = e14;
            throw new SecurityException(We.s.q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new SecurityException(We.s.q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e16) {
            e = e16;
            throw new SecurityException(We.s.q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e17) {
            e = e17;
            throw new SecurityException(We.s.q(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    private static void zzd(Map map, FileChannel fileChannel, long j, long j6, long j7, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaoi zzaoiVar = new zzaoi(fileChannel, 0L, j);
        zzaoi zzaoiVar2 = new zzaoi(fileChannel, j6, j7 - j6);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzaoo.zzc(byteBufferDuplicate, j);
        zzaog zzaogVar = new zzaog(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrZze = zze(iArr, new zzaoh[]{zzaoiVar, zzaoiVar2, zzaogVar});
            for (int i4 = 0; i4 < size; i4++) {
                int i6 = iArr[i4];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i6)), bArrZze[i4])) {
                    throw new SecurityException(zzg(i6).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[][] zze(int[] iArr, zzaoh[] zzaohVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i4;
        String str;
        int i6 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i6 >= 3) {
                break;
            }
            jZza += (zzaohVarArr[i6].zza() + 1048575) / 1048576;
            i6++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(androidx.media3.datasource.cache.c.j(jZza, "Too many chunks: ", new StringBuilder(String.valueOf(jZza).length() + 17)));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i10 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            i4 = 1;
            if (i10 >= length) {
                break;
            }
            int i11 = (int) jZza;
            byte[] bArr2 = new byte[(zzh(iArr[i10]) * i11) + 5];
            bArr2[0] = 90;
            zzl(i11, bArr2, 1);
            bArr[i10] = bArr2;
            i10++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i12 = 0;
        while (true) {
            str = " digest not supported";
            if (i12 >= iArr.length) {
                break;
            }
            String strZzg = zzg(iArr[i12]);
            try {
                messageDigestArr[i12] = MessageDigest.getInstance(strZzg);
                i12++;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strZzg.concat(" digest not supported"), e);
            }
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i) {
            zzaoh zzaohVar = zzaohVarArr[i13];
            int i16 = i13;
            long jZza2 = zzaohVar.zza();
            long j6 = 0;
            while (jZza2 > 0) {
                int i17 = i14;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j);
                zzl(iMin, bArr3, i4);
                for (int i18 = 0; i18 < length; i18++) {
                    messageDigestArr[i18].update(bArr3);
                }
                try {
                    zzaohVar.zzb(messageDigestArr, j6, iMin);
                    int i19 = 0;
                    while (i19 < iArr.length) {
                        int i20 = iArr[i19];
                        byte[] bArr4 = bArr[i19];
                        int iZzh = zzh(i20);
                        char c10 = c;
                        MessageDigest messageDigest = messageDigestArr[i19];
                        int iDigest = messageDigest.digest(bArr4, (i17 * iZzh) + 5, iZzh);
                        if (iDigest != iZzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i19++;
                        c = c10;
                    }
                    long j7 = iMin;
                    j6 += j7;
                    jZza2 -= j7;
                    i14 = i17 + 1;
                    str = str2;
                    j = 1048576;
                    i4 = 1;
                } catch (IOException e7) {
                    throw new DigestException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i17).length() + 37 + String.valueOf(i15).length()), "Failed to digest chunk #", i17, " of section #", i15), e7);
                }
            }
            i15++;
            i13 = i16 + 1;
            j = 1048576;
            i = 3;
            i4 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            byte[] bArr6 = bArr[i21];
            String strZzg2 = zzg(i22);
            try {
                bArr5[i21] = MessageDigest.getInstance(strZzg2).digest(bArr6);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strZzg2.concat(str3), e10);
            }
        }
        return bArr5;
    }

    private static int zzf(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED /* 259 */:
                return 1;
            case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED /* 258 */:
            case MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED /* 260 */:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    private static String zzg(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 33), "Unknown content digest algorthm: ", i));
    }

    private static int zzh(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 33), "Unknown content digest algorthm: ", i));
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i4 = i + iPosition;
        if (i4 < iPosition || i4 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i4);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i4);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iRemaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", iRemaining));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zzi(byteBuffer, i);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(iRemaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", iRemaining2));
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(iRemaining).length()), "Underflow while reading length-prefixed value. Length: ", i, ", available: ", iRemaining));
    }

    private static void zzl(int i, byte[] bArr, int i4) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
