package T3;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final int[] c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5790b;

    public n(int i) {
        switch (i) {
            case 1:
                this.f5789a = new ArrayList();
                this.f5790b = new ArrayList();
                break;
            default:
                this.f5789a = new m(1);
                this.f5790b = new m(0);
                break;
        }
    }

    public void a(String str, int[] iArr) {
        ((ArrayList) this.f5789a).add(iArr);
        ((ArrayList) this.f5790b).add(str);
    }

    public C3.j b(int i, int i4, K3.a aVar) throws NotFoundException {
        EnumMap enumMap;
        int i6 = 0;
        int[] iArrM = o.m(aVar, i4, false, c, new int[3]);
        try {
            return ((m) this.f5790b).a(i, aVar, iArrM);
        } catch (ReaderException unused) {
            m mVar = (m) this.f5789a;
            StringBuilder sb2 = mVar.f5788b;
            sb2.setLength(0);
            int[] iArr = mVar.f5787a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i10 = aVar.f2588b;
            int iF = iArrM[1];
            int i11 = 0;
            int i12 = 0;
            while (i11 < 2 && iF < i10) {
                int i13 = o.i(aVar, iArr, iF, o.h);
                sb2.append((char) ((i13 % 10) + 48));
                int length = iArr.length;
                int i14 = i6;
                while (i6 < length) {
                    iF += iArr[i6];
                    i6++;
                }
                if (i13 >= 10) {
                    i12 |= 1 << (1 - i11);
                }
                if (i11 != 1) {
                    iF = aVar.f(aVar.e(iF));
                }
                i11++;
                i6 = i14;
            }
            int i15 = i6;
            if (sb2.length() != 2) {
                throw NotFoundException.c;
            }
            if (Integer.parseInt(sb2.toString()) % 4 != i12) {
                throw NotFoundException.c;
            }
            String string = sb2.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(C3.k.class);
                enumMap.put(C3.k.f724d, Integer.valueOf(string));
            }
            float f = i;
            C3.l lVar = new C3.l((iArrM[i15] + iArrM[1]) / 2.0f, f);
            C3.l lVar2 = new C3.l(iF, f);
            C3.l[] lVarArr = new C3.l[2];
            lVarArr[i15] = lVar;
            lVarArr[1] = lVar2;
            C3.j jVar = new C3.j(string, null, lVarArr, C3.a.f698q);
            if (enumMap != null) {
                jVar.e = enumMap;
            }
            return jVar;
        }
    }
}
