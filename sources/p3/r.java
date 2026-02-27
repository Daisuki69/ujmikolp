package p3;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements OptionalModuleApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Feature[] f19053b;

    public /* synthetic */ r(Feature[] featureArr, int i) {
        this.f19052a = i;
        this.f19053b = featureArr;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        Feature[] featureArr = this.f19053b;
        switch (this.f19052a) {
            case 0:
                Feature[] featureArr2 = j.f19034a;
                break;
            default:
                Feature[] featureArr3 = j.f19034a;
                break;
        }
        return featureArr;
    }
}
