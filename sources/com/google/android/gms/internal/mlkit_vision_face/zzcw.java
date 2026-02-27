package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.datasource.cache.c;
import androidx.work.WorkInfo;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import u2.InterfaceC2297e;

/* JADX INFO: loaded from: classes3.dex */
final class zzcw implements InterfaceC2296d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final InterfaceC2295c zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final InterfaceC2295c zzh;
    private final zzda zzi = new zzda(this);

    static {
        zzcu zzcuVarL = AbstractC1173g.l(1);
        HashMap map = new HashMap();
        map.put(zzcuVarL.annotationType(), zzcuVarL);
        zzb = new C2294b("key", c.r(map));
        zzcu zzcuVarL2 = AbstractC1173g.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarL2.annotationType(), zzcuVarL2);
        zzc = new C2294b("value", c.r(map2));
        zzd = new InterfaceC2295c() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcv
            @Override // u2.InterfaceC2293a
            public final void encode(Object obj, Object obj2) throws IOException {
                zzcw.zzg((Map.Entry) obj, (InterfaceC2296d) obj2);
            }
        };
    }

    public zzcw(OutputStream outputStream, Map map, Map map2, InterfaceC2295c interfaceC2295c) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = interfaceC2295c;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, InterfaceC2296d interfaceC2296d) throws IOException {
        interfaceC2296d.add(zzb, entry.getKey());
        interfaceC2296d.add(zzc, entry.getValue());
    }

    private static int zzh(C2294b c2294b) {
        zzcu zzcuVar = (zzcu) c2294b.b(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(InterfaceC2295c interfaceC2295c, Object obj) throws IOException {
        zzcr zzcrVar = new zzcr();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzcrVar;
            try {
                interfaceC2295c.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzcrVar.zza();
                zzcrVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzcrVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzcu zzj(C2294b c2294b) {
        zzcu zzcuVar = (zzcu) c2294b.b(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzcw zzk(InterfaceC2295c interfaceC2295c, C2294b c2294b, Object obj, boolean z4) throws IOException {
        long jZzi = zzi(interfaceC2295c, obj);
        if (z4 && jZzi == 0) {
            return this;
        }
        zzn((zzh(c2294b) << 3) | 2);
        zzo(jZzi);
        interfaceC2295c.encode(obj, this);
        return this;
    }

    private final zzcw zzl(InterfaceC2297e interfaceC2297e, C2294b c2294b, Object obj, boolean z4) throws IOException {
        this.zzi.zza(c2294b, z4);
        interfaceC2297e.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) throws IOException {
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            this.zze.write((i & 127) | 128);
            i >>>= 7;
        }
        this.zze.write(i & 127);
    }

    private final void zzo(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.zze.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.zze.write(((int) j) & 127);
    }

    @Override // u2.InterfaceC2296d
    @NonNull
    public final InterfaceC2296d add(@NonNull C2294b c2294b, double d10) throws IOException {
        zza(c2294b, d10, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d inline(@Nullable Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @NonNull
    public final InterfaceC2296d nested(@NonNull C2294b c2294b) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final InterfaceC2296d zza(@NonNull C2294b c2294b, double d10, boolean z4) throws IOException {
        if (z4 && d10 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return this;
        }
        zzn((zzh(c2294b) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    public final InterfaceC2296d zzb(@NonNull C2294b c2294b, float f, boolean z4) throws IOException {
        if (z4 && f == 0.0f) {
            return this;
        }
        zzn((zzh(c2294b) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final InterfaceC2296d zzc(@NonNull C2294b c2294b, @Nullable Object obj, boolean z4) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z4 || charSequence.length() != 0) {
                    zzn((zzh(c2294b) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(c2294b, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, c2294b, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(c2294b, ((Double) obj).doubleValue(), z4);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(c2294b, ((Float) obj).floatValue(), z4);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(c2294b, ((Number) obj).longValue(), z4);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(c2294b, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    InterfaceC2295c interfaceC2295c = (InterfaceC2295c) this.zzf.get(obj.getClass());
                    if (interfaceC2295c != null) {
                        zzk(interfaceC2295c, c2294b, obj, z4);
                        return this;
                    }
                    InterfaceC2297e interfaceC2297e = (InterfaceC2297e) this.zzg.get(obj.getClass());
                    if (interfaceC2297e != null) {
                        zzl(interfaceC2297e, c2294b, obj, z4);
                        return this;
                    }
                    if (obj instanceof zzcs) {
                        zzd(c2294b, ((zzcs) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(c2294b, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, c2294b, obj, z4);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z4 || bArr.length != 0) {
                    zzn((zzh(c2294b) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzcw zzd(@NonNull C2294b c2294b, int i, boolean z4) throws IOException {
        if (!z4 || i != 0) {
            zzcu zzcuVarZzj = zzj(c2294b);
            zzct zzctVar = zzct.DEFAULT;
            int iOrdinal = zzcuVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzn(i);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzcuVarZzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzcuVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    public final zzcw zze(@NonNull C2294b c2294b, long j, boolean z4) throws IOException {
        if (!z4 || j != 0) {
            zzcu zzcuVarZzj = zzj(c2294b);
            zzct zzctVar = zzct.DEFAULT;
            int iOrdinal = zzcuVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzo(j);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzcuVarZzj.zza() << 3);
                zzo((j >> 63) ^ (j + j));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzcuVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    public final zzcw zzf(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC2295c interfaceC2295c = (InterfaceC2295c) this.zzf.get(obj.getClass());
        if (interfaceC2295c == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        interfaceC2295c.encode(obj, this);
        return this;
    }

    @NonNull
    public final InterfaceC2296d add(@NonNull C2294b c2294b, float f) throws IOException {
        zzb(c2294b, f, true);
        return this;
    }

    @Override // u2.InterfaceC2296d
    @NonNull
    public final /* synthetic */ InterfaceC2296d add(@NonNull C2294b c2294b, int i) throws IOException {
        zzd(c2294b, i, true);
        return this;
    }

    @Override // u2.InterfaceC2296d
    @NonNull
    public final /* synthetic */ InterfaceC2296d add(@NonNull C2294b c2294b, long j) throws IOException {
        zze(c2294b, j, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d nested(@NonNull String str) throws IOException {
        return nested(C2294b.c(str));
    }

    @Override // u2.InterfaceC2296d
    @NonNull
    public final InterfaceC2296d add(@NonNull C2294b c2294b, @Nullable Object obj) throws IOException {
        zzc(c2294b, obj, true);
        return this;
    }

    @Override // u2.InterfaceC2296d
    @NonNull
    public final /* synthetic */ InterfaceC2296d add(@NonNull C2294b c2294b, boolean z4) throws IOException {
        zzd(c2294b, z4 ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d add(@NonNull String str, double d10) throws IOException {
        zza(C2294b.c(str), d10, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d add(@NonNull String str, int i) throws IOException {
        zzd(C2294b.c(str), i, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d add(@NonNull String str, long j) throws IOException {
        zze(C2294b.c(str), j, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d add(@NonNull String str, @Nullable Object obj) throws IOException {
        zzc(C2294b.c(str), obj, true);
        return this;
    }

    @NonNull
    public final InterfaceC2296d add(@NonNull String str, boolean z4) throws IOException {
        zzd(C2294b.c(str), z4 ? 1 : 0, true);
        return this;
    }
}
