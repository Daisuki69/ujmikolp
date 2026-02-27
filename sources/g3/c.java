package G3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f1704b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f1705d;
    public static final int[][] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1706a;

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f1705d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f1705d[0][i] = i - 63;
        }
        f1705d[1][32] = 1;
        for (int i4 = 97; i4 <= 122; i4++) {
            f1705d[1][i4] = i4 - 95;
        }
        f1705d[2][32] = 1;
        for (int i6 = 48; i6 <= 57; i6++) {
            f1705d[2][i6] = i6 - 46;
        }
        int[] iArr2 = f1705d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i10 = 0; i10 < 28; i10++) {
            f1705d[3][iArr3[i10]] = i10;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i11 = 0; i11 < 31; i11++) {
            int i12 = iArr4[i11];
            if (i12 > 0) {
                f1705d[4][i12] = i11;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public c(byte[] bArr) {
        this.f1706a = bArr;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(eVar);
                    break;
                }
                e eVar2 = (e) it2.next();
                if (eVar2.c(eVar)) {
                    break;
                }
                if (eVar.c(eVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
