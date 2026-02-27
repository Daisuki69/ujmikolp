package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxg {
    public static final zzxg zza;
    public static final zzxg zzb;
    public static final zzxg zzc;
    public static final zzxg zzd;
    public static final zzxg zze;
    public static final zzxg zzf;
    public static final zzxg zzg;
    public static final zzxg zzh;
    public static final zzxg zzi;
    public static final zzxg zzj;
    public static final zzxg zzk;
    public static final zzxg zzl;
    public static final zzxg zzm;
    public static final zzxg zzn;
    public static final zzxg zzo;
    public static final zzxg zzp;
    public static final zzxg zzq;
    public static final zzxg zzr;
    private static final /* synthetic */ zzxg[] zzs;
    private final zzxh zzt;

    static {
        zzxg zzxgVar = new zzxg("DOUBLE", 0, zzxh.DOUBLE, 1);
        zza = zzxgVar;
        zzxg zzxgVar2 = new zzxg("FLOAT", 1, zzxh.FLOAT, 5);
        zzb = zzxgVar2;
        zzxh zzxhVar = zzxh.LONG;
        zzxg zzxgVar3 = new zzxg("INT64", 2, zzxhVar, 0);
        zzc = zzxgVar3;
        zzxg zzxgVar4 = new zzxg("UINT64", 3, zzxhVar, 0);
        zzd = zzxgVar4;
        zzxh zzxhVar2 = zzxh.INT;
        zzxg zzxgVar5 = new zzxg("INT32", 4, zzxhVar2, 0);
        zze = zzxgVar5;
        zzxg zzxgVar6 = new zzxg("FIXED64", 5, zzxhVar, 1);
        zzf = zzxgVar6;
        zzxg zzxgVar7 = new zzxg("FIXED32", 6, zzxhVar2, 5);
        zzg = zzxgVar7;
        zzxg zzxgVar8 = new zzxg("BOOL", 7, zzxh.BOOLEAN, 0);
        zzh = zzxgVar8;
        zzxg zzxgVar9 = new zzxg("STRING", 8, zzxh.STRING, 2);
        zzi = zzxgVar9;
        zzxh zzxhVar3 = zzxh.MESSAGE;
        zzxg zzxgVar10 = new zzxg("GROUP", 9, zzxhVar3, 3);
        zzj = zzxgVar10;
        zzxg zzxgVar11 = new zzxg("MESSAGE", 10, zzxhVar3, 2);
        zzk = zzxgVar11;
        zzxg zzxgVar12 = new zzxg("BYTES", 11, zzxh.BYTE_STRING, 2);
        zzl = zzxgVar12;
        zzxg zzxgVar13 = new zzxg("UINT32", 12, zzxhVar2, 0);
        zzm = zzxgVar13;
        zzxg zzxgVar14 = new zzxg("ENUM", 13, zzxh.ENUM, 0);
        zzn = zzxgVar14;
        zzxg zzxgVar15 = new zzxg("SFIXED32", 14, zzxhVar2, 5);
        zzo = zzxgVar15;
        zzxg zzxgVar16 = new zzxg("SFIXED64", 15, zzxhVar, 1);
        zzp = zzxgVar16;
        zzxg zzxgVar17 = new zzxg("SINT32", 16, zzxhVar2, 0);
        zzq = zzxgVar17;
        zzxg zzxgVar18 = new zzxg("SINT64", 17, zzxhVar, 0);
        zzr = zzxgVar18;
        zzs = new zzxg[]{zzxgVar, zzxgVar2, zzxgVar3, zzxgVar4, zzxgVar5, zzxgVar6, zzxgVar7, zzxgVar8, zzxgVar9, zzxgVar10, zzxgVar11, zzxgVar12, zzxgVar13, zzxgVar14, zzxgVar15, zzxgVar16, zzxgVar17, zzxgVar18};
    }

    private zzxg(String str, int i, zzxh zzxhVar, int i4) {
        this.zzt = zzxhVar;
    }

    public static zzxg[] values() {
        return (zzxg[]) zzs.clone();
    }

    public final zzxh zza() {
        return this.zzt;
    }
}
