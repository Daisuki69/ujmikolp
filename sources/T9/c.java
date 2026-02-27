package t9;

import com.paymaya.domain.model.CreateChallengeResponse;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.OpenMfaMeta;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenMfaMeta f20189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f20190b;

    public c(OpenMfaMeta openMfaMeta, Bb.f fVar) {
        this.f20189a = openMfaMeta;
        this.f20190b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        CreateChallengeResponse challengeResponse = (CreateChallengeResponse) obj;
        j.g(challengeResponse, "challengeResponse");
        String challengeId = challengeResponse.getChallengeId();
        OpenMfaMeta openMfaMeta = this.f20189a;
        this.f20190b.w(new MfaMeta(challengeId, openMfaMeta.getClient(), "FACE", openMfaMeta.getTransactionType(), null, openMfaMeta.getMobileNumber(), openMfaMeta.getSourceScreen(), openMfaMeta.getSuccessScreen(), null, false, 784, null));
    }
}
