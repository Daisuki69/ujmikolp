package t9;

import com.paymaya.domain.model.CreateChallengeResponse;
import com.paymaya.domain.model.MfaMeta;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MfaMeta f20191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f20192b;

    public d(MfaMeta mfaMeta, Bb.f fVar) {
        this.f20191a = mfaMeta;
        this.f20192b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        CreateChallengeResponse challengeResponse = (CreateChallengeResponse) obj;
        j.g(challengeResponse, "challengeResponse");
        String challengeId = challengeResponse.getChallengeId();
        MfaMeta mfaMeta = this.f20191a;
        this.f20192b.w(new MfaMeta(challengeId, mfaMeta.getClient(), "FACE", mfaMeta.getTransactionType(), null, null, null, null, null, false, 1008, null));
    }
}
