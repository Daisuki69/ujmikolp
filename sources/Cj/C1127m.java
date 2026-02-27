package cj;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: cj.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1127m extends C1126l {
    public static List c(Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.f(listAsList, "asList(...)");
        return listAsList;
    }

    public static void d(int i, int i4, int i6, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.j.g(bArr, "<this>");
        kotlin.jvm.internal.j.g(destination, "destination");
        System.arraycopy(bArr, i4, destination, i, i6 - i4);
    }

    public static void e(int i, int i4, int i6, int[] iArr, int[] destination) {
        kotlin.jvm.internal.j.g(iArr, "<this>");
        kotlin.jvm.internal.j.g(destination, "destination");
        System.arraycopy(iArr, i4, destination, i, i6 - i4);
    }

    public static void f(float[] fArr, int i, float[] destination, int i4, int i6) {
        kotlin.jvm.internal.j.g(fArr, "<this>");
        kotlin.jvm.internal.j.g(destination, "destination");
        System.arraycopy(fArr, i4, destination, i, i6 - i4);
    }

    public static void g(long[] jArr, long[] destination, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(jArr, "<this>");
        kotlin.jvm.internal.j.g(destination, "destination");
        System.arraycopy(jArr, i4, destination, i, i6 - i4);
    }

    public static void h(Object[] objArr, int i, Object[] destination, int i4, int i6) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        kotlin.jvm.internal.j.g(destination, "destination");
        System.arraycopy(objArr, i4, destination, i, i6 - i4);
    }

    public static /* synthetic */ void i(int i, int i4, int i6, int[] iArr, int[] iArr2) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = iArr.length;
        }
        e(i, 0, i4, iArr, iArr2);
    }

    public static /* synthetic */ void j(Object[] objArr, Object[] objArr2, int i, int i4, int i6, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            i4 = 0;
        }
        if ((i10 & 8) != 0) {
            i6 = objArr.length;
        }
        h(objArr, i, objArr2, i4, i6);
    }

    public static byte[] k(int i, int i4, byte[] bArr) {
        kotlin.jvm.internal.j.g(bArr, "<this>");
        C1125k.a(i4, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i4);
        kotlin.jvm.internal.j.f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] l(int i, int i4, Object[] objArr) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        C1125k.a(i4, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i4);
        kotlin.jvm.internal.j.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void m(Object[] objArr, Gj.t tVar, int i, int i4) {
        kotlin.jvm.internal.j.g(objArr, "<this>");
        Arrays.fill(objArr, i, i4, tVar);
    }

    public static void n(long[] jArr) {
        int length = jArr.length;
        kotlin.jvm.internal.j.g(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }
}
