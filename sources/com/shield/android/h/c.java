package com.shield.android.h;

import com.shield.android.j.h;
import com.shield.android.n.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: nk, reason: collision with root package name */
    private final int f15403nk;

    /* JADX INFO: renamed from: nl, reason: collision with root package name */
    private final List<b.a> f15404nl;

    private c(int i, List<b.a> list) {
        this.f15403nk = i;
        this.f15404nl = list;
    }

    public static c e(byte[] bArr) throws IOException {
        int iDJ;
        List<b.a> listM = com.shield.android.n.b.m(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
        if (listM == null) {
            throw new IllegalArgumentException("Can't calculate minimum SDK version of null nodes");
        }
        Iterator<b.a> it = listM.iterator();
        int i = 28;
        while (it.hasNext()) {
            h hVar = it.next().pF;
            if (hVar != null && (iDJ = hVar.dJ()) > i) {
                i = iDJ;
            }
        }
        return new c(i, listM);
    }

    public static c f(List<c> list) {
        c cVar;
        c cVar2;
        if (list.isEmpty()) {
            return null;
        }
        c cVar3 = list.get(0);
        int i = 1;
        while (i < list.size()) {
            c cVar4 = list.get(i);
            X509Certificate x509Certificate = cVar3.f15404nl.get(0).pW;
            if (x509Certificate == null) {
                throw new NullPointerException("cert == null");
            }
            int i4 = 0;
            while (true) {
                if (i4 >= cVar4.f15404nl.size()) {
                    cVar = cVar3;
                    cVar2 = cVar4;
                    break;
                }
                if (cVar4.f15404nl.get(i4).pW.equals(x509Certificate)) {
                    cVar2 = cVar3;
                    cVar = cVar4;
                    break;
                }
                i4++;
            }
            b.a aVar = cVar2.f15404nl.get(0);
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (true) {
                if (i6 >= cVar.f15404nl.size()) {
                    break;
                }
                int i10 = i6 + 1;
                b.a aVar2 = cVar.f15404nl.get(i6);
                if (aVar2.pW.equals(aVar.pW)) {
                    i6 = i10;
                    break;
                }
                arrayList.add(aVar2);
                i6 = i10;
            }
            if (i6 == arrayList.size()) {
                throw new IllegalArgumentException("The provided lineage is not a descendant or an ancestor of this lineage");
            }
            arrayList.add(aVar);
            int i11 = 1;
            while (i6 < cVar.f15404nl.size() && i11 < cVar2.f15404nl.size()) {
                int i12 = i6 + 1;
                b.a aVar3 = cVar.f15404nl.get(i6);
                int i13 = i11 + 1;
                b.a aVar4 = cVar2.f15404nl.get(i11);
                if (!aVar3.pW.equals(aVar4.pW)) {
                    throw new IllegalArgumentException("The provided lineage diverges from this lineage");
                }
                arrayList.add(aVar4);
                i6 = i12;
                i11 = i13;
            }
            while (i6 < cVar.f15404nl.size()) {
                arrayList.add(cVar.f15404nl.get(i6));
                i6++;
            }
            while (i11 < cVar2.f15404nl.size()) {
                arrayList.add(cVar2.f15404nl.get(i11));
                i11++;
            }
            i++;
            cVar3 = new c(Math.min(cVar3.f15403nk, cVar4.f15403nk), arrayList);
        }
        return cVar3;
    }

    public final c a(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        for (int i = 0; i < this.f15404nl.size(); i++) {
            if (this.f15404nl.get(i).pW.equals(x509Certificate)) {
                return new c(this.f15403nk, new ArrayList(this.f15404nl.subList(0, i + 1)));
            }
        }
        throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
    }

    public final int cZ() {
        return this.f15404nl.size();
    }
}
