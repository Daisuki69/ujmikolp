package I8;

import M8.O0;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycAccountUnderReviewActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycAccountUnderReviewActivity f2261b;

    public /* synthetic */ b(MayaKycAccountUnderReviewActivity mayaKycAccountUnderReviewActivity, int i) {
        this.f2260a = i;
        this.f2261b = mayaKycAccountUnderReviewActivity;
    }

    @Override // M8.O0
    public final void onDismiss() {
        MayaKycAccountUnderReviewActivity mayaKycAccountUnderReviewActivity = this.f2261b;
        switch (this.f2260a) {
            case 0:
                int i = MayaKycAccountUnderReviewActivity.f12440r;
                mayaKycAccountUnderReviewActivity.finish();
                break;
            default:
                int i4 = MayaKycAccountUnderReviewActivity.f12440r;
                mayaKycAccountUnderReviewActivity.finish();
                break;
        }
    }
}
