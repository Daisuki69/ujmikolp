package M8;

import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: M8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0344d implements O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H8.b f3281b;

    public /* synthetic */ C0344d(int i, H8.b bVar) {
        this.f3280a = i;
        this.f3281b = bVar;
    }

    @Override // M8.O0
    public final void onDismiss() {
        H8.b bVar = this.f3281b;
        switch (this.f3280a) {
            case 0:
                ((MayaKycActivity) bVar).i2(true);
                break;
            case 1:
                ((MayaKycActivity) bVar).finish();
                break;
            case 2:
                ((MayaKycActivity) bVar).finish();
                break;
            case 3:
                ((MayaKycActivity) bVar).finish();
                break;
            case 4:
                MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
                mayaKycActivity.n1();
                B5.i.N(mayaKycActivity);
                mayaKycActivity.finish();
                break;
            case 5:
                ((MayaKycActivity) bVar).finish();
                break;
            case 6:
                ((MayaKycActivity) bVar).finish();
                break;
            case 7:
                ((MayaKycActivity) bVar).finish();
                break;
            case 8:
                KProperty[] kPropertyArr = MayaKycLivenessCaptureFragment.f12558d0;
                ((MayaKycActivity) bVar).i2(true);
                break;
            case 9:
                KProperty[] kPropertyArr2 = MayaKycLivenessCaptureFragment.f12558d0;
                ((MayaKycActivity) bVar).i2(true);
                break;
            case 10:
                KProperty[] kPropertyArr3 = MayaKycLivenessCaptureFragment.f12558d0;
                ((MayaKycActivity) bVar).i2(true);
                break;
            case 11:
                KProperty[] kPropertyArr4 = MayaKycLivenessCaptureFragment.f12558d0;
                ((MayaKycActivity) bVar).finish();
                break;
            case 12:
                ((MayaKycActivity) bVar).finish();
                break;
            case 13:
                ((MayaKycActivity) bVar).j2(Integer.valueOf(R.id.maya_kyc_complete_your_maya_experience_fragment));
                break;
            case 14:
                ((MayaKycActivity) bVar).j2(Integer.valueOf(R.id.maya_kyc_take_video_selfie_fragment));
                break;
            default:
                ((MayaKycActivity) bVar).finish();
                break;
        }
    }
}
