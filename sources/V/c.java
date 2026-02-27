package V;

import D.S;
import a.AbstractC0617a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.firebase.messaging.p;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.a f6017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f6018b;

    public c(n0.a aVar, S s9) {
        j.g(aVar, numX49.tnTj78("bPCL"));
        this.f6017a = aVar;
        this.f6018b = s9;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    @Override // V.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, a.AbstractC0617a r7) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "bPCr"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            kotlin.jvm.internal.j.g(r6, r0)
            java.lang.String r0 = "bPCZ"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            D.S r1 = r5.f6018b
            if (r1 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bPCk"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = "bPCB"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            D.S.s(r0, r2)
        L31:
            n0.a r2 = r5.f6017a
            V.b r2 = r2.f18541b
            Ej.Z r2 = r2.a()
            java.io.File r2 = r2.f(r6)
            boolean r3 = r2.exists()
            r4 = 0
            if (r3 == 0) goto L45
            goto L46
        L45:
            r2 = r4
        L46:
            if (r2 == 0) goto Lb0
            if (r1 == 0) goto L57
            java.lang.String r1 = "bPCu"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            java.lang.String r1 = r6.concat(r1)
            D.S.s(r0, r1)
        L57:
            byte[] r0 = nj.j.a(r2)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r2)
            r5.e(r6, r1)
            V.g r6 = V.g.c
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L98
            boolean r6 = r2.exists()
            if (r6 != 0) goto L72
            goto L93
        L72:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
            r7 = 1
            r6.inJustDecodeBounds = r7
            java.lang.String r7 = r2.getPath()
            android.graphics.BitmapFactory.decodeFile(r7, r6)
            int r7 = r6.outWidth
            r0 = -1
            if (r7 == r0) goto L93
            int r6 = r6.outHeight
            if (r6 == r0) goto L93
            java.lang.String r6 = r2.getAbsolutePath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)
            goto L94
        L93:
            r6 = r4
        L94:
            if (r6 != 0) goto L97
            goto Lb0
        L97:
            return r6
        L98:
            V.g r6 = V.g.f6023d
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto La1
            return r0
        La1:
            V.g r6 = V.g.e
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Laa
            return r2
        Laa:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V.c.a(java.lang.String, a.a):java.lang.Object");
    }

    @Override // V.e
    public final Pair b(String str) {
        j.g(str, numX49.tnTj78("bPCV"));
        if (this.f6018b != null) {
            S.s(numX49.tnTj78("bPCd"), numX49.tnTj78("bPCS") + str + numX49.tnTj78("bPCj"));
        }
        return (Pair) this.f6017a.f18541b.d().o(str);
    }

    @Override // V.e
    public final boolean c(String str) {
        j.g(str, numX49.tnTj78("bPCi"));
        if (this.f6018b != null) {
            S.s(numX49.tnTj78("bPCH"), numX49.tnTj78("bPCE") + str + numX49.tnTj78("bPCF"));
        }
        return this.f6017a.f18541b.a().m(str);
    }

    @Override // V.e
    public final File d(String str, byte[] bArr) {
        j.g(str, numX49.tnTj78("bPCO"));
        j.g(bArr, numX49.tnTj78("bPCQ"));
        return this.f6017a.f18541b.a().a(str, bArr);
    }

    @Override // V.e
    public final boolean e(String str, Pair pair) {
        j.g(str, numX49.tnTj78("bPCt"));
        if (this.f6018b != null) {
            S.s(numX49.tnTj78("bPC8"), numX49.tnTj78("bPCU") + str + numX49.tnTj78("bPCe"));
        }
        return this.f6017a.f18541b.d().c(str, pair);
    }

    @Override // V.e
    public final Object f(String str, AbstractC0617a abstractC0617a) {
        j.g(str, numX49.tnTj78("bPCC"));
        p pVar = (p) this.f6017a.f18541b.d().c;
        pVar.getClass();
        Pair pair = (Pair) ((We.p) pVar.f9799b).get(str);
        if (pair == null) {
            return null;
        }
        if (this.f6018b != null) {
            S.s(numX49.tnTj78("bPCo"), str.concat(numX49.tnTj78("bPC4")));
        }
        boolean zEquals = abstractC0617a.equals(g.c);
        Object obj = pair.f18160a;
        if (zEquals) {
            byte[] bArr = (byte[]) obj;
            j.g(bArr, numX49.tnTj78("bPCK"));
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray == null) {
                return null;
            }
            return bitmapDecodeByteArray;
        }
        if (abstractC0617a.equals(g.f6023d)) {
            if (obj == null) {
                return null;
            }
            return obj;
        }
        if (!abstractC0617a.equals(g.e)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = pair.f18161b;
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }
}
