package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class w0 {
    public static final w0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0 f10131d;
    public static final t0 e;
    public static final /* synthetic */ w0[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f10132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10133b;

    /* JADX INFO: Fake field, exist only in values array */
    w0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    w0 EF11;

    static {
        w0 w0Var = new w0("DOUBLE", 0, x0.DOUBLE, 1);
        w0 w0Var2 = new w0("FLOAT", 1, x0.FLOAT, 5);
        x0 x0Var = x0.LONG;
        w0 w0Var3 = new w0("INT64", 2, x0Var, 0);
        c = w0Var3;
        w0 w0Var4 = new w0("UINT64", 3, x0Var, 0);
        x0 x0Var2 = x0.INT;
        w0 w0Var5 = new w0("INT32", 4, x0Var2, 0);
        w0 w0Var6 = new w0("FIXED64", 5, x0Var, 1);
        w0 w0Var7 = new w0("FIXED32", 6, x0Var2, 5);
        w0 w0Var8 = new w0("BOOL", 7, x0.BOOLEAN, 0);
        s0 s0Var = new s0("STRING", 8, x0.STRING, 2);
        f10131d = s0Var;
        x0 x0Var3 = x0.MESSAGE;
        t0 t0Var = new t0("GROUP", 9, x0Var3, 3);
        e = t0Var;
        f = new w0[]{w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, s0Var, t0Var, new u0("MESSAGE", 10, x0Var3, 2), new v0("BYTES", 11, x0.BYTE_STRING, 2), new w0("UINT32", 12, x0Var2, 0), new w0("ENUM", 13, x0.ENUM, 0), new w0("SFIXED32", 14, x0Var2, 5), new w0("SFIXED64", 15, x0Var, 1), new w0("SINT32", 16, x0Var2, 0), new w0("SINT64", 17, x0Var, 0)};
    }

    public w0(String str, int i, x0 x0Var, int i4) {
        this.f10132a = x0Var;
        this.f10133b = i4;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f.clone();
    }
}
