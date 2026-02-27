package C3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f723b;
    public static final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f724d;
    public static final k e;
    public static final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f725g;
    public static final k h;
    public static final k i;
    public static final k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k[] f726k;

    /* JADX INFO: Fake field, exist only in values array */
    k EF11;

    static {
        k kVar = new k("OTHER", 0);
        k kVar2 = new k("ORIENTATION", 1);
        f722a = kVar2;
        k kVar3 = new k("BYTE_SEGMENTS", 2);
        f723b = kVar3;
        k kVar4 = new k("ERROR_CORRECTION_LEVEL", 3);
        c = kVar4;
        k kVar5 = new k("ISSUE_NUMBER", 4);
        f724d = kVar5;
        k kVar6 = new k("SUGGESTED_PRICE", 5);
        e = kVar6;
        k kVar7 = new k("POSSIBLE_COUNTRY", 6);
        f = kVar7;
        k kVar8 = new k("UPC_EAN_EXTENSION", 7);
        f725g = kVar8;
        k kVar9 = new k("PDF417_EXTRA_METADATA", 8);
        h = kVar9;
        k kVar10 = new k("STRUCTURED_APPEND_SEQUENCE", 9);
        i = kVar10;
        k kVar11 = new k("STRUCTURED_APPEND_PARITY", 10);
        j = kVar11;
        f726k = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f726k.clone();
    }
}
