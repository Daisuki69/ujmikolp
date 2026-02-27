package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzast extends zzhih implements zzhjt {
    private static final zzast zzbe;
    private static volatile zzhka zzbf;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzasv zzO;
    private int zza;
    private zzaso zzaF;
    private zzasm zzaG;
    private long zzaM;
    private long zzaN;
    private zzase zzaQ;
    private zzasg zzaR;
    private int zzaU;
    private long zzaV;
    private boolean zzaY;
    private zzasq zzag;
    private zzass zzai;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzati zzax;
    private int zzb;
    private long zzba;
    private zzatg zzbb;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = Ef.a.c;
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = Ef.a.c;
    private String zzW = Ef.a.c;
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;
    private zzhit zzah = zzhih.zzbM();
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private String zzar = Ef.a.c;
    private long zzas = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = Ef.a.c;
    private zzhit zzaC = zzhih.zzbM();
    private int zzaD = 1000;
    private zzhit zzaE = zzhih.zzbM();
    private String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaO = -1;
    private String zzaP = "";
    private long zzaS = -1;
    private long zzaT = -1;
    private String zzaW = "";
    private int zzaX = 2;
    private String zzaZ = "";
    private long zzbc = -1;
    private String zzbd = "";

    static {
        zzast zzastVar = new zzast();
        zzbe = zzastVar;
        zzhih.zzbu(zzast.class, zzastVar);
    }

    private zzast() {
    }

    public static zzast zzh(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return (zzast) zzhih.zzbV(zzbe, bArr, zzhhrVar);
    }

    public static zzarw zzi() {
        return (zzarw) zzbe.zzbn();
    }

    public static zzast zzj() {
        return zzbe;
    }

    public final /* synthetic */ void zzA(long j) {
        this.zza |= 33554432;
        this.zzH = j;
    }

    public final /* synthetic */ void zzB(long j) {
        this.zza |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.zzI = j;
    }

    public final /* synthetic */ void zzC(long j) {
        this.zza |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        this.zzJ = j;
    }

    public final /* synthetic */ void zzD(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void zzE(long j) {
        this.zza |= androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE;
        this.zzL = j;
    }

    public final /* synthetic */ void zzF(long j) {
        this.zza |= 1073741824;
        this.zzM = j;
    }

    public final /* synthetic */ void zzG(long j) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j;
    }

    public final /* synthetic */ void zzH(long j) {
        this.zzb |= 2;
        this.zzP = j;
    }

    public final /* synthetic */ void zzI(long j) {
        this.zzb |= 4;
        this.zzQ = j;
    }

    public final /* synthetic */ void zzJ(long j) {
        this.zzb |= 8;
        this.zzR = j;
    }

    public final /* synthetic */ void zzK(long j) {
        this.zzb |= 16;
        this.zzS = j;
    }

    public final /* synthetic */ void zzL(long j) {
        this.zzb |= 32;
        this.zzT = j;
    }

    public final /* synthetic */ void zzM(long j) {
        this.zzb |= 64;
        this.zzU = j;
    }

    public final /* synthetic */ void zzN(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void zzO(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void zzP(long j) {
        this.zzb |= 4096;
        this.zzaa = j;
    }

    public final /* synthetic */ void zzQ(long j) {
        this.zzb |= 8192;
        this.zzab = j;
    }

    public final /* synthetic */ void zzR(long j) {
        this.zzb |= 16384;
        this.zzac = j;
    }

    public final /* synthetic */ void zzS(zzasq zzasqVar) {
        zzasqVar.getClass();
        this.zzag = zzasqVar;
        this.zzb |= 262144;
    }

    public final /* synthetic */ void zzT(zzasq zzasqVar) {
        zzasqVar.getClass();
        zzhit zzhitVar = this.zzah;
        if (!zzhitVar.zza()) {
            this.zzah = zzhih.zzbN(zzhitVar);
        }
        this.zzah.add(zzasqVar);
    }

    public final /* synthetic */ void zzU() {
        this.zzah = zzhih.zzbM();
    }

    public final /* synthetic */ void zzV(zzass zzassVar) {
        zzassVar.getClass();
        this.zzai = zzassVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void zzW(long j) {
        this.zzb |= 1048576;
        this.zzaj = j;
    }

    public final /* synthetic */ void zzX(long j) {
        this.zzb |= 2097152;
        this.zzak = j;
    }

    public final /* synthetic */ void zzY(long j) {
        this.zzb |= 4194304;
        this.zzal = j;
    }

    public final /* synthetic */ void zzZ(long j) {
        this.zzb |= 8388608;
        this.zzam = j;
    }

    public final boolean zza() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void zzaa(long j) {
        this.zzb |= 16777216;
        this.zzan = j;
    }

    public final /* synthetic */ void zzab(long j) {
        this.zzb |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.zzap = j;
    }

    public final /* synthetic */ void zzac(long j) {
        this.zzb |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        this.zzaq = j;
    }

    public final /* synthetic */ void zzad(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void zzae(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void zzaf(long j) {
        this.zzc |= 2048;
        this.zzaI = j;
    }

    public final /* synthetic */ void zzag(long j) {
        this.zzc |= 4096;
        this.zzaJ = j;
    }

    public final /* synthetic */ void zzah(long j) {
        this.zzc |= 8192;
        this.zzaK = j;
    }

    public final /* synthetic */ void zzai(long j) {
        this.zzc |= 16384;
        this.zzaL = j;
    }

    public final /* synthetic */ void zzaj(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void zzak(long j) {
        this.zzc |= 4194304;
        this.zzaT = j;
    }

    public final /* synthetic */ void zzal(long j) {
        this.zzc |= androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE;
        this.zzba = j;
    }

    public final /* synthetic */ void zzam(zzatg zzatgVar) {
        zzatgVar.getClass();
        this.zzbb = zzatgVar;
        this.zzc |= 1073741824;
    }

    public final /* synthetic */ void zzao(int i) {
        this.zzY = i - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void zzap(int i) {
        this.zzZ = i - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void zzaq(int i) {
        this.zzaf = i - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void zzar(int i) {
        this.zzaz = i - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void zzas(int i) {
        this.zzaA = i - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void zzat(int i) {
        this.zzaU = i - 1;
        this.zzc |= 8388608;
    }

    public final String zzb() {
        return this.zzE;
    }

    public final long zzc() {
        return this.zzaj;
    }

    public final long zzd() {
        return this.zzan;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzhin zzhinVar = zzatb.zza;
            return zzhih.zzbv(zzbe, "\u0001d\u0000\u0004\u0001Įd\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂX\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈY\u0019ဂ]\u001a᠌Z\u001bဈ\u0016\u001cဇ[\u001dဈ\u0018\u001eဈ\\\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉS[ဉT\\ဂU]ဂV^᠌W_᠌@`ဉIaဂPÉဉ^ĭဂ_Įဈ`", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzaV", "zzC", "zzD", "zzaW", "zzba", "zzaX", zzasa.zza, "zzE", "zzaY", "zzG", "zzaZ", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzasq.class, "zzT", "zzU", "zzV", "zzW", "zzY", zzhinVar, "zzZ", zzhinVar, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", zzhinVar, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", zzata.zza, "zzau", zzate.zza, "zzar", "zzaw", zzarx.zza, "zzax", "zzay", "zzan", "zzao", "zzaz", zzhinVar, "zzX", "zzF", "zzaA", zzhinVar, "zzaB", "zzaC", zzask.class, "zzaD", zzhinVar, "zzaE", zzarz.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", "zzaU", zzash.zza, "zzav", zzasb.zza, "zzaG", "zzaN", "zzbb", "zzbc", "zzbd"});
        }
        if (iOrdinal == 3) {
            return new zzast();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzarw(bArr);
        }
        if (iOrdinal == 5) {
            return zzbe;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzbf;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzast.class) {
            try {
                zzhicVar = zzbf;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzbe);
                    zzbf = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final boolean zze() {
        return (this.zzc & 1073741824) != 0;
    }

    public final zzatg zzg() {
        zzatg zzatgVar = this.zzbb;
        return zzatgVar == null ? zzatg.zze() : zzatgVar;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zza |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void zzo(long j) {
        this.zza |= 32;
        this.zzj = j;
    }

    public final /* synthetic */ void zzp(long j) {
        this.zza |= 1024;
        this.zzo = j;
    }

    public final /* synthetic */ void zzq(long j) {
        this.zza |= 2048;
        this.zzp = j;
    }

    public final /* synthetic */ void zzr(long j) {
        this.zza |= 8192;
        this.zzv = j;
    }

    public final /* synthetic */ void zzs(long j) {
        this.zza |= 16384;
        this.zzw = j;
    }

    public final /* synthetic */ void zzt(long j) {
        this.zza |= 32768;
        this.zzx = j;
    }

    public final /* synthetic */ void zzu(long j) {
        this.zza |= 65536;
        this.zzy = j;
    }

    public final /* synthetic */ void zzv(long j) {
        this.zza |= 524288;
        this.zzB = j;
    }

    public final /* synthetic */ void zzw(long j) {
        this.zza |= 1048576;
        this.zzC = j;
    }

    public final /* synthetic */ void zzx(long j) {
        this.zza |= 2097152;
        this.zzD = j;
    }

    public final /* synthetic */ void zzy(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void zzz(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }
}
