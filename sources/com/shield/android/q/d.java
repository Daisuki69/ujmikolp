package com.shield.android.q;

import We.s;
import com.dynatrace.android.agent.Global;
import com.shield.android.p.h;
import com.shield.android.p.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: com.shield.android.q.d$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] rq;
        static final /* synthetic */ int[] rr;

        static {
            int[] iArr = new int[h.values().length];
            rr = iArr;
            try {
                iArr[h.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rr[h.CONTEXT_SPECIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rr[h.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rr[h.UNIVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[j.values().length];
            rq = iArr2;
            try {
                iArr2[j.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                rq[j.OBJECT_IDENTIFIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                rq[j.OCTET_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                rq[j.BIT_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                rq[j.SET_OF.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                rq[j.SEQUENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                rq[j.SEQUENCE_OF.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                rq[j.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                rq[j.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                rq[j.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static int a(j jVar) {
        switch (AnonymousClass1.rq[jVar.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 17;
            case 6:
            case 7:
                return 16;
            case 8:
                return 23;
            case 9:
                return 24;
            case 10:
                return 1;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + jVar);
        }
    }

    public static String b(int i, int i4) {
        String strR = r(i);
        String strS = s(i4);
        return strR.isEmpty() ? strS : androidx.camera.core.impl.a.j(strR, Global.BLANK, strS);
    }

    public static String r(int i) {
        if (i == 0) {
            return "UNIVERSAL";
        }
        if (i == 1) {
            return "APPLICATION";
        }
        if (i == 2) {
            return "";
        }
        if (i == 3) {
            return "PRIVATE";
        }
        throw new IllegalArgumentException(s.f(i, "Unsupported type class: "));
    }

    private static String s(int i) {
        if (i == 16) {
            return "SEQUENCE";
        }
        if (i == 17) {
            return "SET";
        }
        if (i == 23) {
            return "UTC TIME";
        }
        if (i == 24) {
            return "GENERALIZED TIME";
        }
        switch (i) {
            case 1:
                return "BOOLEAN";
            case 2:
                return "INTEGER";
            case 3:
                return "BIT STRING";
            case 4:
                return "OCTET STRING";
            case 5:
                return "NULL";
            case 6:
                return "OBJECT IDENTIFIER";
            default:
                return androidx.camera.core.impl.a.e(i, new StringBuilder("0x"));
        }
    }

    public static int a(h hVar) {
        int i = AnonymousClass1.rr[hVar.ordinal()];
        int i4 = 1;
        if (i != 1) {
            i4 = 2;
            if (i != 2) {
                i4 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + hVar);
                }
            }
        }
        return i4;
    }
}
