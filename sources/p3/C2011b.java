package p3;

import android.os.Bundle;
import bg.AbstractC0983W;
import cj.C1110A;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import e1.InterfaceC1418b;
import hh.InterfaceC1568a;
import hh.InterfaceC1569b;
import i1.C1581a;
import i1.C1582b;
import i1.EnumC1584d;
import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.SerializableEvent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import mi.InterfaceC1866a;

/* JADX INFO: renamed from: p3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2011b implements C3.n, Ch.c, M5.f, InterfaceC1866a, Q3.c, InterfaceC1569b, InterfaceC1418b, InterfaceC1568a, b2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C2011b f19022b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19023a;

    public /* synthetic */ C2011b(int i) {
        this.f19023a = i;
    }

    public static Charset b() {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        try {
            return Charset.forName("UTF-8");
        } catch (Exception unused) {
            Ri.a.g("UTF-8 charset not available");
            return charsetDefaultCharset;
        }
    }

    public static Set f(Set fields) {
        W0.d dVar;
        kotlin.jvm.internal.j.g(fields, "fields");
        ArrayList arrayList = new ArrayList(cj.t.l(fields, 10));
        Iterator it = fields.iterator();
        while (it.hasNext()) {
            switch (((W0.c) it.next()).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    dVar = W0.d.f6180d;
                    break;
                case 6:
                case 7:
                case 8:
                    dVar = W0.d.e;
                    break;
                case 9:
                case 10:
                    dVar = W0.d.f6179b;
                    break;
                case 11:
                case 12:
                    dVar = W0.d.c;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(dVar);
        }
        return C1110A.Z(arrayList);
    }

    public static MayaCashInCodeFormFragment j(BankPullPaymentOption paymentOption) {
        String name = paymentOption.getName();
        kotlin.jvm.internal.j.g(paymentOption, "paymentOption");
        kotlin.jvm.internal.j.g(name, "name");
        MayaCashInCodeFormFragment mayaCashInCodeFormFragment = new MayaCashInCodeFormFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("payment_option", paymentOption);
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, name);
        mayaCashInCodeFormFragment.setArguments(bundle);
        return mayaCashInCodeFormFragment;
    }

    public static void k(Q3.d dVar, StringBuilder sb2) {
        int iCharAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        dVar.c.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb2.delete(0, 3);
    }

    @Override // mi.InterfaceC1866a
    public String a(Object obj) {
        switch (this.f19023a) {
            case 10:
                return io.split.android.client.utils.b.b((Oi.a) obj);
            default:
                ArrayList arrayList = new ArrayList();
                for (Event event : (List) obj) {
                    SerializableEvent serializableEvent = new SerializableEvent();
                    serializableEvent.eventTypeId = event.eventTypeId;
                    serializableEvent.trafficTypeName = event.trafficTypeName;
                    serializableEvent.key = event.key;
                    serializableEvent.value = event.value;
                    serializableEvent.timestamp = event.timestamp;
                    serializableEvent.properties = event.properties;
                    arrayList.add(serializableEvent);
                }
                return io.split.android.client.utils.b.f17635a.k(arrayList);
        }
    }

    @Override // hh.InterfaceC1569b
    public void accept(Object obj, Object obj2) {
        StringBuilder sb2 = (StringBuilder) obj;
        String str = (String) obj2;
        if (sb2.length() == 0) {
            sb2.append(str);
        } else {
            sb2.append(", ");
            sb2.append(str);
        }
    }

    public int c(char c, StringBuilder sb2) {
        if (c == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb2.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb2.append((char) (c - '3'));
            return 1;
        }
        if (c >= 0 && c <= 31) {
            sb2.append((char) 0);
            sb2.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c - 'E'));
            return 2;
        }
        if (c >= '`' && c <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c - '`'));
            return 2;
        }
        if (c >= 128) {
            sb2.append("\u0001\u001e");
            return c((char) (c - 128), sb2) + 2;
        }
        throw new IllegalArgumentException("Illegal character: " + c);
    }

    @Override // M5.f
    public String d() {
        switch (this.f19023a) {
            case 6:
                return String.format("SELECT * FROM %1$s ORDER BY name", "biller_category");
            case 7:
                return String.format("SELECT * FROM %1$s ", "load_up_partner");
            default:
                return "SELECT * FROM identity WHERE type = \"msisdn\"  AND verified = 1";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[PHI: r2 r3
  0x0047: PHI (r2v1 java.nio.charset.Charset) = (r2v0 java.nio.charset.Charset), (r2v20 java.nio.charset.Charset) binds: [B:3:0x0008, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r3v1 int) = (r3v0 int), (r3v19 int) binds: [B:3:0x0008, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // C3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K3.b e(java.lang.String r20, C3.a r21, int r22, int r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C2011b.e(java.lang.String, C3.a, int, int, java.util.HashMap):K3.b");
    }

    public void g(Q3.d dVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!dVar.b()) {
                break;
            }
            char cA = dVar.a();
            dVar.f5208d++;
            int iC = c(cA, sb2);
            int length = dVar.c.length() + ((sb2.length() / 3) << 1);
            dVar.c(length);
            int i = dVar.f.f5214b - length;
            if (!dVar.b()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - iC, length2);
                    dVar.f5208d--;
                    iC = c(dVar.a(), sb3);
                    dVar.f = null;
                }
                while (sb2.length() % 3 == 1 && ((iC <= 3 && i != 1) || iC > 3)) {
                    int length3 = sb2.length();
                    sb2.delete(length3 - iC, length3);
                    dVar.f5208d--;
                    iC = c(dVar.a(), sb3);
                    dVar.f = null;
                }
            } else if (sb2.length() % 3 == 0) {
                if (AbstractC0983W.s(dVar.f5206a, dVar.f5208d, h()) != h()) {
                    dVar.e = 0;
                    break;
                }
            }
        }
        i(dVar, sb2);
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f19023a) {
            case 20:
                return new c1.o(Executors.newSingleThreadExecutor());
            default:
                N4.d dVar = new N4.d(27);
                HashMap map = new HashMap();
                Z0.e eVar = Z0.e.f6874a;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(eVar, new C1582b(30000L, 86400000L, set));
                Z0.e eVar2 = Z0.e.c;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(eVar2, new C1582b(1000L, 86400000L, set));
                Z0.e eVar3 = Z0.e.f6875b;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC1584d.f17074b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(eVar3, new C1582b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < Z0.e.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C1581a(dVar, map);
        }
    }

    public int h() {
        return 1;
    }

    public void i(Q3.d dVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int length3 = dVar.c.length() + length;
        dVar.c(length3);
        int i = dVar.f.f5214b - length3;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                k(dVar, sb2);
            }
            if (dVar.b()) {
                dVar.d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                k(dVar, sb2);
            }
            if (dVar.b()) {
                dVar.d((char) 254);
            }
            dVar.f5208d--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                k(dVar, sb2);
            }
            if (i > 0 || dVar.b()) {
                dVar.d((char) 254);
            }
        }
        dVar.e = 0;
    }

    @Override // hh.InterfaceC1568a
    public void run() {
    }

    public String toString() {
        switch (this.f19023a) {
            case 25:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        return new h();
    }

    public C2011b() {
        this.f19023a = 29;
        new CopyOnWriteArrayList();
    }

    @Override // Ch.c
    public void accept(Object obj) {
        E1.c.k((Throwable) obj);
    }
}
