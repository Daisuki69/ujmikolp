package D8;

import K8.InterfaceC0277b;
import com.paymaya.data.api.KycSubmissionApi;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycNationality;
import com.paymaya.domain.model.KycSubmissionNotify;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import w.C2360b;
import w.C2361c;

/* JADX INFO: renamed from: D8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0196d extends C8.a {
    public final com.google.firebase.messaging.r e;
    public final com.paymaya.domain.store.L f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1040g;
    public String h;
    public String i;
    public String j;

    public C0196d(com.google.firebase.messaging.r rVar, com.paymaya.domain.store.L l6, com.paymaya.data.preference.a aVar, S5.c cVar) {
        super(aVar, 0);
        this.e = rVar;
        this.f = l6;
        this.f1040g = aVar;
    }

    public final String o(String str) {
        KycCmsContentData data;
        List<KycNationality> nationalities;
        Object next;
        KycCmsContent cmsContent = ((InterfaceC0277b) this.c.get()).getCmsContent();
        if (cmsContent != null && (data = cmsContent.getData()) != null && (nationalities = data.getNationalities()) != null) {
            Iterator<T> it = nationalities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.j.b(((KycNationality) next).getCode(), str)) {
                    break;
                }
            }
            KycNationality kycNationality = (KycNationality) next;
            if (kycNationality != null) {
                return kycNationality.getName();
            }
        }
        return null;
    }

    public final void p() {
        int i = 11;
        int i4 = 2;
        int i6 = 10;
        int i10 = 0;
        ((InterfaceC0277b) this.c.get()).R();
        if (this.f1040g.n().length() == 0) {
            this.f1040g.b0(UUID.randomUUID().toString());
        }
        if (((InterfaceC0277b) this.c.get()).s0()) {
            e(new Lh.d(new Lh.d(new Lh.h(((KycSubmissionApi) this.f.f11367b).getSubmissionResponse().h(Th.e.c), zh.b.a(), 0), new V2.c(this, i6), i4), new A5.l(this, i6), i10).e());
        } else {
            e(new Lh.d(new Lh.d(new Lh.h(Ah.p.l(((KycSubmissionApi) this.f.f11367b).getSubmissionResponse().h(Th.e.c), this.e.u(), C0195c.f1037b), zh.b.a(), 0), new C2360b(this, i), i4), new C2361c(this, i), i10).e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.paymaya.domain.model.KycLatestSubmissionContentData r22) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0196d.q(com.paymaya.domain.model.KycLatestSubmissionContentData):void");
    }

    public final void r() {
        KycSubmissionNotify kycSubmissionNotify = new KycSubmissionNotify(this.h, this.i, this.j);
        com.paymaya.domain.store.L l6 = this.f;
        l6.getClass();
        e(new Lh.d(new Lh.d(new Lh.h(((KycSubmissionApi) l6.f11367b).createSubmissionNotifyResponse(kycSubmissionNotify).h(Th.e.c), zh.b.a(), 0), new J5.a(this, 13), 2), new J5.c(this, 12), 0).e());
    }
}
