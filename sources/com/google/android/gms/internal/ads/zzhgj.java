package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgk;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhgj<MessageType extends zzhgk<MessageType, BuilderType>, BuilderType extends zzhgj<MessageType, BuilderType>> implements zzhjr {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        androidx.media3.datasource.cache.c.A(sb2, "Reading ", name, " from a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    public static zzhku zzaR(zzhjs zzhjsVar) {
        return new zzhku(zzhjsVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhiu.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzhjd)) {
            if (iterable instanceof zzhkb) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzhjd) iterable).zza();
        zzhjd zzhjdVar = (zzhjd) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzhjdVar.size() - size;
                String strM = androidx.media3.datasource.cache.c.m(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzhjdVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(strM);
                    }
                    zzhjdVar.remove(size3);
                }
            } else if (obj instanceof zzhhb) {
                zzhjdVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzhhb.zzr(bArr2, 0, bArr2.length);
                zzhjdVar.zzb();
            } else {
                zzhjdVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzhkd) {
                ((zzhkd) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            A1.b bVar = (Object) list2.get(i);
            if (bVar == null) {
                zzc(list, size2);
            }
            list.add(bVar);
        }
    }

    private static void zzc(List<?> list, int i) {
        int size = list.size() - i;
        String strM = androidx.media3.datasource.cache.c.m(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strM);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzhhg zzhhgVar) throws IOException {
        int i = zzhhr.zzb;
        int i4 = zzhgo.zza;
        return (BuilderType) zzbd(zzhhgVar, zzhhr.zza);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException;

    public BuilderType zzaF(zzhhb zzhhbVar) throws zzhiw {
        try {
            zzhhg zzhhgVarZzp = zzhhbVar.zzp();
            zzbe(zzhhgVarZzp);
            zzhhgVarZzp.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e7) {
            throw new RuntimeException(zza("ByteString"), e7);
        }
    }

    public BuilderType zzaG(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        try {
            zzhhg zzhhgVarZzp = zzhhbVar.zzp();
            zzbd(zzhhgVarZzp, zzhhrVar);
            zzhhgVarZzp.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e7) {
            throw new RuntimeException(zza("ByteString"), e7);
        }
    }

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzhiw {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i4) throws zzhiw {
        try {
            zzhhg zzhhgVarZzG = zzhhg.zzG(bArr, i, i4, false);
            zzbe(zzhhgVarZzG);
            zzhhgVarZzG.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e7) {
            throw new RuntimeException(zza("byte array"), e7);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzhhrVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i, int i4, zzhhr zzhhrVar) throws zzhiw {
        try {
            zzhhg zzhhgVarZzG = zzhhg.zzG(bArr, i, i4, false);
            zzbd(zzhhgVarZzG, zzhhrVar);
            zzhhgVarZzG.zzb(0);
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e7) {
            throw new RuntimeException(zza("byte array"), e7);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzhhg zzhhgVarZzF = zzhhg.zzF(inputStream, 4096);
        zzbe(zzhhgVarZzF);
        zzhhgVarZzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        zzhhg zzhhgVarZzF = zzhhg.zzF(inputStream, 4096);
        zzbd(zzhhgVarZzF, zzhhrVar);
        zzhhgVarZzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaM(new zzhgi(inputStream, zzhhg.zzM(i, inputStream)), zzhhrVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i = zzhhr.zzb;
        int i4 = zzhgo.zza;
        return zzaN(inputStream, zzhhr.zza);
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzhjs zzhjsVar) {
        if (zzbw().getClass().isInstance(zzhjsVar)) {
            return (BuilderType) zzaQ((zzhgk) zzhjsVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzhjr zzaV(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        zzaM(inputStream, zzhhrVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhjr zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhjr zzbb(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        zzaG(zzhhbVar, zzhhrVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhjr zzbc(zzhhb zzhhbVar) throws zzhiw {
        zzaF(zzhhbVar);
        return this;
    }
}
