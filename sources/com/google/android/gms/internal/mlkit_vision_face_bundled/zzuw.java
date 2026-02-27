package com.google.android.gms.internal.mlkit_vision_face_bundled;

import We.s;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuq;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuw;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzuw<MessageType extends zzuw<MessageType, BuilderType>, BuilderType extends zzuq<MessageType, BuilderType>> extends zztf<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzww zzc = zzww.zzc();

    public static zzvb zzA() {
        return zzwf.zze();
    }

    public static Object zzB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzC(zzvw zzvwVar, String str, Object[] objArr) {
        return new zzwg(zzvwVar, str, objArr);
    }

    public static void zzF(Class cls, zzuw zzuwVar) {
        zzuwVar.zzE();
        zzb.put(cls, zzuwVar);
    }

    public static final boolean zzH(zzuw zzuwVar, boolean z4) {
        byte bByteValue = ((Byte) zzuwVar.zzf(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzwe.zza().zzb(zzuwVar.getClass()).zzk(zzuwVar);
        if (z4) {
            zzuwVar.zzf(2, true != zZzk ? null : zzuwVar, null);
        }
        return zZzk;
    }

    private final int zzb(zzwh zzwhVar) {
        return zzwe.zza().zzb(getClass()).zza(this);
    }

    private static zzuw zzd(zzuw zzuwVar, byte[] bArr, int i, int i4, zzuh zzuhVar) throws zzve {
        if (i4 == 0) {
            return zzuwVar;
        }
        zzuw zzuwVarZzy = zzuwVar.zzy();
        try {
            zzwh zzwhVarZzb = zzwe.zza().zzb(zzuwVarZzy.getClass());
            zzwhVarZzb.zzh(zzuwVarZzy, bArr, 0, i4, new zztj(zzuhVar));
            zzwhVarZzb.zzf(zzuwVarZzy);
            return zzuwVarZzy;
        } catch (zzve e) {
            throw e;
        } catch (zzwu e7) {
            throw e7.zza();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzve) {
                throw ((zzve) e10.getCause());
            }
            throw new zzve(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zzuu zzw(zzvw zzvwVar, zzvw zzvwVar2, zzuz zzuzVar, int i, zzxg zzxgVar, boolean z4, Class cls) {
        return new zzuu(zzvwVar, Collections.EMPTY_LIST, zzvwVar2, new zzut(null, 202056002, zzxgVar, true, false), cls);
    }

    public static zzuw zzx(Class cls) {
        Map map = zzb;
        zzuw zzuwVar = (zzuw) map.get(cls);
        if (zzuwVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzuwVar = (zzuw) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzuwVar != null) {
            return zzuwVar;
        }
        zzuw zzuwVar2 = (zzuw) ((zzuw) zzxc.zze(cls)).zzf(6, null, null);
        if (zzuwVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzuwVar2);
        return zzuwVar2;
    }

    public static zzuw zzz(zzuw zzuwVar, byte[] bArr, zzuh zzuhVar) throws zzve {
        zzuw zzuwVarZzd = zzd(zzuwVar, bArr, 0, bArr.length, zzuhVar);
        if (zzuwVarZzd == null || zzH(zzuwVarZzd, true)) {
            return zzuwVarZzd;
        }
        throw new zzwu(zzuwVarZzd).zza();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzwe.zza().zzb(getClass()).zzj(this, (zzuw) obj);
    }

    public final int hashCode() {
        if (zzI()) {
            return zzs();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzs = zzs();
        this.zza = iZzs;
        return iZzs;
    }

    public final String toString() {
        return zzvy.zza(this, super.toString());
    }

    public final void zzD() {
        zzwe.zza().zzb(getClass()).zzf(this);
        zzE();
    }

    public final void zzE() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzG(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final /* synthetic */ zzvv zzK() {
        return (zzuq) zzf(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final void zzL(zzuc zzucVar) throws IOException {
        zzwe.zza().zzb(getClass()).zzi(this, zzud.zza(zzucVar));
    }

    public abstract Object zzf(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztf
    public final int zzp(zzwh zzwhVar) {
        if (zzI()) {
            int iZza = zzwhVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(s.f(iZza, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzwhVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(s.f(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvx
    public final /* synthetic */ zzvw zzq() {
        return (zzuw) zzf(6, null, null);
    }

    public final int zzs() {
        return zzwe.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvx
    public final boolean zzt() {
        return zzH(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvw
    public final int zzu() {
        if (zzI()) {
            int iZzb = zzb(null);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException(s.f(iZzb, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzb2 = zzb(null);
        if (iZzb2 < 0) {
            throw new IllegalStateException(s.f(iZzb2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzb2;
        return iZzb2;
    }

    public final zzuq zzv() {
        return (zzuq) zzf(5, null, null);
    }

    public final zzuw zzy() {
        return (zzuw) zzf(4, null, null);
    }
}
