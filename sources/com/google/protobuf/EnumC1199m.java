package com.google.protobuf;

import s.AbstractC2217b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1199m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1199m f10109b;
    public static final EnumC1199m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1199m[] f10110d;
    public static final /* synthetic */ EnumC1199m[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10111a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1199m EF0;

    static {
        EnumC1208w enumC1208w = EnumC1208w.DOUBLE;
        EnumC1199m enumC1199m = new EnumC1199m("DOUBLE", 0, 0, 1, enumC1208w);
        EnumC1208w enumC1208w2 = EnumC1208w.FLOAT;
        EnumC1199m enumC1199m2 = new EnumC1199m("FLOAT", 1, 1, 1, enumC1208w2);
        EnumC1208w enumC1208w3 = EnumC1208w.LONG;
        EnumC1199m enumC1199m3 = new EnumC1199m("INT64", 2, 2, 1, enumC1208w3);
        EnumC1199m enumC1199m4 = new EnumC1199m("UINT64", 3, 3, 1, enumC1208w3);
        EnumC1208w enumC1208w4 = EnumC1208w.INT;
        EnumC1199m enumC1199m5 = new EnumC1199m("INT32", 4, 4, 1, enumC1208w4);
        EnumC1199m enumC1199m6 = new EnumC1199m("FIXED64", 5, 5, 1, enumC1208w3);
        EnumC1199m enumC1199m7 = new EnumC1199m("FIXED32", 6, 6, 1, enumC1208w4);
        EnumC1208w enumC1208w5 = EnumC1208w.BOOLEAN;
        EnumC1199m enumC1199m8 = new EnumC1199m("BOOL", 7, 7, 1, enumC1208w5);
        EnumC1208w enumC1208w6 = EnumC1208w.STRING;
        EnumC1199m enumC1199m9 = new EnumC1199m("STRING", 8, 8, 1, enumC1208w6);
        EnumC1208w enumC1208w7 = EnumC1208w.MESSAGE;
        EnumC1199m enumC1199m10 = new EnumC1199m("MESSAGE", 9, 9, 1, enumC1208w7);
        EnumC1208w enumC1208w8 = EnumC1208w.BYTE_STRING;
        EnumC1199m enumC1199m11 = new EnumC1199m("BYTES", 10, 10, 1, enumC1208w8);
        EnumC1199m enumC1199m12 = new EnumC1199m("UINT32", 11, 11, 1, enumC1208w4);
        EnumC1208w enumC1208w9 = EnumC1208w.ENUM;
        EnumC1199m enumC1199m13 = new EnumC1199m("ENUM", 12, 12, 1, enumC1208w9);
        EnumC1199m enumC1199m14 = new EnumC1199m("SFIXED32", 13, 13, 1, enumC1208w4);
        EnumC1199m enumC1199m15 = new EnumC1199m("SFIXED64", 14, 14, 1, enumC1208w3);
        EnumC1199m enumC1199m16 = new EnumC1199m("SINT32", 15, 15, 1, enumC1208w4);
        EnumC1199m enumC1199m17 = new EnumC1199m("SINT64", 16, 16, 1, enumC1208w3);
        EnumC1199m enumC1199m18 = new EnumC1199m("GROUP", 17, 17, 1, enumC1208w7);
        EnumC1199m enumC1199m19 = new EnumC1199m("DOUBLE_LIST", 18, 18, 2, enumC1208w);
        EnumC1199m enumC1199m20 = new EnumC1199m("FLOAT_LIST", 19, 19, 2, enumC1208w2);
        EnumC1199m enumC1199m21 = new EnumC1199m("INT64_LIST", 20, 20, 2, enumC1208w3);
        EnumC1199m enumC1199m22 = new EnumC1199m("UINT64_LIST", 21, 21, 2, enumC1208w3);
        EnumC1199m enumC1199m23 = new EnumC1199m("INT32_LIST", 22, 22, 2, enumC1208w4);
        EnumC1199m enumC1199m24 = new EnumC1199m("FIXED64_LIST", 23, 23, 2, enumC1208w3);
        EnumC1199m enumC1199m25 = new EnumC1199m("FIXED32_LIST", 24, 24, 2, enumC1208w4);
        EnumC1199m enumC1199m26 = new EnumC1199m("BOOL_LIST", 25, 25, 2, enumC1208w5);
        EnumC1199m enumC1199m27 = new EnumC1199m("STRING_LIST", 26, 26, 2, enumC1208w6);
        EnumC1199m enumC1199m28 = new EnumC1199m("MESSAGE_LIST", 27, 27, 2, enumC1208w7);
        EnumC1199m enumC1199m29 = new EnumC1199m("BYTES_LIST", 28, 28, 2, enumC1208w8);
        EnumC1199m enumC1199m30 = new EnumC1199m("UINT32_LIST", 29, 29, 2, enumC1208w4);
        EnumC1199m enumC1199m31 = new EnumC1199m("ENUM_LIST", 30, 30, 2, enumC1208w9);
        EnumC1199m enumC1199m32 = new EnumC1199m("SFIXED32_LIST", 31, 31, 2, enumC1208w4);
        EnumC1199m enumC1199m33 = new EnumC1199m("SFIXED64_LIST", 32, 32, 2, enumC1208w3);
        EnumC1199m enumC1199m34 = new EnumC1199m("SINT32_LIST", 33, 33, 2, enumC1208w4);
        EnumC1199m enumC1199m35 = new EnumC1199m("SINT64_LIST", 34, 34, 2, enumC1208w3);
        EnumC1199m enumC1199m36 = new EnumC1199m("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1208w);
        f10109b = enumC1199m36;
        EnumC1199m enumC1199m37 = new EnumC1199m("FLOAT_LIST_PACKED", 36, 36, 3, enumC1208w2);
        EnumC1199m enumC1199m38 = new EnumC1199m("INT64_LIST_PACKED", 37, 37, 3, enumC1208w3);
        EnumC1199m enumC1199m39 = new EnumC1199m("UINT64_LIST_PACKED", 38, 38, 3, enumC1208w3);
        EnumC1199m enumC1199m40 = new EnumC1199m("INT32_LIST_PACKED", 39, 39, 3, enumC1208w4);
        EnumC1199m enumC1199m41 = new EnumC1199m("FIXED64_LIST_PACKED", 40, 40, 3, enumC1208w3);
        EnumC1199m enumC1199m42 = new EnumC1199m("FIXED32_LIST_PACKED", 41, 41, 3, enumC1208w4);
        EnumC1199m enumC1199m43 = new EnumC1199m("BOOL_LIST_PACKED", 42, 42, 3, enumC1208w5);
        EnumC1199m enumC1199m44 = new EnumC1199m("UINT32_LIST_PACKED", 43, 43, 3, enumC1208w4);
        EnumC1199m enumC1199m45 = new EnumC1199m("ENUM_LIST_PACKED", 44, 44, 3, enumC1208w9);
        EnumC1199m enumC1199m46 = new EnumC1199m("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1208w4);
        EnumC1199m enumC1199m47 = new EnumC1199m("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1208w3);
        EnumC1199m enumC1199m48 = new EnumC1199m("SINT32_LIST_PACKED", 47, 47, 3, enumC1208w4);
        EnumC1199m enumC1199m49 = new EnumC1199m("SINT64_LIST_PACKED", 48, 48, 3, enumC1208w3);
        c = enumC1199m49;
        e = new EnumC1199m[]{enumC1199m, enumC1199m2, enumC1199m3, enumC1199m4, enumC1199m5, enumC1199m6, enumC1199m7, enumC1199m8, enumC1199m9, enumC1199m10, enumC1199m11, enumC1199m12, enumC1199m13, enumC1199m14, enumC1199m15, enumC1199m16, enumC1199m17, enumC1199m18, enumC1199m19, enumC1199m20, enumC1199m21, enumC1199m22, enumC1199m23, enumC1199m24, enumC1199m25, enumC1199m26, enumC1199m27, enumC1199m28, enumC1199m29, enumC1199m30, enumC1199m31, enumC1199m32, enumC1199m33, enumC1199m34, enumC1199m35, enumC1199m36, enumC1199m37, enumC1199m38, enumC1199m39, enumC1199m40, enumC1199m41, enumC1199m42, enumC1199m43, enumC1199m44, enumC1199m45, enumC1199m46, enumC1199m47, enumC1199m48, enumC1199m49, new EnumC1199m("GROUP_LIST", 49, 49, 2, enumC1208w7), new EnumC1199m("MAP", 50, 50, 4, EnumC1208w.VOID)};
        EnumC1199m[] enumC1199mArrValues = values();
        f10110d = new EnumC1199m[enumC1199mArrValues.length];
        for (EnumC1199m enumC1199m50 : enumC1199mArrValues) {
            f10110d[enumC1199m50.f10111a] = enumC1199m50;
        }
    }

    public EnumC1199m(String str, int i, int i4, int i6, EnumC1208w enumC1208w) {
        this.f10111a = i4;
        int iC = AbstractC2217b.c(i6);
        if (iC == 1 || iC == 3) {
            enumC1208w.getClass();
        }
        if (i6 == 1) {
            enumC1208w.ordinal();
        }
    }

    public static EnumC1199m valueOf(String str) {
        return (EnumC1199m) Enum.valueOf(EnumC1199m.class, str);
    }

    public static EnumC1199m[] values() {
        return (EnumC1199m[]) e.clone();
    }
}
