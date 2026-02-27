package ph;

import a7.ViewTreeObserverOnGlobalLayoutListenerC0635C;
import android.os.SystemClock;
import android.view.ViewTreeObserver;
import com.liaoinstan.springview.widget.SpringView;
import com.lyft.kronos.internal.ntp.NTPSyncException;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import w4.C2379c;
import w4.C2382f;
import w4.EnumC2380d;

/* JADX INFO: loaded from: classes4.dex */
public final class U2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19355b;

    public U2(MayaCarousel mayaCarousel, MayaCreatorStoreFragment mayaCreatorStoreFragment) {
        this.f19354a = 1;
        this.f19355b = mayaCreatorStoreFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.shield.android.sheildsignature.a.a$a, u4.d] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r15;
        ?? r12;
        Object obj = this.f19355b;
        switch (this.f19354a) {
            case 0:
                ((V2) obj).c.dispose();
                return;
            case 1:
                MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) obj;
                int dimensionPixelSize = mayaCreatorStoreFragment.getResources().getDimensionPixelSize(R.dimen.maya_margin_24);
                MayaCarousel mayaCarousel = mayaCreatorStoreFragment.f12109A0;
                if (mayaCarousel != null) {
                    ViewTreeObserver viewTreeObserver = mayaCarousel.getViewTreeObserver();
                    kotlin.jvm.internal.j.f(viewTreeObserver, "getViewTreeObserver(...)");
                    ViewTreeObserverOnGlobalLayoutListenerC0635C viewTreeObserverOnGlobalLayoutListenerC0635C = new ViewTreeObserverOnGlobalLayoutListenerC0635C(viewTreeObserver, mayaCreatorStoreFragment, mayaCarousel, dimensionPixelSize, 1);
                    mayaCreatorStoreFragment.f12110B0 = viewTreeObserverOnGlobalLayoutListenerC0635C;
                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0635C);
                    return;
                }
                return;
            case 2:
                int i = SpringView.f10155q0;
                ((SpringView) obj).k();
                return;
            case 3:
                C2382f c2382f = (C2382f) obj;
                c2382f.a();
                for (?? it = c2382f.f20697g.iterator(); it.hasNext(); it = r15) {
                    String str = (String) it.next();
                    AtomicLong atomicLong = c2382f.f20695b;
                    EnumC2380d enumC2380d = EnumC2380d.f20690a;
                    AtomicReference atomicReference = c2382f.f20694a;
                    EnumC2380d enumC2380d2 = EnumC2380d.f20691b;
                    if (((EnumC2380d) atomicReference.getAndSet(enumC2380d2)) != enumC2380d2) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        ?? r11 = c2382f.f;
                        r11.onStartSync(str);
                        try {
                            C2379c c2379cF = c2382f.f20696d.f(str, Long.valueOf(c2382f.h));
                            long j = c2379cF.f20688a;
                            long j6 = jElapsedRealtime;
                            long j7 = c2379cF.c;
                            long j9 = j + j7;
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            long j10 = c2379cF.f20689b;
                            try {
                                if ((jElapsedRealtime2 - j10) + j9 < 0) {
                                    throw new NTPSyncException("Invalid time " + ((SystemClock.elapsedRealtime() - j10) + j + j7) + " received from " + str);
                                }
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j6;
                                r15 = it;
                                long j11 = c2382f.f20698k;
                                try {
                                    if (jElapsedRealtime3 <= j11) {
                                        c2382f.e.k(c2379cF);
                                        r11.onSuccess(j7, jElapsedRealtime3);
                                        return;
                                    }
                                    StringBuilder sb2 = new StringBuilder("Ignoring response from ");
                                    sb2.append(str);
                                    sb2.append(" because the network latency (");
                                    sb2.append(jElapsedRealtime3);
                                    sb2.append(" ms) is longer than the required value (");
                                    sb2.append(j11);
                                    sb2.append(" ms");
                                    throw new NTPSyncException(sb2.toString());
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = str;
                                    try {
                                        r11.onError(r12, th);
                                    } finally {
                                        atomicReference.set(enumC2380d);
                                        atomicLong.set(SystemClock.elapsedRealtime());
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r12 = c2379cF;
                                r15 = j6;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r15 = it;
                            r12 = str;
                        }
                    } else {
                        r15 = it;
                    }
                }
                return;
        }
        while (true) {
            try {
                ((Rg.u) obj).q();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ U2(Object obj, int i) {
        this.f19354a = i;
        this.f19355b = obj;
    }

    public U2(SpringView springView, t4.h hVar) {
        this.f19354a = 2;
        this.f19355b = springView;
    }
}
