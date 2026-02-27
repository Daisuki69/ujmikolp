package Q3;

import Oi.i;
import Oi.s;
import We.O;
import Xh.o;
import Xh.p;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import okio.Source;
import org.joda.time.DateTimeConstants;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5204b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5205d;

    public b(Qi.c cVar, Xh.d dVar, int i, int i4) {
        Objects.requireNonNull(cVar);
        this.c = cVar;
        this.f5205d = dVar;
        this.f5203a = i;
        this.f5204b = i4;
    }

    public Ff.f a() {
        o oVar;
        ArrayList arrayList = new ArrayList();
        for (p pVar : (ArrayList) this.c) {
            List list = pVar.f6670b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                oVar = pVar.f6669a;
                if (!zHasNext) {
                    break;
                }
                String str = (String) it.next();
                ((Si.d) this.f5205d).getClass();
                if (Si.d.b(str) != null) {
                    Ri.a.q("Warning: Malformed " + oVar.toString() + " value. Filter ignored: " + str);
                } else {
                    arrayList2.add(str);
                }
            }
            if (arrayList2.size() > 0) {
                arrayList.add(new p(oVar, arrayList2));
            }
        }
        return new Ff.f(arrayList, this.f5203a, this.f5204b);
    }

    public Oi.a b() {
        Qi.c cVar = (Qi.c) this.c;
        Oi.a aVar = new Oi.a();
        Xh.d dVar = (Xh.d) this.f5205d;
        try {
            cVar.E("av:" + Build.VERSION.SDK_INT);
            dVar.getClass();
            cVar.E("bgr:15");
        } catch (ClassCastException unused) {
            Ri.a.d("Telemetry storage is not a producer");
        }
        dVar.getClass();
        aVar.l();
        Oi.p pVar = new Oi.p();
        pVar.e();
        pVar.d(DateTimeConstants.SECONDS_PER_HOUR);
        long j = 1800;
        pVar.c(j);
        pVar.b(j);
        pVar.a();
        aVar.j(pVar);
        aVar.m(cVar.F());
        int i = 0;
        aVar.f(false);
        aVar.n(cVar.G());
        aVar.o(cVar.q());
        aVar.i(cVar.s());
        aVar.a(cVar.m());
        aVar.e(dVar.f6632a != null);
        aVar.k(cVar.y());
        s sVar = new s();
        sVar.a(false);
        sVar.c(false);
        sVar.d(false);
        sVar.b(false);
        sVar.e(false);
        aVar.p(sVar);
        aVar.h(30000);
        aVar.b(10000);
        int iC = AbstractC2217b.c(1);
        if (iC == 0) {
            i = 2;
        } else if (iC == 1) {
            i = 3;
        } else if (iC == 2) {
            i = 1;
        }
        aVar.q(i);
        int i4 = this.f5203a;
        int i6 = this.f5204b;
        aVar.d(i4 + i6);
        aVar.c(i6);
        i iVar = i.f4849a;
        iVar.getClass();
        int i10 = Oi.h.f4848a[iVar.ordinal()];
        int i11 = 2;
        if (i10 == 2) {
            i11 = 1;
        } else if (i10 != 3) {
            i11 = 0;
        }
        aVar.g(i11);
        return aVar;
    }

    public void c(int i, int i4, int i6, int i10) {
        if (i < 0) {
            int i11 = this.f5203a;
            i += i11;
            i4 += 4 - ((i11 + 4) % 8);
        }
        int i12 = this.f5204b;
        if (i4 < 0) {
            i4 += i12;
            i += 4 - ((i12 + 4) % 8);
        }
        ((byte[]) this.f5205d)[(i * i12) + i4] = (byte) ((((String) this.c).charAt(i6) & (1 << (8 - i10))) == 0 ? 0 : 1);
    }

    public Object d(long j, boolean z4) {
        long j6 = Long.MAX_VALUE;
        Object obj = null;
        while (true) {
            int i = this.f5204b;
            if (i <= 0) {
                break;
            }
            long j7 = j - ((long[]) this.c)[this.f5203a];
            if (j7 < 0 && (z4 || (-j7) >= j6)) {
                break;
            }
            Xh.i.f(i > 0);
            int i4 = this.f5203a;
            Object[] objArr = (Object[]) this.f5205d;
            Object obj2 = objArr[i4];
            objArr[i4] = null;
            this.f5203a = (i4 + 1) % objArr.length;
            this.f5204b--;
            obj = obj2;
            j6 = j7;
        }
        return obj;
    }

    public synchronized Object e(long j) {
        return d(j, true);
    }

    public void f(int i, int i4, int i6) {
        int i10 = i - 2;
        int i11 = i4 - 2;
        c(i10, i11, i6, 1);
        int i12 = i4 - 1;
        c(i10, i12, i6, 2);
        int i13 = i - 1;
        c(i13, i11, i6, 3);
        c(i13, i12, i6, 4);
        c(i13, i4, i6, 5);
        c(i, i11, i6, 6);
        c(i, i12, i6, 7);
        c(i, i4, i6, 8);
    }

    public b(String str, int i, int i4) {
        this.c = str;
        this.f5204b = i;
        this.f5203a = i4;
        byte[] bArr = new byte[i * i4];
        this.f5205d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public b(int i) {
        switch (i) {
            case 4:
                this.c = new long[10];
                this.f5205d = new Object[10];
                break;
            default:
                this.c = new ArrayList();
                this.f5203a = 0;
                this.f5204b = 0;
                this.f5205d = new Si.d();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Source source, int i) {
        this((Bitmap) null, source, i, 0);
        StringBuilder sb2 = O.f6375a;
        if (source == null) {
            throw new NullPointerException("source == null");
        }
    }

    public b(Bitmap bitmap, Source source, int i, int i4) {
        if ((bitmap != null) != (source != null)) {
            this.c = bitmap;
            this.f5205d = source;
            if (i != 0) {
                this.f5203a = i;
                this.f5204b = i4;
                return;
            }
            throw new NullPointerException("loadedFrom == null");
        }
        throw new AssertionError();
    }
}
