package com.shield.android.i;

import android.R;
import com.shield.android.j.a;
import com.shield.android.r.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    public static class a {
        private static final h<Character, Integer>[] nm = {h.a('C', 2), h.a('D', 3), h.a('E', 4), h.a('F', 7), h.a('G', 8), h.a('H', 10), h.a('I', 13), h.a('J', 15), h.a('K', 18), h.a('L', 20), h.a('M', 22), h.a('N', 23), h.a('O', 25)};
        private static final Comparator<h<Character, Integer>> nn = new C0070a(0);

        /* JADX INFO: renamed from: com.shield.android.i.c$a$a, reason: collision with other inner class name */
        public static class C0070a implements Comparator<h<Character, Integer>> {
            private C0070a() {
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(h<Character, Integer> hVar, h<Character, Integer> hVar2) {
                return hVar.et().charValue() - hVar2.et().charValue();
            }

            public /* synthetic */ C0070a(byte b8) {
                this();
            }
        }
    }

    public static class b extends com.shield.android.v.b {
        public b(long j, long j6, int i, long j7, ByteBuffer byteBuffer) {
            super(j, j6, i, j7, byteBuffer);
        }
    }

    public static int a(ByteBuffer byteBuffer) throws f {
        int iCharValue;
        try {
            com.shield.android.j.a aVar = new com.shield.android.j.a(byteBuffer);
            int iMax = 1;
            for (int iDf = aVar.df(); iDf != 2; iDf = aVar.dj()) {
                if (iDf == 3 && aVar.de() == 2 && "uses-sdk".equals(aVar.dg()) && aVar.dh().isEmpty()) {
                    int i = 0;
                    while (true) {
                        if (i >= aVar.di()) {
                            break;
                        }
                        if (aVar.h(i) == 16843276) {
                            int i4 = aVar.i(i);
                            if (i4 == 1) {
                                String strK = aVar.k(i);
                                char cCharAt = strK.isEmpty() ? ' ' : strK.charAt(0);
                                if (cCharAt < 'A' || cCharAt > 'Z') {
                                    throw new e("Unable to determine APK's minimum supported Android platform version : Unsupported codename in AndroidManifest.xml's minSdkVersion: \"" + strK + "\"", strK);
                                }
                                h[] hVarArr = a.nm;
                                int iBinarySearch = Arrays.binarySearch(hVarArr, h.a(Character.valueOf(cCharAt), null), a.nn);
                                if (iBinarySearch >= 0) {
                                    iCharValue = ((Integer) hVarArr[iBinarySearch].eu()).intValue();
                                } else if ((-1) - iBinarySearch != 0) {
                                    h hVar = hVarArr[(-2) - iBinarySearch];
                                    iCharValue = (cCharAt - ((Character) hVar.et()).charValue()) + ((Integer) hVar.eu()).intValue();
                                }
                            } else {
                                if (i4 != 2) {
                                    throw new f("Unable to determine APK's minimum supported Android: unsupported value type in AndroidManifest.xml's minSdkVersion. Only integer values supported.");
                                }
                                iCharValue = aVar.j(i);
                            }
                        } else {
                            i++;
                        }
                    }
                    iCharValue = 1;
                    iMax = Math.max(iMax, iCharValue);
                }
            }
            return iMax;
        } catch (a.e e) {
            throw new f("Unable to determine APK's minimum supported Android platform version: malformed binary resource: AndroidManifest.xml", e);
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        try {
            return a(byteBuffer, "manifest", R.attr.targetSandboxVersion);
        } catch (com.shield.android.i.a unused) {
            return 1;
        }
    }

    public static int c(ByteBuffer byteBuffer) {
        try {
            return a(byteBuffer, "uses-sdk", R.attr.targetSdkVersion);
        } catch (com.shield.android.i.a unused) {
            byteBuffer.rewind();
            try {
                return a(byteBuffer);
            } catch (com.shield.android.i.a unused2) {
                return 1;
            }
        }
    }

    private static int a(ByteBuffer byteBuffer, String str, int i) throws com.shield.android.i.a {
        try {
            com.shield.android.j.a aVar = new com.shield.android.j.a(byteBuffer);
            for (int iDf = aVar.df(); iDf != 2; iDf = aVar.dj()) {
                if (iDf == 3 && str.equals(aVar.dg())) {
                    for (int i4 = 0; i4 < aVar.di(); i4++) {
                        if (aVar.h(i4) == i) {
                            int i6 = aVar.i(i4);
                            if (i6 != 1 && i6 != 2) {
                                throw new com.shield.android.i.a("Unsupported value type, " + i6 + ", for attribute " + String.format("0x%08X", Integer.valueOf(i)) + " under element " + str);
                            }
                            return aVar.j(i4);
                        }
                    }
                }
            }
            throw new com.shield.android.i.a("Failed to determine APK's " + str + " attribute " + String.format("0x%08X", Integer.valueOf(i)) + " value");
        } catch (a.e e) {
            throw new com.shield.android.i.a("Unable to determine value for attribute " + String.format("0x%08X", Integer.valueOf(i)) + " under element " + str + "; malformed binary resource: AndroidManifest.xml", e);
        }
    }
}
