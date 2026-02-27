package cj;

import bj.AbstractC1044o;
import bj.AbstractC1045p;
import bj.AbstractC1047r;
import bj.AbstractC1049t;
import java.util.Arrays;

/* JADX INFO: renamed from: cj.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1126l extends C1125k {
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!b((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof AbstractC1044o) && (obj2 instanceof AbstractC1044o)) {
                            if (!Arrays.equals((byte[]) null, (byte[]) null)) {
                            }
                        } else if ((obj instanceof AbstractC1049t) && (obj2 instanceof AbstractC1049t)) {
                            if (!Arrays.equals((short[]) null, (short[]) null)) {
                            }
                        } else if ((obj instanceof AbstractC1045p) && (obj2 instanceof AbstractC1045p)) {
                            if (!Arrays.equals((int[]) null, (int[]) null)) {
                            }
                        } else if ((obj instanceof AbstractC1047r) && (obj2 instanceof AbstractC1047r)) {
                            if (!Arrays.equals((long[]) null, (long[]) null)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
