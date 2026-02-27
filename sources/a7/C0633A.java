package a7;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import zj.C2576A;

/* JADX INFO: renamed from: a7.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0633A extends ArrayList {
    public static boolean a(C0633A c0633a, String defaultLabel, String str, String str2, boolean z4, Function1 function1, int i) {
        String str3;
        if ((i & 8) != 0) {
            z4 = true;
        }
        if ((i & 16) != 0) {
            function1 = null;
        }
        kotlin.jvm.internal.j.g(defaultLabel, "defaultLabel");
        if (str2 == null || C2576A.H(str2) || !z4) {
            return false;
        }
        if (str != null && !C2576A.H(str)) {
            defaultLabel = str;
        }
        if (C2576A.H(str2)) {
            str2 = null;
        } else if (function1 != null && (str3 = (String) function1.invoke(str2)) != null) {
            str2 = str3;
        }
        return c0633a.add(new C0664y(defaultLabel, str2));
    }

    public static boolean c(C0633A c0633a, String label, String str, Function1 function1, int i) {
        String str2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        kotlin.jvm.internal.j.g(label, "label");
        if (str == null || C2576A.H(str)) {
            return false;
        }
        if (C2576A.H(str)) {
            str = null;
        } else if (function1 != null && (str2 = (String) function1.invoke(str)) != null) {
            str = str2;
        }
        return c0633a.add(new C0664y(label, str));
    }

    public static void d(C0633A c0633a, boolean[] zArr) {
        boolean z4 = false;
        for (boolean z5 : zArr) {
            z4 = z4 || z5;
        }
        if (z4) {
            c0633a.add(new C0662w(2));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC0665z) {
            return super.contains((AbstractC0665z) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC0665z) {
            return super.indexOf((AbstractC0665z) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC0665z) {
            return super.lastIndexOf((AbstractC0665z) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof AbstractC0665z) {
            return super.remove((AbstractC0665z) obj);
        }
        return false;
    }
}
