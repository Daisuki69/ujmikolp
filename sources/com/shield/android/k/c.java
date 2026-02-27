package com.shield.android.k;

import com.shield.android.j.a;
import com.shield.android.j.d;
import com.shield.android.j.f;
import com.shield.android.j.j;
import com.shield.android.r.h;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static a.AnonymousClass1 a(com.shield.android.u.b bVar, com.shield.android.v.b bVar2, byte[] bArr, Map<Integer, Map<f, byte[]>> map, int i, int i4) throws j, NoSuchAlgorithmException, IOException {
        a.AnonymousClass1 anonymousClass1 = new a.AnonymousClass1(0);
        ByteBuffer byteBuffer = d.a(bVar, bVar2, 1845461005).pv;
        com.shield.android.j.b bVar3 = new com.shield.android.j.b();
        anonymousClass1.nJ.add(bVar3);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ByteBuffer byteBufferK = d.k(byteBuffer);
            HashMap map2 = new HashMap();
            for (Map.Entry<Integer, Map<f, byte[]>> entry : map.entrySet()) {
                map2.put(entry.getKey(), d.g(g(entry.getValue())));
            }
            b.a(byteBufferK, certificateFactory, bVar3, map2, bArr, i, i4);
            anonymousClass1.nI = (anonymousClass1.cP() || anonymousClass1.dl()) ? false : true;
            return anonymousClass1;
        } catch (com.shield.android.i.a | BufferUnderflowException unused) {
            bVar3.a(20, new Object[0]);
            return anonymousClass1;
        } catch (CertificateException e) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e);
        }
    }

    private static List<h<Integer, byte[]>> g(Map<f, byte[]> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<f, byte[]> entry : map.entrySet()) {
            arrayList.add(h.a(Integer.valueOf(entry.getKey().dC()), entry.getValue()));
        }
        Collections.sort(arrayList, new Comparator<h<Integer, byte[]>>() { // from class: com.shield.android.k.c.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(h<Integer, byte[]> hVar, h<Integer, byte[]> hVar2) {
                return hVar.et().intValue() - hVar2.et().intValue();
            }
        });
        return arrayList;
    }
}
