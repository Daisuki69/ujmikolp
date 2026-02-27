package xi;

import Rg.u;
import Xh.i;
import ai.C0715d;
import hi.C1576a;
import io.split.android.client.dtos.Helper;
import io.split.android.client.dtos.RuleBasedSegment;
import io.split.android.client.dtos.Split;
import io.split.android.client.service.sseclient.notifications.InstantUpdateChangeNotification;
import io.split.android.client.service.sseclient.notifications.NotificationType;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import ki.C1781b;
import ki.h;
import p2.C2009e;
import ti.C2287b;
import zi.d;

/* JADX INFO: renamed from: xi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2484c extends u {
    public final LinkedBlockingDeque c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f21009d;
    public final io.split.android.client.storage.splits.c e;
    public final Mi.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0715d f21010g;
    public final C1781b h;
    public final h i;
    public final C2009e j;

    public C2484c(d dVar, LinkedBlockingDeque linkedBlockingDeque, io.split.android.client.storage.splits.c cVar, Mi.c cVar2, C0715d c0715d, C1781b c1781b, h hVar) {
        C2009e c2009e = new C2009e();
        super(4);
        this.f21009d = dVar;
        Objects.requireNonNull(linkedBlockingDeque);
        this.c = linkedBlockingDeque;
        Objects.requireNonNull(cVar);
        this.e = cVar;
        Objects.requireNonNull(cVar2);
        this.f = cVar2;
        this.f21010g = c0715d;
        this.h = c1781b;
        this.i = hVar;
        this.j = c2009e;
    }

    @Override // Rg.u
    public final void q() throws InterruptedException {
        try {
            InstantUpdateChangeNotification instantUpdateChangeNotification = (InstantUpdateChangeNotification) this.c.take();
            String str = instantUpdateChangeNotification.getType() == NotificationType.SPLIT_UPDATE ? "feature flags" : "rule based segments";
            Ri.a.d("A new notification to update " + str + " has been received");
            long jA = instantUpdateChangeNotification.getType() == NotificationType.RULE_BASED_SEGMENT_UPDATE ? this.f.a() : this.e.getTill();
            if (instantUpdateChangeNotification.getChangeNumber() <= jA) {
                Ri.a.d("Notification for " + str + " change number (" + instantUpdateChangeNotification.getChangeNumber() + ") is lower than the current one (" + jA + "). Ignoring notification");
                return;
            }
            if (instantUpdateChangeNotification.getData() != null && instantUpdateChangeNotification.getCompressionType() != null && instantUpdateChangeNotification.getPreviousChangeNumber() != null && instantUpdateChangeNotification.getPreviousChangeNumber().longValue() != 0 && jA == instantUpdateChangeNotification.getPreviousChangeNumber().longValue()) {
                w(instantUpdateChangeNotification);
                return;
            }
            v(instantUpdateChangeNotification);
        } catch (InterruptedException e) {
            Ri.a.d("Feature flags update worker has been interrupted");
            throw e;
        }
    }

    public final void v(InstantUpdateChangeNotification instantUpdateChangeNotification) {
        NotificationType type = instantUpdateChangeNotification.getType();
        NotificationType notificationType = NotificationType.RULE_BASED_SEGMENT_UPDATE;
        d dVar = this.f21009d;
        if (type == notificationType) {
            dVar.f.d(null, Long.valueOf(instantUpdateChangeNotification.getChangeNumber()));
        } else {
            dVar.f.d(Long.valueOf(instantUpdateChangeNotification.getChangeNumber()), null);
        }
        Ri.a.d("Enqueuing polling task");
    }

    public final void w(InstantUpdateChangeNotification instantUpdateChangeNotification) {
        String data = instantUpdateChangeNotification.getData();
        io.split.android.client.utils.a aVarA = this.f21010g.a(instantUpdateChangeNotification.getCompressionType());
        String str = null;
        try {
            if (aVarA == null) {
                Ri.a.g("Compression type not supported");
            } else {
                this.j.getClass();
                byte[] bArrD = i.d(data);
                if (bArrD == null) {
                    Ri.a.g("Could not decode payload");
                } else {
                    byte[] bArrA = aVarA.a(bArrD);
                    if (bArrA == null) {
                        Ri.a.g("Decompressed payload is null");
                    } else {
                        str = new String(bArrA);
                    }
                }
            }
        } catch (Exception unused) {
            Ri.a.g("Could not decompress payload");
        }
        if (str == null) {
            v(instantUpdateChangeNotification);
            return;
        }
        try {
            x(instantUpdateChangeNotification, str);
        } catch (Exception unused2) {
            Ri.a.g("Could not parse instant update notification");
            v(instantUpdateChangeNotification);
        }
    }

    public final void x(InstantUpdateChangeNotification instantUpdateChangeNotification, String str) {
        C2483b c2483b = new C2483b(0, this, instantUpdateChangeNotification);
        NotificationType type = instantUpdateChangeNotification.getType();
        NotificationType notificationType = NotificationType.RULE_BASED_SEGMENT_UPDATE;
        C1781b c1781b = this.h;
        h hVar = this.i;
        Mi.c cVar = this.f;
        if (type == notificationType) {
            RuleBasedSegment ruleBasedSegment = (RuleBasedSegment) io.split.android.client.utils.b.f17635a.e(str, RuleBasedSegment.class);
            long changeNumber = instantUpdateChangeNotification.getChangeNumber();
            if (cVar.n(Helper.getReferencedRuleBasedSegments(ruleBasedSegment.getConditions()))) {
                c1781b.l(new C2287b((Mi.c) hVar.f18141b.f923q, hVar.j, hVar.f18143g, ruleBasedSegment, changeNumber), c2483b);
                return;
            } else {
                Ri.a.d("Referenced rule based segment not found in storage. Forcing sync");
                v(instantUpdateChangeNotification);
                return;
            }
        }
        Split split = (Split) io.split.android.client.utils.b.f17635a.e(str, Split.class);
        long changeNumber2 = instantUpdateChangeNotification.getChangeNumber();
        if (cVar.n(Helper.getReferencedRuleBasedSegments(split.conditions))) {
            c1781b.l(new C1576a((io.split.android.client.storage.splits.c) hVar.f18141b.f914a, hVar.i, hVar.f18143g, hVar.f18144k, split, changeNumber2), c2483b);
        } else {
            Ri.a.d("Referenced rule based segment not found in storage. Forcing sync");
            v(instantUpdateChangeNotification);
        }
    }
}
