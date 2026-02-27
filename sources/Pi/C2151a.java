package pi;

import A3.i;
import Ch.f;
import We.s;
import Xh.o;
import Xh.p;
import cj.K;
import com.google.firebase.encoders.EncodingException;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.FileUploadRequest;
import com.paymaya.domain.model.FileUploadResponse;
import com.paymaya.domain.store.H0;
import com.paymaya.domain.store.S;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.Split;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.j;
import p2.C2009e;
import pg.C2038a;
import s1.InterfaceC2231f;
import u2.InterfaceC2295c;
import ui.InterfaceC2314a;
import w2.C2370a;
import x2.C2459f;

/* JADX INFO: renamed from: pi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2151a implements InterfaceC2231f, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19708b;
    public final Object c;

    public /* synthetic */ C2151a(Object obj, Serializable serializable, Object obj2) {
        this.f19707a = obj;
        this.f19708b = serializable;
        this.c = obj2;
    }

    public static void d(String str, Exception exc) {
        StringBuilder sbW = s.w(numX49.tnTj78("bQCP"), str, numX49.tnTj78("bQCb"));
        sbW.append(exc.getLocalizedMessage());
        Ri.a.q(sbW.toString());
    }

    public io.split.android.client.storage.splits.b a(long j, List list) {
        C2038a c2038a;
        i iVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        p pVar = (p) this.f19707a;
        InterfaceC2314a interfaceC2314a = (C2009e) this.f19708b;
        if (pVar != null) {
            List list2 = pVar.f6670b;
            if (!list2.isEmpty()) {
                o oVar = o.f6668b;
                o oVar2 = pVar.f6669a;
                if (oVar2 == oVar && (iVar = (i) this.c) != null) {
                    c2038a = new C2038a(20, iVar, interfaceC2314a, false);
                } else if (oVar2 == o.f6667a) {
                    c2038a = new C2038a(19, list2, interfaceC2314a, false);
                }
                interfaceC2314a = c2038a;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Split split = (Split) it.next();
            if (split != null && split.name != null) {
                interfaceC2314a.e(arrayList, arrayList2, split);
            }
        }
        return new io.split.android.client.storage.splits.b(arrayList, arrayList2, j, System.currentTimeMillis());
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        j.g(num, numX49.tnTj78("bQC2"));
        ArrayList arrayList = (ArrayList) this.f19707a;
        EDDFinancialDocument eDDFinancialDocument = (EDDFinancialDocument) arrayList.get(num.intValue());
        int iHashCode = eDDFinancialDocument.getType().hashCode();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.f19708b);
        String strTnTj78 = numX49.tnTj78("bQCL");
        sb2.append(strTnTj78);
        sb2.append(iHashCode);
        sb2.append(strTnTj78);
        String strH = s.h(jCurrentTimeMillis, numX49.tnTj78("bQCr"), sb2);
        Lb.a aVar = (Lb.a) this.c;
        S s9 = (S) aVar.f2942g;
        s9.getClass();
        Ah.p<FileUploadResponse> pVarRequestUploadUrl = s9.f11386a.requestUploadUrl(numX49.tnTj78("bQCZ"), numX49.tnTj78("bQCk"), FileUploadRequest.sBuilder().mFilename(strH).build());
        sd.f fVar = new sd.f(aVar, eDDFinancialDocument, arrayList, num);
        pVarRequestUploadUrl.getClass();
        return new Lh.f(pVarRequestUploadUrl, fVar, 0);
    }

    public void b(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        HashMap map = (HashMap) this.f19708b;
        HashMap map2 = (HashMap) this.f19707a;
        C2459f c2459f = new C2459f(byteArrayOutputStream, map2, map, (C2370a) this.c);
        if (obj == null) {
            return;
        }
        InterfaceC2295c interfaceC2295c = (InterfaceC2295c) map2.get(obj.getClass());
        if (interfaceC2295c != null) {
            interfaceC2295c.encode(obj, c2459f);
        } else {
            throw new EncodingException(numX49.tnTj78("bQCB") + obj.getClass());
        }
    }

    public boolean c() {
        LinkedHashSet linkedHashSetD = cj.S.d((Set) this.f19707a, (Set) this.f19708b);
        if (linkedHashSetD.isEmpty()) {
            return true;
        }
        Iterator it = linkedHashSetD.iterator();
        while (it.hasNext()) {
            if (!((Boolean) jk.b.m((Map) this.c, (FieldType) it.next(), Boolean.FALSE)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public void e(FieldType fieldType) {
        j.g(fieldType, numX49.tnTj78("bQCu"));
        ((Set) this.f19707a).remove(fieldType);
        ((Set) this.f19708b).remove(fieldType);
        ((Map) this.c).remove(fieldType);
    }

    public void f(FieldType fieldType, boolean z4) {
        j.g(fieldType, numX49.tnTj78("bQCV"));
        ((Set) this.f19708b).add(fieldType);
        ((Set) this.f19707a).remove(fieldType);
        ((Map) this.c).put(fieldType, Boolean.valueOf(z4));
    }

    public C2151a(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f19707a = set;
        this.f19708b = linkedHashSet;
        this.c = K.a(new LinkedHashMap(), new H0(17));
    }

    public C2151a(List list) {
        this.c = list;
        this.f19707a = new ArrayList(list.size());
        this.f19708b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f19707a).add(((u.f) list.get(i)).f20227b.f());
            ((ArrayList) this.f19708b).add(((u.f) list.get(i)).c.f());
        }
    }

    public C2151a(InterfaceC2153c interfaceC2153c) {
        C2152b c2152b = new C2152b(interfaceC2153c);
        Objects.requireNonNull(interfaceC2153c);
        this.f19707a = interfaceC2153c;
        this.f19708b = c2152b;
        this.c = new ReentrantReadWriteLock();
    }

    public C2151a(Map map, i iVar) {
        if (map != null && !map.isEmpty()) {
            this.f19707a = (p) map.values().iterator().next();
        } else {
            this.f19707a = null;
        }
        this.f19708b = new C2009e();
        this.c = iVar;
    }

    public C2151a(p pVar, i iVar) {
        this.f19707a = pVar;
        this.c = iVar;
        this.f19708b = new C2009e();
    }

    public C2151a(int[] iArr, Random random) {
        this.f19708b = iArr;
        this.f19707a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            ((int[]) this.c)[iArr[i]] = i;
        }
    }
}
