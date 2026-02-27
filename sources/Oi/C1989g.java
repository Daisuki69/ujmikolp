package oi;

import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.dtos.SplitChange;
import io.split.android.client.dtos.TargetingRulesChange;
import io.split.android.client.dtos.TestImpressions;
import io.split.android.client.service.http.HttpResponseParserException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mi.InterfaceC1866a;
import mi.InterfaceC1867b;
import ph.C2059c2;
import ph.S1;
import ph.W1;
import w5.InterfaceC2384b;

/* JADX INFO: renamed from: oi.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1989g implements InterfaceC1866a, S1, InterfaceC1867b, InterfaceC2384b {
    public static boolean c(String str) throws IOException {
        String strTnTj78 = numX49.tnTj78("bQjn");
        j3.a aVar = new j3.a(new StringReader(str));
        try {
            aVar.f17701o = 1;
            if (aVar.peek() != 3) {
                throw new HttpResponseParserException("Error parsing splitChanges http response: not a JSON object");
            }
            aVar.c();
            if (aVar.t()) {
                String strE = aVar.E();
                boolean zEquals = strTnTj78.equals(strE);
                String strTnTj782 = numX49.tnTj78("bQjx");
                if (zEquals || strTnTj782.equals(strE)) {
                    aVar.close();
                    return true;
                }
                aVar.Q();
                while (aVar.t()) {
                    String strE2 = aVar.E();
                    if (strTnTj78.equals(strE2) || strTnTj782.equals(strE2)) {
                        aVar.close();
                        return true;
                    }
                    aVar.Q();
                }
            }
            aVar.close();
            return false;
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // mi.InterfaceC1866a
    public String a(Object obj) {
        HashMap map = new HashMap();
        for (KeyImpression keyImpression : (List) obj) {
            List arrayList = (List) map.get(keyImpression.feature);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(keyImpression);
            map.put(keyImpression.feature, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            TestImpressions testImpressions = new TestImpressions();
            testImpressions.testName = (String) entry.getKey();
            testImpressions.keyImpressions = (List) entry.getValue();
            arrayList2.add(testImpressions);
        }
        return io.split.android.client.utils.b.f17635a.k(arrayList2);
    }

    @Override // w5.InterfaceC2384b
    public String b(Object obj) {
        return (String) obj;
    }

    @Override // ph.S1
    public W1 call() {
        return new C2059c2(16);
    }

    @Override // mi.InterfaceC1867b
    public Object d(String str) throws HttpResponseParserException {
        if (str == null) {
            return null;
        }
        try {
            if (str.isEmpty()) {
                return null;
            }
            if (c(str)) {
                return (TargetingRulesChange) io.split.android.client.utils.b.f17635a.e(str, TargetingRulesChange.class);
            }
            SplitChange splitChange = (SplitChange) io.split.android.client.utils.b.f17635a.e(str, SplitChange.class);
            if (splitChange == null) {
                return null;
            }
            return TargetingRulesChange.create(splitChange);
        } catch (Exception e) {
            throw new HttpResponseParserException(numX49.tnTj78("bQjs") + e.getLocalizedMessage());
        }
    }
}
