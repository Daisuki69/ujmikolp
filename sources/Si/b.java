package Si;

import D.S;
import R4.i;
import T3.l;
import We.A;
import We.AbstractC0598b;
import We.D;
import We.F;
import We.H;
import We.HandlerC0609m;
import We.HandlerThreadC0610n;
import We.I;
import We.O;
import We.RunnableC0603g;
import We.x;
import We.y;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Looper;
import android.provider.Settings;
import com.paymaya.domain.store.M;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.ht2aO8;
import ei.C1447b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5729b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5730d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5731g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5733l;
    public final Object m;

    public b(S s9, d dVar, fi.c cVar, mg.c cVar2, Qi.c cVar3, i iVar, A3.i iVar2, io.split.android.client.storage.splits.c cVar4) {
        this.f5729b = s9;
        this.c = dVar;
        this.f5730d = cVar;
        this.f5728a = true;
        this.e = cVar2;
        Objects.requireNonNull(cVar3);
        this.f = cVar3;
        M m = new M(new C1447b(new HashMap()));
        this.f5731g = new U8.c(5, cVar4, iVar, m);
        this.m = m;
        this.h = iVar2;
        Objects.requireNonNull(cVar4);
        this.i = cVar4;
        this.j = new d();
        this.f5732k = new d();
        this.f5733l = new Xh.c();
    }

    public void a(RunnableC0603g runnableC0603g) {
        Future future = runnableC0603g.f6397n;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = runnableC0603g.m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            ((ArrayList) this.m).add(runnableC0603g);
            HandlerC0609m handlerC0609m = (HandlerC0609m) this.i;
            if (handlerC0609m.hasMessages(7)) {
                return;
            }
            handlerC0609m.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public void b(RunnableC0603g runnableC0603g) {
        HandlerC0609m handlerC0609m = (HandlerC0609m) this.i;
        handlerC0609m.sendMessage(handlerC0609m.obtainMessage(4, runnableC0603g));
    }

    public void c(RunnableC0603g runnableC0603g, boolean z4) {
        runnableC0603g.f6392b.getClass();
        ((LinkedHashMap) this.e).remove(runnableC0603g.f);
        a(runnableC0603g);
    }

    public void d(AbstractC0598b abstractC0598b, boolean z4) {
        AbstractC0598b abstractC0598b2;
        RunnableC0603g runnableC0603g;
        b bVar;
        boolean zContains = ((LinkedHashSet) this.h).contains(abstractC0598b.h);
        A a8 = abstractC0598b.f6378a;
        if (zContains) {
            ((WeakHashMap) this.f5731g).put(abstractC0598b.d(), abstractC0598b);
            a8.getClass();
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        String str = abstractC0598b.f6381g;
        RunnableC0603g runnableC0603g2 = (RunnableC0603g) linkedHashMap.get(str);
        F f = abstractC0598b.f6379b;
        if (runnableC0603g2 != null) {
            runnableC0603g2.f6392b.getClass();
            if (runnableC0603g2.f6395k == null) {
                runnableC0603g2.f6395k = abstractC0598b;
                return;
            }
            if (runnableC0603g2.f6396l == null) {
                runnableC0603g2.f6396l = new ArrayList(3);
            }
            runnableC0603g2.f6396l.add(abstractC0598b);
            int i = f.h;
            if (AbstractC2217b.c(i) > AbstractC2217b.c(runnableC0603g2.f6402s)) {
                runnableC0603g2.f6402s = i;
                return;
            }
            return;
        }
        D d10 = (D) this.c;
        if (d10.isShutdown()) {
            a8.getClass();
            return;
        }
        Object obj = RunnableC0603g.f6387t;
        List list = a8.f6341a;
        int size = list.size();
        int i4 = 0;
        while (true) {
            l lVar = (l) this.f5732k;
            I i6 = (I) this.f5733l;
            if (i4 >= size) {
                abstractC0598b2 = abstractC0598b;
                bVar = this;
                runnableC0603g = new RunnableC0603g(a8, bVar, lVar, i6, abstractC0598b2, RunnableC0603g.f6390w);
                break;
            } else {
                H h = (H) list.get(i4);
                if (h.b(f)) {
                    bVar = this;
                    abstractC0598b2 = abstractC0598b;
                    runnableC0603g = new RunnableC0603g(a8, bVar, lVar, i6, abstractC0598b2, h);
                    break;
                }
                i4++;
            }
        }
        runnableC0603g.f6397n = d10.submit(runnableC0603g);
        linkedHashMap.put(str, runnableC0603g);
        if (z4) {
            ((WeakHashMap) bVar.f).remove(abstractC0598b2.d());
        }
        a8.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, D d10, y yVar, x xVar, l lVar, I i) {
        HandlerThreadC0610n handlerThreadC0610n = new HandlerThreadC0610n(numX49.tnTj78("bkbj"), 10);
        handlerThreadC0610n.start();
        Looper looper = handlerThreadC0610n.getLooper();
        StringBuilder sb2 = O.f6375a;
        y yVar2 = new y(looper, 1);
        yVar2.sendMessageDelayed(yVar2.obtainMessage(), 1000L);
        this.f5729b = context;
        this.c = d10;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.f5731g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new HandlerC0609m(handlerThreadC0610n.getLooper(), this, 0 == true ? 1 : 0);
        this.f5730d = xVar;
        this.j = yVar;
        this.f5732k = lVar;
        this.f5733l = i;
        this.m = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f5728a = context.checkCallingOrSelfPermission(numX49.tnTj78("bkbd")) == 0;
        E5.b bVar = new E5.b(this, 3);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(numX49.tnTj78("bkbi"));
        b bVar2 = (b) bVar.f1262b;
        if (bVar2.f5728a) {
            intentFilter.addAction(numX49.tnTj78("bkbE"));
        }
        ht2aO8.registerReceiver((Context) bVar2.f5729b, bVar, intentFilter);
    }
}
