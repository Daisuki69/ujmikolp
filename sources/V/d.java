package V;

import D.S;
import a.AbstractC0617a;
import android.graphics.Bitmap;
import com.google.firebase.messaging.p;
import dOYHB6.tiZVw8.numX49;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.a f6019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f6020b;

    public d(n0.a aVar, S s9) {
        j.g(aVar, numX49.tnTj78("bPCW"));
        this.f6019a = aVar;
        this.f6020b = s9;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    @Override // V.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, a.AbstractC0617a r7) {
        /*
            r5 = this;
            java.lang.String r0 = "bPCP9"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            kotlin.jvm.internal.j.g(r6, r0)
            java.lang.String r0 = "bPCPP"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            D.S r1 = r5.f6020b
            if (r1 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bPCPb"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = "bPCP2"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            D.S.s(r0, r2)
        L31:
            n0.a r2 = r5.f6019a
            V.b r2 = r2.f18540a
            Ej.Z r2 = r2.a()
            java.io.File r2 = r2.f(r6)
            boolean r3 = r2.exists()
            r4 = 0
            if (r3 == 0) goto L45
            goto L46
        L45:
            r2 = r4
        L46:
            if (r2 == 0) goto Lb2
            if (r1 == 0) goto L57
            java.lang.String r1 = "bPCPL"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            java.lang.String r1 = r6.concat(r1)
            D.S.s(r0, r1)
        L57:
            boolean r0 = r2.exists()
            if (r0 != 0) goto L5e
            goto L7f
        L5e:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            java.lang.String r1 = r2.getPath()
            android.graphics.BitmapFactory.decodeFile(r1, r0)
            int r1 = r0.outWidth
            r3 = -1
            if (r1 == r3) goto L7f
            int r0 = r0.outHeight
            if (r0 == r3) goto L7f
            java.lang.String r0 = r2.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            goto L80
        L7f:
            r0 = r4
        L80:
            if (r0 == 0) goto L8a
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r2)
            r5.e(r6, r1)
        L8a:
            V.g r6 = V.g.c
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L96
            if (r0 == 0) goto L95
            return r0
        L95:
            return r4
        L96:
            V.g r6 = V.g.f6023d
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto La3
            byte[] r6 = nj.j.a(r2)
            return r6
        La3:
            V.g r6 = V.g.e
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lac
            return r2
        Lac:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V.d.a(java.lang.String, a.a):java.lang.Object");
    }

    @Override // V.e
    public final Pair b(String str) {
        j.g(str, numX49.tnTj78("bPCPr"));
        if (this.f6020b != null) {
            S.s(numX49.tnTj78("bPCPB"), numX49.tnTj78("bPCPZ") + str + numX49.tnTj78("bPCPk"));
        }
        return (Pair) this.f6019a.f18540a.d().o(str);
    }

    @Override // V.e
    public final boolean c(String str) {
        j.g(str, numX49.tnTj78("bPCPu"));
        if (this.f6020b != null) {
            S.s(numX49.tnTj78("bPCPj"), numX49.tnTj78("bPCPV") + str + numX49.tnTj78("bPCPS"));
        }
        return this.f6019a.f18540a.a().m(str);
    }

    @Override // V.e
    public final File d(String str, byte[] bArr) {
        j.g(str, numX49.tnTj78("bPCPd"));
        j.g(bArr, numX49.tnTj78("bPCPi"));
        return this.f6019a.f18540a.a().a(str, bArr);
    }

    @Override // V.e
    public final boolean e(String str, Pair pair) {
        j.g(str, numX49.tnTj78("bPCPE"));
        if (this.f6020b != null) {
            S.s(numX49.tnTj78("bPCPO"), numX49.tnTj78("bPCPF") + str + numX49.tnTj78("bPCPH"));
        }
        return this.f6019a.f18540a.d().c(str, pair);
    }

    @Override // V.e
    public final Object f(String str, AbstractC0617a abstractC0617a) {
        j.g(str, numX49.tnTj78("bPCPQ"));
        p pVar = (p) this.f6019a.f18540a.d().c;
        pVar.getClass();
        Pair pair = (Pair) ((We.p) pVar.f9799b).get(str);
        if (pair == null) {
            return null;
        }
        if (this.f6020b != null) {
            S.s(numX49.tnTj78("bPCPU"), str.concat(numX49.tnTj78("bPCPt")));
        }
        boolean zEquals = abstractC0617a.equals(g.c);
        Object obj = pair.f18160a;
        if (zEquals) {
            if (obj == null) {
                return null;
            }
            return obj;
        }
        if (!abstractC0617a.equals(g.f6023d)) {
            if (!abstractC0617a.equals(g.e)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj2 = pair.f18161b;
            if (obj2 == null) {
                return null;
            }
            return obj2;
        }
        j.e(obj, numX49.tnTj78("bPCPe"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray == null) {
            return null;
        }
        return byteArray;
    }
}
