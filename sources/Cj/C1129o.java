package cj;

import com.paymaya.domain.store.H0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cj.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1129o extends C1127m {
    public static ArrayList A(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static ArrayList B(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        return new ArrayList(new C1123i(objArr, false));
    }

    public static Set C(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C1114E.f9379a;
        }
        if (length == 1) {
            return P.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(L.b(objArr.length));
        y(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean p(Object[] objArr, Object obj) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        return t(objArr, obj) >= 0;
    }

    public static List q(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object r(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Float s(float[] fArr, int i) {
        if (i < 0 || i >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i]);
    }

    public static int t(Object[] objArr, Object obj) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void u(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        sb2.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb2.append(charSequence);
            }
            zj.r.a(sb2, obj, function1);
        }
        sb2.append(charSequence3);
    }

    public static String v(byte[] bArr, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            function1 = null;
        }
        kotlin.jvm.internal.j.g(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i4 = 0;
        for (byte b8 : bArr) {
            i4++;
            if (i4 > 1) {
                sb2.append((CharSequence) str);
            }
            if (function1 != null) {
                sb2.append((CharSequence) function1.invoke(Byte.valueOf(b8)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b8));
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static String w(Object[] objArr, String str, H0 h02, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        String str3 = (i & 2) != 0 ? "" : "[";
        String str4 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            h02 = null;
        }
        kotlin.jvm.internal.j.g(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        u(objArr, sb2, str2, str3, str4, "...", h02);
        return sb2.toString();
    }

    public static void x(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Object obj = objArr[i];
            objArr[i] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void y(Object[] objArr, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        for (Object obj : objArr) {
            abstractCollection.add(obj);
        }
    }

    public static List z(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? B(objArr) : r.c(objArr[0]) : C1112C.f9377a;
    }
}
