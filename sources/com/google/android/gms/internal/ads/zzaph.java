package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaph implements Comparable {
    private final zzaps zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @GuardedBy("mLock")
    private final zzapl zzf;
    private Integer zzg;
    private zzapk zzh;

    @GuardedBy("mLock")
    private boolean zzi;

    @Nullable
    private zzaoq zzj;

    @GuardedBy("mLock")
    private zzapg zzk;
    private final zzaov zzl;

    public zzaph(int i, String str, @Nullable zzapl zzaplVar) {
        Uri uri;
        String host;
        this.zza = zzaps.zza ? new zzaps() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaplVar;
        this.zzl = new zzaov();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaph) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        androidx.media3.datasource.cache.c.A(sb2, "[ ] ", str, Global.BLANK, strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzaps.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzapk zzapkVar = this.zzh;
        if (zzapkVar != null) {
            zzapkVar.zzc(this);
        }
        if (zzaps.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapf(this, str, id));
                return;
            }
            zzaps zzapsVar = this.zza;
            zzapsVar.zza(str, id);
            zzapsVar.zzb(toString());
        }
    }

    public final void zze(int i) {
        zzapk zzapkVar = this.zzh;
        if (zzapkVar != null) {
            zzapkVar.zzd(this, i);
        }
    }

    public final zzaph zzf(zzapk zzapkVar) {
        this.zzh = zzapkVar;
        return this;
    }

    public final zzaph zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return We.s.q(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, Global.HYPHEN, str);
    }

    public final zzaph zzj(zzaoq zzaoqVar) {
        this.zzj = zzaoqVar;
        return this;
    }

    @Nullable
    public final zzaoq zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzaop {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzaop {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z4;
        synchronized (this.zze) {
            z4 = this.zzi;
        }
        return z4;
    }

    public abstract zzapn zzr(zzapd zzapdVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzapq zzapqVar) {
        zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzf;
        }
        zzaplVar.zza(zzapqVar);
    }

    public final void zzu(zzapg zzapgVar) {
        synchronized (this.zze) {
            this.zzk = zzapgVar;
        }
    }

    public final void zzv(zzapn zzapnVar) {
        zzapg zzapgVar;
        synchronized (this.zze) {
            zzapgVar = this.zzk;
        }
        if (zzapgVar != null) {
            zzapgVar.zza(this, zzapnVar);
        }
    }

    public final void zzw() {
        zzapg zzapgVar;
        synchronized (this.zze) {
            zzapgVar = this.zzk;
        }
        if (zzapgVar != null) {
            zzapgVar.zzb(this);
        }
    }

    public final /* synthetic */ zzaps zzx() {
        return this.zza;
    }

    public final zzaov zzy() {
        return this.zzl;
    }
}
