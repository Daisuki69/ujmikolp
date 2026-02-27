package com.google.firebase.messaging;

import Kh.C0301f;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.BillerV3Response;
import com.paymaya.domain.model.BillerV3Transaction;
import com.paymaya.domain.model.BillersPagedListV3Response;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.LoanInstance;
import com.paymaya.domain.model.Restrictions;
import com.shield.android.Shield;
import df.InterfaceC1359a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import pi.C2151a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Z0.f, com.google.gson.internal.l, OnSuccessListener, Shield.DeviceResultStateListener, Ch.g, Ch.f, com.shield.android.u.c, OnFailureListener, InterfaceC1359a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9794a;

    public /* synthetic */ n(int i) {
        this.f9794a = i;
    }

    @Override // Z0.f
    public Object apply(Object obj) {
        switch (this.f9794a) {
            case 0:
                H2.e eVar = (H2.e) obj;
                eVar.getClass();
                C2151a c2151a = q.f9800a;
                c2151a.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c2151a.b(byteArrayOutputStream, eVar);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 15:
                List list = (List) obj;
                Objects.requireNonNull(list, "source is null");
                return new C0301f(list);
            case 16:
                return Ah.p.c((List) ((Pair) obj).first);
            case 17:
                return ((BillerV3Response) obj).convertToBillerDetails();
            case 18:
                return ((BillersPagedListV3Response) obj).getBillers();
            case 19:
                return (List) obj;
            case 20:
                return ((BillerV3Response) obj).convertToBiller();
            case 21:
                return ((BillerV3Transaction) obj).convertToBillerTransaction();
            case 22:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((Consent) it.next()).toBuilder().isEnabled(true).build());
                }
                return arrayList;
            case 23:
                return Ah.p.c((List) ((Pair) obj).first);
            case 24:
                return Ah.p.c((List) ((Pair) obj).first);
            case 25:
                return ((Restrictions) obj).getRestrictions();
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                return Boolean.TRUE;
        }
    }

    @Override // com.google.gson.internal.l
    public Object b() {
        switch (this.f9794a) {
            case 1:
                return new com.google.gson.internal.k(true);
            case 2:
                return new LinkedHashMap();
            case 3:
                return new TreeMap();
            case 4:
                return new ConcurrentHashMap();
            case 5:
                return new ConcurrentSkipListMap();
            case 6:
                return new ArrayList();
            case 7:
                return new LinkedHashSet();
            case 8:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // com.shield.android.u.c
    public void execute(com.shield.android.u.d dVar) {
        dVar.createRunnable().run();
    }

    @Override // com.shield.android.Shield.DeviceResultStateListener
    public void isReady() {
        switch (this.f9794a) {
            case 11:
                yk.a.a();
                i0.a();
                break;
            default:
                i0.a();
                break;
        }
    }

    @Override // df.InterfaceC1359a
    public List lookup(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Long l6 = (Long) obj;
        if (l6 != null) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            ((HashMap) Cg.c.k().f769d).put("session_id", l6.toString());
        }
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        switch (this.f9794a) {
            case 13:
                return LoanInstance.lambda$getRemainingDaysUnit$0((String) obj);
            default:
                return !((List) obj).isEmpty();
        }
    }
}
